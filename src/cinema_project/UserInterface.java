package cinema_project;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		SoldSeats list = new SoldSeats();

		System.out.println("Enter the number of rows:");

		int row = scan.nextInt();

		System.out.println("Enter the number of seats in each row:");

		int seat = scan.nextInt();
		System.out.println();

		CinemaRoom room = new CinemaRoom(row, seat);

		while (true) {

			System.out.println(
					"1. Show the seats" + "\n" + "2. Buy a ticket" + "\n" + "3. Statistics" + "\n" + "0. Exit" + "\n");

			int command = scan.nextInt();

			switch (command) {

			case 0:

				return;

			case 1:

				room.showSoldSeats(list);

				System.out.println();
				System.out.println();

				break;

			case 2:

				System.out.println("Enter a row number:");

				int selectRow = scan.nextInt();

				System.out.println("Enter a seat number in that row:");

				int selectSeat = scan.nextInt();

				Ticket ticket = new Ticket(selectRow, selectSeat);

				if (list.seatTaken(selectRow, selectSeat) == false) {

					list.addTicketSold(ticket);
					room.ShowPrice(selectRow, selectSeat);
				} else if (list.seatTaken(selectRow, selectSeat) == true) {
					System.out.println("seat taken");
				}

				System.out.println();

				break;

			case 3:

				System.out.println("Tickets Sold: " + list.ticketsSold());

				System.out.println("Purchased Tickets Precentage: " + room.soldPercentage(list) + "%");

				System.out.println("Current Income: $" + list.currentIncome(room));

				room.totalIncome();

				System.out.println();

				break;

			}

		}

	}

}
