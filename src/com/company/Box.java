package com.company;

public class Box {
    int dlina;
    int shirina;
    int visota;

    Box(int dlina, int shirina, int visota) {
        this.dlina = dlina;
        this.shirina = shirina;
        this.visota = visota;
        int vivod = dlina * shirina * visota;
        System.out.println(vivod);

    }
    public static void vi(){
        Box box = new Box(3,3,3);
        System.out.println(box);

    }

    public Box(int dlina) {
        this.dlina = dlina;
    }

    public void setDlina(int dlina) {
        this.dlina = dlina;
        dlina = 10;
    }

    public int getShirina() {
        return shirina;
    }

    public int getDlina() {
        return dlina;
    }
}

