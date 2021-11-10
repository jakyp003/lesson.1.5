package com.company;

public class Hero {
     private int hp;
     private int dm;
     private String supper;

    public Hero(int hp, int dm, String supper) {
        this.hp = hp;
        this.dm = dm;
        this.supper = supper;
    }

    public Hero(int hp, int dm) {
        this.hp = hp;
        this.dm = dm;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    public String getSupper() {
        return supper;
    }

    public void setSupper(String supper) {
        this.supper = supper;
    }
}

