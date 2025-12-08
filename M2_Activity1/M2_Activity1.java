package M2_Activity1;

public class M2_Activity1 {

	public static void main(String[] args) {
		//Book
		Book myBook = new Book();
		myBook.title = "All the Bright Places";
		myBook.author = "Jennifer Niven";
		
		myBook.read();	
		// Tree
		Tree myTree = new Tree();
		myTree.name = "Apple Tree";
		
		myTree.name();
		
		//House
		House myHouse = new House();
		myHouse.city = "Manila";
		
		myHouse.live();
		
	}

}