package array;

public class BookArray2 {

	public static void main(String[] args) {
		book [] library = new book [5];
		library[0] = new book("태백산","조쟁");
		library[1] = new book("데미안-","헤르");
		library[2] = new book("오오오","오오오오");
		library[3] = new book("12","12424아아");
		library[4] = new book("가지","고리기리기");
									
		for(int i =0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}

}
