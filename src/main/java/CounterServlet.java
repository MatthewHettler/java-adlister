import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Integer count = new Integer(0);
        String head;
        if (session.isNew()) {
            head = "This is the New Session";
        } else {
            head = "This is the old Session";
            Integer oldcount =(Integer)session.getValue("count");
            if (oldcount != null) {
                count = new Integer(oldcount.intValue() + 1);
            }
        }
        session.putValue("count", count);
        out.println("<HTML><BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H2 ALIGN=\"CENTER\">" + head + "</H2>\n" +
                "<TABLE BORDER=1 ALIGN=CENTER>\n"
                + "<TR BGCOLOR=\"#FFAD00\">\n"
                +"  <TH>Information Type<TH>Session Count\n"
                +"<TR>\n" +" <TD>Total Session Accesses\n" +
                "<TD>" + count + "\n" +
                "</TABLE>\n"
                +"</BODY></HTML>" );
    }
}