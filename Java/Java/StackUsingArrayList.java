import java.util.ArrayList;

public class StackUsingArrayList {
    public class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;
        }

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            return list.remove(top);
        }

        public int peek(){
            return list.get(list.size()-1);
        }
    }
    
}
