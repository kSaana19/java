package arrays;

public class Duplicate_elements {

	public static void main(String[] args) {
		
		
		int[] a = {2,4,6,2,4,7,8};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++){
				  if( a[i] == a[j]);
          System.out.println(a[i]);
	}
		}
	}

}
