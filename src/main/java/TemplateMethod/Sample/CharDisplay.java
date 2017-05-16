package TemplateMethod.Sample;

/**
 * Created by kjs850 on 2017. 5. 17..
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    public void open() {
        System.out.print("<<");
    }

    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.println(">>");
    }
}
