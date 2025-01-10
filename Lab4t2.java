package lab4t2;
class RollTable extends Thread {
    private int number;

    // Constructor to initialize the number for the table
    public RollTable(int number) {
        this.number = number;
        this.setName("RollTableThread"); // Set the thread's name
    }

    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] Multiplication Table of Roll Number (" + number + "):");
        for (int i = 1; i <= 10; i++) {
            System.out.println("[" + Thread.currentThread().getName() + "] " + number + " x " + i + " = " + (number * i));
        }
    }
}

class BirthTable extends Thread {
    private int number;

    // Constructor to initialize the number for the table
    public BirthTable(int number) {
        this.number = number;
        this.setName("BirthTableThread"); // Set the thread's name
    }

    public void run() {
        System.out.println("\n[" + Thread.currentThread().getName() + "] Multiplication Table of Birth Day (" + number + "):");
        for (int i = 1; i <= 10; i++) {
            System.out.println("[" + Thread.currentThread().getName() + "] " + number + " x " + i + " = " + (number * i));
        }
    }
}

public class Lab4t2{
    public static void main(String[] args) {
        // Create threads for roll number and birth day tables
        RollTable rollThread = new RollTable(216);  // Roll number
        BirthTable birthThread = new BirthTable(11);  // Birth day

        // Start both threads
        rollThread.start();
        birthThread.start();
    }
}
