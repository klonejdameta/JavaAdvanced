package InterfaceInJava;

import InterfaceInJava.InterfaceExp;
import InterfaceInJava.InterfaceExp2;

public class InterfaceExpInClasses implements InterfaceExp, InterfaceExp2 { //per te vendosur disa interface

    private  int nr1;
    private  int nr2;
    public InterfaceExpInClasses(){//best practise ta deklarojme konstruktoin default, konstrukori na sherben per ti dhene vlera variablave.

    }

    public  InterfaceExpInClasses(int nr1, int nr2){
        this.nr1=nr1;
        this.nr2=nr2;    //this perdoret per aksesim variablash e metodash te klases ku jemi
    }
    @Override
    public void printsSum() {

    }

    @Override
    public void printSum() {
        System.out.println("This is an interface implementation");

    }

    @Override
    public int sum(int a, int b, int c) {
        return nr1+nr2;
    }

    @Override
    public int multiply(int x, int y) {
        return nr1*nr2;
    }
}

//munt te perdorim me shume se nje interface brenda nje klase