public class DuplicateString {

    public static void main(String[] args){
        duplicateChars("example");
    }

    public static void duplicateChars(String string) {

        char[] ch = string.toCharArray();

        for(int i = 0; i < string.length(); i++){

            for(int j = i + 1; j < string.length(); j++){

                if (ch[i] == ch[j]){
                    System.out.println(ch[j] + " -> ");
                }
            }
        }
    }

}
