package BitManipulation;

/**
 * Created by Peter on 12/14/2015.
 */
public class BitsString {
    public static void main(String args[]){
        System.out.println(toBinary(89));
    }

    public static String toBinary(int num){
        int numOfBits = (int)(Math.log(num)/Math.log(2)) + 1;
        int paddedNumOfBits = (int)Math.pow(2, (int)Math.ceil(Math.log(numOfBits)/Math.log(2)));

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < paddedNumOfBits - numOfBits ; i++){
            sb.append('0');
        }

        for (int i = numOfBits; i > 0; i--){
            sb.append((char)(((num >> (i - 1)) & 1) + '0'));
        }

        return "0b" + sb.toString();
    }
}
