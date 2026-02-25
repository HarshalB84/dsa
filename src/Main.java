import arrays_hashing.*;
import strings.ValidAnagram;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /*
        int[] nums = {1,2,3,4};
        System.out.println(ContainsDuplicate.containsDuplicate(nums));

        String s = "anagram", t = "nagaram";
        System.out.println(ValidAnagram.isAnagram(s,t));

        int [] nums = {1,3,5,7,9,11};
        int target = 18;
        System.out.println(Arrays.toString(TwoSum.twoSum(nums,target)));

        int[] prices = {7,1,5,3,6,4};
        System.out.println(BestTimeToBuyAndSellStock.maxProfit(prices));

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        System.out.println(Arrays.toString(Merge_Sorted_Array.mergeSortedArray(nums1,m,nums2,n)));

        int[] nums  = {0,1,0,3,12};
        MoveZeroesToEnd.movesZeroes(nums);
        System.out.println(Arrays.toString(nums));
         */

        int[] prices = {1,2,3,4,5};
        System.out.println(BestTimetoBuyandSellStockII.stockProfit(prices));



    }
}