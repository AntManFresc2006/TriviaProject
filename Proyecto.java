package Navidad;

import java.util.Scanner;

public class Proyecto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
	public static String bloqueMates (int num) {
		String mates[] = new String[9];
		String respuesta[] = new String[9];
		mates[0] = "Dime el factorial de 5.";
		mates[1] = "Resuelve la ecuacion: 3x+5 = 20.";
		mates[2] = "¿Se podria decir que una integral es una antiderivada?";
		mates[3] = "Resuelve la siguiente integral:  ∫3x²dx";
		mates[4] = "Ahora resuelve la ecuacion cuadratica: x²-5x+6=0";
		mates[5] = "Dime cuanto vale π";
		mates[6] = "Dime, de los 4 siguientes numeros, cual es primo y cual es compuesto: (4, 3, 11, 17)";
		mates[7] = "Dime cual es el eje de coordenadas y cual es el de ordenadas.";
		mates[8] = "¿Que es la recta tangente?";
		return mates[num];
		
	}
	public static String bloqueBiologia (int num) {
		String biology[] = new String[9];
		biology[0] = "Elige cual es la funcion del cloroplasto.";
		biology[1] = "Una bacteria es...";
		biology[2] = "¿Es posible detener la infeccion de un virus usando antibioticos? ¿Y la infeccion de una bacteria?";
		biology[3] = "El azucar es...";
		biology[4] = "El proceso de masticación es un tipo de digestion....";
		biology[5] = "¿Por que los niños que no se exponen al medio ambiente o no juegan con otros niños son mas propensos a enfermarse y tener un sistema inmune mas debil?";
		biology[6] = "Una vaca es...";
		biology[7] = "Y su alimentacion es...";
		biology[8] = "¿Por que un mono casi siempre vive menos que el humano promedio?";
		return biology[num];
	}
	public static String bloqueFisica (int num) {
		String physics[] = new String[9];
		physics[0] = "¿Que mide un termometro?";
		physics[1] = "¿Cual es la unidad de fuerza en el sistema internacional?";
		physics[2] = "¿Que es el movimiento rectilineo uniforme?";
		physics[3] = "¿Y el movimiemnto rectilineo uniformemente acelerado?";
		physics[4] = "La tierra es...";
		physics[5] = "¿Que es un agujero negro?";
		physics[6] = "¿Y una supernova?";
		physics[7] = "¿Que es la entropía?";
		physics[8] = "¿Que dice la ley de la conservacion de la masa?";
		return physics[num];
	}
		
		public static String classical (int num) {
			String classicalEra[] = new String[9];
			classicalEra[0] = "¿Por que cayó el imperio romano de occidente?";
			classicalEra[1] = "¿Quien fue el autor del libro 'la republica'?";
			classicalEra[2] = "¿Que civilizacion construyo el coliseo?";
			classicalEra[3] = "¿Por que Sócrates fue condenado a muerte?";
			classicalEra[4] = "¿Que imperio gano las 3 guerras punicas?";
			classicalEra[5] = "¿Que zona de europa fue conquistada mas facilmente por los romanos, la Galia o Hispania?";
			classicalEra[6] = "Dime uno de 4 emperadores romanos que nacieron en lo que hoy en dia es España.";
			classicalEra[7] = "¿Como llamaron los romanos a la provincia que hoy en dia seria gran parte del territorio andaluz?";
			classicalEra[8] = "¿Que pueblo barbaro conquisto Hispania despues de la caida de Roma?";
			return classicalEra[num];
		}
		public static String twenty_Century (int num) {
			String twenties[] = new String[9];
			twenties[0] = "¿Cuando comenzo la segunda guerra mundial?";
			twenties[1] = "¿Y la primera guerra mundial?";
			twenties[2] = "¿Que dos superpotencias se enfrentaron en la guerra fria?";
			twenties[3] = "¿Que sistema politico saba la union sovietica?";
			twenties[4] = "¿Cual era la diferencia entre ser un pais del primer mundo, del segundo mundo y del tercer mundo?";
			twenties[5] = "¿Quien gano la guerra de Corea?";
			twenties[6] = "¿Y la de Vietnam?";
			twenties[7] = "¿Que acontecimiento fue el causante del fin de la segunda guerra mundial?";
			twenties[8] = "¿Por que el imperio ruso se retiro de la primera guerra mundial?";
			return twenties[num];
		}
		public static String medieval (int num) {
			String medieval[] = new String[9];
			medieval[0] = "¿En que año desembarcaron los musulmanes en la peninsula ibérica?";
			medieval[1] = "¿En que año fueron los musulmanes expulsados completamente de la peninsula iberica?";
			medieval[2] = "¿Por que la batalla de las navas de tolosa fue la mas importante de la reconquista?";
			medieval[3] = "¿Y en que año sucedio?";
			medieval[4] = "¿Quien fue el rey de los francos?";
			medieval[5] = "¿Cuanto duro la guerra de los 100 años?";
			medieval[6] = "¿Que fue la peste negra?";
			medieval[7] = "¿Cual fue la institucion religiosa con mayor poder de toda la edad media?";
			medieval[8] = "¿Que sistema politico predomino en toda europa?";
			return medieval[num];
	}
	}

