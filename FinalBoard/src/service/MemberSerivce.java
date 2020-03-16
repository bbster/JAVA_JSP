package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import persistence.MemberDTO;

public interface MemberSerivce {
	void execute(HttpServletRequest request, HttpServletResponse response, String sign);

	boolean regist(MemberDTO mdto);
	boolean login(MemberDTO mdto);
}
