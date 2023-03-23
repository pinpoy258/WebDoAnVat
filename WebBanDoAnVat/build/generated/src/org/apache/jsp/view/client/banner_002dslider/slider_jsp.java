package org.apache.jsp.view.client.banner_002dslider;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slider_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("       <section id=\"aa-slider\">\n");
      out.write("    <div class=\"aa-slider-area\">\n");
      out.write("      <div id=\"sequence\" class=\"seq\">\n");
      out.write("        <div class=\"seq-screen\">\n");
      out.write("          <ul class=\"seq-canvas\">\n");
      out.write("            <!-- single slide item -->\n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slide_1.jpg\" alt=\"Men slide img\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"seq-title\">\n");
      out.write("               <span data-seq>Giảm giá lên đến 50%</span>                \n");
      out.write("                <h2 data-seq>Các Loại Hạt Bổ Dưỡng</h2>                \n");
      out.write("                <p data-seq>Các loại hạt tại của hàng luôn luôn được tuyển chọn,và các mặt hàng luôn đảm bảo chất lượng.</p>\n");
      out.write("                <a data-seq href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/client/product\" class=\"aa-shop-now-btn aa-secondary-btn\">Xem Sản Phẩm</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <!-- single slide item -->\n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slide_2.jpg\" alt=\"Wristwatch slide img\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"seq-title\">\n");
      out.write("                <span data-seq>Giảm giá lên đến 20%</span>                \n");
      out.write("                <h2 data-seq>Rau Củ Quả Xanh Sạch</h2>                \n");
      out.write("                <p data-seq>Rau củ quả được trồng đảm bảo không thuốc hóa học , đảm bảo chất lương xanh sạch và an toàn.</p>\n");
      out.write("                <a data-seq href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/client/product\" class=\"aa-shop-now-btn aa-secondary-btn\">Xem Sản Phẩm</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <!-- single slide item -->\n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slide_3.jpg\" alt=\"Women Jeans slide img\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"seq-title\">\n");
      out.write("                <span data-seq>Giảm giá lên đến 33%</span>                \n");
      out.write("                <h2 data-seq>Trái Cây Ngon Ngọt</h2>                \n");
      out.write("                <p data-seq>Trái cây tại cửa hàng đa dạng về loại hàng, luôn đảm bảo tính an toàn và chất lượng lên hàng đầu.</p>\n");
      out.write("                <a data-seq href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/client/product\" class=\"aa-shop-now-btn aa-secondary-btn\">Xem Sản Phẩm</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <!-- single slide item -->           \n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slide_4.jpg\" alt=\"Shoes slide img\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"seq-title\">\n");
      out.write("                <span data-seq>Giảm giá lên đến 25%</span>                \n");
      out.write("                <h2 data-seq>Mật Ong Và Tinh Dầu</h2>                \n");
      out.write("                <p data-seq>Là 2 sản phẩm mới bên cửa hàng của chúng tôi,sản phẩm đã được kiểm định\n");
      out.write("                và cấp phép về an toàn.</p>\n");
      out.write("                <a data-seq href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/client/product\" class=\"aa-shop-now-btn aa-secondary-btn\">Xem Sản Phẩm</a>\n");
      out.write("              </div>\n");
      out.write("            </li>                   \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- slider navigation btn -->\n");
      out.write("        <fieldset class=\"seq-nav\" aria-controls=\"sequence\" aria-label=\"Slider buttons\">\n");
      out.write("          <a type=\"button\" class=\"seq-prev\" aria-label=\"Previous\"><span class=\"fa fa-angle-left\"></span></a>\n");
      out.write("          <a type=\"button\" class=\"seq-next\" aria-label=\"Next\"><span class=\"fa fa-angle-right\"></span></a>\n");
      out.write("        </fieldset>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
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
