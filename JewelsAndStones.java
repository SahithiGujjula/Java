package com.company;

public class JewelsAndStones {
        public int numJewelsInStones(String jewels, String stones) {
            int count = 0;
            for(int i=0; i<stones.length(); i++){
                char stone = stones.charAt(i);
                for(int j=0; j<jewels.length(); j++){
                    char jewel = jewels.charAt(j);
                    if (stone == jewel){
                        count++;
                    }
                }
            } return count;
        }

        public static void main(String[] args){
            JewelsAndStones j = new JewelsAndStones();
           System.out.println(j.numJewelsInStones("aA", "aaAAAbbbb"));
        }

}
