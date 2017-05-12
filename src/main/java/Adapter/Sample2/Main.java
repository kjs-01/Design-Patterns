package Adapter.Sample2;

import Adapter.Sample1.Print;
import Adapter.Sample1.PrintBanner;

/**
 * Created by kjs850 on 2017. 5. 12..
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();


    }
}
