//Backtracking of Arrays
public class Classroom {
    public static void changeArr(int arr[], int i, int value)
    {
        // base case
        if(i==arr.length)
        {
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=value;
        changeArr(arr, i+1, value+ 1);
        arr[i]= arr[i] -2;//backtracking step
    }

    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++) {
            System.out.println("The updated array is:" + arr);
            System.out.println("The updated array is:" + arr[i]);
        }
    }

    public static void main(String[] args){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
