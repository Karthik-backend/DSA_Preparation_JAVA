package Recursion.Arrays;

import java.util.*;

public class FindTargetNum {
    
    public static void main(String [] args){

        int[] arr = {3,2,1,18,9,10}; int target = 10;
        findTarget(arr, target, 0);
        findMultiOccurence(arr, target, 0);
        System.out.println(list);
    }
    static void findTarget(int [] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target)
            System.out.println(index);
        findTarget(arr, target, index+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findMultiOccurence(int[] arr, int target, int index){
        if(index==arr.length) return;
        if(arr[index]==target) list.add(index);
        findMultiOccurence(arr, target, index+1);
    }
}
