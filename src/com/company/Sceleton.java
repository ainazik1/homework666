package com.company;

public class Sceleton  extends Boss{
    private int getNumberOfArrows;


    public int getGetNumberOfArrows() {
        return getNumberOfArrows;
    }

    public void setGetNumberOfArrows(int getNumberOfArrows) {
        this.getNumberOfArrows = getNumberOfArrows;
    }

    public  String printinfo(){
        return super.printinfo()+ " "+ getNumberOfArrows;
    }
}
