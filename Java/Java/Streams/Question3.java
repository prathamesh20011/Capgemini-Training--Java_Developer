import java.util.*;

public class Question3 {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(6,7,3,8,2,1);

        int even = list.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even: " + even);

        int odd = list.stream().filter(n -> n%2 == 1).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of odd: " + odd);
        
    }
    
}
