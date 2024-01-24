package day14.solved;

public class AppInsert {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello World");
        builder.insert(5, "Beautiful ");
        System.out.println(builder.toString());
    }
}