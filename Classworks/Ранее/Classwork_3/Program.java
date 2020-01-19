// Сортировка пузырьком (Bubble Sort)

class Program {
	public static void main(String[] args) {
	 	int a[] = {-1, 5, -3, 20, 11, 0, 2, 6};
	 	
//		for (int k = 0; k < 8; k++) {
//	 		System.out.print(" " + a[k]);	
//	 	}
//	 	System.out.println();

	 	for (int i = 8; i >= 0; i--) {
	 		for (int j = 0; j < i-1; j++) {
	 			if (a[j] > a[j+1]) {
	 				int temp = a[j];
	 				a[j] = a[j+1];
	 				a[j+1] = temp;
	 			}
	 		}
//	 		for (int k = 0; k < 8; k++) {
//	 			System.out.print(" " + a[k]);
//	 		}
//	 		System.out.println();
	 	}
	 	for (int i = 0; i < 8; i++) {
	 	System.out.print(" " + a[i]);	
	 	}
	 }
}
