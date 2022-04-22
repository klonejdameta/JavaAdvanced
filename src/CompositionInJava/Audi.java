package CompositionInJava;

public class Audi {

    private Benz benz2;
    int window;

    public Audi(Benz b, int w) {

        this.benz2 = b;
        this.window = w;

    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public Benz getBenz2() {
        return benz2;
    }

    public void setBenz2(Benz benz2) {
        this.benz2 = benz2;
    }
}
