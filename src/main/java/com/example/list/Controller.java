package com.example.list;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class Controller {
    public TableView<AnimeTier> AnimeTierlist;
    public TableColumn Rank;
    public TableColumn Anime;
    public TableColumn MainCharacter;
    public TableColumn MainAntagonist;
    public TableColumn YearReleased;


    ///Jaden rulz
    public void initialize() throws Exception {


        Rank.setCellValueFactory(
                new PropertyValueFactory<>("Rank")
        );
        Anime.setCellValueFactory(
                new PropertyValueFactory<>("Anime")
        );
        MainCharacter.setCellValueFactory(
                new PropertyValueFactory<>("MainCharacter")
        );
        MainAntagonist.setCellValueFactory(
                new PropertyValueFactory<>("MainAntagonist")
        );
        YearReleased.setCellValueFactory(
                new PropertyValueFactory<>("YearReleased")
        );

        if (false) {
            AnimeTier Anime1 = new AnimeTier(1, "Baki", "Baki", "Yujiro", 1994);
            AnimeTier Anime2 = new AnimeTier(2, "Dragon Ball Z", "Goku", "Frieza", 1989);
            AnimeTier Anime3 = new AnimeTier(3, "JoJo's Bizarre Adventure", "Jotro", "Dio", 1993);
            System.out.println(Anime1);
            System.out.println(Anime2);
            System.out.println(Anime3);

            // tell the table view about your data
            AnimeTierlist.getItems().add(Anime1);
            AnimeTierlist.getItems().add(Anime2);
            AnimeTierlist.getItems().add(Anime3);
            // teach tablewivew how to find your fields using a factory
        } else {
            this.restoreData();
        }
    }

    void saveData() throws Exception {
        File fileForData = new File("Angelos");
        FileOutputStream outputStream = new FileOutputStream(fileForData);
        ObjectOutputStream objOutputStream= new ObjectOutputStream(outputStream);
        objOutputStream.writeObject(AnimeTierlist.getItems().size());
        for (AnimeTier eachData : AnimeTierlist.getItems()) {
            objOutputStream.writeObject(eachData);
        }
        objOutputStream.flush();
    }
    void restoreData() throws Exception {
        File fileForData = new File("Angelos");
        FileInputStream inputStream = new FileInputStream(fileForData);
        ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
        Integer numOfSavedObjects = (Integer)objInputStream.readObject();
        for (int i = 0; i < numOfSavedObjects; i = i + 1) {
            AnimeTier eachData = (AnimeTier) objInputStream.readObject();
            AnimeTierlist.getItems().add(eachData);
        }
        inputStream.close();
        }
}