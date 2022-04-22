package StaticSynchronizedBlock;

public class SynchronizedBlock {
    static void printTable(int n) {
        synchronized (SynchronizedBlock.class) {//synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
            }
        }
    }
}