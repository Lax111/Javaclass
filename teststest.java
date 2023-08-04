//singleton

package test2;

public class teststest {

	public static void main(String[] args) {
		
		Documents doc3 = Documents.getInsctance();
		doc3.getConnection();
	}}

class Documents{
	
	private static Documents doc2 = null;
	
	private Documents() {
		
	}
	public static Documents getInsctance() {
		if(doc2 == null) {
		doc2 = new Documents();
			
		}
		
		return doc2;
	}
	public void getConnection() {
		System.out.println("con to docs");
	
	
	
	
	
}
}