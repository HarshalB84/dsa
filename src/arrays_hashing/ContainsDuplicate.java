package arrays_hashing;

public class ContainsDuplicate {

    /*Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct.

     Example 1:
     Input: nums = [1,2,3,1]
     Output: true
     Explanation:
     The element 1 occurs at the indices 0 and 3.
     */


    public static boolean containsDuplicate(int[] nums){

        int length = nums.length;

        for(int i= 1; i< length; i++){
            if(nums[i-1] > nums[i]){
                return true;
            }
        }
        return false;
    }



}
