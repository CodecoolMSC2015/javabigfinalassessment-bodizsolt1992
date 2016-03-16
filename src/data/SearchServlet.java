package data;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends javax.servlet.http.HttpServlet {

	private static final long serialVersionUID = 5974834586357593210L;

	Map<String, List<Person>> cache;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		Object reqSkillset = req.getAttribute("skillSet");
		javax.servlet.http.HttpSession session = req.getSession();
		if (reqSkillset.equals(session.getAttribute("skillSet"))) {
		}
		Object skillset = req.getAttribute("skillset");
		SearchType searchType = (SearchType) req.getAttribute("searchType");
		session.setAttribute("skillSet", skillset);
		session.setAttribute("searchType", searchType);
		out.close();

	}
}
