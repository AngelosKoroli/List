package com.example.list;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.BooleanStringConverter;
import javafx.util.converter.IntegerStringConverter;

import java.io.*;

public class Controller {
    public TableView<AnimeTier> AnimeTierlist;
    public TableColumn<AnimeTier, Integer> Rank;
    public TableColumn<AnimeTier, String> Anime;
    public TableColumn<AnimeTier, String> MainCharacter;
    public TableColumn<AnimeTier, String> MainAntagonist;
    public TableColumn<AnimeTier, Integer> YearReleased;


    ///Jaden rulz
    public void initialize() throws Exception {

        AnimeTierlist.setEditable(true);
        Rank.setCellValueFactory(new PropertyValueFactory<AnimeTier, Integer>("Rank"));
        // Make each cell editable by setting up its CellFactory
        Rank.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        // Set up an onAction method for cell edit commit event
        Rank.setOnEditCommit(event -> {
            AnimeTier cellData = event.getRowValue();
            cellData.setRank(event.getNewValue());
        });

        Anime.setCellValueFactory(new PropertyValueFactory<AnimeTier, String>("Anime"));
        Anime.setCellFactory(TextFieldTableCell.forTableColumn());
        Anime.setOnEditCommit(event -> {
            AnimeTier cellData = event.getRowValue();
            cellData.setAnime(event.getNewValue());
        });

        MainCharacter.setCellValueFactory(new PropertyValueFactory<AnimeTier, String>("MainCharacter"));
        MainCharacter.setCellFactory(TextFieldTableCell.forTableColumn());
        MainCharacter.setOnEditCommit(event -> {
            AnimeTier cellData = event.getRowValue();
            cellData.setMainCharacter(event.getNewValue());
        });

        MainAntagonist.setCellValueFactory(new PropertyValueFactory<AnimeTier, String>("MainAntagonist"));
        MainAntagonist.setCellFactory(TextFieldTableCell.forTableColumn());
        MainAntagonist.setOnEditCommit(event -> {
                    AnimeTier cellData = event.getRowValue();
                    cellData.setMainAntagonist(event.getNewValue());
                });
        YearReleased.setCellValueFactory(new PropertyValueFactory<AnimeTier, Integer>("YearReleased"));
        YearReleased.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        YearReleased.setOnEditCommit(event -> {
            AnimeTier cellData = event.getRowValue();
            cellData.setYearReleased(event.getNewValue());
        });
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