import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListassignment {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	int[]names=new int[6];
		names[0]=3;
		names[1]=2;
		names[2]=4;
		names[3]=5;
		names[4]=6;
		ArrayList intlist=new ArrayList();
		intlist.add(3);
		intlist.add(2);
		intlist.add(4);
		intlist.add(5);
	System.out.println(names[4]+""+names[3]+""+names[2]+""+names[1]+""+names[0]);
		System.out.print(names[2]+names[4]);
		
		System.out.print("Even numbers:");
		for(int k=0;k<names.length ;k++){
			if (names[k]%2==0) {
	        System.out.print(names[k]+",");
			}
	    }
		System.out.println("");
		System.out.print("Odd Numbers:");
		for (int i=0; i<names.length; i++) {
	        if(names[i]%2 != 0) {
	           System.out.print(+names[i]);
		int sum=0;
	           for(int i1 =0; i1 < names.length; i1++){
	               
	               if((i1 % 2) != 1){
	                   sum += names[i1];
	               }else{
	                   sum -= names[i1];
	               }
	           }
	       		System.out.println("This is the alternating Sum:"+sum);
		

	}

		}}}
