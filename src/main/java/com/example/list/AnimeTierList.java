package com.example.list;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.io.*;

public class AnimeTierList implements Serializable {
    private int Rank;
    private String Anime;
    private String MainCharacter;
    private String MainAntagonist;
    private int YearReleased;

    public Button buttonSave;

    public AnimeTierList(int Rank, String Anime, String MainCharacter, String MainAntagonist, int YearReleased) throws IOException {
        this.Rank = Rank;
        this.Anime = Anime;
        this.MainCharacter = MainCharacter;
        this.MainAntagonist = MainAntagonist;
        this.YearReleased = YearReleased;

    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public String getAnime() {
        return Anime;
    }

    public void setAnime(String anime) {
        Anime = anime;
    }

    public String getMainCharacter() {
        return MainCharacter;
    }

    public void setMainCharacter(String mainCharacter) {
        MainCharacter = mainCharacter;
    }

    public String getMainAntagonist() {
        return MainAntagonist;
    }

    public void setMainAntagonist(String mainAntagonist) {
        MainAntagonist = mainAntagonist;
    }

    public int getYearReleased() {
        return YearReleased;
    }

    public void setYearReleased(int yearReleased) {
        YearReleased = yearReleased;
    }


    public String toString() {
        return Rank + Anime + MainCharacter + MainAntagonist + YearReleased;
    }

    void saveData() throws Exception {
        File fileForData = new File("Angelos");
        FileOutputStream outputStream = new FileOutputStream(fileForData);
        ObjectOutputStream objOutputStream= new ObjectOutputStream(outputStream);
        objOutputStream.writeObject(this.Rank);
        objOutputStream.writeObject(this.Anime);
        objOutputStream.writeObject(this.MainCharacter);
        objOutputStream.writeObject(this.MainAntagonist);
        objOutputStream.writeObject(this.YearReleased);
        objOutputStream.flush();
    }
}
