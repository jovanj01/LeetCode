
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        boolean isWordPattern;
        
        isWordPattern = wordPattern(pattern, s);

        System.out.println("Result: " + isWordPattern);
    }   

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pairs = new HashMap<>();
        String[] words = s.split(" ");
        
        if(words.length != pattern.length()){
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if(pairs.containsKey(pattern.charAt(i))){
                if(!pairs.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }else{
                if(pairs.values().contains(words[i])){
                    return false;
                }
                pairs.put(pattern.charAt(i), words[i]);
            }
        } 

        return true;
    }
}
