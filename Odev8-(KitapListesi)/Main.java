import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		
		Book book1 = new Book("Kitap - 1", 175, "Yazar - 1", "1998");
		Book book2 = new Book("Kitap - 2", 256, "Yazar - 2", "2005");
		Book book3 = new Book("Kitap - 3", 1452, "Yazar - 3", "2035");
		Book book4 = new Book("Kitap - 4", 175, "Yazar - 4", "2048");
		Book book5 = new Book("Kitap - 5", 56, "Yazar - 5", "1896");
		Book book6 = new Book("Kitap - 6", 189, "Yazar - 6", "2006");
		Book book7 = new Book("Kitap - 7", 256, "Yazar - 7", "1006");
		Book book8 = new Book("Kitap - 8", 358, "Yazar - 8", "2001");
		Book book9 = new Book("Kitap - 9", 72, "Yazar - 9", "1996");
		Book book10 = new Book("Kitap - 10", 472, "Yazar - 10", "1999");
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		books.add(book10);
	
		Map<String, String> newMap = new HashMap<>();
		books.stream().forEach(book -> newMap.put(book.getName(), book.getAuthorName()));
		
		System.out.println(newMap);
		
		List<Book> lessThan100PagesList = new ArrayList<>();
		books.stream().filter(book -> book.getNumberOfPages() > 100).forEach(b -> lessThan100PagesList.add(b));
		
		System.out.println(lessThan100PagesList);
	}
}
