import java.util.*;

public class Question7 {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(2,4,1,6,7,8);

        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());

        max.ifPresent(m -> System.out.println("Maximum:" + m));

        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());

        min.ifPresent(m -> System.out.println("Minimum:" + m));

    }
}
