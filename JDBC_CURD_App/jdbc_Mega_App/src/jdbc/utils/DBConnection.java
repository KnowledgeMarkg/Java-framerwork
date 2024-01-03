package jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/jdbcdb";
	private static final String DATABASE_USER = "kausar";
	private static final String DATABASE_PASS = "kausar86";

	public DBConnection() {
		try {
			Class.forName(DRIVER_PATH);
		} catch (Exception e) {
			throw new RuntimeException("Something Went Wrong " + e);
		}
	}// End Of Constructor......

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASS);
	}// End Of GetConnection Method.....
}
