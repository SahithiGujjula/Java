package com.company;

public class ShuffleStrings {

        public String restoreString(String s, int[] indices) {
            int len = s.length();
            char[] a = new char[len];

            for(int i = 0; i < len; ++i) {
                a[indices[i]] = s.charAt(i);
            }

            return new String(a);
        }

    public static void main(String[] args) {
        ShuffleStrings a = new ShuffleStrings();
        System.out.println(a.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        System.out.println(a.restoreString("aiohn", new int[]{3, 1, 4, 2, 0}));
        System.out.println(a.restoreString("art", new int[]{1, 0, 2}));
    }
}
