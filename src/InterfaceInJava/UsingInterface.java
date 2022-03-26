package InterfaceInJava;

import InterfaceInJava.InterfaceExpInClasses;

public class UsingInterface {
    public static void main(String[] args) {
        InterfaceExpInClasses interfaceExpInClasses=new InterfaceExpInClasses(3,4);
        interfaceExpInClasses.printsSum();
        interfaceExpInClasses.sum(1,2,3);

        InterfaceExpInClasses abstrClassInhert=interfaceExpInClasses;


    }
}
