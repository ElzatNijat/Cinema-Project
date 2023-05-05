package cinema_project;

public class CinemaRoom {
	private int row;
	private int seat;

	public CinemaRoom(int row, int seat) {
		this.row = row;
		this.seat = seat;
	}

	public int totalSeats() {
		return this.row * this.seat;

	}

	public double soldPercentage(SoldSeats obj) {

		double soldPercentage = (obj.ticketsSold() * 1.00 / (this.row * this.seat)) * 100;
		double roundOffPercentage = Math.round(soldPercentage * 100.0) / 100.0;
		return roundOffPercentage;
	}

	public void totalIncome() {
		double ticketPrice = 10.0;
		double backTicketPrice = 8.0;
		int seatSold = 1;
		if (row * seat <= 60) {
			seatSold = seatSold * row * seat;
			System.out.println("Total Income " + "$" + ticketPrice * seatSold);
		} else if (row % 2 == 0) {
			seatSold = row / 2 * seat;
			System.out.println("Total Income " + "$" + (ticketPrice * seatSold + backTicketPrice * seatSold));
		} else if (row % 2 == 1) {
			int frontRow = (row - 1) / 2;
			int backRow = row - frontRow;
			System.out.println(
					"Total Income " + "$" + (ticketPrice * frontRow * seat + backTicketPrice * backRow * seat));
		}

	}

	public void ShowPrice(int selectRow, int selectSeat) {

		double ticketPrice = 10.0;
		double backTicketPrice = 8.0;

		if (this.row * this.seat <= 60) {

			System.out.println("Ticket price " + "$" + ticketPrice);
		} else {

			if (this.row % 2 == 0) {
				if (selectRow <= this.row / 2) {
					System.out.println("Ticket price " + "$" + ticketPrice);
				} else {
					System.out.println("Ticket price " + "$" + backTicketPrice);
				}

			}

			if (this.row % 2 == 1) {
				int frontRow = (this.row - 1) / 2;
				int backRow = this.row - frontRow;

				if (selectRow <= frontRow) {
					System.out.println("Ticket price " + "$" + ticketPrice);
				} else {
					System.out.println("Ticket price " + "$" + backTicketPrice);
				}

			}

		}

	}

	public void showSoldSeats(SoldSeats tickets) {

		System.out.println("Cinema:");

		for (int h = 0; h <= this.seat; h++) {
			if (h == 0) {
				System.out.print(" ");
			} else {
				System.out.print(h);
			}
		}
		System.out.println();

		int k = 1;
		for (int i = 1; i <= this.row; i++) {
			System.out.print(k);
			k++;
			for (int j = 1; j <= this.seat; j++) {

				for (Ticket n : tickets.getTickets()) {
					if (i == n.getSelectRow() && j == n.getSelectSeat()) {
						System.out.print("B");
						j++;
					}

				}

				if (j <= this.seat) {
					System.out.print("S");
				}

			}
			System.out.println();
		}

	}

	public double ticketPrice(int selectRow, int selectSeat) {

		double ticketPrice = 10.0;
		double backTicketPrice = 8.0;
		double output = 1.00;

		if (this.row * seat <= 60) {

			output = ticketPrice * output;
		} else {

			if (this.row % 2 == 0) {
				if (selectRow <= row / 2) {
					output = ticketPrice * output;
				} else {
					output = backTicketPrice * output;
				}

			}

			if (this.row % 2 == 1) {
				int frontRow = (this.row - 1) / 2;
				int backRow = this.row - frontRow;

				if (selectRow <= frontRow) {
					output = ticketPrice * output;
				} else {
					output = backTicketPrice * output;
				}

			}

		}
		return output;

	}

}
