package array;

public class Objectcopy3 {

	public static void main(String[] args) {
		book[] bookArray1 = new book[3];
		book[] bookArray2 = new book[3];
		
		bookArray1[0]=new book("태백산맥","조정래");
		bookArray1[1]=new book("데미안","헤르만 헤세");
		bookArray1[2]=new book("어떻게 살것 인가?","유시민");
		
		bookArray2[0]=new book();
				bookArray2[1]=new book();
				bookArray2[2]=new book();
				
			for(int i =0; i<bookArray1.length; i++) {
				bookArray2[i].setBookName(bookArray1[i].getBookName());
				bookArray2[i].setAuthor(bookArray1[i].getBookName());
			}
			
			for(int i =0; i<bookArray2.length;i++)	{
				bookArray2[i].showBookInfo();
			}
			bookArray1[0].setBookName("나무");
			bookArray1[0].setAuthor("박완서");
			
			System.out.println("=== bookArray1 ===");
	for(int i=0; i< bookArray1.length; i++) {
		bookArray1[i].showBookInfo();
	}
	
	System.out.println("=== bookArray2 ===");
	for(int i=0; i <bookArray2.length; i++) {
		bookArray2[i].showBookInfo();
	}
	}

}
