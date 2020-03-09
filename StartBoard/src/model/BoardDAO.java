package model;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoardDAO {
	private static Logger log = LoggerFactory.getLogger(BoardDAO.class);
	DataSource ds;

	public BoardDAO() {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/mysql");
		} catch (NamingException e) {
			log.info(">>> error : DB Connection Fail");
			e.printStackTrace();
		}
	}
	
	public boolean insert(String title, String author, String content, String email) {
		return false;
	}
}
