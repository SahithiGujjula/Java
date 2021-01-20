package com.company;

public class SmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] mylist = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            mylist[i]=count;
            count=0;
        }
        return mylist;
    }
    public static void main(String[] args){
        SmallerThanCurrentNumber s = new SmallerThanCurrentNumber();
        int[] result = s.smallerNumbersThanCurrent(new int[] {6,5,4,8});
s.method(result);
    }

    public void method(int[] res){
        for (int num : res) {
            System.out.println(num);
        }
    }
}
