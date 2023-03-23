package org.apache.jsp.view.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <!-- Start header section -->\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./header/mainHeader.jsp", out, true);
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <section id=\"aa-catg-head-banner\">\n");
      out.write("   <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/banner_tc.jpg\" alt=\"banner sản phẩm\">\n");
      out.write("   <div class=\"aa-catg-head-banner-area\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("      <div class=\"aa-catg-head-banner-content\">\n");
      out.write("        <h2>Hướng dẫn đặt hàng</h2>\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\">Trang chủ</a></li>   \n");
      out.write("          <li style=\"color:#fff\">Đăt hàng</li>      \n");
      out.write("        </ol>\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("   </div>\n");
      out.write("  </section>\n");
      out.write("  <section id=\"aa-product-category\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("      \t<div>\n");
      out.write("      \t\t<h1 style =\"text-align: center; color: red;\">Hướng dẫn đặt hàng</h1>\n");
      out.write("      \t\t<strong>Các bước mua hàng trên Nông Sản 24h: </strong>\n");
      out.write("      \t\t<p>\n");
      out.write("      \t\t- Tìm kiếm sản phẩm <br>\n");
      out.write("      \t\t- Chọn sản phẩm <br>\n");
      out.write("      \t\t- Kiểm tra thông tin sản phẩm <br> \n");
      out.write("      \t\t- Xác nhận giỏ hàng <br>\n");
      out.write("      \t\t- Nhập thông tin giao hàng <br>\n");
      out.write("      \t\t- Chọn phương thức thanh toán <br>\n");
      out.write("      \t\t- Đặt hàng <br>\n");
      out.write("      \t\t- Nhận thông báo xác nhận đơn hàng.</p>\n");
      out.write("      \t\t\n");
      out.write("\t\t\t<p>Cách thức thực hiện cực đơn giản, dễ dàng, và nhanh chóng và có đầy đủ hướng dẫn sẽ tiết kiệm thời gian mua hàng của khách hàng.</p>\n");
      out.write("      \t\t\n");
      out.write("      \t\t<p>Ngoài mua hàng thông qua website, khách hàng cũng có thể đặt hàng các sản phẩm của <strong>Nông Sản 24h</strong> qua Hotline: 19001234</p>\n");
      out.write("      \t\t<i>Hy vọng rằng với những kênh đặt hàng tiện lợi, đơn giản chúng tôi sẽ phục vụ khách hàng một cách nhanh nhất, hiệu quả nhất.</i>\n");
      out.write("      \t\t<br><br/>\n");
      out.write("      \t</div>\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("<!--  footer-->\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./footer/footer.jsp", out, true);
      out.write("\n");
      out.write("<!-- end footer-->\n");
      out.write("      ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/view/client/assets");
    _jspx_th_c_url_0.setVar("url");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
