package Lab2;

public class Library {
public static void main(String[] args) {
		
		CD j= new CD (2145255,"java",5,89,"Sid","abcd");
		Book i=new Book(245367,"corejava",6,"JamesGosling");
		j.addItem();
		j.checkIn();
		j.checkOut();
		j.print();
		System.out.println(j);
		i.addItem();
		i.checkIn();
		i.checkOut();
		i.print();
		System.out.println(i);
	}
}


