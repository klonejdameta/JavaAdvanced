package ClassExmlp2.Interface;

public class WorldImplemenation {
    public static void main(String[] args) {
        //eshte nje klase qe ka bere implementimin e interface

        System.out.println("Data about planet Earth");
        Earth earth=new Earth();

        System.out.println(earth.nameOfContinent());
        earth.printName();
        System.out.println( earth.surfaceOfContinent());
        System.out.println(earth.numberOfContinents());

        World march=new March();  //interface e perdorim si datatype per nje objekt //polimorfizem ku interface sillet si klase
                                   //objektin e MArch e kalojme si datatype te World
        System.out.println("Data of March");
        System.out.println(march.nameOfContinent());
        System.out.println(march.numberOfContinents());
        System.out.println(march.surfaceOfContinent());
        march.printName();


    }
}
