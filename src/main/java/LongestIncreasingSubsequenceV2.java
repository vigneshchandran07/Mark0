import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LongestIncreasingSubsequenceV2 {

    public static List<Integer> addToArray() {

        int[] arrayFromInput = {1, 2, 8, 4, 5, 6, 7, 8, 9};
        return Arrays.stream(arrayFromInput).boxed().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> seqOfNumbers = addToArray();
        int biggerArray = 0;
        List<Integer> sizesOfSubseq = checkLongestIncrease(seqOfNumbers);
        sizesOfSubseq.sort(Collections.reverseOrder());
        System.out.println(sizesOfSubseq.get(0));


    }

    public static List<Integer> checkLongestIncrease(List<Integer> arrayNumber) {
        List<Integer> sizeOfSubSeq = new ArrayList<>();
        List<Integer> longestIncrSubSeqPossible = new ArrayList<>();
        do {
            for (int i = 0; i < arrayNumber.size(); i++) {
                if (i == arrayNumber.size() - 1) {
                    longestIncrSubSeqPossible.add(arrayNumber.get(i));
                    break;
                }
                if (arrayNumber.get(i) < arrayNumber.get(i + 1)) {
                    longestIncrSubSeqPossible.add(arrayNumber.get(i));
                } else {
                    longestIncrSubSeqPossible.add(arrayNumber.get(i));
                    break;
                }
            }
            sizeOfSubSeq.add(longestIncrSubSeqPossible.size());
            arrayNumber.removeAll(checkLongestIncrease(arrayNumber));
        } while (!arrayNumber.isEmpty());
        return longestIncrSubSeqPossible;
    }
}
