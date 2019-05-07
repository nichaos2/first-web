package sqlite.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqliteConnection {
	private static String dbResources = "resource_db";
	private static String myDB = "myfirstdb.db";
	// path to database in local project
	private static String url = "jdbc:sqlite:./" + dbResources + "/" + myDB;

	public static Connection Connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
			// TODO: handle exception
		}
	}
}
