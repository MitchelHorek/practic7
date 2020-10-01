package com.company;

import java.util.ArrayList;

public class FurnitureShop {
    public static void main(String[] args) {
        Stol stol = new Stol("drevo", "mirea", 20, 4);
        Taburetka babushkina = new Taburetka("белое дерево", "mirea", 40);
        Taburetka dedushkina = new Taburetka("черное дерево", "mirea", 30);
        ArrayList<Mebel>all = new ArrayList<>();
        all.add(stol);
        all.add(babushkina);
        all.add(dedushkina);
        Person one = new Person(1);
        Person two = new Person(2);
        one.addCorzina(babushkina);
        one.addCorzina(dedushkina);
        two.addCorzina(all.get(0));
    }
}
