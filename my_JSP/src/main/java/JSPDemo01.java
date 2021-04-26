/**
 * JSP本质上就是一个Servlet（JSP继承自Servlet）
 * 浏览器向服务器发送请求，不管访问什么资源，本质上都是在访问Servlet
 *
 * 可以吧JSP视作一个特殊的标记类语言编写的"动态界面代码"：
 * 如果是简单的HTML代码，就直接转换为out.write("<html></html>")这样的代码
 * 而如果是使用<% %>标记的Java语句，就会转换为功能一样的Java代码，在加上系统自动封装的下述代码
 * 最后就封装成了一个Servlet类的Java文件，然后web容器进行编译，返回给客户端class文件，让JVM直接运行class文件
 * 就可以实现JSP中编写的效果
 *
 * JSP作为Java的一种应用，有一些扩充的语法，同时支持所有的Java语法
 *
 *
 *
 *
 *   public void _jspInit() {
 *   }
 *
 *   public void _jspDestroy() {
 *   }
 *
 *   public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
 *      {方法内执行的操作：
 *      1。判断请求的类型
 *      2。 * 2.定义了一直内置对象：
 *  *     final javax.servlet.jsp.PageContext pageContext;     //页面上下文
 *  *     javax.servlet.http.HttpSession session = null;       //session
 *  *     final javax.servlet.ServletContext application;      //ServletContext的封装：application
 *  *     final javax.servlet.ServletConfig config;            //Servlet配置
 *  *     javax.servlet.jsp.JspWriter out = null;              //out：就是封装好的Servlet.Writer
 *  *     final java.lang.Object page = this;                  //当前页面
 *  *     final javax.servlet.http.HttpServletRequest request  //请求
 *  *     final javax.servlet.http.HttpServletResponse response//相应
 *  *     exception
 *
 *      3。输出页面前增加的代码：
 *            response.setContentType("text/html;charset=UTF-8");           //设置相应的文档类型
 *       pageContext = _jspxFactory.getPageContext(this, request, response, //初始化页面上下文
 *       			null, true, 8192, true);
 *       _jspx_page_context = pageContext;                                  //
 *       application = pageContext.getServletContext();                     //初始化application
 *       config = pageContext.getServletConfig();                           //初始化config
 *       session = pageContext.getSession();                                //初始化session
 *       out = pageContext.getOut();                                        //初始化out对象
 *       _jspx_out = out;                                                   //
 *
 *       4。以上代码中的对象，可以直接在JSP页面中直接使用
 *      }
 *
 */
public class JSPDemo01 {
}
