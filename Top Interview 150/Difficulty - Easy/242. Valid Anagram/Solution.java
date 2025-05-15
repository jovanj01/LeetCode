class Solution {
    public static void main(String[] args){
        String s= "rat", t = "car";
        boolean isAnag;

        isAnag = isAnagram(s, t);

        System.out.println("Resulttt: " + isAnag);
    }

    public static boolean isAnagram(String s, String t) {
        int[] chars = new int[26];

        if(t.length() != s.length()){
            return false;
        }

        for (Character ch : s.toCharArray()) {
            chars[ch - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            chars[t.charAt(i) - 'a']--;

            if(chars[t.charAt(i)- 'a'] < 0){
                return false;
            }
        }

        return true;
    }
}
