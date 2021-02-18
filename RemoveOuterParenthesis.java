public class RemoveOuterParenthesis {
    public String removeOuterParentheses(String S) {
        StringBuilder b = new StringBuilder();
        int count = 0;
        for(char c:S.toCharArray()){
            if(c=='('){
                count++;
                if(count!=1){
                    b.append(c);
                }
            } else{
                count--;
                if(count!=0){
                    b.append(c);
                }
            }
        }
        return b.toString();
    }

    public static void main(String[] args) {
        RemoveOuterParenthesis r = new RemoveOuterParenthesis();
        String res = r.removeOuterParentheses("(()())(())(()(()))");
        System.out.println(res);
        res = r.removeOuterParentheses("(()())(())");
        System.out.println(res);
    }

}
