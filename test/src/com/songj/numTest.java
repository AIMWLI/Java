package com.songj;

import java.util.Arrays;
import java.util.Comparator;
public class numTest {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 4, 9 };
        largest(arr);
    }

    static String largest(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        if (arr[0].equals("0")) {
            return "0";
        }
        for (String ele : arr) {
            sb.append(ele);
        }
        return sb.toString();
    }
}