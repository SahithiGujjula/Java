package com.company;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetArray = new ArrayList<>();//initializing list targetArray
        for(int i = 0; i < nums.length; i++){ // Loop to add nums into targetArray
            targetArray.add(index[i], nums[i]);
        }
        // converting list into int array
        for(int i = 0; i < nums.length; i++){
            nums[i] = targetArray.get(i);
        }
        return nums;
    }

    public void print(int[] res){ //method to print targetArray
        for (int num : res) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        CreateTargetArray t = new CreateTargetArray();
        int[] res = t.createTargetArray (new int []{0,1,2,3,4}, new int[]{0,1,2,2,1});
        t.print(res);
    }
}
