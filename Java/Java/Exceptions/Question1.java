class Question1{

    public static void isOdd(int num){

        if(num%2 != 2){
            throw new IllegalArgumentException(num + " is odd");
        }
    }

    public static void tryNumber(int num){
        
        try{
            isOdd(num);
            System.out.println(num + " is an even number");
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        
        int n = 7;
        tryNumber(n);
    }
}