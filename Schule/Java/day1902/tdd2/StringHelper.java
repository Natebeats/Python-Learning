package day1902.tdd2;

public class StringHelper {
	
	public String reverse(String input) {
		return new StringBuilder(input).reverse().toString();
	}

	public String reverse2(String input) {
		String result = "";
		int i;
		for(i=input.length();i>=0;i--) {
			result += input.substring(i,i+1);
		}
		return result;
	}

}
