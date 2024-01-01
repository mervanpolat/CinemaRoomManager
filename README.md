# Cinema Seat Booking System

## Description
This Java application simulates a cinema seat booking system, allowing users to select a seat and view the corresponding ticket price. It's designed to demonstrate basic Java concepts such as arrays, loops, conditionals, and user input handling.

## Features
- Users can input the dimensions of the cinema (number of rows and seats per row).
- The program prints out the initial seating arrangement.
- Users can select a specific seat by entering its row and seat number.
- The program calculates the ticket price based on the seat location and the total number of seats.
- The seating arrangement is updated to mark the chosen seat and printed out again.
- The program outputs the ticket price for the selected seat.

## How to Run
Ensure you have Java installed on your system. Compile and run the Cinema.java file using your Java compiler or IDE.

1. Compile the Java file:
   ```
   javac cinema/Cinema.java
   ```

2. Run the compiled class:
   ```
   java cinema.Cinema
   ```

## User Guide
1. **Enter the number of rows**: Input the total number of rows in the cinema.
2. **Enter the number of seats in each row**: Input the number of seats available in each row.
3. The cinema layout will be displayed.
4. **Enter a row number**: Input the row number of the seat you want to book.
5. **Enter a seat number in that row**: Input the seat number in the specified row that you want to book.
6. The ticket price will be displayed, followed by the updated cinema layout with your seat marked as 'B'.

## Example
```
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
```
