package UdJava;

public class ArrayIncreasingSize {

	public static void main(String[] args) {

		int A[]= {3,4,5,7,8};
		int B[]=new int[10];
		
		System.out.println("Length of A:" + A.length);
		
		for(int i=0;i<A.length;i++) 
		{
			B[i]=A[i];
		}
		A=B;
		//for(int x:B)
		//System.out.print(x + " ");
		System.out.print("Length of A:" + A.length);
		
	}

}


/*
    public static void main(String[] args) 
    {
        int A[]={8,6,10,9,2};
        
        System.out.println("Length of A="+A.length);
        
        int B[]=new int[10];
        
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        A=B;
        
        System.out.println("Length of A="+A.length);
        
    }


*/