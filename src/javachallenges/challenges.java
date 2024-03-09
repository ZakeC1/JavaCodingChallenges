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
	
	//You are given two vectors starting from the origin (x=0, y=0) with coordinates (x1,y1) and (x2,y2). Your task is to find out if these vectors are collinear. Collinear vectors are vectors that lie on the same straight line. They can be directed in the same or opposite directions. One vector can be obtained from another by multiplying it by a certain number. In terms of coordinates, vectors (x1, y1) and (x2, y2) are collinear if (x1, y1) = (k*x2, k*y2) , where k is any number acting as a coefficient.
	public static boolean collinearity(int x1, int y1, int x2, int y2) {
	    return x1 * y2 == y1 * x2;
	  }
	
	public static void main(String[] args) {
		
	}
	
}
