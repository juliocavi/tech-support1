import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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

        respuestasForInput.put("payment", "Our payment service is down right now, please wait.");
        respuestasForInput.put("aq", "You can ask questions to us and we will response you later.");
        respuestasForInput.put("linux", "Our software allready can be runned on linux.");
        respuestasForInput.put("help", "Follow this page if you need our help, www.tech-support.help.com.");

        respuestas.add("Give us a moment to solve the problem please.");
        respuestas.add("Thanks you for your time.");
        respuestas.add("Thanks you for your help.");
        respuestas.add("I hope see you later.");
        respuestas.add("What operating system do you have?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> input)
    {
        String respuesta = null;
        String fraseInput = "";
        for(String palabra : input){
            fraseInput = palabra;
        }
        respuesta = respuestasForInput.get(fraseInput);
        
        if(respuesta == null){
            respuesta = respuestas.get(aleatorio.nextInt(respuestas.size()));
        }

        return respuesta;
    }
}
