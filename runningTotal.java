package com.company;

class runningTotal {

    public int[] runningSum(int[] nums) {
        int l= nums.length;
        for(int i=1; i<l; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }


    public static void main(String[] args){
        runningTotal r = new runningTotal();
        int[] res = r.runningSum(new int[]{1,2,3,4});
        r.method(res);
        res = r.runningSum(new int[]{1,1,1,1,});

    }

    public void method(int[] res){
        for (int num : res) {
            System.out.println(num);
        }
    }
}
