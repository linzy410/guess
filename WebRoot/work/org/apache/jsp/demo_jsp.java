package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hisupplier.guess.util.IConstants;

public final class demo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<script type=\"text/javascript\" src=\"/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/js/uploadify/swfobject.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/js/uploadify/jquery.uploadify.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t$(\"#uploadify\").uploadify({\r\n");
      out.write("\t\t\t\t\t'swf'            : '/js/uploadify/uploadify.swf',\r\n");
      out.write("\t\t\t\t\t'uploader'       : '/upload.jsp',\r\n");
      out.write("\t\t\t\t\t'buttonText'\t : '选择图片',\r\n");
      out.write("\t\t\t\t\t'fileTypeExts'\t : '*.*',\r\n");
      out.write("\t\t\t\t\t'onUploadSuccess':function(file, data, response){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"thumbnail\" style=\"margin:25px;\">\r\n");
      out.write("\t\t\t<legend>图片上传</legend>\r\n");
      out.write("\t\t\t<input type=\"file\" name=\"uploadify\" id=\"uploadify\" />\r\n");
      out.write("\t\t</div>\t\r\n");
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
