import java.util.Scanner;
public class DistinctValues {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int x = 1;
        
        int y = 2;

        int z = 5;

        if (x == y && x == z)
        {
            System.out.println("All numbers are equal");
        }
        else if ((x != y) && (x != z) && (z == y))
        {
            System.out.println("One number is different");
        }
        else if ((x == y) && (x != z) && (z != y)){
            System.out.println("One number is different");
        }
        else if ((x != y) && (x != z) && (z != y)){

            System.out.println("All numbers are differents");
        }
        else if ((y != x) && (x == z) && (y != z)){
            
            System.out.println("One number is different");
        }
    }
}
