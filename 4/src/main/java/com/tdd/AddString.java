package com.tdd;

import java.util.regex.Pattern;

public class AddString {

	public int Add(String numbers) {
		int sum=0;
		String regex_pattern="", new_numbers;
		
		try {
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
			for(String z:arr) {
				sum+=Integer.parseInt(z);
			}
		}
		catch(Exception e) {
			sum=0;
		}
			return sum;
	}
	
}
