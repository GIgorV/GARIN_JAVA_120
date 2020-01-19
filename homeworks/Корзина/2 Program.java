class Program {
	public static void main(String[] args) {
		int a5000, a2000, a1000, a500, a100, a50, a10, a5;
		int number = 13765;
		a5000 = number / 5000;
		number = number - a5000*5000;
		a2000 = number / 2000;
		number = number - a2000*2000;
		a1000 = number / 1000;
		number = number - a1000 * 1000;
		a500 = number / 500;
		number = number - a500 * 500;
		a100 = number / 100;
		number = number - a100 * 100;
		a50 = number / 50;
		number = number - a50*50;
		a10 = number / 10;
		number = number - a10 *10;
		a5 = number / 5;
		number = number - a5 * 5;
	System.out.println("5000=" + a5000);
	System.out.println("2000=" + a2000);
	System.out.println("1000=" + a1000);
	System.out.println(" 500=" + a500);
	System.out.println(" 100=" + a100);
	System.out.println("  50=" + a50);
	System.out.println("  10=" + a10);
	System.out.println("   5=" + a5);
	}
}