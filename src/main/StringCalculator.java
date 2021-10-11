package main;

import java.util.ArrayList;

import java.util.Arrays;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;

public class StringCalculator {
	public int Add(String numbers) throws IllegalArgumentException {
		if(numbers.equals("")) {
			return 0;
		}
		else if (numbers.matches("[0-9]+")) {
			return Integer.parseInt(numbers);
		}
		
		
		else if (numbers.contains(",") || numbers.contains("\n")) {
			int sum = 0;
			
			String[] string = Arrays.stream(numbers.replace("\n", ",").replaceAll("//", ",").replaceAll(";", ",")
					.replaceAll("\\[|\\]", ",").replace("*", ",").replace("%", ",").replaceAll("[a-zA-Z]", ",")
					.split(",")).filter(e -> e.trim().length() > 0).toArray(String[]::new);
			
			int[] arr = new int[string.length];
			
			
			if(Arrays.toString(string).contains("-")) {
				sum = 0;
				
			}
			
			else {
				for (int i = 0; i < string.length; i++) {
		            arr[i] = Integer.valueOf(string[i]);
		            
		            if(arr[i] > 1000) {
		            	
		            }
		            
		            else {
		            	sum += arr[i];
		            }
		        }
				
			}
			return sum;	
		}
		
		return 0;

	}
}
