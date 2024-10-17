import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(2,5,3,1,8,6,9);

        double average = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println(average);


    }
    
}
