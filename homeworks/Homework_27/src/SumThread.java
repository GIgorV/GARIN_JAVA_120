public class SumThread extends Thread {
    private final int numbers[];
    private int start;
    private int finish;
    private int result;

    public SumThread(int[] numbers, int start, int finish) {
        this.numbers = numbers;
        this.start = start;
        this.finish = finish;
    }

    @Override
    public void run() {
        for (int i = start; i<finish; i++){
            result += numbers[i];
        }
    }

    public int getResult() {
        return result;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }
}
