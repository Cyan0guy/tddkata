package com.tdd;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class AddString {

	public int Add(String numbers) {
		int sum=0,count=0;
		String regex_pattern="", new_numbers;
		if(numbers.equals("")) {
			return 0;
		}
		
//		try {
			if(numbers.charAt(0)=='/' && numbers.charAt(1)=='/' && numbers.charAt(3)=='\n')
			{
				regex_pattern+="("+numbers.charAt(2)+")";
				new_numbers=numbers.substring(4);
			}
			else
			{
				regex_pattern+="(,|\n)";
				new_numbers=numbers;
			}
			Pattern p=Pattern.compile(regex_pattern);
			String[] arr=p.split(new_numbers);
			String negative="";
			for(String z:arr) {
				int num=Integer.parseInt(z);
				if(num<0) {
					negative+=num;
					count++;
				}
				
				sum+=num;
			}
			if(count>0) {
				throw new NumberFormatException("negatives not allowed"+negative);
			}
//		}
//		catch(NumberFormatException e) {
//			System.out.println("negatives not allowed"+e.toString().substring(32));
//		}
//		catch(Exception e) {
//			sum=0;
//		}
			return sum;
	}
	
}
