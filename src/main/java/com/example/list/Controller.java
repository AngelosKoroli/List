package com.example.list;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {
    public TableView<AnimeTierList> AnimeTierlist;
    public TableColumn Rank;
    public TableColumn Anime;
    public TableColumn MainCharacter;
    public TableColumn MainAntagonist;
    public TableColumn YearReleased;

    ///
    public void initialize() {
        AnimeTierList Anime1 = new AnimeTierList(1, "Baki", "Baki", "Yujiro", 1994);
        AnimeTierList Anime2 = new AnimeTierList(2, "Dragon Ball Z", "Goku", "Frieza", 1989);
        System.out.println(Anime1);
        System.out.println(Anime2);
    }


    //Angelos K was here
}