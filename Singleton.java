package test2;

public class Singleton {

	public static void main(String[] args) {
		
		Document doc1 = Document.getInstance();
		doc1.getConnection();
	}

}

class Document{
	
	//declare static 
	private static Document doc = null;
	//create single construcoor
	private Document() {
}
	public static Document getInstance() {
		
		if(doc == null) {
			doc = new Document();
		}
		return doc;
	}
	public void getConnection() {
		System.out.println("conn to document");
	}}