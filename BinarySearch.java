import java.util.Scanner;
class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int low = 0;
        int high = arr.length -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int found = sc.nextInt();
       while (low <=high) {
        int mid = low + (high-low)/2;
       }
        {
            if(arr[mid]==found)
            {
                System.out.println("Element is found");
                return;
            }
            else if(arr[mid]<found){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        System.out.println("Element is not found");
    }