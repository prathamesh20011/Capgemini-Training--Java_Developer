class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //GETTERS AND SETTERS
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    
}

public class Question1 {
    public static void main(String[] args) {
        
        Person person = new Person("Rohan", 12);
        Person person1 = new Person("Sam", 22);

        System.out.println(person.getName() + " is " + person.getAge());
        System.out.println(person1.getName() + " is " + person1.getAge());
    }
}
