package week3.day2.seleniumassignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};

				
		Set<Integer> unique = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			unique.add(data[i]);
		}
		System.out.println(unique);
		List<Integer> secondLargest = new ArrayList<Integer>(unique);
		int size = secondLargest.size();
		
		System.out.println(secondLargest.get(size-2));
	}

}
