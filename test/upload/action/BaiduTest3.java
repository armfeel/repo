package upload.action;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaiduTest3
 */
public class BaiduTest3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private static  Map<String,String> map = new ConcurrentHashMap<String,String>(); 

    public BaiduTest3() {
        super();
        map.put("kingdeetest504", "3.498d78fa8bb298c4713b871b3a82a6c5.2592000.1357261743.2367156752-426627");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		deal(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		deal(request, response);
	}
	
    private void deal(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		if(userName!=null&&!userName.equals("")) {
			if(map.get(userName)!=null) {
				response.getWriter().print(map.get(userName));
			}
		}
	}

}
