package com.company;

public class Taburetka extends Mebel{


    public Taburetka(String texture, String company, int size) {
        super(texture, company, size);
    }

    @Override
    public void showMebel() {
        System.out.println("Стол из текстуры: " + texture + " Компания: " + company + " Размер: " + size);
    }
}
