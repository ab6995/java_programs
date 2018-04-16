package com.ashish;

public class Lamp {
    private String style;
    private boolean battery;
    private int globrating;

    public Lamp(String style, boolean battery, int globrating) {
        this.style = style;
        this.battery = battery;
        this.globrating = globrating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobrating() {
        return globrating;
    }
    public void turnnon(){
        System.out.println("Turned On");
    }
}
