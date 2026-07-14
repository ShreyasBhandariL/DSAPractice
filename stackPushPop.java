import java.util.Scanner;
class StackOperations{
    int[] num = new int[5];
    int top = -1;
    void push(int k){
        if(top == 4){
            System.out.println("Stack Overflow");
            return;
        }
        num[++top] = k;
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return;
        }
        top--;
    }
    void display(){
        for(int i = top; i>=0; i--){
            System.out.print(num[i]+" ");
        }
        return;
    }
}

public class stackPushPop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StackOperations so = new StackOperations();
        boolean flag = true;
        while(flag){
        System.out.println("Enter a number \n1.Push \n2.Pop \n3.Display \n4.Exit");
        int choice = sc.nextInt();
        switch(choice){
            case 1 : System.out.println("Enter a number to push into stack");
                     so.push(sc.nextInt());
                     break;
            case 2 : so.pop();
                     System.out.println("The number is deleted from the stack to check please use number 3 to display");
                     break;
            case 3 : System.out.println("The Numbers in the stack are:");
                     so.display();
                     break;
            case 4 : flag = false;
                     break;
            default : System.out.println("Invalid Option please try again");
        }
        }
        
    }
}