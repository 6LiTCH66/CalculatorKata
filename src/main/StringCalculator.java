package main;

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
			String[] string = numbers.replace("\n", ",").split(",");
			int[] arr = new int[string.length];
		
			for (int i = 0; i < string.length; i++) {
	            arr[i] = Integer.valueOf(string[i]);
	            sum += arr[i];
	        }
			
			return sum;
		}
		
		return 0;

	}
}
