package assignment.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> list=new ArrayList<>();
		
		List<Integer> num1=Arrays.asList(11,22,33);
		List<Integer> num2=Arrays.asList(9,19,29);
		List<Integer> num3=Arrays.asList(7,17,27);
		
		list.add(num1);
		list.add(num2);
		list.add(num3);
		
		System.out.println("Combined list is "+list);
		
		

	}

}
