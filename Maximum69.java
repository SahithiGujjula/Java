public class Maximum69 {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        char[] nums = s.toCharArray();
        for(int i=0;i<nums.length; i++){
            if(nums[i]=='6'){
                nums[i]='9';
                return Integer.valueOf(s.valueOf(nums));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Maximum69 m = new Maximum69();
        int max = m.maximum69Number(9669);
        System.out.println(max);
    }
}
