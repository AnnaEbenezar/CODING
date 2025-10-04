import java.util.Scanner;

class Lab05_1_ChildThread extends Thread {
    private int num;
    private int result;

    public Lab05_1_ChildThread(int num) {
        this.num = num;
    }

    public void run() {
        result = 0;
        for (int i = 1; i <= 2 * num; i++) {
            result += i;
        }
    }

    public int getResult() {
        return result;
    }
}

public class Lab05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        Lab05_1_ChildThread child = new Lab05_1_ChildThread(num);
        child.start();

        int parentResult = 0;
        for (int i = 1; i <= num; i++) {
            parentResult += i;
        }

        try {
            child.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int finalResult = parentResult + child.getResult();
        System.out.println("The final result is: " + finalResult);
    }
}
