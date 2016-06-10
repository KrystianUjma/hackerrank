package codility;

/**
 * Created by Veezq on 2015-11-14.
 */
public class Primes3 {


        public int solution(int A, int B) {
            int size = B + 1;
            boolean[] array = new boolean[size];

            for(int i = 2; i * i <= B; i++){
                if(!array[i]){
                    for(int j = 2 * i; j < B; j += i){
                        array[j] = true;
                    }
                }
            }

            int counter = 0;

            if(B % 2 == 0){
                B--;
            }

            for(int i = A; i <= B; i++){
                if(!array[i]){
                    counter++;
                }
            }

            return counter;
        }

}
