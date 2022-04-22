package CompositionInJava;

import CompositionInJava.Benz;

public class Bicycle {
    private String color;
    private Benz benz1;


    public Bicycle(String color, Benz bn) {
        this.color = color;
        this.benz1 = bn;

    }

    public Benz getBenz1() {
        return benz1;
    }

    public void setBenz1(Benz benz1) {
        this.benz1 = benz1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
