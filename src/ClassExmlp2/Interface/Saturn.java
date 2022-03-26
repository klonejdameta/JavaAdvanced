package ClassExmlp2.Interface;

public class Saturn implements World {
    @Override
    public Integer numberOfContinents() {
        return 10;
    }

    @Override
    public void printName() {
        System.out.println("This planet is Saturn");

    }

    @Override
    public String nameOfContinent() {
        String str="Galaxy";
        return str;
    }

    @Override
    public double surfaceOfContinent() {
        return 0.0d;
    }
}
