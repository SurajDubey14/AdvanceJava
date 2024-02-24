class AverageThread extends Thread {
    private int[] numbers;
    private double average;

    public AverageThread(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        try {
            average = calculateAverage();
            System.out.println("Average of the first 10 numbers: " + average);
        } catch (InterruptedException e) {
            System.out.println("AverageThread had interrupted.");
        }
    }

    private double calculateAverage() throws InterruptedException {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += numbers[i];
            Thread.sleep(100); // Simulate some processing time
        }
        return (double) sum / 10;
    }
}

class SquareThread extends Thread {
    private int[] numbers;

    public SquareThread(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        try {
            printSquares();
        } catch (InterruptedException e) {
            System.out.println("SquareThread had interrupted.");
        }
    }

    private void printSquares() throws InterruptedException {
        for (int num=0; num<numbers.length;num++) {
            System.out.println("Square of " + num + ": " + (num * num));
            Thread.sleep(100); // Simulate some processing time
        }
    }
}

public class ExampleOfMultithreading {
    public static void main(String[] args) {
        int[] arr = {1, 20, 50, 15, 30};

        AverageThread averageThread = new AverageThread(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        SquareThread squareThread = new SquareThread(arr);

        try {
            averageThread.start();
            averageThread.join(); // Wait for averageThread to finish
            squareThread.start();
            squareThread.join(); // Wait for squareThread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
