package slr.mvn.tsk01.cnt;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import slr.mvn.lib.*;

/**
 *
 * @author T107
 */
public class CuentaSvr implements IServletExtension{

    @Override
    public void procesar(HttpServletRequest request, HttpServletResponse response, RequestType req, PrintWriter out) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("cuenta.jsp");
        request.setAttribute("hola", "k ase");
        rd.forward(request, response);
    }
    
}
