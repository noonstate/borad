package common;

public class ActionForward {
	
	private String path; // 서블릿에서 요청 처리후에 포워딩 할 뷰 페이지 url
	
	private boolean redirect; // 포워딩방식 true=redirect  false=dispatch

	public ActionForward() {
		
	}
	public ActionForward(String path, boolean redirect) {
		this.path = path;
		this.redirect = redirect;
	}

	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	
	
	
}
