package com.company;

import java.util.ArrayList;
import java.util.List;

public class DecompressRLE {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<Integer>(); // initializing array list and assigning to res.

        for(int i=0; i<nums.length-1; i+=2){ // freq loop
            for(int j=0; j<nums[i]; j++){ //value loop with length=length of freq
                res.add(nums[i+1]); //add value into list
            }
        }
        // convert list to array
        int n = res.size(); //declaring size of array
        int[] result = new int[n]; //initializing array and assigning to result
        for(int i = 0; i < n; i++){
            result[i] = res.get(i); //getting list elements into array
        }

        return result;
    }

    public void print(int[] res){
        for (int num : res) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        DecompressRLE d = new DecompressRLE();
        int[] result = d.decompressRLElist(new int[]{1,1,2,3});
        d.print(result);
    }


}
