package arrays_hashing;

public class RemoveDulicatesFromSortedArray {

    /*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
    element appears only once. The relative order of the elements should be kept the same.
     */

    public static int removeDuplicates(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }


}
