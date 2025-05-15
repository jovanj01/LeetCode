

class Solution {
    public static void main(String[] args) {
        String word = "luffy is still joyboy";

        int lastWordLength = lengthOfLastWord(word);

        System.out.println(lastWordLength);
    }

    public static int lengthOfLastWord(String s) {
        //works but slow and memory inefficient
        // int lastWordLength = 0;
        // String[] wordsArray = s.split(" ");
// 
        // lastWordLength = wordsArray[wordsArray.length-1].length();
        // 
        // return lastWordLength;


        //dobro resenje
        int length = 0;
        int i = s.length() - 1;

        // Preskoči praznine na kraju
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Broji slova poslednje reči
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
