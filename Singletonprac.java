//Singleton

package test2;

public class Singletonprac {

	public static void main(String[] args) {
		
		DocumentA doc7 = DocumentA.getInstance();
		doc7.getConnection();
	}
}

class DocumentA{
	
	private static DocumentA doc6 = null;
	
	private DocumentA() {
		
	}
	public static DocumentA getInstance() {
		if(doc6 == null) {
			doc6 = new DocumentA();
		}
		return doc6;
		
	}
	public void getConnection() {
		System.out.println("con to docs");
	}
}