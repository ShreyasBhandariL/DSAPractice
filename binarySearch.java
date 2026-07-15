import java.util.Scanner;
public class binarySearch{
    int searchElement(int arr[],int key){
        int low = 0, high = arr.length - 1 ;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                low = low + mid;
            }
            else{
                high = high - mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        binarySearch bs = new binarySearch();
        System.out.println("Enter the total number of elements to store:");
        int numLen = sc.nextInt();
        int[] arr = new int[numLen];
        System.out.println("Enter the elements to store in array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key to search");
        int key = sc.nextInt();
        int result = bs.searchElement(arr,key);
        if (result == -1){
            System.out.println("Key not found in the array");
        }
        else{
            System.out.println("The key fond in the position "+result);
        }
    }
}