import java.util.Scanner;

/*Create an array of integers from console input and a separate number from user input, can you
  write code to find the number in the array. What will be the complexity of your code?*/
public class find {
	Scanner s = new Scanner(System.in);
     void num(){
    	 int n;
    	 System.out.println("how may numbers to be entered");
    	 n = s.nextInt();
    	 int a[] = new int[n];
    	 System.out.println("Enter the number:");
    	 for(int j = 0; j < n; j++){
    		 a[j] = s.nextInt();
    	 }
    	 System.out.println("The numbers are: ");
    	 for( int j = 0; j < n; j++){
    		 System.out.println(a[j]);
    	 }
    	 int m;
    	 System.out.println("Enter the user number");
    	 m = s.nextInt();
    	 for(int l = 0; l < n; l++){
    		 if(a[l] == m){
    	     System.out.println("The similar number is: " +a[l]);
    	     System.exit(0);
       		 }
    		
    	 }
      	 System.out.println("No similar number");
     }
	public static void main(String[] args) {
		find f = new find();
		f.num();

	}

}
