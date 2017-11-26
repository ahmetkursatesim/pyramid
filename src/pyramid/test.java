package pyramid;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) { 
		
		pyramd test=new pyramd();

	    test.height = new ArrayList<Integer>();
	   test.distance = new ArrayList<Integer>();

	   Scanner input = new Scanner(System.in);

	    System.out.println("Enter the Number of Pyramid..");
	     test.A= input.nextInt();

	      int tmp;
	     System.out.println("Enter the Heights");
	      for( int x = 0; x < test.A; x++ ) {
	      tmp = input.nextInt();
	     test.height.add(tmp);
	    }

	        System.out.println("Enter the Distances");
	     for( int x= 0; x < test.A - 1; x++ ) {
	     tmp = input.nextInt();
	     test.distance.add(tmp);
	 }
	       input.nextLine(); // NextInt does not read last newline
	       System.out.println("Enter the Background Texture");
	        test.backgrd = input.nextLine();

	            test.initial();

	          for ( int x= test.A - 1 ; x > -1; x--) {
	             test.addPyramid(x);
	  }

	          for (int x = 0; x< test.maxhrz; x++ ) {
	              for ( int y= 0; y< test.maxvrt; y++ ) {
	         System.out.print(test.mtrx[x][y]);
	   }
	   System.out.println();
	   }

	}
	
	

}
