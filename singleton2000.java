package test2;

public class singleton2000 {

	public static void main(String[] args) {
		
		DocumentZ docs = DocumentZ.getInstance();
		docs.getConnection();
		
	}}

class DocumentZ{
	
	private static DocumentZ docs = null;
	
	private DocumentZ() {
		
		
	}
	public static DocumentZ getInstance() {
		if(docs == null) {
		 docs = new DocumentZ();
	}
	
	return docs;
	
}

public void getConnection() {
	System.out.println("conn to docs");
}
}