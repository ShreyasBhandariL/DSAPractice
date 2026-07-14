import java.util.Scanner;
public class linearSearch{
    public static int searchElement(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a total number of elements to store in array");
        int numLen = sc.nextInt();
        int[] num = new int[numLen];
        System.out.println("Enter the numbers to store in array");
        for(int i=0;i<numLen;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter a key to search");
        int key = sc.nextInt();
        int result = searchElement(num,key);
        if(result == -1){
            System.out.println("The key is not there in the array");
        }
        else {
            System.out.println("The key is found in the position: "+result);
        }
    }
}