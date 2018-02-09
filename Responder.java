import java.util.ArrayList;
import java.util.Random;

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

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<>(); 
        aleatorio = new Random();

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
    public String generateResponse()
    {
        return respuestas.get(aleatorio.nextInt(respuestas.size()));
    }
}
