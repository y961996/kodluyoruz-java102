import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book("Kitap 1", 100, "Yazar 1", "2001");
		Book book2 = new Book("Kitap 2", 150, "Yazar 2", "2000");
		Book book3 = new Book("Eski Kitap 1", 200, "Yazar 3", "2005");
		Book book4 = new Book("Yeni Kitap 1", 175, "Yazar 4", "2020");
		Book book5 = new Book("Eski Kitap 2", 75, "Yazar 5", "1985");
		
		Set<Book> books = new TreeSet<>();
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		books.forEach(book -> System.out.println(book));
		
		System.out.println("\n===============================================\n");
		
		Set<Book> books2 = new TreeSet<>(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getSayfaSayisi() - o2.getSayfaSayisi();
			}
		});
		
		books2.add(book1);
		books2.add(book2);
		books2.add(book3);
		books2.add(book4);
		books2.add(book5);
		
		books2.forEach(book -> System.out.println(book));
	}
}
