package test2;

//singleton pattern

public class Day28 {

	public static void main(String[] args) {

		// Database a = new Database(); //constructor is private
		
		Database db1 = Database.getInstance();
		db1.getConnection();
	}
}

class Database {
	private static Database db = null;

	private Database() {
	}

	public static Database getInstance() {

		if (db == null) {
			db = new Database();
		}
		// returns you singleton object

		return db;
	}

	public void getConnection() {
		System.out.println("You are connected to database");
	}

}
