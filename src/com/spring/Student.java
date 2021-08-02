package com.spring;

public class Student {

    private int id;

    public void setiCheat(Cheat iCheat) {
        this.iCheat = iCheat;
    }

    Cheat iCheat;

    public void setId(int id) {
        this.id = id;
    }


    public void mathCheat()
    {
        iCheat.cheat();
        System.out.println("id is :" +id);
    }

}
