package trivial;

import java.util.Scanner;

public class Trivial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		
		
		sc.close();

		
		
	}
	
	
	
	public static int dadoTematica () {
		int max = 4;
        int min = 1;
        int range = (max - min) + 1;
        int random = (int) ((range * Math.random()) + min);
        return random;
	}
	
	public static int dadoCategoria () {
		int max = 3;
        int min = 1;
        int range = (max - min) + 1;
        int random = (int) ((range * Math.random()) + min);
        return random;
	}
	
	
	public static String bloqueFutbol (int num) {
		String futbol [] = new String [9];
		futbol[0]="¿Quién ganó la Copa Mundial de la FIFA 2018?";
		futbol[1]="¿Qué nación ha ganado más copas del mundo?";
		futbol[2]="¿Con qué frecuencia se celebra la Copa del Mundo?";
		futbol[3]="¿Qué equipo de fútbol francés se conoce como PSG?";
		futbol[4]="¿The Gunners es el apodo de qué equipo?";
		futbol[5]="¿Qué jugador marcó el gol de la “Mano de Dios” en un partido del Mundial de 1986?";
		futbol[6]="¿Quién ganó el campeonato europeo de fútbol de la UEFA en 2021, venciendo a Inglaterra en la final tras la tanda de penaltis?";
		futbol[7]="¿Con qué equipo de fútbol debutó Lionel Messi en un club profesional?";
		futbol[8]="Verdadero o falso: ¿La asociación escocesa de fútbol está considerada la segunda asociación de fútbol más antigua del mundo?";
		return futbol[num];
	}
	
	public static String bloqueBaloncesto (int num) {
		String baloncesto [] = new String [9];
		baloncesto[0]="¿Cuántas sustituciones se permiten en un partido de baloncesto?";
		baloncesto[1]="¿Cuál es el diámetro de una pelota de baloncesto?";
		baloncesto[2]="¿La cantidad de jugadores en una cancha de 1 equipo?";
		baloncesto[3]="¿Cuál es la liga de baloncesto más famosa?";
		baloncesto[4]="¿El número total de equipos en la NBA?";
		baloncesto[5]="¿En qué fecha se fundó la NBA?";
		baloncesto[6]="¿Cuándo hizo su debut en la NBA Michael Jordan?";
		baloncesto[7]="¿Cuántos minutos dura un cuarto de la NBA?";
		baloncesto[8]="¿Qué equipo tiene récord de ganar más títulos consecutivos de la NBA?";
		return baloncesto[num];
	}
	
	public static String bloqueOlimpiadas (int num) {
		String olimpiadas [] = new String [9];
		olimpiadas[0]="¿Qué país ha sido el más exitoso en la historia de los JJ.OO.?";
		olimpiadas[1]="¿Qué país ha sido el menos exitoso en la historia de los JJ.OO.?";
		olimpiadas[2]="¿Qué representan los anillos olímpicos?";
		olimpiadas[3]="¿Qué país ha sido más veces el anfitrión de los JJ.OO.?";
		olimpiadas[4]="¿Cuando se televisaron por primera vez los Juegos Olímpicos?";
		olimpiadas[5]="¿Qué año fue el primero con participación femenina de todos los países?";
		olimpiadas[6]="¿En qué antigua ciudad griega se celebraron los Juegos Olímpicos originales?";
		olimpiadas[7]="¿Qué deportista ha ganado más medallas olímpicas de todos los tiempos?";
		olimpiadas[8]="¿Cuál es el lema de los Juegos Olímpicos?";
		return olimpiadas[num];
	}
	
	public static String bloqueCine (int num) {
		String cine [] = new String [9];
		cine[0]="¿Cuál fue la primera película en ganar el Oscar a Mejor Película?";
		cine[1]="¿Quién dirigió la trilogía de El Señor de los Anillos?";
		cine[2]="¿En qué película de 1994, Tom Hanks interpreta a un personaje que pasa su vida esperando un autobús?";
		cine[3]="¿Cuál fue la primera película de Pixar?";
		cine[4]="¿Cuál es el nombre del androide interpretado por Arnold Schwarzenegger en Terminator?";
		cine[5]="¿En qué año se estrenó la primera película de Harry Potter?";
		cine[6]="¿Qué película de Alfred Hitchcock se desarrolla en gran parte en la famosa escalera de caracol?";
		cine[7]="¿Cuál es el nombre del jefe de la oficina en la versión estadounidense de The Office?";
		cine[8]="¿Qué película de Quentin Tarantino se estrenó en 1994 y ganó la Palma de Oro en Cannes?";
		return cine[num];
	}
	
	public static String bloqueLiteratura (int num) {
		String literatura [] = new String [9];
		literatura[0]="¿Qué filósofo alemán escribió sobre la teoría del superhombre?";
		literatura[1]="¿Con qué seudónimo firmó su obra el escritor chileno Neftalí Ricardo Reyes";
		literatura[2]="¿A quiénes odiaban los Capulettos en la obra de Shakespeare?";
		literatura[3]="¿Cuál es la alcahueta más famosa de la literatura española?";
		literatura[4]="¿A qué escritor se atribuye el poema épico \"La Odisea\"?";
		literatura[5]="¿Qué libro aparece en la Biblia entre el Génesis y el Levítico?";
		literatura[6]="¿Cómo se llamaba el mayor conquistador de damas en la obra de Zorrilla?";
		literatura[7]="¿Quién es el protagonista de las obras literarias inspiradas en Vlad el Empalador?";
		literatura[8]="¿En qué ciudad vivían Romeo y Julieta?";
		return literatura[num];
	}
	
	public static String bloqueGeneral (int num) {
		String general [] = new String [9];
		general[0]="¿Quién fue el primer presidente de la democracia española tras el franquismo?";
		general[1]="¿En qué año el hombre pisó la Luna por primera vez?";
		general[2]="¿Quién fue el primer presidente de Estados Unidos?";
		general[3]="¿En qué año se creó la Organización de las Naciones Unidas?";
		general[4]="¿Cuál es el río más caudaloso del mundo?";
		general[5]="¿Cuál es la lengua más hablada del mundo?";
		general[6]="¿Cuál es la capital de Letonia?";
		general[7]="¿Qué famoso dúo musical participó en la banda sonora de la película \"Tron: Legacy\"?";
		general[8]="¿Qué cordillera separa Europa de Asia?";
		return general[num];
	}
}
