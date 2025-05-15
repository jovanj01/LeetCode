class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean isPalin;
        
        isPalin = isPalindrome(s);

        System.out.println("Da li je '" + s + "' palindrom? " + isPalin);
    }

    public static boolean isPalindrome(String s) {
        //Obe su spore ali tako radi masa i na YT, vrv zbog metoda za replace 
        // String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        // String reversedStr = "";

        // for(int i=str.length()-1; i > -1; i--){
        //     reversedStr += str.charAt(i);
        // }

        // return str.equals(reversedStr);

        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = str.length()-1;

        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
