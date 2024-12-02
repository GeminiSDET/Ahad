package UdJava;

public class ArrayDelete {

	    public static void main(String[] args) {
	        int A[] = {1, 22, 3, 4, 55};
	        int toDelete = 22;

	        for (int x : A) 
	        	System.out.print(x + " ");
	            System.out.println();

	        // Delete the element
	        int newArray[] = new int[A.length - 1];
	        int index = 0;
	        
	        for (int x : A) 
	        {
	            if (x != toDelete) 
	            {
	                newArray[index++] = x;
	            }
	        }

	        for (int x : newArray) 
	        	System.out.print(x + " ");
	    }
	}
