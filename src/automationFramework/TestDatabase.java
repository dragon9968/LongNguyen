package automationFramework;

import Utility.Database;

public class TestDatabase {

	public static void main(String[] args) {
        Database db = new Database();
        try {
            db.connect();
            System.out.println("Connecting to Database...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        db.close();
    }
}
