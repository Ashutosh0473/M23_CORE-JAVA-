package ccom.cg.Exceptionhandling;

public class ArrrayIndexoutOfBound {
	  public static void print(int[] arr) {
	        System.out.println(arr[3]);
	        System.out.println("Fourth element successfully displayed!");
	    }
    public static void main(String[] args){ 
        System.out.println("First line");
        System.out.println("Second line");
        try
        {
        int[] myIntArray = new int[]{1, 2, 3};
        print(myIntArray);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        //if any statement is out of the try and catch block that will always executed
        System.out.println("Third line");
    } 
   
}