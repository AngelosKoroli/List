package com.example.list;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {
    public TableView<AnimeTierList> AnimeTierlist;
   public TableColumn Rank;
    public TableColumn Anime;
    public TableColumn MainCharacter;
    public TableColumn MainAntagonist ;
    public TableColumn YearReleased;

///
    public void initialize() {
        AnimeTierList Anime1 = new AnimeTierList(2, "Baki","Baki", "Yujiro",5);
    }

    //Angelos K was here
}