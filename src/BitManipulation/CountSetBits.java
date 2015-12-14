package BitManipulation;

/**
 * Created by Peter on 12/14/2015.
 */
public class CountSetBits {

    public static void main(String args[]){
        System.out.println(countBits(89));
    }

    public static int countBits(int num){
        int count = 0;
        while(num != 0){
            num &= (num - 1);
            count++;
        }
        return count;
    }
}
