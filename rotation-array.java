package enigm;

import java.util.Scanner;

public class rotorRotate {
	
		/*Select Rotor "We can also use Switch/Case Method"
		public static int selectRotor (String rot)
		{
			
		}*/
		
	    /*Function to left rotate arr[] of size n by d*/
	    void leftRotate(int arr[], int d, int n) 
	    { 
	        for (int i = 0; i < d; i++) 
	            leftRotatebyOne(arr, n); 
	    } 
	  
	    /*Function to right rotate arr[] of size n by d*/
	    void rightRotate(int arr[], int d, int n) 
	    { 
	        for (int i = 0; i < d; i++) 
	            rightRotateByOne(arr, n); 
	    } 
	    
	    void leftRotatebyOne(int arr[], int n) 
	    { 
	        int i, temp; 
	        temp = arr[0]; 
	        for (i = 0; i < n - 1; i++) 
	            arr[i] = arr[i + 1]; 
	        arr[i] = temp; 
	    } 
	    
	    void rightRotateByOne(int arr[], int n)
	    {
	        int last = arr[n - 1];
	        for (int i = n - 2; i >= 0; i--) {
	            arr[i + 1] = arr[i];
	        }
	 
	        arr[0] = last;
	    }
	    
	    public static int[] erot1()  
	    {  
	    int[] er1={10,21,5,-17,21,-4,12,16,6,-3,7,-7,4,2,5,-7,-11,-17,-9,-6,-9,-19,2,-3,-21,-4};  //initializing Encrypting Rotor Number 1  
	    return er1;
	    }
	    
	    public static int[] erot2()  
	    {  
	    int[] er2={3,17,22,18,16,7,5,1,-7,16,-3,8,2,9,2,-5,-1,-13,-12,-17,-11,-4,1,-10,-19,-25};  //initializing Encrypting Rotor Number 2  
	    return er2;
	    }
	    
	    public static int[] erot3()  
	    {  
	    int[] er3={1,16,5,17,20,8,-2,2,14,6,2,-5,-12,-10,9,10,5,-9,1,-14,-2,-10,-6,13,-10,23};  //initializing Encrypting Rotor Number 3  
	    return er3;
	    }
	    
	    public static int[] drot1()  
	    {  
	    int[] dr1={17,4,19,21,7,11,3,-5,7,9,-10,9,17,6,-6,-2,-4,-7,-12,-5,3,4,-21,-16,-2,-21};  //initializing Decrypting Rotor Number 1  
	    return dr1;
	    }
	    
	    public static int[] drot2()  
	    {  
	    int[] dr2={25,7,17,-3,13,19,12,3,-1,11,5,-5,-7,10,-2,1,-2,4,-17,-8,-16,-18,-9,-1,-22,-16};  //initializing Decrypting Rotor Number 2  
	    return dr2;
	    }
	    
	    public static int[] drot3()  
	    {  
	    int[] dr3={12,-1,23,10,2,14,5,-5,9,-2,-13,10,-2,-8,10,-6,6,-16,2,-1,-17,-5,-14,-9,-20,-10};  //initializing Decrypting Rotor Number 3  
	    return dr3;
	    }
	    
	    public static int[] rflct()  
	    {  
	    int[] r4={25,23,21,19,17,15,13,11,9,7,5,3,1,-1,-3,-5,-7,-9,-11,-13,-15,-17,-19,-21,-23,-25};  //initializing Reflector  
	    return r4;
	    }
	    
	    /* utility function to print an array */
	    void printArray(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	    } 
	  
	    // Driver program to test above functions 
	    //Silencing "null" Array
	    public static void main(String[] args) 
	    { 
	    	int i; 
			//Silencing the Scanner
	    	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	    	
	    	/*System.out.println("Enter Rotor you want to select: (erot1,erot2,erot3,drot1,drot2,drot3)") ;
	    	String rot = sc.next().toLowerCase();*/
	    	
	    	/*if (rot=="erot1") {
	    		arr = erot1();
	    		
	    	} else if (rot=="erot2") {
	    		arr= erot2();
	    		
	    	} else if (rot=="erot3") {
	    		arr = erot3();
	    		
	    	} else if (rot=="drot1") {
	    		arr = drot1();
	    		
	    	} else if (rot=="drot2") {
	    		arr = drot2();
	    		
	    	} else if (rot=="drot3") {
	    		arr = drot3();
	    	}*/
	    	
	    	System.out.println("Shifting Right or Left or None :") ;
	    	char shift = sc.next().toUpperCase().charAt(0);
	    	System.out.println("Enter the Shifting number:") ;
	    	int d = sc.nextInt();
		System.out.println("Enter the number of elements:") ;
	    	int n = sc.nextInt();
	    	//int n = 26; in case of our array
	    	int[] arr = new int[n];
	    	System.out.println("Enter the array element");
	        //For reading the element
	        for(i=0;i<n;i++) {
	        arr[i] = sc.nextInt();
	        }
	    	System.out.println("Original array");
	    	     for(i=0;i<n;i++)
	    	     {
	    	         System.out.print(arr[i]+" ");
	    	     }
	    	
	        rotorRotate rotate = new rotorRotate(); 
	        switch (shift) {
	        case 'R' :
	        	rotate.rightRotate(arr, d, n);
	        	break;
	        case 'L' :
	        	rotate.leftRotate(arr, d, n);
	        	break;
	        case 'N' :
	        	break;
	        }
	        System.out.println("\nNew array after rotating by "+ d +" postion in the "+ shift +" direction");
	        rotate.printArray(arr, n); 
	    } 
	    }
	    
