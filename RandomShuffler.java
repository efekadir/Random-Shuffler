import java.util.Arrays;

public class RandomShuffler {
	public static void main(String[] args) {
		int temp = 0;
		int count = 0;
		int[] num1 = {2, 5, 7, 9, 4, 12, 56, 23, 31, 13};
		int[] num2 = {2, 5, 7, 9, 4, 12, 56, 23, 31, 13};
		for (int i = num1.length - 1; i > 0; i--) {
			int mak = (int)(Math.random() * (i + 1));
			temp = num1[i];
			num1[i] = num1[mak];
			num1[mak] = temp;
		}
		for(int i = 0; i < num1.length; i++) {
			if (num1[i] == num2[i]) {
				count++;
			}
		}
		System.out.println("The reference array: " + Arrays.toString(num2));
		System.out.println("The random array: " + Arrays.toString(num1));
		System.out.println("Total equal number amount is " + count);
	}
}