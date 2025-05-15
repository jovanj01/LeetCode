class Solution {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        int foundIndex;

        foundIndex = strStr(haystack, needle);

        System.out.println("Found index: " + foundIndex);
    }   
    
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
