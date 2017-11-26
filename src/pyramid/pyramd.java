package pyramid;

import java.util.ArrayList;

public class pyramd {
	public static int maxhrz;
	public static int maxvrt;

	public static int A; // Number of Pyramids
	public static ArrayList<Integer> height;	
	public static ArrayList<Integer> distance;	
	public static String backgrd;	

	static char[][] mtrx;
	
	static int calinitialPoint(int index){
		int start = 0;

		            if (distance.isEmpty()) return start;

		           for ( int x = 0; x < distance.size(); x++) {
		                   start += distance.get(x);
		               }
		         distance.remove(distance.size() - 1);

		         return start;
		}
	
		            static void addPyramid(int index) { 
		    int h = height.get(index);
		    int length = h * 2;
		    int inlIndex = calinitialPoint(index) + length + 1;
		    int lvl = h + 1;
		    int indexhrz = maxhrz - 1;

		              for ( int k = 0; k < lvl; k++ ) {
		                    mtrx[indexhrz - k][inlIndex] = '\\';

		                   for ( int y = 0; y < length; y++ ) {
		                       mtrx[indexhrz - k][inlIndex - y - 1] = '-';
		                      }

		                  mtrx[indexhrz - k][inlIndex - length - 1] = '/';
		                     length = length - 2;
		                    inlIndex--;
		}

		}

	
		static void displaymatrixfunc() { 

		int backgrdLength = backgrd.length();
		int backgrdIndex = 0;

		       for (int x = 0; x < maxhrz; x++ ) {
		       for ( int y= 0; y < maxvrt; y++ ) {
		if ( backgrdIndex == backgrdLength ) backgrdIndex = 0;

		    mtrx[x][y] = backgrd.charAt(backgrdIndex);
		    backgrdIndex++;
		       }
		   }

		}

		
		    public  static void cal_length_of_vrt(){
		      maxvrt = 0;
		      for ( int x = 0; x < distance.size(); x++ ) {
		      maxvrt += distance.get(x);
		   }
		      maxvrt+= height.get(A - 1) * 2 + 2;
		}

	
		   public static void initial(){
		   maxhrz = 21;
		   cal_length_of_vrt();
		   mtrx = new char[maxhrz][maxvrt];

		          displaymatrixfunc();
		}




}

