package HackerRank.CountingSort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingSortChallenge {

    public static void main(String[] args) {
        List<Integer> array = Stream.of(1,2,2,3,3).collect(Collectors.toList());
        System.out.println(sort(array));
    }

    public static List<Integer> sort(List<Integer> array) {

        HashMap<Integer,Integer> freqTable =  new HashMap<>();
        int[] sortedArray =  new int[array.size()];
        List<Integer> sortedArray2 =  new ArrayList<>();

        for (Integer i : array)
            if(!freqTable.containsKey(i))
                freqTable.put(i,1);
            else
                freqTable.put(i, freqTable.get(i) + 1);

        sortedArray2.add(0,0);
        for(Map.Entry<Integer,Integer> e : freqTable.entrySet()){
            sortedArray[e.getKey()] =  e.getValue();
        }



        return Arrays.stream(sortedArray).boxed().collect(Collectors.toList());
    }
}
