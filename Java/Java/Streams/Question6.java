import java.util.*;

public class Question6 {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Zebra", "Yellow", "Apple", "Bear");

        List<String> list1 = list.stream().sorted().toList();
        System.out.println(list1);

        List<String> list2 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list2);
    }
    
}
