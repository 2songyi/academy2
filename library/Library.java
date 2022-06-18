package library;

public class Library {
	private static Library lib = new Library();
	
	// 생성자를 private으로 설정해서 객체생성을 한번만 하도록
	private Library() {
		
	}
	
	//main에서 객체를 생성하지 않고 (이 클래스에서 객체를 생성하고)이 메서드만 호출하게 함.
	//이 메서드를 호출하게 되면 하나의 도서관만 생성되게 한다.
	public static Library getLibrary() {
		return lib;
	}
	
	private static int listLeng = 100; //저장할 수 있는 도서의 최대치
	private static String[][] bookList = new String[listLeng][2];//책정보를 담을 배열
	private static int bookIndex = 0;
	private String giveBook = "";
	
	public void addBook(Book book) {
		if (bookIndex >= listLeng) {
			// 등록하려는 책의 인덱스가 저장가능한 도서의 수를 넘었을 때
			listLeng *= 2; //저장소 크기 2배로 증가
			String[][] copy = bookList; //지금까지 사용한 배열을 copy변수에 저장
			bookList = new String[listLeng][2]; //저장소를 늘린 새로운 배열 생성
			System.arraycopy(copy, 0, bookList, 0, copy.length);
			// 저장소를 늘린 새로운 배열에 지금까지 썼던 배열들을 앞에 넣어서 이어서 사용
		}
		bookList[bookIndex][0] = book.getBookName(); //책이름 저장
		bookList[bookIndex][1] = book.getSerial(); //시리얼넘버 저장
	}
	
	public String getBook(int serial) {
		for(int i = 0; i < bookList.length; i++) { //등록된 책의 개수
			if (Integer.toString(serial).equals(bookList[i][1])) {
				giveBook = bookList[i][0];
			}
		}
		return giveBook; //책이름 반환
	}
	
	
}
