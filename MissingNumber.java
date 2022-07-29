package week3.day2.seleniumassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		int[] nums = {1,2,4,3,5,7,6,9,10};
		Set<Integer> numsSet = new TreeSet<Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			numsSet.add(nums[i]);
		}
		System.out.println(numsSet);
		
		List<Integer> numsList = new ArrayList<Integer>(numsSet);
		
		for(int i=0;i<numsList.size();i++)
		{
						
			if(((numsList.get(i))+1) == numsList.get(i+1))
			{
				
			}
			else
			{
				System.out.println(numsList.get(i)+1);
			}
		}
		
		
	}

}
