import java.util.Stack;

class Solution {
    public static void main(String[] args){
        String s = "([}}])";
        boolean res;

        res = isValid(s);

        System.out.println("Parentheses result: " + res);
    } 

    public static boolean isValid(String s){
        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(ch == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else{
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}
