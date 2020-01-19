class Program {
	public static void main(String[] args) {
		int number = 135;
		int a7, a6, a5, a4, a3, a2, a1, a0;
		a0 = number % 2;
		number /=2;
		a1 = number % 2;
		number /=2;
		a2 = number % 2;
		number /= 2;
		a3 = number % 2;
		number /=2;
		a4 = number % 2;
		number /=2;
		a5 = number % 2;
		number /= 2;
		a6 = number % 2;
		number /=2;
		a7 = number % 2;
		
		System.out.println(a7 + "" +
			a6 +"" +
			a5 +"" +
			a4 +"" +
			a3 +"" +
			a2 +"" +
			a1 +"" +
			a0);
	}
}