/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2019-04-09 15:08:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/header.inc", Long.valueOf(1554821780000L));
    _jspx_dependants.put("/includes.inc", Long.valueOf(1554731966000L));
    _jspx_dependants.put("/footer.inc", Long.valueOf(1554819102000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/css/main.css\">\t\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>");
      out.write("\r\n");
      out.write("<title>STB - Estações</title>\r\n");
      out.write("</head>\r\n");
      out.write("<header>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("\t<a class=\"navbar-left\" href=\"index.jsp\"><img src=\"/images/logo_home.png\" style=\"width: 50%; height: 50%\" ></a>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"index.jsp\">Horários</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"stations.jsp\">Estações</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"paths.jsp\">Rotas</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"holidays.jsp\">Feriados</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"users.jsp\">Usuários</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<button class=\"btn btn-info float-right btn-sm\"  onclick=\"location.href='login.jsp';\">Sair</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"pb-2 mt-4 mb-4 border-bottom title\"><label class=\"lb-lg\">Horários</label><button class=\"btn btn-primary float-right btn-sm\">Criar novo horário</button></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"d-flex justify-content-center\">\r\n");
      out.write("\t<table class=\"table table-striped table-bordered table-hover table-fit text-center align-middle\">\r\n");
      out.write("\t\t<thead >\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"col\">#</th>\r\n");
      out.write("\t\t\t\t<th scope=\"col\">Estação</th>\r\n");
      out.write("\t\t\t\t<th scope=\"col\">Rota</th>\r\n");
      out.write("\t\t\t\t<th scope=\"col\">Hora</th>\r\n");
      out.write("\t\t\t\t<th scope=\"col\">Dias da Semana</th>\r\n");
      out.write("\t\t\t\t<th scope=\"col\"></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t\t<td><h5>Natal</h5></td>\r\n");
      out.write("\t\t\t\t<td>Natal -> Ceará-Mirim</td>\r\n");
      out.write("\t\t\t\t<td><h2>06:48</h2></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div class=\"weekDays-selector\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-mon0\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-mon0\">Seg</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-tue0\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-tue0\">Ter</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-wed0\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-wed0\">Qua</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-thu0\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-thu0\">Qui</label>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-fri0\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-fri0\">Sex</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-sat0\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-sat0\">Sáb</label>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" disabled id=\"weekday-sun0\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-sun0\">Dom</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td><button type=\"button\" class=\"btn btn-outline-warning btn-sm\">Alterar</button></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"row\">2</th>\r\n");
      out.write("\t\t\t\t<td><h5>Natal</h5></td>\r\n");
      out.write("\t\t\t\t<td>Natal -> Ceará-Mirim</td>\r\n");
      out.write("\t\t\t\t<td><h2>09:44</h2></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div class=\"weekDays-selector\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-mon1\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-mon1\">Seg</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-tue1\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-tue1\">Ter</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-wed1\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-wed1\">Qua</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-thu1\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-thu1\">Qui</label>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-fri1\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-fri1\">Sex</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-sat1\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-sat1\">Sáb</label>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" disabled id=\"weekday-sun1\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-sun1\">Dom</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td><button type=\"button\" class=\"btn btn-outline-warning btn-sm\">Alterar</button></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"row\">3</th>\r\n");
      out.write("\t\t\t\t<td><h5>Natal</h5></td>\r\n");
      out.write("\t\t\t\t<td>Natal -> Ceará-Mirim</td>\r\n");
      out.write("\t\t\t\t<td><h2>12:40</h2></td>\r\n");
      out.write("\t\t\t\t<td><div class=\"weekDays-selector\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-mon2\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-mon2\">Seg</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-tue2\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-tue2\">Ter</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-wed2\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-wed2\">Qua</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-thu2\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-thu2\">Qui</label>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-fri2\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-fri2\">Sex</label> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" checked disabled id=\"weekday-sat2\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-sat2\">Sáb</label>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" id=\"weekday-sun2\" class=\"weekday\" /> \r\n");
      out.write("\t\t\t\t\t\t<label for=\"weekday-sun2\">Dom</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td><button type=\"button\" class=\"btn btn-outline-warning btn-sm\">Alterar</button></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("</body>\r\n");
      out.write("<footer>\r\n");
      out.write("\t<!-- Copyright -->\r\n");
      out.write("\t<div class=\"page-footer font-small blue text-center\">\r\n");
      out.write("\t\t© 2019 - Companhia Brasileira de Trens Urbanos - CBTU<br />\r\n");
      out.write("\t\tTodos os os direitos reservados.\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Copyright -->\r\n");
      out.write("</footer>");
      out.write("\r\n");
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
