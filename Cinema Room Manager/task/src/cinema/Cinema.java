package cinema;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the dimensions of the cinema
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();

        // Step 2: Print the initial seating arrangement
        System.out.println("\nCinema:");
        printSeating(rows, seatsPerRow, null); // null indicates no booked seat initially

        // Step 3: Read the chosen seat coordinates
        System.out.println("\nEnter a row number:");
        int selectedRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int selectedSeat = scanner.nextInt();

        // Step 4: Determine the ticket price
        int ticketPrice = calculateTicketPrice(rows, seatsPerRow, selectedRow);
        System.out.println("\nTicket price: $" + ticketPrice);

        // Step 5: Update and print the seating arrangement with the chosen seat marked as 'B'
        int[] bookedSeat = {selectedRow, selectedSeat};
        System.out.println("\nCinema:");
        printSeating(rows, seatsPerRow, bookedSeat);

        scanner.close();
    }

    // Method to print the seating arrangement
    private static void printSeating(int rows, int seatsPerRow, int[] bookedSeat) {
        System.out.print("  ");
        for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
            System.out.print(seatNum + " ");
        }
        System.out.println();

        for (int rowNum = 1; rowNum <= rows; rowNum++) {
            System.out.print(rowNum + " ");
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                if (bookedSeat != null && bookedSeat[0] == rowNum && bookedSeat[1] == seatNum) {
                    System.out.print("B ");
                } else {
                    System.out.print("S ");
                }
            }
            System.out.println();
        }
    }

    // Method to calculate the ticket price
    private static int calculateTicketPrice(int rows, int seatsPerRow, int selectedRow) {
        int totalSeats = rows * seatsPerRow;
        if (totalSeats <= 60 || selectedRow <= rows / 2) {
            return 10; // Front half or small cinema
        } else {
            return 8; // Back half of a larger cinema
        }
    }
}
