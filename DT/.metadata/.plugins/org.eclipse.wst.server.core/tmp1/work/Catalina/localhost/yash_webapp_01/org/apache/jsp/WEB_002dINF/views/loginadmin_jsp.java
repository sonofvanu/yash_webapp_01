/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.35
 * Generated at: 2016-10-23 12:08:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"robots\" content=\"noindex\">\r\n");
      out.write("\r\n");
      out.write("    <title>Parallax Login Form [RELOAD] - Bootsnipp.com</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    /**\r\n");
      out.write(" * parallax.css\r\n");
      out.write(" * @Author Original @msurguy -> http://bootsnipp.com/snippets/featured/parallax-login-form\r\n");
      out.write(" * @Reworked By @kaptenn_com \r\n");
      out.write(" * @package PARALLAX LOGIN.\r\n");
      out.write(" */\r\n");
      out.write("    \r\n");
      out.write("    body {\r\n");
      out.write("        background-color: #444;\r\n");
      out.write("        background: url(http://s18.postimg.org/l7yq0ir3t/pick8_1.jpg);\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("    .form-signin input[type=\"text\"] {\r\n");
      out.write("        margin-bottom: 5px;\r\n");
      out.write("        border-bottom-left-radius: 0;\r\n");
      out.write("        border-bottom-right-radius: 0;\r\n");
      out.write("    }\r\n");
      out.write("    .form-signin input[type=\"password\"] {\r\n");
      out.write("        margin-bottom: 10px;\r\n");
      out.write("        border-top-left-radius: 0;\r\n");
      out.write("        border-top-right-radius: 0;\r\n");
      out.write("    }\r\n");
      out.write("    .form-signin .form-control {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        font-family: 'Open Sans', Arial, Helvetica, sans-serif;\r\n");
      out.write("        height: auto;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        -webkit-box-sizing: border-box;\r\n");
      out.write("        -moz-box-sizing: border-box;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("    .vertical-offset-100 {\r\n");
      out.write("        padding-top: 100px;\r\n");
      out.write("    }\r\n");
      out.write("    .img-responsive {\r\n");
      out.write("    display: block;\r\n");
      out.write("    max-width: 100%;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    }\r\n");
      out.write("    .panel {\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.75);\r\n");
      out.write("    border: 1px solid transparent;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, .05);\r\n");
      out.write("    box-shadow: 0 1px 1px rgba(0, 0, 0, .05);\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script src=\"//code.jquery.com/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("    <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        window.alert = function(){};\r\n");
      out.write("        var defaultCSS = document.getElementById('bootstrap-css');\r\n");
      out.write("        function changeCSS(css){\r\n");
      out.write("            if(css) $('head > link').filter(':first').replaceWith('<link rel=\"stylesheet\" href=\"'+ css +'\" type=\"text/css\" />'); \r\n");
      out.write("            else $('head > link').filter(':first').replaceWith(defaultCSS); \r\n");
      out.write("        }\r\n");
      out.write("        $( document ).ready(function() {\r\n");
      out.write("          var iframe_height = parseInt($('html').height()); \r\n");
      out.write("          window.parent.postMessage( iframe_height, 'http://bootsnipp.com');\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<!-- \r\n");
      out.write(" * parallax_login.html\r\n");
      out.write(" * @Author original @msurguy (tw) -> http://bootsnipp.com/snippets/featured/parallax-login-form\r\n");
      out.write(" * @Tested on FF && CH\r\n");
      out.write(" * @Reworked by @kaptenn_com (tw)\r\n");
      out.write(" * @package PARALLAX LOGIN.\r\n");
      out.write("-->\r\n");
      out.write("        <script src=\"http://mymaplist.com/js/vendor/TweenLite.min.js\"></script>\r\n");
      out.write("        <body>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row vertical-offset-100\">\r\n");
      out.write("                    <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">                                \r\n");
      out.write("                                <div class=\"row-fluid user-row\">\r\n");
      out.write("                                    <img src=\"http://s11.postimg.org/7kzgji28v/logo_sm_2_mr_1.png\" class=\"img-responsive\" alt=\"Conxole Admin\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                                <form accept-charset=\"UTF-8\" role=\"form\" class=\"form-signin\">\r\n");
      out.write("                                    <fieldset>\r\n");
      out.write("                                        <label class=\"panel-login\">\r\n");
      out.write("                                            <div class=\"login_result\"></div>\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                        <input class=\"form-control\" placeholder=\"Username\" id=\"username\" type=\"text\">\r\n");
      out.write("                                        <input class=\"form-control\" placeholder=\"Password\" id=\"password\" type=\"password\">\r\n");
      out.write("                                        <br></br>\r\n");
      out.write("                                        <input class=\"btn btn-lg btn-success btn-block\" type=\"submit\" id=\"login\" value=\"Login »\">\r\n");
      out.write("                                    </fieldset>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("            </div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t/**\r\n");
      out.write(" * parallax.js\r\n");
      out.write(" * @Author original @msurguy (tw) -> http://bootsnipp.com/snippets/featured/parallax-login-form\r\n");
      out.write(" * @Tested on FF && CH\r\n");
      out.write(" * @Reworked by @kaptenn_com (tw)\r\n");
      out.write(" * @package PARALLAX LOGIN.\r\n");
      out.write(" */\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    $(document).mousemove(function(event) {\r\n");
      out.write("        TweenLite.to($(\"body\"), \r\n");
      out.write("        .5, {\r\n");
      out.write("            css: {\r\n");
      out.write("                backgroundPosition: \"\" + parseInt(event.pageX / 8) + \"px \" + parseInt(event.pageY / '12') + \"px, \" + parseInt(event.pageX / '15') + \"px \" + parseInt(event.pageY / '15') + \"px, \" + parseInt(event.pageX / '30') + \"px \" + parseInt(event.pageY / '30') + \"px\",\r\n");
      out.write("            \t\"background-position\": parseInt(event.pageX / 8) + \"px \" + parseInt(event.pageY / 12) + \"px, \" + parseInt(event.pageX / 15) + \"px \" + parseInt(event.pageY / 15) + \"px, \" + parseInt(event.pageX / 30) + \"px \" + parseInt(event.pageY / 30) + \"px\"\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("})\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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