package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hisupplier.guess.util.IConstants;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final HttpServletRequest request, final HttpServletResponse response)
        throws java.io.IOException, ServletException {

    final PageContext pageContext;
    HttpSession session = null;
    final ServletContext application;
    final ServletConfig config;
    JspWriter out = null;
    final Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<title>海商网-研发部</title>\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"http://www.hisupplier.com/images/ico/hisupplier.ico\" type=\"image/x-icon\">\r\n");
      out.write("\t\t<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"/js/bootstrap-modal.js\"></script>\r\n");
      out.write("\t\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t\t::-webkit-scrollbar { width: 3px; height: 3px;}   \r\n");
      out.write("\t\t\t\t::-webkit-scrollbar-track-piece { background-color: #ffffff;}   \r\n");
      out.write("\t\t\t\t::-webkit-scrollbar-thumb{height: 50px; background-color: #666; -webkit-border-radius: 3px;}  \r\n");
      out.write("\t\t\t\t.ulist {\r\n");
      out.write("\t\t\t\t\twidth: 760px;\r\n");
      out.write("\t\t\t\t\tmargin: 0;\r\n");
      out.write("\t\t\t\t\tborder-top: 1px solid #cccccc;\r\n");
      out.write("\t\t\t\t\tborder-left: 1px solid #cccccc;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t.ulist li {\r\n");
      out.write("\t\t\t\t\tfloat: left;\r\n");
      out.write("\t\t\t\t\twidth: 150px;\r\n");
      out.write("\t\t\t\t\theight: 270px;\r\n");
      out.write("\t\t\t\t\tlist-style-type: none;\r\n");
      out.write("\t\t\t\t\tborder: 1px solid #cccccc;\r\n");
      out.write("\t\t\t\t\tposition: relative;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t.ulist li img {\r\n");
      out.write("\t\t\t\t\tpadding-top: 7px;\r\n");
      out.write("\t\t\t\t\tpadding-bottom: 4px;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t.msglist {\r\n");
      out.write("\t\t\t\t\twidth: 350px;\r\n");
      out.write("\t\t\t\t\tmargin: 0;\r\n");
      out.write("\t\t\t\t\tborder: 1px solid #cccccc;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t.msglist li {\r\n");
      out.write("\t\t\t\t\tfloat: left;\r\n");
      out.write("\t\t\t\t\twidth: 350px;\r\n");
      out.write("\t\t\t\t\tlist-style-type: none;\r\n");
      out.write("\t\t\t\t\tborder: 1px solid #cccccc;\r\n");
      out.write("\t\t\t\t\t/*非必须*/\r\n");
      out.write("\t\t\t\t\tline-height: 30px;\r\n");
      out.write("\t\t\t\t\tfont-size: 13px;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t.die_1 {\r\n");
      out.write("\t\t\t\t\tbackground-image:url(\"/img/people.png\");\r\n");
      out.write("\t\t\t\t\tbackground-repeat:no-repeat;\r\n");
      out.write("\t\t\t\t\ttop:27px;\r\n");
      out.write("\t\t\t\t\tleft:0px;\r\n");
      out.write("\t\t\t\t\twidth:120px;\r\n");
      out.write("\t\t\t\t\theight:119px;\r\n");
      out.write("\t\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t.die_2 {\r\n");
      out.write("\t\t\t\t\tbackground-image:url(\"/img/undercover.png\");\r\n");
      out.write("\t\t\t\t\tbackground-repeat:no-repeat;\r\n");
      out.write("\t\t\t\t\ttop:27px;\r\n");
      out.write("\t\t\t\t\tleft:0px;\r\n");
      out.write("\t\t\t\t\twidth:120px;\r\n");
      out.write("\t\t\t\t\theight:119px;\r\n");
      out.write("\t\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</style>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t$(function(){\r\n");
      out.write("\t\t\t\tgameMain();\r\n");
      out.write("\t\t\t\twindow.setInterval(\"gameMain()\",1000);\r\n");
      out.write("\t\t\t\t$('#myModal').modal({backdrop:false,keyboard:false, show:false});\r\n");
      out.write("\t\t\t    $('#myModal').on('show', function () {\r\n");
      out.write("\t\t\t    \tif ($(\"#modal-backdrop\").size() == 0) {\r\n");
      out.write("\t\t\t\t    \t$('<div class=\"modal-backdrop\" id=\"modal-backdrop\"/>').appendTo(document.body)\r\n");
      out.write("\t\t\t    \t}\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t    $('#myModal').on('hide', function () {\r\n");
      out.write("\t\t\t    \tif ($(\"#modal-backdrop\").size() > 0) {\r\n");
      out.write("\t\t\t\t    \t$(\"#modal-backdrop\").remove();\r\n");
      out.write("\t\t\t    \t}\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t//window.onbeforeunload=stoprefresh;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction stoprefresh(){\r\n");
      out.write("\t\t\t\treturn \"好好游戏不准刷新！\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction gameMain(){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:'/json/main.action',\r\n");
      out.write("\t\t\t\t\tcache:false,\r\n");
      out.write("\t\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\tshowLoginUser(data);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction showLoginUser(data){\r\n");
      out.write("\t\t\t\t$(\"#round\").html(\"第\" + data.map.round + \"回合\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//等待、准备\r\n");
      out.write("\t\t\t\tif (data.map.gameState==");
      out.print(IConstants.GAME_STATE_WAITING);
      out.write(" || data.map.gameState==");
      out.print(IConstants.GAME_STATE_READY);
      out.write("){\r\n");
      out.write("\t\t\t\t\tif ($(\"#gs\").html().indexOf(\"游戏等待中\")<0){\r\n");
      out.write("\t\t\t\t\t\t$(\"#gs\").html('游戏等待中...<button id=\"bsg\" class=\"btn btn-large btn-success\" disabled onclick=\"startGame();\">开始</button>');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t$(\"#tempgs\").val(0);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(data.map.gameState==");
      out.print(IConstants.GAME_STATE_READY);
      out.write("){//准备\r\n");
      out.write("\t\t\t\t\t\t$(\"#bsg\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$(\"#bsg\").attr(\"disabled\", \"true\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar existUser = getExistUser();\r\n");
      out.write("\t\t\t\t\t$(data.loginUsers).each(function(user){\r\n");
      out.write("\t\t\t\t\t\tif (existUser.indexOf(\",\"+this.id+\",\")<0){\r\n");
      out.write("\t\t\t\t\t\t\tvar html = '<li id=\"'+this.id+'\"><img width=\"120\" src=\"/img/headImg/'+this.headImg+'\" title=\"'+this.name+'\"/>'\r\n");
      out.write("\t\t\t\t\t\t\tif (this.gameState==");
      out.print(IConstants.GAME_STATE_READY);
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\thtml += '<input type=\"button\" disabled id=\"btn_ready_'+this.id+'\" class=\"btn btn-primary\" onclick=\"ready(this);\" value=\"已准备\"/></li>';\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\tif (this.id==");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\t\thtml += '<input type=\"button\" id=\"btn_ready_'+this.id+'\" class=\"btn btn-primary\" onclick=\"ready(this);\" value=\"准备\"/></li>';\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\thtml += '<input type=\"button\" disabled id=\"btn_ready_'+this.id+'\" class=\"btn btn-info\" value=\"未准备\"/></li>';\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tvar preId = getMaxIdLiLessThan(this.id);\r\n");
      out.write("\t\t\t\t\t\t\tif (preId == null){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#userlist\").append(html);\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#\"+preId).before(html);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tif (this.gameState==");
      out.print(IConstants.GAME_STATE_READY);
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\tif ($(\"#btn_ready_\"+this.id).size()>0){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#btn_ready_\"+this.id).attr(\"disabled\",true);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#btn_ready_\"+this.id).removeClass(\"btn-info\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#btn_ready_\"+this.id).addClass(\"btn-primary\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#btn_ready_\"+this.id).attr(\"value\", \"已准备\");\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t} else if(data.map.gameState==");
      out.print(IConstants.GAME_STATE_DOING);
      out.write("){ // 进行中\r\n");
      out.write("\t\t\t\t\tif($(\"#tempgs\").val()==0){\r\n");
      out.write("\t\t\t\t\t\t$(\"#gs\").html('游戏进行中');\r\n");
      out.write("\t\t\t\t\t\t$(\"#userlist\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#bsg\").hide();\r\n");
      out.write("\t\t\t\t\t\t$(\"#tempgs\").val(1);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif($(\"#gs\").html().indexOf(\"发言\")<0){\r\n");
      out.write("\t\t\t\t\t\t$(\"#gs\").html('游戏进行中 >> 发言');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar existUser = getExistUser();\r\n");
      out.write("\t\t\t\t\t$(data.loginUsers).each(function(user){\r\n");
      out.write("\t\t\t\t\t\tif (this.state!=");
      out.print(IConstants.GAME_STATE_OVER);
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\tif (existUser.indexOf(\",\"+this.id+\",\")<0){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar html = '<li id=\"'+this.id+'\" rel=\"'+this.guess.state+'\"><img width=\"120\" src=\"/img/headImg/'+this.headImg+'\" title=\"'+this.id+'\"/>'\r\n");
      out.write("\t\t\t\t\t\t\t\tif(this.id==");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\t\thtml+='<div>本轮词：'+this.word+'</div>';\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\tif (this.guess.state==");
      out.print(IConstants.GUESS_SPEAK_ALLOW);
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\t\thtml+='<div id=\"ds_'+this.id+'\">发言<i class=\"icon-volume-up\"></i><span id=\"stime_'+this.id+'\"></span></div>';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#tempvote\").val(0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif (this.id==");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#tmsg, #bspeak\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\thtml+='<div id=\"ds_'+this.id+'\" class=\"hide\">发言<i class=\"icon-volume-up\"></i><span id=\"stime_'+this.id+'\"></span></div>';\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#userlist\").append(html);\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\tvar oldstate = $(\"#\"+this.id).attr(\"rel\");\r\n");
      out.write("\t\t\t\t\t\t\t\tif(this.guess.state==");
      out.print(IConstants.GUESS_SPEAK_ALLOW);
      out.write("){ // 发言\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(oldstate==");
      out.print(IConstants.GUESS_SPEAK_UNALLOW);
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#ds_\"+this.id).show();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#\"+this.id).attr(\"rel\",\"");
      out.print(IConstants.GUESS_SPEAK_ALLOW);
      out.write("\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#tempvote\").val(0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (this.id==");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#tmsg, #bspeak\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#stime_\"+this.id).html(");
      out.print(IConstants.SPEAK_TIME);
      out.write("-this.guess.time);\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(oldstate==");
      out.print(IConstants.GUESS_SPEAK_ALLOW);
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#\"+this.id).attr(\"rel\",\"");
      out.print(IConstants.GUESS_SPEAK_UNALLOW);
      out.write("\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#ds_\"+this.id).hide();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif (data.map.guessState==");
      out.print(IConstants.GUESS_VOTE);
      out.write("){ // 投票信息\r\n");
      out.write("\t\t\t\t\t\t\tif ($(\"#l_v_\"+this.id).size() > 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#l_v_\"+this.id).html(this.name + \": \" + this.guess.allVoteUser);\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar vhtml = '<li id=\"l_v_'+this.id+'\">'+this.name + \": \" + this.guess.allVoteUser+'</li>';\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#uvote\").append(vhtml);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (this.gameState == ");
      out.print(IConstants.GAME_STATE_OVER);
      out.write(" && $(\"#sp_die_\"+this.id).size()==0) { // 淘汰标志\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#\"+this.id).append('<span id=\"sp_die_'+this.id+'\" class=\"die_'+this.identity+'\"></span>');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$(\"#vdesc\").html('');\r\n");
      out.write("\t\t\t\t\t$(data.map.desc).each(function(d){\r\n");
      out.write("\t\t\t\t\t\tvar html = '<li>'+this+'</li>';\r\n");
      out.write("\t\t\t\t\t\t$(\"#vdesc\").append(html);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tif (data.map.guessState==");
      out.print(IConstants.GUESS_VOTE);
      out.write(" && $(\"#tempvote\").val()==0){\r\n");
      out.write("\t\t\t\t\t\tif($(\"#gs\").html().indexOf(\"投票阶段\")<0){\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#gs\").html('游戏进行中 >> 投票阶段');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t$(data.loginUsers).each(function(user){\r\n");
      out.write("\t\t\t\t\t\t\tif (this.id==");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" && this.gameState==");
      out.print(IConstants.GAME_STATE_OVER);
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\".voteBtn\").remove();\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t} else if(this.guess.voteState==");
      out.print(IConstants.VOTE_NOT);
      out.write(" && $(\"#bvote_\"+this.id).size()==0 && this.id!=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar bhtml = '<button id=\"bvote_'+this.id+'\" onclick=\"vote('+this.id+');\" class=\"btn btn-primary voteBtn\">Ta是卧底</button>';\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#\"+this.id).append(bhtml);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t} else if(data.map.gameState==");
      out.print(IConstants.GAME_STATE_OVER);
      out.write(") {\r\n");
      out.write("\t\t\t\t\t$(\"#gs\").html('游戏结束');\r\n");
      out.write("\t\t\t\t\t// 弹框显示结果\r\n");
      out.write("\t\t\t\t\t$(\"#ifr_g_rsl\").attr(\"src\", \"/main/main_game_result.action\");\r\n");
      out.write("\t\t\t\t\t$('#myModal').modal('show');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction vote(userId){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:'/json/main_vote.action?selectedId='+userId,\r\n");
      out.write("\t\t\t\t\tcache:false,\r\n");
      out.write("\t\t\t\t\tdataType:'html',\r\n");
      out.write("\t\t\t\t\tsuccess:function(d){\r\n");
      out.write("\t\t\t\t\t\tif (d=='dieVoteErr'){\r\n");
      out.write("\t\t\t\t\t\t\talert('死人有选举权吗？');\r\n");
      out.write("\t\t\t\t\t\t} else if (d=\"voteMore\"){\r\n");
      out.write("\t\t\t\t\t\t\talert('投那么多次有意思吗？');\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#tempvote\").val(1);\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#userlist > li > button\").remove();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction getExistUser(){\r\n");
      out.write("\t\t\t\tvar existUser = \",\";\r\n");
      out.write("\t\t\t\t$(\"#userlist > li\").each(function(l){\r\n");
      out.write("\t\t\t\t\texistUser += this.id + \",\";\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\treturn existUser;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction getMaxIdLiLessThan(userId){\r\n");
      out.write("\t\t\t\tvar ul = $(\"#userlist > li\");\r\n");
      out.write("\t\t\t\tif (ul.length==0){\r\n");
      out.write("\t\t\t\t\treturn null;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar tId=null;\r\n");
      out.write("\t\t\t\tul.each(function(d){\r\n");
      out.write("\t\t\t\t\tvar liid=Number(this.id);\r\n");
      out.write("\t\t\t\t\tif(liid>userId){\r\n");
      out.write("\t\t\t\t\t\ttId=this.id;\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\treturn tId\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction ready(btn){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : '/json/main_user_ready.action',\r\n");
      out.write("\t\t\t\t\tcache:false,\r\n");
      out.write("\t\t\t\t\tdataType:'html',\r\n");
      out.write("\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\tbtn.disable=true;\r\n");
      out.write("\t\t\t\t\t\tbtn.value = '已准备';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction startGame(){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:'/json/main_start_game.action',\r\n");
      out.write("\t\t\t\t\tcache:false,\r\n");
      out.write("\t\t\t\t\tdataType:'html'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction stopGame() {\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:'/json/main_stop_game.action',\r\n");
      out.write("\t\t\t\t\tcache:false,\r\n");
      out.write("\t\t\t\t\tdataType:'html',\r\n");
      out.write("\t\t\t\t\tsuccess:function(d){\r\n");
      out.write("\t\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction speak() {\r\n");
      out.write("\t\t\t\tvar desc = $(\"#tmsg\").val();\r\n");
      out.write("\t\t\t\tif (desc != null && desc.length > 0){\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\turl:'/json/main_speak.action?desc='+desc,\r\n");
      out.write("\t\t\t\t\t\tcache:false,\r\n");
      out.write("\t\t\t\t\t\tdataType:'html',\r\n");
      out.write("\t\t\t\t\t\tsuccess:function(d){\r\n");
      out.write("\t\t\t\t\t\t\tif (d=='false'){\r\n");
      out.write("\t\t\t\t\t\t\t\talert('确定是你说话了吗');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#tmsg, #bspeak\").attr(\"disabled\", \"true\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction restart() {\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:'/json/main_user_ready.action',\r\n");
      out.write("\t\t\t\t\tcache:false,\r\n");
      out.write("\t\t\t\t\tdataType:'html',\r\n");
      out.write("\t\t\t\t\tsuccess:function(d){\r\n");
      out.write("\t\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"span7\">\r\n");
      out.write("\t\t\t\t\t<div id=\"dmsg\"></div><button class=\"btn btn-danger\" onclick=\"stopGame();\">停</button>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"tempgs\" value=\"0\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"tempvote\" value=\"0\"/>\r\n");
      out.write("\t\t\t\t\t<div style=\"margin:10px;font-size:18px;font-weight: bold;\"><span id=\"round\" style=\"padding-right:20px;\"></span><span id=\"gs\"></span></div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"ulist\" id=\"userlist\"></ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"padding-top:570px;display: block;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"well form-search\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"span8\" disabled placeholder=\"这不该你说话了，你有30秒时间\" id=\"tmsg\"/>&nbsp;&nbsp;<button id=\"bspeak\" disabled=\"disabled\" class=\"btn btn-primary\" onclick=\"speak();\">提交</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"span4\" style=\"padding-top:20px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"span4\">\r\n");
      out.write("\t\t\t\t\t\t<label>投票结果</label>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"msglist\" id=\"uvote\"></ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"span4\" style=\"padding-top:5px;\">\r\n");
      out.write("\t\t\t\t\t\t<label>词描述</label>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"msglist\" id=\"vdesc\"></ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"myModal\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t<h3 id=\"myModalLabel\">游戏结果</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\" style=\"height:360px;\">\r\n");
      out.write("\t\t\t\t<iframe id=\"ifr_g_rsl\" frameborder=\"0\" width=\"100%\" height=\"100%\"></iframe>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-primary\" onclick=\"restart();\">重新开始</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
