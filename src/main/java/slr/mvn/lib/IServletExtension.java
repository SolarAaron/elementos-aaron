package slr.mvn.lib;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
*
* @author aaron
*/
public interface IServletExtension {
    public void procesar(HttpServletRequest request, HttpServletResponse response, RequestType req, PrintWriter out)
        throws ServletException, IOException;
}