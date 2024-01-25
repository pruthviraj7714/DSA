
package Arrays.Searching;

public class Searching {
    public static int linearSearch(int arr[], int key) {//O(n)
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int key) {//O(logn)
        int start = 0, end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == key) {
                return mid;
            }else if(arr[mid] > key) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int key = 4;
        System.out.println(linearSearch(arr, key));
        System.out.println(binarySearch(arr, key));
        
    }
}
