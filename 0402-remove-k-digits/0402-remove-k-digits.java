
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder r=new StringBuilder();
        while(!st.isEmpty()){
            r.append(st.pop());
        }
        r.reverse();
        while(r.length()>0 && r.charAt(0)=='0'){
            r.deleteCharAt(0);
        }
        return r.length()==0?"0":r.toString();
    }
}
