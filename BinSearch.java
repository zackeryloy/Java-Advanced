public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("The index of 3 is: "+ binSearch(arr, 3, 0, arr.length - 1));
        System.out.println("The index of 3 is: "+ linearSearch(arr, 3));
    }




    public static int binSearch(int[] arr, int target, int low, int high) {
       if (low>high) {
           return -1;
       }

         int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binSearch(arr, target, low, mid - 1);
        } else {
            return binSearch(arr, target, mid + 1, high);
        }
    }


    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
}
