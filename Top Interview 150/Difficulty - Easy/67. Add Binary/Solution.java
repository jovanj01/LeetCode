
class Solution{
    public static void main(String[] args){
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"; 
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String res = addBinary(a, b);

        System.out.println(res);
    }

    public static String addBinary(String a, String b){
        //sporo i memory inefficient
        // BigInteger aBig = new BigInteger(a, 2);
        // BigInteger bBig = new BigInteger(b, 2);
        // BigInteger sum = aBig.add(bBig);

        // return sum.toString(2);
        
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        int sum;
        StringBuilder result = new StringBuilder();

        while(i >= 0 || j >= 0){
            sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum%2);
            carry = sum / 2;
        }
        if(carry != 0) result.append(carry);
        return result.reverse().toString();
    }
}