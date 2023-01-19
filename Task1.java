package assignment.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str=Arrays.asList("Java","Selenium","TestNG","Git", "Github");
		System.out.println("Original String order is: "+str);
		
		
		Collections.reverse(str);
		System.out.println("Reverse order is: "+str);
	
		
	}

}
