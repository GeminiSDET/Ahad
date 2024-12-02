package UdJava;

public class ArrayRotationRtoL {

    public static void main(String[] args) {

    	//9 1 22 3 4 55 6 78 79 8 
    	
        int A[]= {1,22,3,4,55,6,78,79,8,9};

        for (int x : A) 
            System.out.print(x + " ");
            System.out.println();

        int temp = A[A.length - 1]; 
        for (int i = A.length-1; i > 0; i--) 
        {
            A[i] = A[i - 1]; 
        }
        A[0] = temp;
        for (int x : A) 
            System.out.print(x + " ");
            System.out.println(); 
    }
}
