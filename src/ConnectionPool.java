import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.dbcp.*;

/**
 * ConnectionPool using DBCP. 
 *
 */
public class ConnectionPool {
	private static BasicDataSource dataSource;
	
	private static Connection getConnection() throws SQLException, IOException, FileNotFoundException {
		if(dataSource == null) {
			Properties properties = new Properties();
			InputStream input = new FileInputStream("connection.properties");

			properties.load(input);
			
			dataSource = new BasicDataSource();
			dataSource.setDriverClassName(properties.getProperty("className"));
			dataSource.setUsername(properties.getProperty("user"));
			dataSource.setPassword(properties.getProperty("password"));
			dataSource.setUrl(properties.getProperty("url"));
			dataSource.setInitialSize(Integer.parseInt((String) properties.getOrDefault("initialConnections", "10")));
			
			input.close();
		}
		return dataSource.getConnection();
	}

}
