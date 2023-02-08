//https://leetcode.com/problems/determine-if-string-halves-are-alike/
class Solution {
    public boolean halvesAreAlike(String s) {
        if(s.length()==0){
            return false;
        }
        int n = s.length();
        String a = s.substring(0, n/2).toLowerCase();
        String b = s.substring(n/2, n).toLowerCase();
        
        int aCount = vowelCount(a);
        int bCount = vowelCount(b);
        
        return aCount==bCount;
        
    }
    public int vowelCount(String a) {
        int vCount=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                vCount++;
            }
        }
        return vCount;
    }
}
