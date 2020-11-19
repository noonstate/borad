package board.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Action;
import common.ActionForward;

public class HomeAction implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("test", "test");
		ActionForward forward = new ActionForward();
		forward.setPath("/views/index.jsp");
		
		return forward;
	}
}
