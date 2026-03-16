package stacktasks;

public class StackTask {

    static int[] nums = new int[10];
    static int top = -1;

    public void push(int element){

        if(top == nums.length - 1){
            System.out.println("Stack Overflow!");
            return;
        }

        nums[++top] = element;
        System.out.println("Element inserted: " + element);
    }

    public void pop(){

        if(top == -1){
            System.out.println("Stack Underflow!");
            return;
        }

        System.out.println("Removed Element: " + nums[top--]);
    }

    public void printStack(){

        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");
        for(int i = top; i >= 0; i--){
            System.out.println(nums[i]);
        }
    }
}