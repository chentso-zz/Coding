package Easy;

/**
 * Created by Peter on 12/14/2015.
 */
public class FizzBuzz {
    public static void main(String args[]){
        FizzBuzz(2, 7, 15);
        FizzBuzz(4, 9, 40);
    }

    public static void FizzBuzz(int x, int y, int n){
        for (int i = 1; i <= n; i++){
            boolean isFizz = isDivisible(i,x);
            boolean isBuzz = isDivisible(i,y);

            if (isFizz) System.out.print("F");
            if (isBuzz) System.out.print("B");
            if (!isFizz && !isBuzz) System.out.print(String.valueOf(i));

            System.out.print(" ");
        }

        System.out.print("\n");
    }

    public static boolean isDivisible(int x, int y){
        return (x % y == 0);
    }
}
