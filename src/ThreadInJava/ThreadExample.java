package ThreadInJava;

public class ThreadExample {
    public static void main(String[] args) {
        Information information = new Information();
        Information information1 = new Information();
        information.start(); //krijohet nje thread dhe shfaqen jo sipas radhes
        information1.run();//therrasim metoden qe kemi krijuar dhe behen sipas radhes

        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();


    }
}
