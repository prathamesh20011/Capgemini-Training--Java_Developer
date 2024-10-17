import java.util.Stack;

public class PushAtBottomOfStack {
    class BottomStack{
        public static void pushAtBottomStack(int data, Stack<Integer> s){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottomStack(4, s);
            s.push(top);
        }

        
    }
}
