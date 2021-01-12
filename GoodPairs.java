package com.company;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int l = nums.length;
        int pairs = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums[i] == nums[j] && i < j) {
                    pairs++;

                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        GoodPairs p = new GoodPairs();
        System.out.println(p.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        System.out.println(p.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }



}
