
public class Persona {
	private double peso;/**Declaración de la variable para peso en kilos*/
	private double altura;/**Declaración de la variable para altura en metros*/
	/**Constructor*/
	public Persona(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	/**Metodo para calcular el IMC*/
	public double calculoIMC() {
		return peso / (altura * altura);		
		
	}
	/**Metodo para generar mensajes personalizados*/
	public String mensaje() {
		double imc= calculoIMC();/**Declaracion y asignacion de variable imc para condicionales*/
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
