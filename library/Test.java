package library;

/*-대학의 모든 도서정보는 하나의 도서관(저장소)에 보관 및 등록된다고 가정한다.
-각 학과(학부)에서 구매한 책들은 모두 이 도서관 도서정보에 등록되어야 한다고 가정한다.
-책을 대출할 때 책의 고유번호(serial)를 통해 검색되어 대출된다고 가정한다.
-도서관에서 책을 보관할 수 있는 정보의 최대치는 100권이며 초과시 자동으로 이전 저장소 크기의 2배로 증가된다고 가정한다. */


public class Test {

	public static void main(String[] args) {
		Library lib = Library.getLibrary();			
		Library lib2 = Library.getLibrary(); //이렇게 해도 하나의 도서관객체만 생성
		
		for(int i = 0; i < 200; i++) {
			lib.addBook(new Book("어린왕자", i));
		}
		
		lib2.addBook(new Book("콩쥐팥쥐", 123));
		System.out.println(lib2.toString());
		System.out.println(lib2.getBook(5));
		System.out.println(lib.toString());
		
	}

}
