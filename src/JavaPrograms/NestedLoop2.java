package JavaPrograms;

public class NestedLoop2 {

    public static void main(String[] args) {
        int k = 3;
        
        for (int i = 1; i <= 3; i++) 
        {
        for (int j = 1; j <= i; j++) 
        {
                System.out.print(k + " ");
                k += 3;  
        }
            System.out.println();
        }
    }
}