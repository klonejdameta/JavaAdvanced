package ClassExmlp2.Interface;

public class March implements World {

    public static Integer NUMBER_OF_CONTINENT =5;// variablat static jane gjithmone me shkronje te madhe
    public  static  String FIRST_CONTS="March";
    public  static  Double AREA=0.0d;

    @Override
    public Integer numberOfContinents() {
        return NUMBER_OF_CONTINENT;
    }

    @Override
    public void printName() {

    }

    @Override
    public String nameOfContinent() {
        return null;
    }

    @Override
    public double surfaceOfContinent() {
        return 0;
    }
}
