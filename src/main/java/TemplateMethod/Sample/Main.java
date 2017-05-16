package TemplateMethod.Sample;

/**
 * Created by kjs850 on 2017. 5. 17..
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');

        AbstractDisplay d2 = new StringDisplay("Hello, world");

        AbstractDisplay d3 = new StringDisplay("안녕하세요.");

        d1.display();
        d2.display();
        d3.display();


    }
}
