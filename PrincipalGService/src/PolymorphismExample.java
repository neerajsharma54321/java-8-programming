
public class PolymorphismExample {
	public static void main(String str[]) {
		
	}
}

class Book {
	void setBook(int a, int b) {}
}


class OtherBook extends Book{
	void setBook(int a, int b) {}
	void setBook() {}
}