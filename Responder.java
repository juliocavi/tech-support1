import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    ArrayList<String> respuestas;
    Random aleatorio;
    HashMap<String, String> respuestasForInput;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<>(); 
        aleatorio = new Random();
        respuestasForInput = new HashMap<>();
        
        respuestasForInput.put("payment", "Our payment service is down right now, please wait");
        respuestasForInput.put("aq", "You can ask questions to us and we response you later.");
        respuestasForInput.put("linux", "Our software allready can be runned on linux.");
        respuestasForInput.put("help", "Follow this page if you need our help.");
        
        respuestas.add("Give me a second to solve the problem please.");
        respuestas.add("Thanks you for your time.");
        respuestas.add("Thanks you for your help.");
        respuestas.add("I hope see you later.");
        respuestas.add("What operating system do you have?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {
        String respuesta = null;
        respuesta = respuestasForInput.get(input);
        
        if(respuesta == null){
            respuesta = respuestas.get(aleatorio.nextInt(respuestas.size()));
        }
        
        return respuesta;
    }
}
