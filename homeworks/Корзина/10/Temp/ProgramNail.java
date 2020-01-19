import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char text[] = scanner.nextLine().toCharArray();
        int check[] = new int[52];
        int index[] = new int[52];
        for (int i = 0; i < 52; i++) { // присвоим массиву "повторений" количество 1
        	index[i] = 1;
        }
        
        check[0] = text[0];
            for (int i = 1; i < text.length; i++) {
            	if (text[i] == check[i-1]){                       // если символ i не равен предыдущему работаем дальше 
            		for (int j = i + 1; j < text.length; j++) {
	       				if (text[i] == text[j]) {
	       					check[i] = text[i];
	       					index[i]++;
            			}
            		}	
				}else{
				index[i]++;		
				}
			System.out.print(index[i] + " ");
			}
    }
}
// char i = (char)check[0] присваивает i символ из массива строки
// System.out.print(text[0]) печатет символ из масива строки
// System.out.print(check[i] + " ") печатает code символа
// System.out.print((int)text[i] + " ");
// System.out.println(Arrays.toString(text));