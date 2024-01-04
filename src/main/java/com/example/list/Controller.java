package com.example.list;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller<AnimeTierlist> {
    public TableView AnimeTierlist;
   public TableColumn Rank;
    public TableColumn Anime;
    public TableColumn MainCharacter;
    public TableColumn MainAntagonist ;
    public TableColumn YearReleased;

///
    public void initialize() {
        AnimeTierlist Anime1 = new AnimeTierlist("S", "Baki","Baki", "Yujiro",1/8/2023);
    }

    //Angelos K was here
}