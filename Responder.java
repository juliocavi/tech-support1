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
    HashMap<HashSet<String>, String> respuestasForInput;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<>(); 
        aleatorio = new Random();
        respuestasForInput = new HashMap<>();
        
        HashSet<String> frase1 = new HashSet<>();
        HashSet<String> frase2 = new HashSet<>();
        HashSet<String> frase3 = new HashSet<>();
        HashSet<String> frase4 = new HashSet<>();
        HashSet<String> frase5 = new HashSet<>();
        HashSet<String> frase6 = new HashSet<>();

        respuestas.add("Give us a moment to solve the problem please.");
        respuestas.add("Thanks you for your time.");
        respuestas.add("Thanks you for your help.");
        respuestas.add("I hope see you later.");
        respuestas.add("What operating system do you have?");

        frase1.add("free");
        frase1.add("app");

        frase2.add("app");

        frase3.add("free");

        frase4.add("problem");
        frase4.add("linux");
        frase4.add("crash");

        frase5.add("linux");
        frase5.add("problem");

        frase6.add("crash");
        frase6.add("linux");

        respuestasForInput.put(frase1, "Our app will be free soon.");
        respuestasForInput.put(frase2, "You can find our app in the next url: www.techsuppot.app.com.");
        respuestasForInput.put(frase3, "Are you searching our app for free?");
        respuestasForInput.put(frase4, "Follow this link to solve your problem about linux crash.");
        respuestasForInput.put(frase5, "What is your problem with our app for linux?");
        respuestasForInput.put(frase6, "Contact with our support system, to find help if you need it please.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> input)
    {
        String respuesta = null;
        
        respuesta = respuestasForInput.get(input);

        if(respuesta == null){
            respuesta = respuestas.get(aleatorio.nextInt(respuestas.size()));
        }

        return respuesta;
    }
}
