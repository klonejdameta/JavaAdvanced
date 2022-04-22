package CompositionInJava;

import CompositionInJava.Audi;
import CompositionInJava.Benz;
import CompositionInJava.Bicycle;

public class Vehicles {

    public static void main(String[] args) {

        Audi audi = new Audi(new Benz(123), 4);
        Bicycle bicycle = new Bicycle("Blue", new Benz(96));
        audi.setWindow(6);
        System.out.println(audi.getWindow());
        bicycle.setColor("BLack");
        System.out.println(bicycle.getColor());

    }
}
