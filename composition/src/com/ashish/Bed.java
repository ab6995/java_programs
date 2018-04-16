package com.ashish;

public class Bed {
    private String style;
    private int pillows;
    private int sheets;
    private int hieght;
    private int quilt;

    public Bed(String style, int pillows, int sheets, int hieght, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.sheets = sheets;
        this.hieght = hieght;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getHieght() {
        return hieght;
    }

    public int getQuilt() {
        return quilt;
    }
    public void make(){
        System.out.println("Bed -> making ");
    }
}
