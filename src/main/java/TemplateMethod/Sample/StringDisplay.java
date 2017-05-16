package TemplateMethod.Sample;

/**
 * Created by kjs850 on 2017. 5. 17..
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("|" +  string + "|");
    }

    public void close() {
        printLine();
    }

    private void printLine() {
    }
}