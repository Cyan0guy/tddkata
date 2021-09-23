package com.tdd;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class AddString {

	public int Add(String numbers) {
		int sum=0,count=0,i=2;
		String regex_pattern="", new_numbers, regex_p="";
		
		if(numbers.equals("")) {
			return 0;
		}
		int newline=numbers.indexOf("\n");
//		try {
			if(numbers.charAt(0)=='/' && numbers.charAt(1)=='/' && newline>-1)
			{
				while(numbers.charAt(i)!='\n') {
					if(numbers.charAt(i)=='[' || numbers.charAt(i)==']') {
						i++;
						continue;
					}
					else if(numbers.charAt(i)=='*' || numbers.charAt(i)=='+' || numbers.charAt(i)=='?') {
						regex_p+="\\";
					}
					regex_p+=numbers.charAt(i);
					i++;
				}
				regex_pattern="("+regex_p+")";
				new_numbers=numbers.substring(newline+1);
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
				if(num>1000) {
					continue;
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
