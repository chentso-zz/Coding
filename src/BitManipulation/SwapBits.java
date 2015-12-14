package BitManipulation;

/**
 * Created by Peter on 12/14/2015.
 */
public class SwapBits {

    public static void main(String args[]){

    }

    public static int swapBits(int num, int x, int y){
        int numOfBits = (int)(Math.log(num)/Math.log(2) + 1);

        if (x >= numOfBits || x < 0 || y >= numOfBits || y < 0){
            return -1;
        }

        int bitAtX = (num >> x) & 1;
        int bitAtY = (num >> y) & 1;

        if (bitAtX != bitAtY) {
            num ^= (1 >> x);
            num ^= (1 >> y);
        }

        return num;
    }
}
