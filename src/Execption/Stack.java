package Execption;

class StackOverflowException extends Exception{
    @Override
    public java.lang.String toString() {
        return "Stack is Full";
    }
}
class StackUnderflowException extends Exception{
    @Override
    public java.lang.String toString() {
        return "Stack is Empty";
    }
}


class stException{
    private int size;
    private int top = -1;
    private int s[];
    public stException (int sz){
        size = sz;
        s = new int[sz];
    }

    public void push (int x) throws StackOverflowException{
        if(top == size-1)
            throw new StackOverflowException();
        top++;
        s[top] = x;
    }
    public int pop() throws StackUnderflowException{
        int x = -1;

        if(top == -1)
            throw new  StackUnderflowException();
        x = s[top];
        top--;
        return x;
    }

}
public class Stack {
    public static void main(String[] args)  {
        stException st = new stException(5);
        try {
//            st.push(10);
//            st.push(15);
//            st.push(10);
//            st.push(15);
//            st.push(10);
//            st.push(15);
            st.pop();
//        }
//        catch (StackOverflowException s){
//            System.out.println(s);
        } catch (StackUnderflowException e) {
            System.out.println(e);
        }
    }

}

