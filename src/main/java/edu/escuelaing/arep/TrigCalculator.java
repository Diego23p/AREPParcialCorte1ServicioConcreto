package edu.escuelaing.arep;

import edu.escuelaing.arep.service.Impl.OperacionesImpl;
import edu.escuelaing.arep.service.Operaciones;
import java.util.ArrayList;
import java.util.List;
import spark.*;
import static spark.Spark.*;
import org.json.*;

/**
 * Servidor que devuelve un JSON con valor de una funcion trigonometrica
 * @author Diego23p
 */
public class TrigCalculator {
    public static void main( String[] args ) {
        port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));   
    }
    
    /**
     * Pagina de input 
     * @param req Request de la pagina
     * @param res Response de la pagina
     * @return HTML con la pagina 
     */
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Parcial 1</h2>"
                + "<form action=\"/results\">"
                + "  Ingrese los valores 'cos','sin' o 'tan' seguidos de '-' y el numero a evaluar <br>"
                + "  Ej: cos-1 <br>"
                + "  <input type=\"text\" name=\"numbers\" >"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }
    
    
    
    /**
      * Función que devuelve el objeto JSON
      * 
      * @param req Request de la página
      * @param res Response de la página
      * @return 
      */
    private static JSONObject resultsPage(Request req, Response res) {
        List<Integer> lista=new ArrayList<>();
        String[] listaNormal= req.queryParams("numbers").split("-");
        
        double number = Double.parseDouble(listaNormal[1]);
        
        Operaciones op = new OperacionesImpl();
        double resultado = 0;
        
        if (listaNormal[0].equals("cos") ){
            resultado = op.cos(number);
        } else if (listaNormal[0].equals("sin") ){
            resultado = op.sin(number);
        } else if (listaNormal[0].equals("tan") ){
            resultado = op.tan(number);
        }
        
        res.header("Content-Type","application/json");        

        JSONObject myObject = new JSONObject();
        myObject.put("resultado", resultado);
        
        return myObject;
    }
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }        
           
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)    }
    }
}
