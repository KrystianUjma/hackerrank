package codility;

/**
 * Created by Veezq
 */
public class PrimesVersion2 {
        public int solution(int a, int b) {
            int size = b + 1;
            int counter = 0;
            boolean[] outputArray = new boolean[size];

            for (int i = 2; i * i <= b; i++) {
                if (!outputArray[i]) {
                    for (int j = 2 * i; j < b; j += i) {
                        outputArray[j] = true;
                    }
                }
            }

            for (int i = a; i <= b; i++) {
                if (!outputArray[i]) {
                    counter++;
                }
            }

            return counter;
        }
}
