import java.util.Scanner;
class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int found = sc.nextInt();
        for(int i=30;i<arr.length;i++)
        {
            if(arr[i]==found)
            {
                System.out.println("Element is found");
                return;
            }
        }
        System.out.println("Element is not found");
    }
}