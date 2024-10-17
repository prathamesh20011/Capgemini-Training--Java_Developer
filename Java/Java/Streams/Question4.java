import java.util.*;

public class Question4 {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(2,2,3,1,7,2,5,4,5);

        List<Integer> duplicates = list.stream().distinct().toList();
        System.out.println(duplicates);
    }
    
}
