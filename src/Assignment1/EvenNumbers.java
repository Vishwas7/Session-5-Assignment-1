package Assignment1;

public class EvenNumbers {

	public static void main(String[] args) {
		
		
		
		int[] arr = new int [10];
		//limit is 10 taken, as mentioned in question !!!
        int limit = 10;
       
        System.out.println("Printing Even numbers between 1 to " + limit);
       
        for(int i=1; i <= limit; i++){ //Using for loop method
               
                // if the number is divisible by 2 then it is even
                if( i % 2 == 0){
                        System.out.print(i + " ");
                }
        }
	}
}
                


        
	
