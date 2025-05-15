class Solution{
    public static void main(String[] args) {
        String[] stringArray = {"aaa","aa","aaa"};
        String prefix;

        prefix = longestCommonPrefix(stringArray);

        System.out.println("Najmanji prefix je: " + prefix + ".");
    }

    public static String longestCommonPrefix(String[] strs) {
        //Moje resenje: radi ali je sporo
        // String prefixCandidate;

        // if(strs.length == 0){
        //     return "";
        // }

        // if(strs.length == 1){
        //     return strs[0];
        // }

        // prefixCandidate = strs[0];
        // String tempCandidate = "";
        // int j=0;
        // for (int i=1; i < strs.length; i++) {
        //     if(strs[i].isEmpty() || prefixCandidate.isEmpty()){
        //         return "";
        //     }
        //     while (j < strs[i].length() && j < prefixCandidate.length() && prefixCandidate.charAt(j) == strs[i].charAt(j)){
        //         tempCandidate += prefixCandidate.charAt(j);
        //         j++;
        //     }

        //     prefixCandidate = tempCandidate;
        //     tempCandidate = "";

        //     if(j == 0){
        //         return "";
        //     }

        //     j=0;
        // }

        // return prefixCandidate; 

        //ovo je dobro resenje
        if(strs.length == 0) return "";
        String prefixCandidate = strs[0];
        for (int i=1; i < strs.length; i++){
            while(strs[i].indexOf(prefixCandidate) != 0){
                prefixCandidate = prefixCandidate.substring(0, prefixCandidate.length()-1);
            }
        }
        return prefixCandidate;
    }
}