package codility;

/**
 * Created by Veezq on 2015-11-14.
 */
public class QRound {

        public int solution(int Q) {
            int first, second;
            int counter = 0;

            for(first = 0; first <= Q/2; first++){
                second = Q - first;
                int firstNumber = (int) Math.sqrt(first);

                if(firstNumber * firstNumber == first){
                    int secondNumber = (int) Math.sqrt(second);
                    if(secondNumber * secondNumber == second){
                        if(firstNumber == 0 && secondNumber == 0){
                            counter += 1;
                        }else{
                            counter += 4;
                        }
                    }
                }
            }

       /* if(counter == 8){
            counter /= 2;
        }
    */
            return counter;
        }

}
