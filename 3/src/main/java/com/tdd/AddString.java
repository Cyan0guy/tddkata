package com.tdd;

import java.util.regex.Pattern;

public class AddString {

	public int Add(String numbers) {
		int sum=0;
		if(numbers=="")
			return 0;
		else {
			//String arr[]=numbers.split(",");
			Pattern p=Pattern.compile("(,|\n)");
			String[] arr=p.split(numbers);
			for(String z:arr) {
				sum+=Integer.parseInt(z);
			}
		}
			return sum;
	}
	
}
