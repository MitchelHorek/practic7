package com.company;

public abstract class Mebel {
    protected String texture;
    protected String company;
    protected int size;

    public Mebel(String texture, String company, int size){
        this.texture = texture;
        this.company = company;
        this.size = size;

    }


    public abstract void showMebel();
}

