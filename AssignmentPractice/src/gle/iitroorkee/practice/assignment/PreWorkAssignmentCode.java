package gle.iitroorkee.practice.assignment;
import java.util.Scanner;
public class PreWorkAssignmentCode {
	
	static int x;
	
	Scanner sc = new Scanner(System.in);
	
    int temp; int sum=0; int r;
	public void checkPalindrome() {
    System.out.println("Enter the number to check whether its Palindrome or not");
	int n=sc.nextInt();
	temp=n;
	while(n>0) {
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
	}
	if(temp==sum) {
		System.out.println("the entered number is Palindrome Number");
	}
	else
	{
		System.out.println("the entered number is not a Palindrome Number");
		
	}
	
}
	
	int i;int j;
	public void checkPattern() {
		System.out.println("Enter the size of Pattern");
		int size =sc.nextInt();
		
		for(int i=size-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
				
	}
			System.out.println();
	
	} 
	}
		
		int k;
		boolean flag=false;
		public void checkPrimeNumber() {
			
       System.out.println("Enter the number to check whether its prime or not");
       int num=sc.nextInt();
       for(int k=2;k<=num/2;++k) {
    	   
    	   if(num%k==0) {
    		   flag=true;
    		   break;
    	   }
    	   }
    	     	   
    	if(!flag)  {
    		
    		System.out.println("Entered Number is Prime");
    		
    	}
    	else
    	{
    		System.out.println("Entered Number is Not a Prime");
    	}
		}
		
	     
		         int n1=0,n2=1,n3,p;
	    		 
		       public void printFibonacciSeries() {
	    		  System.out.println("Enter the value of Counter");
	    		  int counter=sc.nextInt();
	    		  System.out.println(n1+" "+n2);
	    		  for(p=2;p<counter;++p) {
	    			  n3=n1+n2;
	    			  System.out.println(" "+n3);
	    			  n1=n2;
	    			  n2=n3;
	    			  
	    		  }
		         }
	    		     
             public static void main(String args[]) {
    	  
    	  PreWorkAssignmentCode obj =new PreWorkAssignmentCode();
    		  
              do {
    	           Scanner kk = new Scanner(System.in);
    	 
                  System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

    	          + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

    	           + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
    	
                   int x= kk.nextInt();
    	 
                   switch(x) {
	  
	                case 0: 
		            System.out.println("Exit");
		             break;
	                case 1:
		              obj.checkPalindrome();
		            break;
	                   case 2: 
                     obj.checkPattern();
		              break;

                    case 3: 
                     obj.checkPrimeNumber();
                   break;
                   case 4: 
    	         obj.printFibonacciSeries();    			
    	           break;

    	          default:
                 System.out.println("Invalid choice. Enter a valid no\n");
	  }
            }  while (x!= 0);

                
             }
             
}

       

        



              
        
            
              

      
    
      


