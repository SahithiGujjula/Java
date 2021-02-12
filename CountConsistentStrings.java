import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char c: allowed.toCharArray()){
            set.add(c);
        }
        int count = 0;
        for(String s: words){
            boolean consistent = true;
            for(char c: s.toCharArray()){
                if(!set.contains(c)){
                    consistent = false;
                    break;
                }
            }

            if(consistent){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountConsistentStrings c = new CountConsistentStrings();
        int res = c.countConsistentStrings("abc", new String[] {"a","b","c","ab","ac","bc","abc"});
        System.out.println(res);
    }
}
