import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        // ������� ������ ��������� ���������� �� �� ��� �� �����������
        Rectangle rectangles[] = new Rectangle[100];
        // ������� ������-��������� ��������� �����
        Random random = new Random();
        // ������� ������ ����. ������ ��� ��������� ���������������
        RectanglesUtils rectanglesUtils = new RectanglesUtils();

        // ����� �� ���� ���������� ������� ���������������
        for (int i = 0; i < rectangles.length; i++) {
            // ������� ������������� �� ��������� �������
            rectangles[i] = rectanglesUtils.byArea(random.nextInt(1000));
            // ������� ������������� �� �����
            System.out.println(rectangles[i].getWidth() + "x" + rectangles[i].getHeight());
        }

        rectangles[55].setWidth(-132);
        // ������� ������ ��� �������� ����������
        // ���������� ����� ���������������
        int widths[] = new int[32];

        // ����� �� ������� �����
        for (int i = 0; i < rectangles.length; i++) {
            // ��� ��������, ���������������
            // ������ ������� ��������������
            // ������ ��������, ������ ����������� + 1
            widths[(int)rectangles[i].getWidth()]++;
        }

        for (int i = 0; i < widths.length; i++) {
            System.out.print(i + " -> " + widths[i] + ", ");
        }

    }
}