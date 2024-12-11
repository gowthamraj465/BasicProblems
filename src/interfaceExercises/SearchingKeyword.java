package interfaceExercises;
interface Searchable{
	boolean search(String Keyword);
}
class Document implements Searchable{
	private String content;
	public Document(String content) {
		this.content = content;
	}
	public boolean search(String keyword) {
		return content.contains(keyword);
	}
}

public class SearchingKeyword {
	public static void main(String[] args) {
		Document myDoc = new Document("This is a sample text");
		boolean result = myDoc.search("sample");
		System.out.println(" Does the Document contains keyword 'sample' : "+result);
	}

}
