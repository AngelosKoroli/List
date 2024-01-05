package com.example.list;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
    public TableView AnimeTierlist;
    public TableColumn Rank;
    public TableColumn Anime;
    public TableColumn MainCharacter;
    public TableColumn MainAntagonist;
    public TableColumn YearReleased;

    ///
    public void initialize() {

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

        AnimeTierList Anime1 = new AnimeTierList(1, "Baki", "Baki Hanma", "Yujiro Hanma", 1994);
        AnimeTierList Anime2 = new AnimeTierList(2, "Dragon Ball Z", "Son Goku", "Frieza", 1989);
        AnimeTierList Anime3 = new AnimeTierList(3, "JoJo's Bizarre Adventure", "Jotro Kujo", "Dio Brando", 1993);
        System.out.println(Anime1);
        System.out.println(Anime2);
        System.out.println(Anime3);

        // tell the table view about your data
        AnimeTierlist.getItems().add(Anime1);
        AnimeTierlist.getItems().add(Anime2);
        AnimeTierlist.getItems().add(Anime3);
        // teach tablewivew how to find your fields using a factory
    }


    //Angelos K was here
}