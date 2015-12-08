/*
 * You are supposed to automate library information system for MUM where you need to
 *  keep records about Reading material, Shelf management, Issuance and Users. There 
 *  are four kind of reading material i.e. Books, Online research material, CDs, Newspapers. 
 *  While there are two kind of users i.e. Students and Staff. Students are allowed to borrow 
 *  upto 4 books while Staff is allowed to borrow 6 books at a time.
 *  Figure out the objects and classes and structure the whole problem into OOP.
 */
package question1;

import java.util.Scanner;

class ReadingMaterial {

	private int books;
	private int onlineResearchMaterial;
	private int cds;
	private int newspapers;

	public ReadingMaterial(int books, int onlineResearchMaterial, int cds, int newspapers) {
		this.books = books;
		this.onlineResearchMaterial = onlineResearchMaterial;
		this.cds = cds;
		this.newspapers = newspapers;

	}

	public int getBooks() {
		return books;
	}

	public void setBooks(int books) {
		this.books = books;
	}

	public int getOnlineResearchMaterial() {
		return onlineResearchMaterial;
	}

	public void setOnlineResearchMaterial(int onlineResearchMaterial) {
		this.onlineResearchMaterial = onlineResearchMaterial;
	}

	public int getCds() {
		return cds;
	}

	public void setCds(int cds) {
		this.cds = cds;
	}

	public int getNewspapers() {
		return newspapers;
	}

	public void setNewspapers(int newspapers) {
		this.newspapers = newspapers;
	}

}

class ShelfManagement {
	private String[] books;
	private String[] onlineResearchMaterial;
	private String[] cds;
	private String[] newspapers;

	public ShelfManagement(String[] books, String[] onlineResearchMaterial, String[] cds, String[] newspapers) {
		super();
		this.books = books;
		this.onlineResearchMaterial = onlineResearchMaterial;
		this.cds = cds;
		this.newspapers = newspapers;
	}

	public String[] getBooks() {
		return books;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}

	public String[] getOnlineResearchMaterial() {
		return onlineResearchMaterial;
	}

	public void setOnlineResearchMaterial(String[] onlineResearchMaterial) {
		this.onlineResearchMaterial = onlineResearchMaterial;
	}

	public String[] getCds() {
		return cds;
	}

	public void setCds(String[] cds) {
		this.cds = cds;
	}

	public String[] getNewspapers() {
		return newspapers;
	}

	public void setNewspapers(String[] newspapers) {
		this.newspapers = newspapers;
	}

}

class Issuance {
	private static int bookIssued=0;
	private static int onlineResearchMaterialIssued=0;
	private static int cdsIssued=0;
	private static int newspapersIssued=0;

	private static int IssuedByStudents=0;
	private static int IssuedByStaff=0;

	public static int getBookIssued() {
		return bookIssued;
	}

	public static void setBookIssued(boolean flag) {
		if (flag)
			Issuance.bookIssued++;
		else
			Issuance.bookIssued--;
	}

	public static int getOnlineResearchMaterialIssued() {
		return onlineResearchMaterialIssued;
	}

	public static void setOnlineResearchMaterialIssued(boolean flag) {
		if (flag)
			Issuance.onlineResearchMaterialIssued++;
		else
			Issuance.onlineResearchMaterialIssued--;
	}

	public static int getCdsIssued() {
		return cdsIssued;
	}

	public static void setCdsIssued(boolean flag) {
		if (flag)
			Issuance.cdsIssued += 1;
		else
			Issuance.cdsIssued--;
	}

	public static int getNewspapersIssued() {
		return newspapersIssued;
	}

	public static void setNewspapersIssued(boolean flag) {
		if (flag)
			Issuance.newspapersIssued += 1;
		else
			Issuance.newspapersIssued--;
	}

	public static int getIssuedByStudents() {
		return IssuedByStudents;
	}

	public static void setIssuedByStudents(boolean flag) {
		if (flag)
			IssuedByStudents++;
		else
			IssuedByStudents--;
	}

	public static int getIssuedByStaff() {
		return IssuedByStaff;
	}

	public static void setIssuedByStaff(boolean flag) {
		if (flag)
			IssuedByStaff ++;
		else
			IssuedByStaff --;
	}

}

class Users {

	private String name;
	private int id;
	private String email;

	public Users(String name, int id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class Students extends Users {
	private static int borrowedItem=0;

	public Students(String name, int id, String email) {
		super(name, id, email);
	}

	public void borrow(String item) {
		if(borrowedItem<4){
		if (item.equals("book")) {
			Issuance.setBookIssued(true);
		} else if (item.equals("online")) {
			Issuance.setOnlineResearchMaterialIssued(true);
		} else if (item.equals("cd")) {
			Issuance.setCdsIssued(true);
		} else if (item.equals("newpaper")) {
			Issuance.setNewspapersIssued(true);
			;

		} else
			System.out.println("Input Error !!");

		borrowedItem++;
		System.out.println("Requested Item ISSUED !!");
		}else{
			System.out.println("You can not take more then 4 Items. \n Please return other items to takes this.");
		}
	}

	public void returned(String item) {
		if (item.equals("book")) {
			Issuance.setBookIssued(false);
		} else if (item.equals("online")) {
			Issuance.setOnlineResearchMaterialIssued(false);
		} else if (item.equals("cd")) {
			Issuance.setCdsIssued(false);
		} else if (item.equals("newpaper")) {
			Issuance.setNewspapersIssued(false);
			;

		} else
			System.out.println("Input Error !!");
		System.out.println("Requested item - RETURNED");
		borrowedItem--;
	}

	public static int getBookBorrow() {
		return borrowedItem;
	}

	public static void setBookBorrow(int Borrow) {
		Students.borrowedItem = Borrow;
	}

}

class Staff extends Users {

	private static int borrowedItem=0;

	public Staff(String name, int id, String email) {
		super(name, id, email);
	}
	
	public void borrow(String item) {
		if(borrowedItem<4){
		if (item.equals("book")) {
			Issuance.setBookIssued(true);
		} else if (item.equals("online")) {
			Issuance.setOnlineResearchMaterialIssued(true);
		} else if (item.equals("cd")) {
			Issuance.setCdsIssued(true);
		} else if (item.equals("newpaper")) {
			Issuance.setNewspapersIssued(true);
			;

		} else
			System.out.println("Input Error !!");

		borrowedItem++;
		System.out.println("Requested Item ISSUED !!");
		}else{
			System.out.println("You can not take more then 4 Items. \n Please return other items to takes this.");
		}
	}

	public void returned(String item) {
		if (item.equals("book")) {
			Issuance.setBookIssued(false);
		} else if (item.equals("online")) {
			Issuance.setOnlineResearchMaterialIssued(false);
		} else if (item.equals("cd")) {
			Issuance.setCdsIssued(false);
		} else if (item.equals("newpaper")) {
			Issuance.setNewspapersIssued(false);
			;

		} else
			System.out.println("Input Error !!");
		System.out.println("Requested item - RETURNED");
		borrowedItem--;
	}
	
	public static int getBookBorrow() {
		return borrowedItem;
	}

	public static void setBookBorrow(int borrowedItem) {
		Staff.borrowedItem = borrowedItem;
	}
}


// Main Class 
public class Question1 {

	public static void main(String[] args) {
		
//		Adding Library material to shelf.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of book : ");
		int bookNum = input.nextInt();
		System.out.print("Enter number of OnlineMaterial : ");
		int onlineMat = input.nextInt();
		System.out.print("Enter number of Cd : ");
		int cdNum = input.nextInt();
		System.out.print("Enter number of New Paper : ");
		int newNum = input.nextInt();
		
//		Adding each of them by name
		String books[] = new String[bookNum];
		for (int i = 0; i < bookNum; i++) {
			System.out.print("Enter Book No."+(i+1)+" : ");
			books[i]=input.nextLine();
		}
		String online[] = new String[onlineMat];
		for (int i = 0; i < onlineMat; i++) {
			System.out.print("Enter OnlineMaterial No."+(i+1)+" : ");
			online[i]=input.nextLine();
		}
		String cds[] = new String[cdNum];
		for (int i = 0; i < cdNum; i++) {
			System.out.print("Enter Cds No."+(i+1)+" : ");
			cds[i]=input.nextLine();
		}
		String newPapers[] = new String[newNum];
		for (int i = 0; i < newNum; i++) {
			System.out.print("Enter New Paper No."+(i+1)+" : ");
			newPapers[i]=input.nextLine();
		}
		
		ShelfManagement sheft = new ShelfManagement(books, online, cds, newPapers);
		
		
//		Student user
		Students student = new Students("Achyut" , 12, "achyut.dev@gmail.com");
		student.borrow("book");
		student.borrow("cd");
		student.borrow("book");
		student.borrow("cd");
//		more then four 
		student.borrow("book"); 
//		return two item
		student.returned("book");
		student.returned("cd");
//		borrow again
		student.borrow("book");
		
//		Staff User
		Staff staff = new Staff("Devid ", 122, "profdevid@gmail.com");
		staff.borrow("book");
		
		
//		total remaining items 
		System.out.println(Issuance.getBookIssued());
		System.out.println(Issuance.getCdsIssued());
		System.out.println(Issuance.getOnlineResearchMaterialIssued());
		System.out.println(Issuance.getNewspapersIssued());
		
//		Shelf used by stuent and staff
		System.out.println(Issuance.getIssuedByStudents());
		System.out.println(Issuance.getIssuedByStaff());
		
		
	}

}
