package cinema_project;

import java.util.ArrayList;

public class SoldSeats {

	private ArrayList<Ticket> tickets;

	public SoldSeats() {
		this.tickets = new ArrayList<>();
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public boolean seatTaken(int row, int seat) {

		for (Ticket n : this.tickets) {
			if (n.getSelectRow() == row && n.getSelectSeat() == seat) {
				return true;
			}
		}

		return false;
	}

	public void addTicketSold(Ticket ticket) {
		this.tickets.add(ticket);

	}

	public int ticketsSold() {
		int output = this.tickets.size();
		return output;

	}

	public double currentIncome(CinemaRoom room) {
		double output = 0.00;
		for (Ticket n : this.tickets) {
			output = output + room.ticketPrice(n.getSelectRow(), n.getSelectSeat());

		}
		return output;
	}

}
