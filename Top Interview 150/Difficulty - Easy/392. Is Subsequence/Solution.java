class Solution {
    public static void main(String[] args) {
        String s = "aaaaaa", t = "bbaaaa";
        boolean isSubsequenceOfT;

        isSubsequenceOfT = isSubsequence(s, t); 

        System.out.println("Is s subsequence of t? " + isSubsequenceOfT);
    }

    public static boolean isSubsequence(String s, String t) {
        //ovo resenje je dobro ali zadatak je u sekciji 2 pointers, tako da kontam da je trebalo da se iterira sa dva pointera sa pocetka i kraja
        int lastIndex = 0;
        int counter = 0;
        for (int j = 0; j < s.length(); j++) {  
            for (int i = lastIndex; i < t.length(); i++) {
                if(t.charAt(i) == s.charAt(j)){
                    if(i < lastIndex){
                        return false;
                    }
                    
                    lastIndex = i + 1;
                    counter++;

                    break;
                }                
            }
        }

        return counter == s.length();
    }
}
