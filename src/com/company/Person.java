package com.company;

import java.util.ArrayList;

public class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    ArrayList <Mebel> corzina = new ArrayList<>();
    public void addCorzina(Mebel mebel){
        mebel.showMebel();
        corzina.add(mebel);
        System.out.println("В корзине у человека " + id + " :" + corzina.size()+" товаров");
    }
}
