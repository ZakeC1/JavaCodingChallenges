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
	public class Square {    
	    public static boolean isSquare(int n) {        
	    	if (n < 0) {
	    		return false;
	    	} else{
	    		return (Math.pow(((int) Math.sqrt(n)),2) == n);
	    	}
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
	
	//Counts the amount of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string
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
	
	
	public static void main(String[] args) {
		
	}
	
}
