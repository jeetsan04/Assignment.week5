package assignment.week5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str1=Arrays.asList("Java","TestNG", "Maven","Java");
		
		//1-To remove duplicate element
		
		/*HashSet<Integer> number=new HashSet<>(values);
		System.out.println(number);
		*/
		
		// 2- To remove duplicate element
		
		HashSet<String> str2=new HashSet<>();
		str2.addAll(str1);
		System.out.println(str2);
		
		

	}

}
