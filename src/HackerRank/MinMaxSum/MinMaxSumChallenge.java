package HackerRank.MinMaxSum;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxSumChallenge {
    public static void main(String[] args) {

        List<Integer> listOfElements = Stream.of(1,3,5,9,7).collect(Collectors.toList());
        printMinMaxSum(listOfElements);
    }

    private static void printMinMaxSum(List<Integer> listOfElements) {
        Collections.sort(listOfElements);

        BigInteger sum = listOfElements.stream()
                .map(i->new BigInteger(i.toString()))
                .reduce((a,b) -> a.add(b))
                .get();

        BigInteger max = listOfElements.stream()
                .map(i-> new BigInteger(i.toString()))
                .max(BigInteger::compareTo)
                .orElseThrow(NoSuchElementException::new);

        BigInteger bigMin = sum.subtract(max);


        BigInteger min = listOfElements.stream()
                .map(i-> new BigInteger(i.toString()))
                .min(BigInteger::compareTo)
                .orElseThrow(NoSuchElementException::new);

        BigInteger bigMax = sum.subtract(min);


        System.out.printf("%d %d",bigMin,bigMax);
    }
}

