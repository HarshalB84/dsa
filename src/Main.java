import arrays_hashing.ContainsDuplicate;
import strings.ValidAnagram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /*
        int[] nums = {1,2,3,4};
        System.out.println(ContainsDuplicate.containsDuplicate(nums));
        */

        String s = "anagram", t = "nagaram";

        System.out.println(ValidAnagram.isAnagram(s,t));


    }
}