package nikola.mirc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(sugarHigh(new int[] { 33, 20, 12, 19, 29 }, 33)));
		System.out.println(Arrays.toString(sugarHigh(new int[] { 62, 67, 100 }, 8)));
		System.out.println(Arrays.toString(sugarHigh(new int[] { 16, 39, 67, 16, 38, 71 }, 17)));
		System.out.println(Arrays.toString(sugarHigh(new int[] { 16, 3, 14, 17, 11 }, 99)));
	}

	private static int[] sugarHigh(int candies[], int threshold) {

		int sum = 0;
		int[] result;
		List<Integer> candyList = Arrays.stream(candies).boxed().collect(Collectors.toList());
		List<Integer> sortedCandyList = Arrays.stream(candies).sorted().boxed().collect(Collectors.toList());
		List<Integer> filteredList = new ArrayList<Integer>();

		for (Integer candy : sortedCandyList) {
			if (sum + candy < threshold) {
				sum += candy;
				filteredList.add(candyList.indexOf(candy));
			} else {
				break;
			}
		}
		result = filteredList.stream().sorted().mapToInt(e -> e).toArray();
		return result;
	}
}