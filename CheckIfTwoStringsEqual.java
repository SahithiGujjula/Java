public class CheckIfTwoStringsEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();

        for(String s: word1){
            x.append(s);

        }
        for(String s: word2){
            y.append(s);
        }
        if(x.toString().equals(y.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfTwoStringsEqual check = new CheckIfTwoStringsEqual();
        System.out.println(check.arrayStringsAreEqual(new String[] {"ab", "c"}, new String[]{"a", "bc"}));
        System.out.println(check.arrayStringsAreEqual(new String[] {"a", "cb"}, new String[]{"ab", "c"}));
    }
}
