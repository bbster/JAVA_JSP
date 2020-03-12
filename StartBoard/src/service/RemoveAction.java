package service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.BoardDAO;

public class RemoveAction implements Action {
	private static Logger log = LoggerFactory.getLogger(ModifyAction.class);
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException{
		int bno = Integer.parseInt(req.getParameter("clno"));
		
		BoardDAO bdao = new BoardDAO();
		boolean flag = bdao.remove(bno);
		
		if(flag) {
			log.info("Data Delete Success");
		}else {
			log.info("Data Delete Fail");
		}
		
	}

}
