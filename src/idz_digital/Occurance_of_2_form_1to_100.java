package idz_digital;

public class Occurance_of_2_form_1to_100 {
	public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            count += countOccurrences(i, 2);
        }
        System.out.println("Number of occurrences of digit 2 from 1 to 100: " + count);
    }

    private static int countOccurrences(int number, int digit) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
