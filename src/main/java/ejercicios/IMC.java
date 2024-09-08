
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {
           double imc = peso / (estatura * estatura);
        if (imc < 18.5) {
            return "bajo";
        } else if (imc >= 18.5 && imc < 25) {
            if (edad < 45) {
                return "medio";
            } else {
                return "medio";
            }
        } else if (imc >= 25 && imc < 30) {
            if (edad < 45) {
                return "medio";
            } else {
                return "alto";
            }
        } else {
            return "alto";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
