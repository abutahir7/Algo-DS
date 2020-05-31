package core;


import arrays.AdHoc;
import arrays.BinarySearch;

import java.util.Arrays;

public class TestArrays {
    // As per DRY principle always make you code modular and concise.
    // Do Not Repeat code as much as possible
    public static int[] getArray() {
        int[] arr = new int[10];
        for (int i=0 ;i< arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
    public static void testBinarySearch(){
        int[] arr = getArray();
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search(arr, 9);
        binarySearch.search(arr, 111);
    }

    public static void testBuiltInBinarySearch() {
        int[] arr = getArray();
        int searchElement = 9;
        int found = Arrays.binarySearch(arr, searchElement);
        if (found >= 0)
            System.out.println(String.format("Element Found found %s", found));
        else
            System.out.println("Element Not found");
        searchElement =  111;
        found = Arrays.binarySearch(arr, searchElement);
        if (found >= 0)
            System.out.println(String.format("Element Found found %s", found));
        else
            System.out.println("Element Not found");
    }

    public static void testQueries(){
        AdHoc adHoc = new AdHoc();
        adHoc.binaryQueries();
    }
}
