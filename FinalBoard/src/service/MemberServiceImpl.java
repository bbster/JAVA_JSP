package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import persistence.MemberDAO;
import persistence.MemberDAOImpl;
import persistence.MemberDTO;

public class MemberServiceImpl implements MemberSerivce {
	private static Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);
	MemberDAO mdao;
	public MemberServiceImpl() {
		mdao = new MemberDAOImpl();
		
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String nick = request.getParameter("nick");
		MemberDTO mdto = new MemberDTO(email, pwd, nick);
		
	}

	@Override
	public boolean regist(MemberDTO mdto) {
		boolean flag = mdao.insert(mdto);
		if(flag) {
			return true;
		}else {
			return false;
		}
	}
}
