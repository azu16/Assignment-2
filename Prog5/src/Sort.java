import java.util.Scanner;

/*Create an array of integers from console input, can you write code to sort the array.
  What will be the complexity of your code?*/

public class Sort {
	Scanner s = new Scanner(System.in);
      void num(){
    	  System.out.println("how many numbers to be sorted");
       	  int n = s.nextInt();
    	  int a[] = new int[n];
    	  
    	  System.out.println("Enter the numbers: ");
      	    for(int i = 0; i < n; i++){
    	    	a[i] = s.nextInt();
    	    }
      	    System.out.println("Numbers are:");
      	    for(int j = 0; j < n; j++){
      	    	System.out.println(a[j]);
      	    }
      	  System.out.println("Sorted numbers are:");
      	  for(int m = 0; m < a.length; m++){
      	      for(int k = 0; k < a.length-1; k++){
      	    	if(a[k] > a[k+1]){
      	    	int temp;
      	    	temp = a[k];
      	    	a[k] = a[k+1];
      	    	a[k+1] = temp;
      	    		  
      	    	  }
      	      }
      	      }
      	       for(int l = 0; l < n; l++){
      	    	   System.out.println(a[l]);
      	       }
      	    	
      	    }
      
	public static void main(String[] args) {
		Sort s = new Sort();
		s.num();

	}

}
