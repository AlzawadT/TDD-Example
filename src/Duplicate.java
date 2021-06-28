import java.util.HashMap;
import java.util.Map;

public class Duplicate {

    public Map<Character, Integer> countDuplicate(String str) {

        Map<Character, Integer> countMap = new HashMap<>();

        for(Character character: str.toCharArray()){
            if(countMap.get(character) != null){

                int currentCount = countMap.get(character) + 1;
                countMap.put(character,currentCount);

                System.out.println(character + " -> "+ currentCount);
            }
            else{
                countMap.put(character,1);
            }
        }


        return countMap;
    }
}
