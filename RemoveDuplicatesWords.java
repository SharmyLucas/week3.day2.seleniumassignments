package week3.day2.seleniumassignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		
		String[] strArray = text.split(" ");
		for(int i=0;i<strArray.length;i++)
		{
			System.out.println(strArray[i]);
		}
		
		
		Set<String> unique =new LinkedHashSet<String>();
		
		
		for(int i=0;i<strArray.length;i++)
		{
			unique.add(strArray[i]);
		}
		
		System.out.println(unique);

	}

}
