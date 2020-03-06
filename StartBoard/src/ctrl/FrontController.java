package ctrl;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{
	
	public FrontController() {}
	

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI(); // Domain 뒤 url 주소 모두 긁어옴
		System.out.println("uri: " + uri);
		
		String contextPath = request.getContextPath();
		System.out.println("context: " + contextPath);
		
		String path = uri.substring(contextPath.length());
		System.out.println("path: " + path);
		
		if(path.equals("/test.do")) {
			String name = request.getParameter("name");
			System.out.println("name: " + name);
			
		}
	} 
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}
}

// django method 처리는 알아서 해줌(선언해주는 경우도 있음)
// java에서는 하나하나 선언해주고 service라는 메서드로 일괄처리
// django view = java servlet / controller 역할
// djago model = java dao,dto / model 역할 
// django template = java webcontent / view 역할