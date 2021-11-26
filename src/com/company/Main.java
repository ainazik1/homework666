package com.company;

public class Main {

    public static void main(String[] args) {

    Boss boss = new Boss();
    boss.setHealth(600);
    boss.setDamage(50);
    boss.setWeapon(new Weapon("Спортивный" ,"Винторез"));

        System.out.println("Босс"+ " "+ boss.printinfo()+ " " +"Оружие" + " " +boss.getWeapon().getTypeOfWeapon() + " " +boss.getWeapon().getNameOfWeapon());

        Sceleton sceleton= new Sceleton();
        sceleton.setHealth(150);
        sceleton.setDamage(20);
        sceleton.setGetNumberOfArrows(10);
        System.out.println("Скелет:" +sceleton.printinfo());

        Sceleton sceleton1= new Sceleton();
        sceleton1.setHealth(200);
        sceleton1.setDamage(15);
        sceleton1.setGetNumberOfArrows(5);
        System.out.println("Скелет:" +sceleton1.printinfo());





    }

}
