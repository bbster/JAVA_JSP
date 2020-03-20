package ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.MemberService;
import service.MemberServiceImpl;


@WebServlet("/member")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(MemberController.class);
	MemberService service ;

    public MemberController() {
    	service = new MemberServiceImpl();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String sign = request.getParameter("sign");
		
		if (sign.equals("regist")) {
			service.execute(request, response, sign);			
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp?pg=welcome");
			dispatcher.forward(request, response);
		} else if (sign.equals("login")) {
			service.execute(request, response, sign);			
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		} else if (sign.equals("logout")) {
			HttpSession session = request.getSession();
			session.invalidate();
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		} else if (sign.equals("idCheck")) {
			service.execute(request, response, sign);			
		} else if (sign.equals("mlist")) {
			service.execute(request, response, sign);
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp?pg=mlist");
			dispatcher.forward(request, response);
		}else if (sign.equals("mdelete")) {
			service.execute(request, response, sign);
			RequestDispatcher dispatcher = request.getRequestDispatcher("member?sign=mlist");
			dispatcher.forward(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
