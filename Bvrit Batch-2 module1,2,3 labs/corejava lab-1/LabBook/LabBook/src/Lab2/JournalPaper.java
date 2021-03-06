package Lab2;
import Lab2.WrittenItem;

	public class JournalPaper extends WrittenItem {
		
		private int yearPublished;
		
		public JournalPaper(long id, String title, int noOfCopies, String author, int yearPublished) {
			super(id, title, noOfCopies, author);
			this.yearPublished = yearPublished;
		}
		
		

		@Override
		public String toString() {
			return "JournalPaper [yearPublished=" + yearPublished + "]";
		}

		public int getYearPublished() {
			return yearPublished;
		}

		public void setYearPublished(int yearPublished) {
			this.yearPublished = yearPublished;
		}
		
		public void checkIn() {
			System.out.println("Journal Paper Checked-In");
		}
		public void checkOut() {
			System.out.println("Journal Paper Checked-In");
		}
		public void addItem() {
			System.out.println("Journal Paper added");
		}

	}



