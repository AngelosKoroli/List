package com.example.list;

import java.io.Serializable;

public class AnimeTierList implements Serializable {
    private int Rank;
    private String Anime;
    private String MainCharacter;
    private String MainAntagonist;
    private int YearReleased;

    public AnimeTierList(int rank, String anime, String MC, String MA, int YR) {
        this.Rank = rank;
        this.Anime = anime;
        this.MainCharacter = MC;
        this.MainAntagonist = MA;
        this.YearReleased = YR;

    }

    public int getRank() {
        return Rank;
    }

    public void setS(int rank) {
        Rank = rank;
    }

    public String getA() {
        return Anime;
    }

    public void setA(String anime) {
        Anime = anime;
    }

    public String getB() {
        return  MainCharacter;
    }

    public void setB(String MC) {
        MainCharacter = MC;
    }

    public String getC() {
        return MainAntagonist;
    }

    public void setC(String MA) {
        MainAntagonist = MA;
    }

    public int getD() {
        return YearReleased;
    }

    public void setD(int YR) {
        YearReleased = YR;
    }

    public String toString() {
        return Rank + Anime + MainCharacter + MainCharacter + YearReleased;
    }
}
