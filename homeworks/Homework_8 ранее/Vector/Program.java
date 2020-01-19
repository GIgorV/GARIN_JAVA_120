import java.util.Scanner;
class Program{
	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
            Scanner scanner = new Scanner(System.in);
            int arraySize = scanner.nextInt();
            System.out.print("Введите значения для массива: ");
            int a[] = new int[arraySize];
            for (int i=0; i < arraySize; i++) {
                a[i] = scanner.nextInt();
			}
		int vector[] = new int[arraySize];
		for (int i=0; i<vector.length; i++){
			vector[i]=0;
		}

		for (int i = 0; i<arraySize; i++){
			int indexVector = a[i];
			for (int j=i+1;j<arraySize;j++){
				if (a[i]==a[j]){
				vector[indexVector] ++;	
				} 
			}
		}
		for (int i=0; i<vector.length; i++){
			System.out.print(i + " ");
		}
		System.out.println(" ");

		for (int i=0; i<vector.length; i++){
			System.out.print(vector[i] + " ");
		}
	}
}