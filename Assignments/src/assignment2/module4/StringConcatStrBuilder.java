package assignment2.module4;
public class StringConcatStrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Tripillar");
        sb.append(" Solutions");
        String result = sb.toString();
        System.out.println("After Concatenation: " + result);
    }
}
