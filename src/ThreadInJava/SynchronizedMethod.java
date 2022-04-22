package ThreadInJava;

public class SynchronizedMethod {
    public synchronized void print() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Java " + i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}