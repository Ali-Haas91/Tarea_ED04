import java.util.Scanner;
/**
 * Clase raiz que ejcuta la aplicacion.
 */
public class Main {
	/*
	 * Metodo principal que inicia la ejecucion de la aplicacion.
	 */
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
			/**Solicitud del peso*/
			System.out.print("¿Cuanto pesas? ");
			double peso = Entrada.nextDouble();
			/**Solicitud de la altura*/	
			System.out.print("¿Cuanto mides? ");
			double altura = Entrada.nextDouble();
			/**Creacion del objeto persona y calculo del IMC*/
			Persona persona = new Persona(peso, altura);
			/**Impresion en pantalla del mensaje personalizado*/
			System.out.print(persona.mensaje());

	}

}
