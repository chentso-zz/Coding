package BitManipulation;

/**
 * Created by Peter on 12/14/2015.
 */
public class ReverseBits {
    public static void main(String args[]){
        System.out.println(BitsString.toBinary(34));
        System.out.println(BitsString.toBinary(reverseBits(34)));
    }

    public static int reverseBits(int num){
        int numOfBits = (int)(Math.log(num)/Math.log(2)) + 1;
        int result = 0;

        int numOfFullBits = (int)Math.ceil((float)numOfBits/8) * 8;

        for(int i = 0; i < numOfFullBits; i++){
            result = (result | ((num >> i) & 1)) << 1;
        }

        return result >> 1;
    }
}
