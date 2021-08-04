public class Book {

	private String name;
	private int numberOfPages;
	private String authorName;
	private String publishDate;
	
	public Book(String name, int numberOfPages, String authorName, String publishDate) {
		this.name = name;
		this.numberOfPages = numberOfPages;
		this.authorName = authorName;
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		String ret = "";
		ret += "Book name: " + this.name + "\n ";
		ret += "Book number of pages: " + this.numberOfPages+ "\n ";
		ret += "Book author name: " + this.authorName + "\n ";
		ret += "Book publish date: " + this.publishDate + "\n";
		return ret;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	
}
