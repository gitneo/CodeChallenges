package HackerRank.LoneleyInteger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LonelyIntegerChallenge {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Stream.of(1,1,2,2,3,4,4,5,5,6,6,7,7).collect(Collectors.toList());
        int lonelyInt =  getLonelyInt(listOfIntegers);
        System.out.println(lonelyInt);
    }

    private static int getLonelyInt(List<Integer> listOfIntegers) {
        HashMap<Integer,Integer> intMap = new HashMap<>();

        //Frequency table
        for (Integer i : listOfIntegers) {
            if(!intMap.containsKey(i))
                intMap.put(i, 1);
            else
            if(intMap.containsKey(i))
                intMap.put(i, intMap.get(i) + 1);
        }

        return intMap
                .entrySet()
                .stream()
                .filter(s -> s.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().get();
    }
}
