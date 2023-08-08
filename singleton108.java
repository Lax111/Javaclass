package test2;

public class singleton108 {

	public static void main(String[] args) {
		
		DocumentsZ docs = DocumentsZ.getInstant();
		docs.getConnection();
	}}
		
	class DocumentsZ{
		
		private static DocumentsZ docs = null;
		
		private DocumentsZ() {
			
			
		}
		public static DocumentsZ getInstant() {
			if(docs == null) {
			docs = new DocumentsZ();
		}
			return docs;
			
	}
		public void getConnection() {
			System.out.println("conn to docs");
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	