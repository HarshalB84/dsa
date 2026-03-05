package arrays;

import java.util.ArrayList;

public class AlternateElementsOfAnArray {

    public static ArrayList<Integer> getAlternates(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length;i+=2){
            list.add(nums[i]);
        }

        return list;
    }

}
