package arrays;

public class BinarySearch {
    public void search(int[] arr, int searchElement) {
        int left = 0;
        int right = arr.length;
        int mid = 0;
        boolean found = false;
        while(left < right) {
            System.out.println(String.format("left %s right %s searchElement %s", left, right, searchElement));
            mid = left + (right - left) / 2;
            if (arr[mid] == searchElement) {
                System.out.println(String.format("Element %s Found at index %s", searchElement , mid));
                found = true;
                break;
            } else if ( searchElement > arr[mid]) {
                left = mid + 1;
            } else if (searchElement < arr[mid]) {
                right = mid-1;
            }
        }
        if (!found)
            System.out.println(String.format("Element %s not found", searchElement));
    }
}
