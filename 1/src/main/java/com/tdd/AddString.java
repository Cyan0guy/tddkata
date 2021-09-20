package com.tdd;

public class AddString {

	public int Add(String numbers) {
		int sum=0;
		if(numbers=="")
			return 0;
		else {
			String arr[]=numbers.split(",");
			for(String z:arr) {
				sum+=Integer.parseInt(z);
			}
		}
			return sum;
	}
	
}
