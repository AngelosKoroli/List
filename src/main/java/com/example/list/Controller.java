package com.example.list;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class Controller {
    public TableView<AnimeTierList> AnimeTierlist;
    public TableColumn Rank;
    public TableColumn Anime;
    public TableColumn MainCharacter;
    public TableColumn MainAntagonist;
    public TableColumn YearReleased;

    ///
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

        if (true) {
            AnimeTierList Anime1 = new AnimeTierList(1, " Baki", " Baki Hanma", " Yujiro Hanma", 1994);
            AnimeTierList Anime2 = new AnimeTierList(2, " Dragon Ball Z", " Son Goku", " Frieza", 1989);
            AnimeTierList Anime3 = new AnimeTierList(3, " JoJo's Bizarre Adventure", " Jotaro Kujo", " Dio Brando", 1993);
            System.out.println(Anime1);
            System.out.println(Anime2);
            System.out.println(Anime3);

            // tell the table view about your
            AnimeTierlist.getItems().add(Anime1);
            AnimeTierlist.getItems().add(Anime2);
            AnimeTierlist.getItems().add(Anime3);

        } else {

            this.restoreData();
        }
        // teach tablewivew how to find your fields using a factory
    }

    @FXML
    void saveData() throws Exception {
        File fileForData = new File("Angelos");
        FileOutputStream outputStream = new FileOutputStream(fileForData);
        ObjectOutputStream objOutputStream= new ObjectOutputStream(outputStream);
        objOutputStream.writeObject(AnimeTierlist.getItems().size());
        for (AnimeTierList eachData : AnimeTierlist.getItems()) {
            objOutputStream.writeObject(eachData);
        }
        objOutputStream.flush();
    }


    void restoreData()  throws Exception{
            File fileForData = new File("MyData");
            FileInputStream inputStream = new FileInputStream(fileForData);
            ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
            Integer numOfSavedObjects = (Integer)objInputStream.readObject();
            for (int i = 0; i < numOfSavedObjects; i = i + 1) {
                AnimeTierList eachData = (AnimeTierList) objInputStream.readObject();
                AnimeTierlist.getItems().add(eachData);
            }
            inputStream.close();
    }
    //Angelos K was here
}