import java.util.*;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Red", "Green", "Blue", "White");

        List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase " + upperCase);

        List<String> lowerCase = list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Lowercase" + lowerCase);
    }
}
