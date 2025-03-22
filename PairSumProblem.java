import java.util.HashSet;

public class PairSumProblem {

    public static void main(String[] args) {
        int[] array = {1, 4, 45, 6, 10, 8};
        int targetSum = 16;

        findPairWithSum(array, targetSum);
    }

    public static void findPairWithSum(int[] array, int targetSum) {
        // Create a HashSet to store visited elements
        HashSet<Integer> visitedNumbers = new HashSet<>();

        // Iterate through the array
        for (int number : array) {
            // Calculate the required complement to reach the target sum
            int complement = targetSum - number;

            // Check if the complement exists in the HashSet
            if (visitedNumbers.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + number + ")");
                return; // Exit after finding the first
