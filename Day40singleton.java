package test2;

public class Day40singleton {

	public static void main(String[] args) {
		

		
		DocumentDD docDD = DocumentDD.getObject();
		docDD.connection();
	}

}

class DocumentDD{
	
	private static DocumentDD docD;
	
	private DocumentDD(){
	}
		public static DocumentDD getObject() {
			
			if(docD == null) {
			docD = new DocumentDD();
			
		}
		
		return docD;
	}

public void connection() {
	System.out.println("connected");
}
}