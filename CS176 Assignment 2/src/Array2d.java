
public class Array2d {
	public static void main(String[] args) {
		
		

		int rowtotal=0;
	int [] [] num= {
			{1,2,3,4},
			{1,2,3,4},
			{1,2,3,4},
			{1,2,3,4}
			
	};
	
	
	for (int i=0; i < num.length; i++) {
        for (int j=0; j < num.length; j++) {
          
   
            System.out.print(num[i][j] + " "); 
        } 
            System.out.println();
}
System.out.println(num);
	
	int totalcol=0;
	for(int i=0;i<num.length;i++) {
		totalcol= totalcol+num[i][2];
	}
	System.out.println("this is the sum of the colloms:"+totalcol);
	
	
	
	for(int i=0; i<num[1].length;i++) {
		rowtotal += num[1][i];
	}
	System.out.println("This is the row total:"+rowtotal);
	int total=sum(num);
	System.out.println("This is the total:"+total);
	}
	public static int sum( int [][] values) {
		
		int total=0;
		
		
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values[0].length;j++) {
				total+=values[i][j];
			}
		}
			return total;
	}
	
	

	
	
	
	
	}
