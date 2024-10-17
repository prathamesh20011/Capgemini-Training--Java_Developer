import java.util.*;

public class Question8 {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(4,2,1,7,8,6);

        Optional<Integer> max  = list.stream().max(Comparator.naturalOrder());

        max.ifPresent(m -> System.out.println(m));

        

    }
    
}
