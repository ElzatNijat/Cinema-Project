package cinema_project;

public class Ticket {

	private int selectRow;
	private int selectSeat;

	public Ticket(int selectRow, int selectSeat) {
		super();
		this.selectRow = selectRow;
		this.selectSeat = selectSeat;
	}

	public int getSelectRow() {
		return selectRow;
	}

	public void setSelectRow(int selectRow) {
		this.selectRow = selectRow;
	}

	public int getSelectSeat() {
		return selectSeat;
	}

	public void setSelectSeat(int selectSeat) {
		this.selectSeat = selectSeat;
	}

	@Override
	public String toString() {
		return "Ticket [selectRow=" + selectRow + ", selectSeat=" + selectSeat + "]";
	}

}
