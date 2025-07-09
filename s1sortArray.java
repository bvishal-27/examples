public class s1sortArray {
    public static void main(String[] args) {
        int arr[]= {1,34,45,67,87,23,44,34};
        System.out.println(sort(arr,0));

    }
    static boolean sort(int arr[], int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]< arr[index +1] &&  sort(arr, index+1);
    }
}
