package project2.fibonacee.series;
//print first 10 numbers;
public class FibonaceeSeries {
	// 0 1 1 2 3 5 8 13 21
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, count = 10;
		for (int i = 0; i < (count-2); i++) {
			if (i == 0) 
			System.out.print(n1 + ", " + n2);
			
			n3 = n1 + n2;
			
			System.out.print(", "+n3);
			n1 = n2;
			n2 = n3;
		}		
	}

}
