package slr.mvn.tsk02.cnt;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import slr.mvn.lib.*;
import slr.mvn.tsk02.mdl.*;

/**
 *
 * @author aaron
 */
public class RegistroSvr implements IServletExtension{

    @Override
    public void procesar(HttpServletRequest request, HttpServletResponse response, RequestType req, PrintWriter out) throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Mascota mascota = (Mascota) Class.forName("slr.mvn.tsk02.mdl."+request.getParameter("animal")).newInstance();
        Persona x = new Persona();
        x.setMascota(mascota);
        x.getMascota().setNombre(request.getParameter("nombre"));
        RequestDispatcher rd = request.getRequestDispatcher("mascota.jsp");
        request.setAttribute("registro", x);
        rd.forward(request, response);
    }
    
}
