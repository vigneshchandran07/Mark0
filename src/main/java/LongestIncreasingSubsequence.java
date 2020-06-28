import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestIncreasingSubsequence {

    public static List<Integer> addToArray() {

        //int[] arrayFromInput = {1, 2, 8, 4, 5, 6, 7, 8, 9};
        //int[] arrayFromInput = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int[] arrayFromInput = {3, 8, 90, 7, 40, 80};
        return Arrays.stream(arrayFromInput).boxed().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> seqOfNumbers = addToArray();

        List<Integer> longSubSeq = checkLongestIncrease(seqOfNumbers);
        System.out.println(longSubSeq);
        System.out.println("Size : " + longSubSeq.size());


    }

    public static List<Integer> checkLongestIncrease(List<Integer> arrayNumber) {
        List<Integer> finalLongSubSeq = new ArrayList<>();
        int big = 0;
        for (int i = 0; i < arrayNumber.size(); i++) {
            List<Integer> longestIncrSubSeqPossible = new ArrayList<>();
            int a = i;
            int b = i + 1;
            while (b < arrayNumber.size()) {
                if (arrayNumber.get(a) < arrayNumber.get(b)) {
                    longestIncrSubSeqPossible.add(arrayNumber.get(a));
                    a = b;
                    if (b == arrayNumber.size() - 1) {
                        longestIncrSubSeqPossible.add(arrayNumber.get(b - 1));
                        break;
                    }
                }
                b++;
            }
            if (big < longestIncrSubSeqPossible.size()) {
                big = longestIncrSubSeqPossible.size();
                finalLongSubSeq = longestIncrSubSeqPossible;
            }
        }
        return finalLongSubSeq;
    }
}
