package ThreadInJava;

public class Information extends  Thread{
    @Override
    public void run() {
        for (int i = 1; i < 5 ; i++) {
            System.out.println("Java " + i);
        }
        try {
            Thread.sleep(100);//eshte nje metode statike e klases Thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
