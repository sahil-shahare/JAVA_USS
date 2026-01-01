package Collection_Framework.List;

import java.util.Stack;

public class StackExample {
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<=10;i++){
            st.push(i);
            System.out.println(st.peek());
            st.pop();
        }

        System.out.println(st);    
    }
}
