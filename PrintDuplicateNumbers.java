package week3.day2.seleniumassignments;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,4,3,5,7,4,2,6,9,10};
		
		Set<Integer> unique = new HashSet<Integer>();
		
		for(int i =0; i<nums.length;i++)
		{
			boolean add = unique.add(nums[i]);
			if(!add)
			{
				System.out.println(nums[i]);
			}
		}
	}
}
