package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AdHoc {
    public void binaryQueries(){
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] firstLineList  = firstLine.split(" ");
        int N = Integer.parseInt(firstLineList[0].trim());
//        System.out.println(String.format("N => %s", N));
        int Q = Integer.parseInt(firstLineList[1].trim());
//        System.out.println(String.format("Q => %s", Q));
        String input = scanner.nextLine();
        int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
//        System.out.println(String.format("arr => %s", Arrays.toString(arr)));
        for (int i=0; i < Q; i++){
            int[] qInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            System.out.println("Query "+Arrays.toString(qInput));
            if (qInput[0] == 0) {
                int startIndex = qInput[1] - 1;
                int endIndex = qInput[2] -1 ;
//                System.out.println("Start index => "+ startIndex +" endIndex => "+endIndex);
                StringBuilder endString = new StringBuilder();
                for (int k=startIndex; k<= endIndex; k++){
                    endString.append(arr[k]);
                }
//                System.out.println("End string "+endString);
//                System.out.println("With 10 "+ Integer.parseInt(endString.toString(), 10));
                int finalInt = Integer.parseInt(endString.toString(), 2);
                if (finalInt %2 == 0){
                    System.out.println("EVEN");
                }else{
                    System.out.println("ODD");
                }
            } else {
                if (arr[qInput[1] - 1] == 0) {
                    arr[qInput[1] - 1] = 1;
                }else {
                    arr[qInput[1]] = 0;
                }
//                System.out.println("After Flipping => "+ Arrays.toString(arr));
            }
        }



    }
}
