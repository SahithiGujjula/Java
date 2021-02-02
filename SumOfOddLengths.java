public class SumOfOddLengths {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int l = arr.length;
        for(int i=0;i<l;i++){
            int start=l-i;
            int end=i+1;
            int total=start*end;
            int odd = total/2;
            if(total%2==1){
                odd++;
            }
            sum = sum+(odd*arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfOddLengths s = new SumOfOddLengths();
        int result = s.sumOddLengthSubarrays(new int[]{1,4,2,5,3});
        System.out.println(result);
        result = s.sumOddLengthSubarrays(new int[]{10,11,12});
        System.out.println(result);
    }
}
