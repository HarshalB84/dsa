import arrays_hashing.BestTimeToBuyAndSellStock;
import arrays_hashing.ContainsDuplicate;
import arrays_hashing.TwoSum;
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
        */

        int[] prices = {7,1,5,3,6,4};
        System.out.println(BestTimeToBuyAndSellStock.maxProfit(prices));


    }
}