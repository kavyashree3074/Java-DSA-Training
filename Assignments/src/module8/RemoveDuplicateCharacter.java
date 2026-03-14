package module8;
//Remove duplicate characters from a string.
public class RemoveDuplicateCharacter {
    public static void main(String[] args) {

        String str = "programming";
        String result = "";

        for(int i = 0; i < str.length(); i++){

            if(result.indexOf(str.charAt(i)) == -1)
                result += str.charAt(i);
        }

        System.out.println(result);
    }
}
