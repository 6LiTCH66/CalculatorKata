package main;

import java.util.Arrays;
import java.lang.Throwable;


public class StringCalculator {
	public int Add(String numbers) {
		if(numbers.equals("")) {
			return 0;
		}
		else if (numbers.matches("[0-9]+")) {
			return Integer.parseInt(numbers);
		}
			
		else if (numbers.contains(",") || numbers.contains("\n")) {
			int sum = 0;
			//numbers.replaceAll("[", ",").replaceAll("]", ",").replaceAll("*", ",");
			String[] string = Arrays.stream(numbers.replace("\n", ",").replaceAll("//", ",").replaceAll(";", ",")
					.replaceAll("\\[|\\]", ",").replace("*", ",").replace("%", ",").replaceAll("[a-zA-Z]", ",")
					.split(",")).filter(e -> e.trim().length() > 0).toArray(String[]::new);
			int[] arr = new int[string.length];
			
			for (int i = 0; i < string.length; i++) {
	            arr[i] = Integer.valueOf(string[i]);
	            
	            if(arr[i] < 0) {
	            	throw new IllegalArgumentException("negatives not allowed:" + arr[i] + "," + arr[i]);
	            }
	            
	            if(arr[i] > 1000) {}
	            else {
	            	sum += arr[i];
	            }
	            

	        }
			return sum;
		}
		
		return 0;

	}
}
