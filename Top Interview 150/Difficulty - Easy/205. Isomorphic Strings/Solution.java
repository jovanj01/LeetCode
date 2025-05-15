
import java.util.HashMap;

class Solution {
    public static void main(String[] args){
        String s = "bbbaaaba", t = "aaaffffa";
        boolean areIsomorphic;

        areIsomorphic = isIsomorphic(s, t);

        System.out.println("Rezultat: " + areIsomorphic);
    }

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> charPairs = new HashMap<>();

        char temp;

        for (int i = 0; i < s.length(); i++) {
            if(charPairs.containsKey(s.charAt(i))){
                temp = charPairs.get(s.charAt(i));
                if(temp != t.charAt(i)){
                    return false;
                }
            }else{
                if (charPairs.values().contains(t.charAt(i))) {
                    return false;
                }else{
                    charPairs.put(s.charAt(i), t.charAt(i));
                }
            }
        }
    
        return true;
    }
}