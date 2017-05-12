package Adapter.Sample1;

/**
 * Created by kjs850 on 2017. 5. 12..
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
//        PrintBanner p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();


    }
}
