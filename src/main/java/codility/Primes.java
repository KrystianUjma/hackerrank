package codility;

/**
 * Created by Veezq on 2015-10-18.
 */
public class Primes {


    public int solution(int a, int b){

        int size = b - a;

        boolean[] array = new boolean[size];

        if(a == 1){
            a = 2;
        }

        for(int i = a; i * i<= size; i++){

            if(array[i] == true){
                continue;
            }

            for (int j = 2 * i; j < size ; j += i){
                array[j] = true;
            }
        }

        int primes = 0;

        for (int i = a; i < size; i++){
            if(array[i] == false){
                primes++;
            }
        }

        return primes;
    }


}
