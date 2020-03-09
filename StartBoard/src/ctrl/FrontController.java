package ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;

import model.BoardDAO;

import org.slf4j.Logger;

// 컨트롤러는 매핑 역할(django urls 역할)만 해주는게 좋다. - 모듈화를 잘 해야된다.
public class FrontController extends HttpServlet {
	private static Logger log = LoggerFactory.getLogger(FrontController.class);

	public FrontController() {
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI(); // Domain 뒤 주소 모두 긁어옴
		log.info("uri: " + uri);

		String contextPath = request.getContextPath(); // Domain 뒤 API 까지의 Location
		log.info("context: " + contextPath);

		String path = uri.substring(contextPath.length()); // 실제로 작동하는 API Location
		log.info("path: " + path);

		String targetPage = ""; // targetPage 값을 null값으로 두고 아래 if문을 통해 조건별로 targetPage 변경

		if (path.equals("/writeSave.do")) { //
			String title = request.getParameter("title"); // GET방식으로 넘어온 파라미터값 받아와서 command 출력
			String author = request.getParameter("author");
			String content = request.getParameter("content");
			String email = request.getParameter("email");

			BoardDAO bdao = new BoardDAO();
			bdao.insert(title, author, content, email);

			targetPage = "/testReturn.jsp";
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher(targetPage); // targetPage로 보내준다
		requestDispatcher.forward(request, response); // data binding
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service(request, response);
	}
}