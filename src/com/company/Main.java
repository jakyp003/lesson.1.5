package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(250);
        boss.setDm(300);
        boss.setDefent("огонь");
        System.out.println("Босс "+boss.getHp()+" "+boss.getDm()+" "+boss.getDefent());
        for (int i = 0; i < createHeroes().length; i++) {
            if (createHeroes()[i].getSupper() ==null){
                System.out.println(createHeroes()[i].getDm()+" "+createHeroes()[i].getHp());
            }else {
                System.out.println(createHeroes()[i].getDm()+" "+createHeroes()[i].getHp()+" "+createHeroes()[i].getSupper());
            }
        }
    }
    public static Hero[] createHeroes(){
        Hero manas = new Hero(250,300, "земля");
        Hero semetey = new Hero(200, 400);
        Hero seitek = new Hero(150, 350, "вода");
        Hero[] heroes ={manas,semetey,seitek};
        return heroes;

    }
}