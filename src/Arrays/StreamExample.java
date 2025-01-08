package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(2,1,4,3,5);
        Stream<Integer> numberStream = numbers.stream()
                .filter((Integer value) -> value >=3)
                .peek((Integer value) -> System.out.println("After filter: "+ value))
                .map((Integer value) -> (value * -1))
                .peek((Integer value) -> System.out.println("After Map: "+ value))
                .sorted()
                .peek((Integer value) -> System.out.println("After sorting: "+ value));

        List<Integer> resultStream = numberStream.collect(Collectors.toList());
    }
}