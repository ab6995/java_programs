package com.ashish;

public class Printer {
    private int tonerlevel;
    private int numberofpages;
    private boolean duplex;

    public Printer(int tonerlevel, int numberofpages, boolean duplex) {
        this.tonerlevel = tonerlevel;
        this.numberofpages = numberofpages;
        this.duplex = duplex;
    }

    public Printer(int tonerlevel, boolean duplex) {
        if (tonerlevel > -1 && tonerlevel <= 100) {
            this.tonerlevel = tonerlevel;
        } else {
            this.tonerlevel = -1;
        }
        this.duplex = duplex;
        this.numberofpages = 0;
    }

    public int addtoner(int toneramount) {
        if (toneramount > 0 && toneramount <= 100) {
            if (this.tonerlevel + toneramount > 100) {
                return -1;
            }
            this.tonerlevel += toneramount;
            return this.tonerlevel;
        } else {
            return -1;
        }

    }

    public int printpages(int pages) {
        int pagestoprint = pages;
        if (this.duplex) {
            pagestoprint /= 2;
            System.out.println("printing in duplex mode");
        }
        this.numberofpages += pagestoprint;
        return pagestoprint;
    }

    public int getNumberofpages() {
        return numberofpages;
    }
}


