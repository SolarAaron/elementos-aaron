package slr.mvn.tsk02.cnt;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import slr.mvn.lib.*;
import slr.mvn.tsk02.mdl.Perro;
import slr.mvn.tsk02.mdl.Persona;

/**
 *
 * @author aaron
 */
public class RegistroSvr implements IServletExtension{

    @Override
    public void procesar(HttpServletRequest request, HttpServletResponse response, RequestType req, PrintWriter out) throws ServletException, IOException {
        Persona x = new Persona();
        x.setPerro(new Perro());
        x.getPerro().setNombre("Toby");
        
        RequestDispatcher rd = request.getRequestDispatcher("perro.jsp");
        request.setAttribute("registro", x);
        rd.forward(request, response);
    }
    
}
