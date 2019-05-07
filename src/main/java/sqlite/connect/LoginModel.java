package sqlite.connect;

import java.sql.Connection;
import java.sql.SQLException;

public class LoginModel {

	private Connection connection;

	public LoginModel() {
		connection = SqliteConnection.Connector();
		if (connection == null) {
			System.out.println("connection not successful");
			System.exit(1);
		}
	}

	public boolean isDbConnected() {
		try {
			return !connection.isClosed();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
