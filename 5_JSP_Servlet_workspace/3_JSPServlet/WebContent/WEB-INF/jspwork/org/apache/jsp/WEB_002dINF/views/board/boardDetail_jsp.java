/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-10-26 07:07:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.Reply;
import java.util.ArrayList;
import board.model.vo.Board;
import member.model.vo.Member;

public final class boardDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/board/../common/menubar.jsp", Long.valueOf(1602658096409L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("board.model.vo.Board");
    _jspx_imports_classes.add("board.model.vo.Reply");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Board b = (Board) request.getAttribute("board");
	ArrayList<Reply> list = (ArrayList<Reply>) request.getAttribute("list");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>게시판 상세보기</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t.outer{\r\n");
      out.write("\t\twidth:800px; min-height:500px; background: rgba(255, 255, 255, 0.4); border: 5px solid white;\r\n");
      out.write("\t\tmargin-left:auto; margin-right:auto; margin-top:50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.tableArea {width: 450px; height:350px; margin-left:auto; margin-right:auto; align: center;}\r\n");
      out.write("\ttable{align: center;}\r\n");
      out.write("\t#updateBtn{background: #B2CCFF;}\r\n");
      out.write("\t#menuBtn{background: #D1B2FF;}\r\n");
      out.write("\t#deleteBtn{background: #D5D5D5;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");

	Member loginUser = (Member)session.getAttribute("loginUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>JSP&Servlet</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tbackground:url('");
      out.print( request.getContextPath() );
      out.write("/images/bg.png') no-repeat center center fixed;\r\n");
      out.write("\t\tbackground-size: cover;\r\n");
      out.write("\t}\r\n");
      out.write("\t.loginArea{float: right;}\r\n");
      out.write("\t#loginTable{text-align: right;}\r\n");
      out.write("\t#loginTable td:nth-child(1){padding-right: 15px;}\r\n");
      out.write("\t.loginBtns{float: right; margin-left: 5px;}\r\n");
      out.write("\t#loginBtn, #myPage{background: #D1B2FF;}\r\n");
      out.write("\t#joinBtn, #logout{background: #B2CCFF;}\r\n");
      out.write("\tinput[type=button], input[type=submit]{cursor: pointer; border-radius: 15px; color: white;}\r\n");
      out.write("\t#userInfo label{font-weight: bold;}\r\n");
      out.write("\r\n");
      out.write("\t.wrap{background: white; width: 100%; height: 50px;}\r\n");
      out.write("\t.menu{\r\n");
      out.write("\t\tbackground: white; color: navy; text-align: center; font-weight: bold; \r\n");
      out.write("\t\tvertical-align: middle; width: 150px; height: 50px; display: table-cell;\r\n");
      out.write("\t}\r\n");
      out.write("\tnav{width: 600px; margin-left: auto; margin-right: auto;}\r\n");
      out.write("\t.menu:hover {background: beige; color:orangered; font-weight:bold; cursor:pointer;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1 align=\"center\">Welcome to JSP&amp;Servlet World!</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"loginArea\">\r\n");
      out.write("\t\t");
 if(loginUser == null) { 
      out.write("\r\n");
      out.write("\t\t<form id=\"loginForm\" action=\"");
      out.print( request.getContextPath() );
      out.write("/login.me\" method=\"post\">\r\n");
      out.write("\t\t\t<table id=\"loginTable\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label>ID</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"userId\" id=\"userId\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label>PWD</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"userPwd\" id=\"userPwd\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"loginBtns\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" id=\"loginBtn\" value=\"로그인\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" id=\"joinBtn\" value=\"회원가입\" onclick=\"memberJoin();\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t<div id=\"userInfo\" align=\"right\">\r\n");
      out.write("\t\t\t<label>");
      out.print( loginUser.getUserName() );
      out.write("님의 방문을 환영합니다.</label>\r\n");
      out.write("\t\t\t<div class=\"btns\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" id=\"myPage\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/myPage.me'\" value=\"내 정보 보기\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" id=\"logout\" onclick=\"logout();\" value=\"로그아웃\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br clear=\"all\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"goHome();\">HOME</div>\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"goNotice();\">공지사항</div>\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"goBoard();\">게시판</div>\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"goThumbnail();\">사진게시판</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction logout() {\r\n");
      out.write("\t\t\tlocation.href = '");
      out.print( request.getContextPath() );
      out.write("/logout.me';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction memberJoin() {\r\n");
      out.write("\t\t\tlocation.href = '");
      out.print( request.getContextPath() );
      out.write("/signUpForm.me';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goHome() {\r\n");
      out.write("\t\t\tlocation.href = '");
      out.print( request.getContextPath() );
      out.write("';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goNotice() {\r\n");
      out.write("\t\t\tlocation.href = '");
      out.print( request.getContextPath() );
      out.write("/list.no';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goBoard() {\r\n");
      out.write("\t\t\tlocation.href = '");
      out.print( request.getContextPath() );
      out.write("/list.bo';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goThumbnail() {\r\n");
      out.write("\t\t\tlocation.href = '");
      out.print( request.getContextPath() );
      out.write("/list.th';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div class=\"outer\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<h2 align=\"center\">게시판 상세보기</h2>\r\n");
      out.write("\t\t<div class=\"tableArea\">\r\n");
      out.write("\t\t\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/boardUpdateForm.bo\" id=\"detailForm\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>분야</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( b.getCategory() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"no\" value=\"");
      out.print( b.getBoardId() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( b.getBoardTitle() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( b.getNickName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( b.getBoardCount() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<th>작성일</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( b.getCreateDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>내용</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t\t\t\t\t<textarea cols=\"60\" rows=\"15\" style=\"resize:none;\" readonly>");
      out.print( b.getBoardContent() );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
 if(loginUser != null && loginUser.getUserId().equals(b.getBoardWriter())) { 
      out.write("\r\n");
      out.write("\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" id=\"updateBtn\" value=\"수정\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"deleteBoard();\" id=\"deleteBtn\" value=\"삭제\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/list.bo'\" id=\"menuBtn\" value=\"메뉴로\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"replyArea\">\r\n");
      out.write("\t\t\t");
 if(loginUser != null) { 
      out.write("\r\n");
      out.write("\t\t\t<div class=\"replyWriterArea\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>댓글작성</td>\r\n");
      out.write("\t\t\t\t\t\t<td><textarea rows=\"3\" cols=\"80\" id=\"replyContent\" style=\"resize: none;\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t\t<td><button id=\"addReply\">댓글등록</button></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t<div id=\"replySelectArea\">\r\n");
      out.write("\t\t\t\t<table id=\"replySelectTable\">\r\n");
      out.write("\t\t\t\t");
 if(list.isEmpty()) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr><td colspan=\"3\">댓글이 없습니다.</td></tr>\r\n");
      out.write("\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 for(int i = 0; i < list.size(); i++) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"100px\">");
      out.print( list.get(i).getReplyWriter() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"400px\">");
      out.print( list.get(i).getReplyContent() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"200px\">");
      out.print( list.get(i).getCreateDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction deleteBoard() {\r\n");
      out.write("\t\t\tif(confirm('정말 삭제하시겠습니까?')) {\r\n");
      out.write("\t\t\t\tvar form = document.getElementById(\"detailForm\");\r\n");
      out.write("\t\t\t\tform.setAttribute(\"action\", \"");
      out.print( request.getContextPath() );
      out.write("/delete.bo\");\r\n");
      out.write("\t\t\t\tform.submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t");
 if(loginUser != null) { 
      out.write("\r\n");
      out.write("\t\t$('#addReply').click(function() {\r\n");
      out.write("\t\t\tvar writer = '");
      out.print( loginUser.getUserId() );
      out.write("'\r\n");
      out.write("\t\t\tvar bId = '");
      out.print( b.getBoardId() );
      out.write("';\r\n");
      out.write("\t\t\tvar content = $(\"#replyContent\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl: 'insertReply.bo',\r\n");
      out.write("\t\t\t\tdata: {writer: writer, bId:bId, content:content},\r\n");
      out.write("\t\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$replySelectTable = $(\"#replySelectTable\");\r\n");
      out.write("\t\t\t\t\t$replySelectTable.children().remove();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tfor(var key in data) {\r\n");
      out.write("\t\t\t\t\t\tvar $tr = $('<tr>');\r\n");
      out.write("\t\t\t\t\t\tvar $writerTd = $('<td>');\r\n");
      out.write("\t\t\t\t\t\t$writerTd.text(data[key].replyWriter).css('width', '100px');\r\n");
      out.write("\t\t\t\t\t\tvar $contentTd = $('<td>');\r\n");
      out.write("\t\t\t\t\t\t$contentTd.text(data[key].replyContent).css('width', '400px');\r\n");
      out.write("\t\t\t\t\t\tvar $dateTd = $('<td>');\r\n");
      out.write("\t\t\t\t\t\t$dateTd.text(data[key].createDate).css('width', '200px');\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$tr.append($writerTd);\r\n");
      out.write("\t\t\t\t\t\t$tr.append($contentTd);\r\n");
      out.write("\t\t\t\t\t\t$tr.append($dateTd);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$replySelectTable.append($tr);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#replyContent\").val(\"\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
