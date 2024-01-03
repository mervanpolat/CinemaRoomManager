# Cinema Seat Booking System

## Overview

This Java application simulates a cinema seat booking system, allowing users to interactively select seats and view ticket prices. It's designed to demonstrate basic Java concepts such as arrays, loops, conditionals, and user input handling. The application provides a simple text-based user interface for users to input the dimensions of the cinema, select seats, view the updated seating arrangement, ticket prices, and statistics on cinema occupancy and income.

## Features

- **Custom Cinema Size**: Users can define the number of rows and seats per row in the cinema.
- **Interactive Seating Layout**: The program prints out the initial seating arrangement and updates it as seats are booked.
- **Seat Selection**: Users can select a specific seat by entering its row and seat number.
- **Dynamic Ticket Pricing**: The program calculates the ticket price based on the seat's location and the total number of seats in the cinema.
- **Updated Seating Arrangement**: After booking, the seating arrangement is updated to mark the chosen seat and printed out again.
- **Ticket Pricing Output**: The program outputs the ticket price for the selected seat.
- **Cinema Statistics**: Display the number of purchased tickets, percentage of occupancy, current income, and total possible income.

## Installation

Ensure you have Java installed on your system. This application was built and tested with Java. You can download Java from the official [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html) or use package managers for your specific operating system.

## Compilation and Execution

Navigate to the directory containing the `Cinema.java` file and compile the Java file:

```bash
javac cinema/Cinema.java
```

Run the compiled class:

```bash
java cinema.Cinema
```

## Usage Instructions

1. **Start the Program**: Execute the program using the command line instructions above.
2. **Enter Cinema Dimensions**:
   - **Enter the number of rows**: Input the total number of rows in the cinema.
   - **Enter the number of seats in each row**: Input the number of seats available in each row.
   - The cinema layout will be displayed in a grid format with 'S' indicating available seats.
3. **Book Your Seat**:
   - **Enter a row number**: Input the row number of the seat you want to book.
   - **Enter a seat number in that row**: Input the seat number in the specified row that you want to book.
   - The ticket price will be displayed, followed by the updated cinema layout with your seat marked as 'B'.
4. **View Statistics**: At any point, you can view the cinema's booking statistics:
   - **Number of Purchased Tickets**: See how many seats have been booked.
   - **Percentage of Occupancy**: Understand the cinema's occupancy rate.
   - **Current Income**: View the income generated from the sold tickets.
   - **Total Possible Income**: See the potential total income if all seats are sold.
5. **Repeat or Exit**: Continue to book seats, view statistics, or choose the exit option from the menu to end the session.

## Example Session

```plaintext
Enter the number of rows:
> 7
Enter the number of seats in each row:
> 8

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
...

Enter a row number:
> 3
Enter a seat number in that row:
> 6

Ticket price: $10

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
...
3 S S S S S B S S
...

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 1
Percentage: 1.79%
Current income: $10
Total income: $560
```
