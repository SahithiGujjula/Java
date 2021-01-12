package com.company;

public class RichestCustomer {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            max = Math.max(max, wealth);
        }
        return max;
    }


    public static void main(String[] args) {
        RichestCustomer r = new RichestCustomer();
        System.out.println(r.maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
        System.out.println(r.maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}}));
        System.out.println(r.maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
    }


}