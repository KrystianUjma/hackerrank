package codility;

/**
 * Created by kamil on 2015-10-17.
 */
public class Solution3 {

    public static void main(String[] args) {
        int max = 75;
        print(max);

        max = Integer.highestOneBit(max)<<1;
        print(max);

        max = max-1;
        print(max);
//        max = getSmth(max);
//        print(max);
//        for(int i=0; i<300; i++) {
//            print(max&i);
//        }
    }

    private static int getSmth(int i) {
        return i-1;
//        return (Integer.highestOneBit(i))-1;
    }

    private static void print(int i) {
        String out = Integer.toBinaryString(i);
        out = String.format("%8s",out).replace(" ","0");
        System.out.println(i+" = "+out);
    }

    private static int getIntegerComplement1(int n) {
        String o = Integer.toBinaryString(n);
        o = o.replace("0", "2").replace("1", "0").replace("2", "1");
        return Integer.parseInt(o, 2);
    }

    private static int getIntegerComplement2(int n) {
        return (Integer.highestOneBit(n)<<1) -1 -n;
    }



}
