package project2.fibonacee.series;
//print upto 50 and provide count
public class FibonaceeSeries2 {
	// 0 1 1 2 3 5 8 13 21
	public static void main(String[] args) {
		
		
		
		int n1 = 0, n2 = 1, n3, count = 1;
		int c =2;
		for (int i = 0; i < count; i++) {
			if (i == 0) 
			System.out.print(n1 + ", " + n2);
			
			n3 = n1 + n2;
	        c++;
			if(n3>count) {
				
				break;
			}
			System.out.print(", "+n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
		// count
		System.out.println(c==3 ? c : c-1);
		
		
		
		
	}

}
