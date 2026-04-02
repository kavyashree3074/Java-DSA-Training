package assignment2.module4;
public class StringDemo {
    public static void main(String[] args) {

        // String
        String s = "Tripillar";
        s.concat(" Solutions");
        System.out.println("String: " + s);

        // StringBuilder
        StringBuilder sb = new StringBuilder("Tripillar");
        sb.append(" Solutions");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer
        StringBuffer sbf = new StringBuffer("Tripillar");
        sbf.append(" Solutions");
        System.out.println("StringBuffer: " + sbf);
    }
}

