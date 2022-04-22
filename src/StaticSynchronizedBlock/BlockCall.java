package StaticSynchronizedBlock;

public class BlockCall {
    public static void main(String[] args) {
        hello();
        goodbye();
    }

    public static synchronized void hello() {
        System.out.println("hello");
    }

    public static void goodbye() {
        synchronized (BlockCall.class) {
            System.out.println("goodbye");
        }
    }

}
