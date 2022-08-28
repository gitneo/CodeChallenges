package HackerRank.PlusMinus;

import java.util.ArrayList;
import java.util.List;

public class PlusMinusChallenge {
    public static void main(String[] args) {

        List<Integer> listOfElements = List.of(1,1,0,-1,-1);
        calculateRatioOfElementsIn(listOfElements);
    }

    private static void calculateRatioOfElementsIn(List<Integer> listOfElements) {
        //define variables
        double posCount = 0;
        double negCount = 0;
        double zerCount = 0;

        //loop through the array
        for (Integer i : listOfElements) {

            if(Integer.signum(i) == 1){
                posCount++;
            }
            else
            if(Integer.signum(i) == -1){
                negCount++;
            }
            else
            if(Integer.signum(i) == 0){
                zerCount++;
            }
        }


        //print ratios
        System.out.printf("%.6f\n",posCount/listOfElements.size());
        System.out.printf("%.6f\n",negCount/listOfElements.size());
        System.out.printf("%.6f\n",zerCount/listOfElements.size());
    }


}
