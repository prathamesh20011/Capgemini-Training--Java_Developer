import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Streams_basic{
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(9,2,5,1,7,3);

        Stream<Integer> data = list.stream();
        // data.

        // list.stream().map(n -> n*2).forEach(n -> System.out.println(n));

    //    int result = list.stream().filter(n -> n%2 != 0).sorted().map(n -> n*2).reduce(0, (c,e)->c+e);
    //    System.out.println(result);

        // Stream<Integer> doubleValue = data.map(n -> n*2);
        // doubleValue.forEach(n -> System.out.println(n));



        // data.forEach(n -> System.out.println(n));

    }
}