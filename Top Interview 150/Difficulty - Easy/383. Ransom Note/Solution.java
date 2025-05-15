

class Solution {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        boolean works;

        works = canConstruct(ransomNote, magazine);

        System.out.println("works? " + works);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        //radi resenje, brda sporo
        // HashMap<Character, Integer> magazineMap = new HashMap<>();
        // char charTemp;
        // int temp;

        // for (int i=0; i < magazine.length(); i++) {
        //     charTemp = magazine.charAt(i);
        //     if(magazineMap.containsKey(charTemp)){
        //         temp = magazineMap.get(charTemp);
        //         magazineMap.put(charTemp, ++temp);
        //     }else{
        //         magazineMap.put(charTemp, 1);
        //     }
        // }

        // for (char ch : ransomNote.toCharArray()) {
        //     if(!magazineMap.containsKey(ch)){
        //         return false;
        //     }

        //     temp = magazineMap.get(ch);
        //     temp--;
        //     System.out.println(ch);
        //     System.out.println(temp);

        //     if (temp < 0){
        //         return false;
        //     }

        //     magazineMap.put(ch, temp);
        // }

        // return true;
        //ovo je bolje resenje
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}
