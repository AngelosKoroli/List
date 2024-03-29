package com.example.list;

import java.io.*;

public class AnimeTier implements Serializable {
    private int Rank;
    private String Anime;
    private String MainCharacter;
    private String MainAntagonist;
    private int YearReleased;


    public AnimeTier(int Rank, String Anime, String MainCharacter, String MainAntagonist, int YearReleased) throws IOException {
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

}
