import java.util.*;

public class Question5 {
    
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Apple", "Ape", "Alue", "Bye", "Cat");

        int count = (int) list.stream().filter(n -> n.startsWith("A")).count();
        System.out.println(count);
    }
}
