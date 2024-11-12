package rollnumbertable;
// Thread to print the student roll number table
class RollNumberTable extends Thread {
    private String rollNumber;

    public RollNumberTable(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void run() {
        System.out.println("Roll Number Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(rollNumber + " * " + i + " = " + (rollNumber + "-" + i));
            try {
                Thread.sleep(100); // Sleep to simulate concurrent execution
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread to print the date of birth table
class DateOfBirthTable extends Thread {
    private String dateOfBirth;

    public DateOfBirthTable(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void run() {
        System.out.println("Date of Birth Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(dateOfBirth + " * " + i + " = " + (dateOfBirth + "-" + i));
            try {
                Thread.sleep(100); // Sleep to simulate concurrent execution
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating threads for roll number and date of birth tables
        RollNumberTable rollNumberTable = new RollNumberTable("2022f-SE-216");
        DateOfBirthTable dateOfBirthTable = new DateOfBirthTable("05-April");

        // Starting both threads to run concurrently
        rollNumberTable.start();
        dateOfBirthTable.start();
    }
}

