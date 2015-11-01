package codility;

/**
 * Created by kamil on 2015-10-17.
 */

class Solution2 {
    public int solution(int Q) {
        int firstSquare;
        int secondSquare;

        int counter = 0;


        for (firstSquare = 0; firstSquare <= Q; firstSquare++) {
            secondSquare = Q - firstSquare;

            int firstNumber = (int) Math.sqrt(firstSquare);
            if (firstNumber * firstNumber == firstSquare) {
                int secondNumber = (int) Math.sqrt(secondSquare);
                if (secondNumber * secondNumber == secondSquare) {
                    if (firstNumber == 0 && secondNumber == 0) {
                        counter += 1;
                    } else {
                        counter += 4;
                    }
                }
            }
        }

        return counter;
    }
}
