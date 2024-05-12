package javachallenges;

public class challenges {
	//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
	public static int sumDouble(int a, int b) {
		if(a == b) {
			return (4*a);
		} else {
			return (a+b);
		}
	}
	
	/*You are given two vectors starting from the origin (x=0, y=0) with coordinates (x1,y1) and 
	(x2,y2). Your task is to find out if these vectors are collinear. Collinear vectors are vectors 
	that lie on the same straight line. They can be directed in the same or opposite directions. One vector 
	can be obtained from another by multiplying it by a certain number. In terms of coordinates, 
	vectors (x1, y1) and (x2, y2) are collinear if (x1, y1) = (k*x2, k*y2) , where k is any number 
	acting as a coefficient.*/
	
	public static boolean collinearity(int x1, int y1, int x2, int y2) {
	    return x1 * y2 == y1 * x2;
	}
	
	//Finds the range between letters.
	public static String gimmeTheLetters(String s){
	    char[] alpha = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
	    System.out.println(alpha.toString());
	    char[] ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	    char[] range = s.toCharArray();
	    char start = range[0];
	    char end = range[2];
	    String result = "";
	    
	    for (int i = 0; i < 26; i++) {
	    	if (start == end) {
	    		result = result + start;
	    		break;
	    	} else if (start == alpha[i]) {
	    		result += alpha[i];
	    		start = alpha[i+1];
	    	} else if (start == ALPHA[i]) {
	    		result += ALPHA[i];
	    		start = ALPHA[i+1];
	    	}
	    } 
	    return result;
	}
		
	/*Your code must return true or false (not 'true' and 'false') depending upon whether 
	the given number is a Narcissistic number in base 10.*/
	public static boolean isNarcissistic(int number) {
        char[] c = String.valueOf(number).toCharArray();
        int nar = 0;
        for (int i = 0; i < c.length; i++) {
            nar += Math.pow((c[i] - '0'),(c.length));
        }
        return (nar == number);
    }
		
	//Converts a stream of words into a sentence.
	public static String smash(String... words) {
	    if (words.length == 0) {
	    	return "";
	    }
	    String sentence = words[0];
	    for (int i = 1; i < words.length; i++) {
	    	sentence += " " + words[i];
	    }
	    return sentence;
	}
	
	//Checker whether number is a Square Number.   
	public static boolean isSquare(int n) {        
	    if (n < 0) {
	   		return false;
	   	} else{
	   		return (Math.pow(((int) Math.sqrt(n)),2) == n);
	   	}
    }
	
	
	//Checks if a sentence is a Pangram. Contains every letter in the alphabet.
	public boolean check(String sentence){
		for (char c = 'a'; c<='z'; c++){
			if (!(sentence.toLowerCase().contains("" + c))){
				return false;
			}
		}
		return true;
	}
	
	//Counts the amount of distinct case-insensitive alphabetic characters and numeric 
	//digits that occur more than once in the input string.
	
	public static int duplicateCount(String text) {
		int count = 0;
	    text = text.toLowerCase();
	    while (text != "") {
	    	String c = Character.toString(text.charAt(0));
	    	if (text.length() - (text.replace(c, "")).length() > 1){
	    		count += 1;
	    		text = text.replace(c, "");
	    	}
	      text = text.replace(c, "");
	    }
	    return count;
	}
	
	//Create a function taking a positive integer between 1 and 3999 (both included) as 
	//its parameter and returning a string containing the Roman Numeral representation of that integer.
	
	public String conversion(int n) {
        int val = n;
        int[] values = {900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romLet = {"CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String romnum = "";
        romnum += "M".repeat(val / 1000);
        val = val - (val / 1000)*1000;
        for (int i = 0; i < values.length; i++){
           while (val >= values[i]) {
             romnum += romLet[i];
             val -= values[i];
           }
        } 
        return romnum;
    }
	
	//Greed Dice Game
	
	public static int greedy(int[] dice){
        int score = 0;
        int[] count = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            count[dice[i]-1] += 1;
        }
        if (count[0] >= 3) {
            score += 1000;
            count[0] = count[0] - 3;
        }
        for (int i = 1; i < 6; i++) {
            if (count[i] >= 3) {
                score += (i+1)*100;
                count[i] = count[i]-3;
            }
        }
        score += count[4]*50;
        score += count[0]*100;
        return score;
    }
	
	//Define a function that takes an integer argument and returns a logical value true or false depending 
	//on if the integer is a prime.
	public static boolean isPrime(int num) {
	    
	    if (num <= 1) {
	    	return false;
	    }
	    
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	    	if (num % i == 0) {
	    		return false;   
	    	}
	    }
	    
	    return true;
	}
	
	//Define a function that outputs a mirrored pyramid of stars
	public static void stars() {
		int size = 10;
		for (int i = 0; i< size; i++) {
			for (int j = size; j  >  i; j--) {
                System.out.print(" ");
            }
			for (int k = 0; k  <= 2*i; k++) {
                System.out.print("*");
            }
			System.out.println();
		}
	}
	
	//Write an algorithm to sort and return an array in ascending order.
	public static int[] sort(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
	
	//Write an algorithm that takes in a number and returns the next prime number.
	public static int nextPrime(int num) {
		int prime = num;
		if ((num % 2) == 0) {
			prime += 1;
		} else {
			prime += 2;
		}
		
		while (!isPrime(prime)) {
			prime += 2;
		}
		
		return prime;
	}
	
	public static void main(String[] args) {
		
	}
	
}
