package ThreadExample;

public class CallMethod {
    public static void main(String[] args) {
        PrintFromThread printFromThread = new PrintFromThread();
        printFromThread.run();
    }
}
