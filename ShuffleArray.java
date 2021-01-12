package com.company;

public class ShuffleArray {
        public int[] shuffle(int[] nums, int n) {
            int[] result = new int[nums.length];
            int x = 0; //first set start index
            int y = n; //second set start index
            int r= 0; //result list-->index
            for(int i=0; i<n; i++){
                result[r]=nums[x];
                result[r+1]=nums[y];
                x++;
                y++;
                r+=2; //result list index 0, index1 is occupied by x,y so increment 2 positions
            }
            return result;
        }

    public void print(int[] res) {
        for (int num : res) {
            System.out.print(num);
        }
    }

        public static void main(String[] args){
            ShuffleArray x = new ShuffleArray();
            int[] res = x.shuffle(new int[]{1,2,3,4,5,6}, 3);
            x.print(res);
            System.out.println();
            res = x.shuffle(new int[]{1,1,2,2}, 2);
            x.print(res);

        }




}

