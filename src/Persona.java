/**
 * Con esta clase vamos a calcular el indice de masa corporal de una persona
 * 
 * @author Ali-Haas91
 * @version 1.2
 * 
 */
public class Persona {
	private double peso;
	private double altura;
	/**
	 * Constructor de la clase Persona
	 * @param peso de la perosna en kilogramos
	 * @param altura de la persona en metros
	 * */
	public Persona(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	/**
	 * Metodo para calcular el IMC
	 * @return El indice de masa corporal de la persona*/
	public double calculoIMC() {
		return peso / (altura * altura);		
		
	}
	/**Metodo para generar mensajes personalizados*/
	public String mensaje() {
		double imc= calculoIMC();/**Declaracion y asignacion de variable imc para condicionales*/
		/**
		 * @return Imprime un mensaje segun el return del calculoIMC.
		 */
		if (imc < 18.5) {
			return "Tu IMC es de " + imc + ". Estas por debajo de tu peso normal. ¡Consulta con tu medico!";
		}
		else if (imc>= 18.5 && imc <= 24.9) {
			return "Tu IMC es de " + imc + ". Tienes un peso saludable. ¡Buen trabajo!";
		}
		else {
			return "Tu IMC es de " + imc + ". Tienes sobrepeso. ¡Cuida tu salud!";
		}
	}
}
