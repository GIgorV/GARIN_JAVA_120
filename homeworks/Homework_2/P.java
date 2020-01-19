import java.util.Scanner;
class P {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum5000 = 0;
		int sum2000 = 0;
		int sum1000 = 0;
		int sum500 = 0;
		int sum100 = 0;
		int sum50 = 0;
		for (int i = 0; num / 5000 >= 1; i++) {
			num = num - 5000;
			sum5000++;
		}
		for (int i = 0; num / 2000 >= 1; i++) {
			num = num - 2000;
			sum2000++;
		}
		for (int i = 0; num / 1000 >= 1; i++) {
			num = num - 1000;
			sum1000++;
		}
		for (int i = 0; num / 500 >= 1; i++) {
			num = num - 500;
			sum500++;
		}
		for (int i = 0; num / 100 >= 1; i++) {
			num = num - 100;
			sum100++;
		}
		for (int i = 0; num / 50 >= 1; i++) {
			num = num - 50;
			sum50++;
		}
		System.out.println("Количество купюр номиналом 5000 рублей составит " +sum5000);
		System.out.println("Количество купюр номиналом 2000 рублей составит " +sum2000);
		System.out.println("Количество купюр номиналом 1000 рублей составит " +sum1000);
		System.out.println("Количество купюр номиналом 500 рублей составит " +sum500);
		System.out.println("Количество купюр номиналом 100 рублей составит " +sum100);
		System.out.println("Количество купюр номиналом 50 рублей составит " +sum50);
	}
}