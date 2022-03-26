package GenerikTypes;

public class GenerikExp {
    public static void main(String[] args) {
        test(1);
        test("Kloi");
        test(24F);

    }
    public  static <T> void  test(T i){ //per te perdorur nje generic types
        System.out.println(i.toString());//mund te deklarojm edhe nje klase me generik type <T>,nuk te lejon te krijosh
                                         //konstruktor pa parametra
    }
}
