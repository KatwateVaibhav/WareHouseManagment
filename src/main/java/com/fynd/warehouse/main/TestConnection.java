package com.fynd.warehouse.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/CODINGGROUND";

	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		TestConnection sh = new TestConnection();
		sh.createConnection();
	}

	private final static String createTable = "CREATE TABLE `example` (id INT, data VARCHAR(100))";

	public Connection createConnection() throws IOException, ClassNotFoundException, SQLException {

		Connection connection;

		// Properties prop = new Properties();
		// System.out.println("test");
		// prop.load(new FileInputStream(System.getProperty("user.home") + "/mydb.cfg"));
		// System.out.println("user.home: " + System.getProperty("user.home"));
		//
		String host = "jdbc:mysql://node168468-java-mysql.jelastic.com/mysqldb";
		String username = "root";
		String password = "QGNqdk91394";
		String driver = "com.mysql.jdbc.Driver";

		// jdbc:mysql://node168468-java-mysql.jelastic.com/mysqldb
		// root
		// QGNqdk91394
		// com.mysql.jdbc.Driver

		System.out.println("host: " + host + "username: " + username + "password: " + password + "ndriver: " + driver);

		Class.forName(driver);
		System.out.println("--------------------------");
		System.out.println("DRIVER: " + driver);
		connection = DriverManager.getConnection(host, username, password);
		System.out.println("CONNECTION: " + connection);

		return connection;
	}

	public void runSqlStatement() {
		try {
			Statement statement = createConnection().createStatement();
			boolean rs = statement.execute(createTable);

		}
		catch (IOException ex) {
		}
		catch (ClassNotFoundException ex) {
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}}
