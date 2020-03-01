import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class NonRepeatingChar {
    public static void main(String[] args) {
        //System.out.println(getStreamOfNonRepeatingChar("aabccdb"));

        Map<A,String> map= new HashMap<>();
        map.put(new A(),"123");
        map.put(new A(),"456");
        System.out.println(map.toString());

    }

    //as there can be multiple non repeating letters we cant use variables
    //we will need queue
    public static String getStreamOfNonRepeatingChar(String string){
        if(string.length()>0) {
            char stringArr[] = string.toCharArray();

            LinkedList<Character> nonRepeatedCharQueue = new LinkedList<>();

            Set<Character> repeatedChar = new HashSet<>();

            StringBuilder response = new StringBuilder(stringArr.length);
            //storing 1st element
            nonRepeatedCharQueue.add(stringArr[0]);
            response.append(stringArr[0]);

            //iterating over given string arr
            for (int i = 1; i < stringArr.length; i++) {
                //check if letter is present in nonrepeated queue or in already repeated list
                if (nonRepeatedCharQueue.contains(stringArr[i]) || repeatedChar.contains(stringArr[i])) {
                    repeatedChar.add(stringArr[i]);
                    nonRepeatedCharQueue.removeFirstOccurrence(stringArr[i]);
                    if (nonRepeatedCharQueue.size() <= 0) {
                        response.append(-1);
                    } else {
                        response.append(nonRepeatedCharQueue.get(0));
                    }
                } else {
                    nonRepeatedCharQueue.add(stringArr[i]);
                    response.append(nonRepeatedCharQueue.get(0));
                }
            }
            return response.toString();
        }
        return null;
    }
}
