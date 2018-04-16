package com.ashish;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Western", 2,1,3,2);
        Lamp lamp = new Lamp("Classic", false, 78);
        Bedroom bedroom = new Bedroom("ashish's",wall1,wall2,wall3,wall4, ceiling,bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnnon();
    }

}
