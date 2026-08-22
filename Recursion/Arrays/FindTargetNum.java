package Recursion.Arrays;

import java.util.*;

public class FindTargetNum {
    
    public static void main(String [] args){

        int[] arr = {3,2,1,18,9,10,3,3}; int target = 3;
        findTarget(arr, target, 0);
        System.out.println(findMultiOccurence(arr, target, 0, new ArrayList<>()));
    }
    static void findTarget(int [] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target)
            System.out.println(index);
        findTarget(arr, target, index+1);
    }

    static ArrayList<Integer> findMultiOccurence(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length) return list;
        if(arr[index]==target) list.add(index);
        return findMultiOccurence(arr, target, index+1, list);
    }
}
