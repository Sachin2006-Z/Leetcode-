class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        StringBuilder r1=new StringBuilder();
        StringBuilder r2=new StringBuilder();
        int i=0,j=0;
        while(i<s.length()){
            if(s.charAt(i)=='#'){
                if(!s1.isEmpty()) s1.pop();
            }
            else{
                s1.push(s.charAt(i));
            }
            i++;
        }
        while(j<t.length()){
            if(t.charAt(j)=='#'){
                if(!s2.isEmpty()) s2.pop();
            }
            else{
                s2.push(t.charAt(j));
            }
            j++;
        }
        r1.append(s1);
        r2.append(s2);
        return r1.toString().equals(r2.toString());
    }
}