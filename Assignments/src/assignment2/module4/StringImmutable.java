package assignment2.module4;
public class StringImmutable {
    public static void main(String[] args) {

        String str = "Tripillar";
        System.out.println("Original String: " + str);
        str.concat("Solutions");
        System.out.println("After concat(): " + str);
        str = str.concat(" Solutions");
        System.out.println("After reassignment: " + str);
    }
}
