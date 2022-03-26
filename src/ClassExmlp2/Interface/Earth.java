package ClassExmlp2.Interface;

public class Earth implements World {

    public static Integer NUMBER_OF_CONTINENTS =7;// variablat static jane gjithmone me shkronje te madhe
    public  static  String FIRST_CONT="Panagea";
    public  static  Double AREA=70.30d;

    @Override   //annotation
    public Integer numberOfContinents() {
        return NUMBER_OF_CONTINENTS;
    }

    @Override
    public void printName() {
        System.out.println("Milk Way");

    }

    @Override
    public String nameOfContinent() {
        return FIRST_CONT;
    }

    @Override
    public double surfaceOfContinent() {
        return AREA;
    }
}
