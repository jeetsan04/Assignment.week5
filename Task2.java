package assignment.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str=Arrays.asList( "Git", "Github", "GitLab","GitBash", "Selenium", "Java", "Maven");
		List<String> str2= new  ArrayList<>();
		
		for (int i = 0; i < str.size(); i++) 
		{
			if (str.get(i).contains("Git")) 
			{
				System.out.println(str.get(i));
				
				
			}
			
		}
		

	}

}
