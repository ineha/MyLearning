package Recursion;

public class Sorted {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,4,6,7,8,9};
        System.out.println(sorted(arr,0,1));
        System.out.println(linearSearch(arr,10,0));
    }

    private static boolean linearSearch(int[] arr, int target, int i) {
        if(arr[i] == target){
            return true;
        }
        if(arr.length-1 == i){
            return false;
        }
        return linearSearch(arr,target,i+1);
    }

    public static boolean sorted(int[] arr, int curr, int next) {
        if (next == arr.length) {
            return true;
        }
        if(arr[next]<arr[curr]){
            return false;
        }
        return sorted(arr, curr+1,next+1);
    }
}
