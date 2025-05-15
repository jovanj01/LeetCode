class Solution {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        int number = romanToInt(s);

        System.out.println("Broj " + s + " je arapski: " + number);
    }

    public static int romanToInt(String s) {
        // I             1
        // V             5
        // X             10
        // L             50
        // C             100
        // D             500
        // M             1000

        // I can be placed before V (5) and X (10) to make 4 and 9. 
        // X can be placed before L (50) and C (100) to make 40 and 90. 
        // C can be placed before D (500) and M (1000) to make 400 and 900.

        if(s.isEmpty() || s.isBlank()){
            return 0;
        }

        int arabicNumber = 0;
        char[] strArray = s.toCharArray();

        for (int i=0; i < s.length(); i++) {
            // System.out.println(ch);
            switch (strArray[i]) {
                case 'I' -> {
                    if(i+1 == s.length()){
                        arabicNumber += 1;
                        break;
                    }
                    if(strArray[i+1] == 'V' || strArray[i+1] == 'X'){
                        arabicNumber -= 1;
                    }else{
                        arabicNumber += 1;
                    }
                }
                case 'V' -> arabicNumber += 5;
                case 'X' -> {
                    if(i+1 == s.length()){
                        arabicNumber += 10;
                        break;
                    }
                    if(strArray[i+1] == 'L' || strArray[i+1] == 'C'){
                        arabicNumber -= 10;
                    }else{
                        arabicNumber += 10;
                    }
                }
                case 'L' -> arabicNumber += 50;
                case 'C' -> {
                    if(i+1 == s.length()){
                        arabicNumber += 100;
                        break;
                    }
                    if(strArray[i+1] == 'D' || strArray[i+1] == 'M'){
                        arabicNumber -= 100;
                    }else{
                        arabicNumber += 100;
                    }
                }
                case 'D' -> arabicNumber += 500;
                case 'M' -> arabicNumber += 1000;
                default -> throw new AssertionError();
            }
        }

        return arabicNumber;
    }
}
