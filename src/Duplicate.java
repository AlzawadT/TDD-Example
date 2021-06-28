import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate {

    public Map<Character, Integer> countDuplicate(String str) {

        Map<Character, Integer> countMap = new HashMap<>();

        for(Character character: str.toCharArray()){
            if(countMap.get(character) != null){

                int currentCount = countMap.get(character) + 1;
                countMap.put(character,currentCount);

            }
            else{
                countMap.put(character,1);
            }
        }

        Set<Character> key = countMap.keySet();
        for (Character character : key) {
            if (countMap.get(character) > 1 && !str.isEmpty()) {
                System.out.println(character + " -> " + countMap.get(character));
            }

            else{
                System.out.println("Duplicate");
                break;
            }
        }

        return countMap;
    }
}
