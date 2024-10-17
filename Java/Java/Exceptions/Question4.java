import java.util.*;

public class Question4 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements:");
            for(int i = 0; i<size; i++){
                arr[i] = sc.nextInt();
                isEven(arr);
            }


    }

    public static void isEven(int[] arr) throws PositiveNumberException{

        try{
            for(int i : arr){
                if(i > 0){
                    throw new PositiveNumberException("number is positive");
                }
            }
        }
        catch (PositiveNumberException e){
            System.out.println("number is positive " + e);
        }
    }
}
