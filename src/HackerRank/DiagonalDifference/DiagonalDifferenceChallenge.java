package HackerRank.DiagonalDifference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DiagonalDifferenceChallenge {

    public static void main(String[] args) {
        List<List<Integer>> multiArray = List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9));
        int diagonalDifference = getDiagonalDifference(multiArray);

        System.out.printf("The diagonal difference is %s", diagonalDifference);
    }

    private static int getDiagonalDifference(List<List<Integer>> multiArray) {
        final int ARRAY_SIZE = multiArray.size();

        int rDiagonal = 0;
        int lDiagonal = 0;


        for (int r = 0; r < ARRAY_SIZE; r++) {
            for (int c = 0; c < ARRAY_SIZE; c++) {
               if(r==c)
                   rDiagonal = rDiagonal + multiArray.get(r).get(c);

               if(r+c == ARRAY_SIZE-1)
                   lDiagonal = lDiagonal + multiArray.get(r).get(c);
            }
        }

        return Math.abs(rDiagonal - lDiagonal);
    }
}
