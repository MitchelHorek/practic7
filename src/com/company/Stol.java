package com.company;

public class Stol extends Mebel{


    private int sticks;

    public Stol(String texture, String company, int size, int sticks) {
        super(texture, company, size);
        this.sticks = sticks;

    }

    @Override
    public void showMebel() {
        System.out.println("Стол из текстуры: " + texture + " Компания: " + company + " Размер: " + size +
                " Количество ножек: " + sticks);
    }
}
