package trivial;

import java.util.Scanner;

public class Trivial {
	public static void main(String[] args) {
		int opcionRespuesta;
		Scanner sc = new Scanner (System.in);
		int contadorBloques = 0;
		do {
			switch (dadoTematica()) {
				case 1:
					System.out.println("\nDEPORTES");
					switch (dadoCategoria()) {
						case 1: 
							System.out.println("\nFÚTBOL\n");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixFutbol = bloqueFutbol(i,j);
									System.out.println(matrixFutbol[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
						case 2:
							System.out.println("\nBALONCESTO\n");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixBaloncesto = bloqueBaloncesto(i,j);
									System.out.println(matrixBaloncesto[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
							
						case 3:
							System.out.println("\nOLIMPIADAS\n");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixOlimpiadas = bloqueOlimpiadas(i,j);
									System.out.println(matrixOlimpiadas[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
					}
					break;
					
				case 2:
					System.out.println("\nHISTORIA");
					switch (dadoCategoria()) {
						case 1: 
							System.out.println("\nCLÁSICA: ");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixClassical = bloqueClasico(i,j);
									System.out.println(matrixClassical[i][j]);	
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
							
						case 2:
							System.out.println("\nSIGLO XX: ");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixTwenties = bloqueXX(i,j);
									System.out.println(matrixTwenties[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
							
						case 3:
							System.out.println("\nMEDIEVAL: ");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixTwenties = bloqueMedieval(i,j);
									System.out.println(matrixTwenties[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
					}
					break;
				
				case 3:
					System.out.println("\nCULTURA");
					switch (dadoCategoria()) {
						case 1: 
							System.out.println("\nCINE\n");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixCine = bloqueCine(i,j);
									System.out.println(matrixCine[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
							
						case 2:
							System.out.println("\nLITERATURA\n");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixLiteratura = bloqueLiteratura(i,j);
									System.out.println(matrixLiteratura[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
							
						case 3:
							System.out.println("\nGENERAL\n");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixGeneral = bloqueGeneral(i,j);
									System.out.println(matrixGeneral[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
					}
					break;
					
				case 4:
					System.out.println("\nCIENCIA");
					switch (dadoCategoria()) {
						case 1: 
							System.out.println("\nMATEMÁTICAS\n");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixMates = bloqueMates(i,j);
									System.out.println(matrixMates[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
							
						case 2:
							System.out.println("\nBIOLOGÍA\n");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixBio = bloqueBiologia(i,j);
									System.out.println(matrixBio[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
							
						case 3:
							System.out.println("\nFÍSICA\n");
							for (int i = 0; i<9; i++) {
								for (int j = 0; j<5; j++) {
									String [][] matrixFisica = bloqueFisica(i,j);
									System.out.println(matrixFisica[i][j]);
									
								}
								opcionRespuesta = sc.nextInt();	
							}
							break;
					}
					break;
			}
				
		contadorBloques++;	
		} while (contadorBloques < 4);
		
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
	
	
	public static String [][] bloqueFutbol (int numPregunta, int numRespuesta) {
		String futbol [][] = new String [9][5];
		futbol[0][0]="¿Quién ganó la Copa Mundial de la FIFA 2018?";
		futbol[0][1]="1. Brasil";
		futbol[0][2]="2. Alemania";
		futbol[0][3]="3. Croacia";
		futbol[0][4]="4. Francia"; 
		futbol[1][0]="¿Qué nación ha ganado más copas del mundo?";
		futbol[1][1]="1. Brasil";
		futbol[1][2]="2. Inglaterra";
		futbol[1][3]="3. Italia";
		futbol[1][4]="4. Alemania";
		futbol[2][0]="¿Con qué frecuencia se celebra la Copa del Mundo?";
		futbol[2][1]="1. Cada año";
		futbol[2][2]="2. Cada dos años";
		futbol[2][3]="3. Cada cuatro años";
		futbol[2][4]="4. Cada seis meses";
		futbol[3][0]="¿Qué equipo de fútbol francés se conoce como PSG?";
		futbol[3][1]="1. Pedro San Gil";
		futbol[3][2]="2. Paris Saint Giroud";
		futbol[3][3]="3. Paris Saint Germain";
		futbol[3][4]="4. Peter Said Gang";
		futbol[4][0]="¿The Gunners es el apodo de qué equipo?";
		futbol[4][1]="1. Tottenham";
		futbol[4][2]="2. Chelsea";
		futbol[4][3]="3. Liverpool";
		futbol[4][4]="4. Arsenal";
		futbol[5][0]="¿Qué jugador marcó el gol de la “Mano de Dios” en un partido del Mundial de 1986?";
		futbol[5][1]="1. Messi";
		futbol[5][2]="2. Maradona";
		futbol[5][3]="3. Pelé";
		futbol[5][4]="4. Ronaldinho";
		futbol[6][0]="¿Quién ganó el campeonato europeo de fútbol de la UEFA en 2021, venciendo a Inglaterra en la final tras la tanda de penaltis?";
		futbol[6][1]="1. Italia";
		futbol[6][2]="2. Brasil";
		futbol[6][3]="3. España";
		futbol[6][4]="4. Moldavia";
		futbol[7][0]="¿Con qué equipo de fútbol debutó Lionel Messi en un club profesional?";
		futbol[7][1]="1. Real Betis";
		futbol[7][2]="2. F.C. Barcelona";
		futbol[7][3]="3. Tomares F.C.";
		futbol[7][4]="4. Boca Juniors";
		futbol[8][0]="Verdadero o falso: ¿La asociación escocesa de fútbol está considerada la segunda asociación de fútbol más antigua del mundo?";
		futbol[8][1]="1. Verdadero";
		futbol[8][2]="2. Falso";
		futbol[8][3]="";
		futbol[8][4]="";
		
		return futbol;
	}
	
	public static String [][] bloqueBaloncesto (int numPregunta, int numRespuesta) {
		String baloncesto [] [] = new String [9][5];
		baloncesto[0][0]="¿Cuántas sustituciones se permiten en un partido de baloncesto?";
		baloncesto[0][1]="1. Muchas";
		baloncesto[0][2]="2. Infinitas";
		baloncesto[0][3]="3. 5";
		baloncesto[0][4]="4. 10";
		baloncesto[1][0]="¿Cuál es el diámetro de una pelota de baloncesto?";
		baloncesto[1][1]="1. 13 cm";
		baloncesto[1][2]="2. 15 cm";
		baloncesto[1][3]="3. 22 cm";
		baloncesto[1][4]="4. 30 cm";
		baloncesto[2][0]="¿La cantidad de jugadores en una cancha de 1 equipo?";
		baloncesto[2][1]="1. 5";
		baloncesto[2][2]="2. 6";
		baloncesto[2][3]="3. 11";
		baloncesto[2][4]="4. 10";
		baloncesto[3][0]="¿Cuál es la liga de baloncesto más famosa?";
		baloncesto[3][1]="1. ACB";
		baloncesto[3][2]="2. Champions";
		baloncesto[3][3]="3. NBA";
		baloncesto[3][4]="4. BBVA";
		baloncesto[4][0]="¿El número total de equipos en la NBA?";
		baloncesto[4][1]="1. 20";
		baloncesto[4][2]="2. 15";
		baloncesto[4][3]="3. 25";
		baloncesto[4][4]="4. 30";
		baloncesto[5][0]="¿En qué fecha se fundó la NBA?";
		baloncesto[5][1]="1. 1896";
		baloncesto[5][2]="2. 1946";
		baloncesto[5][3]="3. 1936";
		baloncesto[5][4]="4. 1956";
		baloncesto[6][0]="¿Cuándo hizo su debut en la NBA Michael Jordan?";
		baloncesto[6][1]="1. 1984";
		baloncesto[6][2]="2. 1994";
		baloncesto[6][3]="3. 2004";
		baloncesto[6][4]="4. 1974";
		baloncesto[7][0]="¿Cuántos minutos dura un cuarto de la NBA?";
		baloncesto[7][1]="1. 10";
		baloncesto[7][2]="2. 15";
		baloncesto[7][3]="3. 12";
		baloncesto[7][4]="4. 30";
		baloncesto[8][0]="¿Qué equipo tiene récord de ganar más títulos consecutivos de la NBA?";
		baloncesto[8][1]="1. Chicago Bulls";
		baloncesto[8][2]="2. Boston Celtics";
		baloncesto[8][3]="3. Real Betis";
		baloncesto[8][4]="4. NY Knicks";
		return baloncesto;
	}
	
	public static String [][] bloqueOlimpiadas (int numPregunta, int numRespuesta) {
		String olimpiadas [][] = new String [9][5];
		olimpiadas[0][0]="¿Qué país ha sido el más exitoso en la historia de los JJ.OO.?";
		olimpiadas[0][1]="1. URSS";
		olimpiadas[0][2]="2. China";
		olimpiadas[0][3]="3. España";
		olimpiadas[0][4]="4. Estados Unidos";
		olimpiadas[1][0]="¿Qué país ha sido el menos exitoso en la historia de los JJ.OO.?";
		olimpiadas[1][1]="1. Luxemburgo";
		olimpiadas[1][2]="2. Yibuti";
		olimpiadas[1][3]="3. España";
		olimpiadas[1][4]="4. Francia";
		olimpiadas[2][0]="¿Qué representan los anillos olímpicos?";
		olimpiadas[2][1]="1. Los 5 sentidos";
		olimpiadas[2][2]="2. Las 5 categorías";
		olimpiadas[2][3]="3. Los 5 continentes";
		olimpiadas[2][4]="4. Los 5 fantásticos";
		olimpiadas[3][0]="¿Qué país ha sido más veces el anfitrión de los JJ.OO.?";
		olimpiadas[3][1]="1. Francia";
		olimpiadas[3][2]="2. Grecia";
		olimpiadas[3][3]="3. Moldavia";
		olimpiadas[3][4]="4. Estados Unidos";
		olimpiadas[4][0]="¿Cuando se televisaron por primera vez los Juegos Olímpicos?";
		olimpiadas[4][1]="1. 1974";
		olimpiadas[4][2]="2. 1960";
		olimpiadas[4][3]="3. 1992";
		olimpiadas[4][4]="4. 2008";
		olimpiadas[5][0]="¿Qué año fue el primero con participación femenina de todos los países?";
		olimpiadas[5][1]="1. Francia";
		olimpiadas[5][2]="2. Grecia";
		olimpiadas[5][3]="3. Moldavia";
		olimpiadas[5][4]="4. Estados Unidos";
		olimpiadas[6][0]="¿En qué antigua ciudad griega se celebraron los Juegos Olímpicos originales?";
		olimpiadas[6][1]="1. Atenas";
		olimpiadas[6][2]="2. Cádiz";
		olimpiadas[6][3]="3. Olimpia";
		olimpiadas[6][4]="4. Esparta";
		olimpiadas[7][0]="¿Qué deportista ha ganado más medallas olímpicas de todos los tiempos?";
		olimpiadas[7][1]="1. Lamine Yamal";
		olimpiadas[7][2]="2. Messi";
		olimpiadas[7][3]="3. Usain Bolt";
		olimpiadas[7][4]="4. Michael Phelps";
		olimpiadas[8][0]="¿Cuál es el lema de los Juegos Olímpicos?";
		olimpiadas[8][1]="1. Manque Pierda";
		olimpiadas[8][2]="2. Citius, Altius, Fortius";
		olimpiadas[8][3]="3. Veni, vidi, vici";
		olimpiadas[8][4]="4. Just do it";
		return olimpiadas;
	}
	
	public static String [][] bloqueClasico (int numPregunta, int numRespuesta) {
		String classicalEra[][] = new String[9][5];
		classicalEra[0][0] = "¿Por qué cayó el imperio romano de occidente?";
		classicalEra[0][1] = "1. Se dejaron encendida la cocina";
		classicalEra[0][2] = "2. Invasión musulmana";
		classicalEra[0][3] = "3. Invasión bárbara";
		classicalEra[0][4] = "4. Guerra civil";
		classicalEra[1][0] = "¿Quién es el autor del libro 'La República'?";
		classicalEra[1][1] = "1. Homero";
		classicalEra[1][2] = "2. Cervantes";
		classicalEra[1][3] = "3. Platón";
		classicalEra[1][4] = "4. Julio César";
		classicalEra[2][0] = "¿Qué civilización realizó la construcción del Coliseo?";
		classicalEra[2][1] = "1. Roma";
		classicalEra[2][2] = "2. Grecia";
		classicalEra[2][3] = "3. Egipto";
		classicalEra[2][4] = "4. Mesopotamia";
		classicalEra[3][0] = "¿Por qué Sócrates fue condenado a muerte?";
		classicalEra[3][1] = "1. Por ateo";
		classicalEra[3][2] = "2. Por homicidio";
		classicalEra[3][3] = "3. Por corromper a la juventud";
		classicalEra[3][4] = "4. Opción 1 y 3 son correctas";
		classicalEra[4][0] = "¿Qué civilización ganó las 3 Guerras Púnicas?";
		classicalEra[4][1] = "1. Roma";
		classicalEra[4][2] = "2. Grecia";
		classicalEra[4][3] = "3. Cartagineses";
		classicalEra[4][4] = "4. Hispania";
		classicalEra[5][0] = "¿Qué forma de gobierno tenían en la Ciudad Estado de Atenas?";
		classicalEra[5][1] = "1. Democracia";
		classicalEra[5][2] = "2. Oligarquía";
		classicalEra[5][3] = "3. Aristocracia";
		classicalEra[5][4] = "4. Monarquía";
		classicalEra[6][0] = "¿Cuál es el nombre del emperador romano que nació en Itálica?";
		classicalEra[6][1] = "1. Trajano";
		classicalEra[6][2] = "2. Adriano";
		classicalEra[6][3] = "3. Marrano";
		classicalEra[6][4] = "4. Opción 1 y 2 son correctas";
		classicalEra[7][0] = "¿Cómo llamaron los romanos a la provincia que hoy en día foma parte del territorio andaluz?";
		classicalEra[7][1] = "1. Murciae";
		classicalEra[7][2] = "2. Gadis";
		classicalEra[7][3] = "3. Hispalis";
		classicalEra[7][4] = "4. Baetica";
		classicalEra[8][0] = "¿Qué pueblo bárbaro conquistó Hispania después de la caída de Roma?";
		classicalEra[8][1] = "1. Musulmanes";
		classicalEra[8][2] = "2. Germanos";
		classicalEra[8][3] = "3. Carolingios";
		classicalEra[8][4] = "4. Visigodos";
		return classicalEra;
	}
	
	public static String [][] bloqueXX (int numPregunta, int numRespuesta) {
		String twenties[][] = new String[9][5];
		twenties[0][0] = "¿Cuándo comenzó la Segunda Guerra Mundial?";
		twenties[0][1] = "1. 1936";
		twenties[0][2] = "2. 1918";
		twenties[0][3] = "3. 1975";
		twenties[0][4] = "4. 1939";
		twenties[1][0] = "¿¿Cuándo comenzó la Primera Guerra Mundial?";
		twenties[1][1] = "1. 1916";
		twenties[1][2] = "2. 1918";
		twenties[1][3] = "3. 1924";
		twenties[1][4] = "4. 1914";
		twenties[2][0] = "¿Qué dos superpotencias se enfrentaron en la Guerra Fría?";
		twenties[2][1] = "1. Estados Unidos vs Inglaterra";
		twenties[2][2] = "2. Inglaterra vs Francia";
		twenties[2][3] = "3. Estados Unidos vs la URSS";
		twenties[2][4] = "4. Alemania vs la URSS";
		twenties[3][0] = "¿Qué sistema político y social caracterizó al bloque Soviético?";
		twenties[3][1] = "1. Capitalismo";
		twenties[3][2] = "2. Fascismo";
		twenties[3][3] = "3. Anarquismo";
		twenties[3][4] = "4. Comunismo";
		twenties[4][0] = "¿Qué significaba durante la Guerra Fría el término 3er mundista?";
		twenties[4][1] = "1. Que un país fuera pobre";
		twenties[4][2] = "2. Que un país fuera africano";
		twenties[4][3] = "3. Que un país no estuviera alineado con ningún bloque";
		twenties[4][4] = "4. Que un país tuviera como gobierno una dictadura";
		twenties[5][0] = "¿Quién ganó la Guerra de Corea?";
		twenties[5][1] = "1. Estados Unidos";
		twenties[5][2] = "2. La URSS";
		twenties[5][3] = "3. Corea del Norte";
		twenties[5][4] = "4. Se firmó un acuerdo con un empate técnico";
		twenties[6][0] = "¿Quién ganó la Guerra de Vietnam?";
		twenties[6][1] = "1. El bando capitalista";
		twenties[6][2] = "2. El bando comunista";
		twenties[6][3] = "3. Adolf Hitler";
		twenties[6][4] = "4. Napoleón";
		twenties[7][0] = "¿Cuál fue la causa del fin de la Segunda Guerra Mundial?";
		twenties[7][1] = "1. La caída del muro de Berlín";
		twenties[7][2] = "2. La Guerra de Vietnam";
		twenties[7][3] = "3. Los bombardeos de Hiroshima y Nagasaki";
		twenties[7][4] = "4. La muerte de Franco";
		twenties[8][0] = "¿Por qué el Imperio Ruso se retiró de la Primera Guerra Mundial?";
		twenties[8][1] = "1. Por el inicio de la Segunda Guerra Mundial";
		twenties[8][2] = "2. Por el inicio de la Revolución Bolchevique en Rusia";
		twenties[8][3] = "3. Porque no tenían ejército";
		twenties[8][4] = "4. Porque cayó el bloque soviético";
		return twenties;
	}
	
	public static String [][]bloqueMedieval (int numPregunta, int numRespuesta) {
		String medieval[][] = new String[9][5];
		medieval[0][0] = "¿En qué año desembarcaron los musulmanes en la Península Ibérica?";
		medieval[0][1] = "1. 722";
		medieval[0][2] = "2. 711";
		medieval[0][3] = "3. 911";
		medieval[0][4] = "4. 1155";
		medieval[1][0] = "¿En qué año fueron los musulmanes y los judíos expulsados completamente de la Península Ibérica?";
		medieval[1][1] = "1. 1492";
		medieval[1][2] = "2. 1292";
		medieval[1][3] = "3. 1512";
		medieval[1][4] = "4. 1617";
		medieval[2][0] = "¿Por qué la batalla de las Navas de Tolosa fue la más importante de la reconquista?";
		medieval[2][1] = "1. Se inició la decadencia de la ocupación musulmana";
		medieval[2][2] = "2. Se descubrió América el mismo año";
		medieval[2][3] = "3. Se unificaron los reinos de Castilla y Aragón";
		medieval[2][4] = "4. El Betis ganó la Copa del Rey";
		medieval[3][0] = "¿En qué año tuvo lugar la batalla de las Navas de Tolosa?";
		medieval[3][1] = "1. 1248";
		medieval[3][2] = "2. 1492";
		medieval[3][3] = "3. 1212";
		medieval[3][4] = "4. 1356";
		medieval[4][0] = "¿Quién fue el rey de los Francos?";
		medieval[4][1] = "1. Carlogrande";
		medieval[4][2] = "2. Carlos II";
		medieval[4][3] = "3. Carlos V";
		medieval[4][4] = "4. Carlomagno";
		medieval[5][0] = "¿Cuánto duró la Guerra de los 100 años?";
		medieval[5][1] = "1. 100 años";
		medieval[5][2] = "2. 200 años";
		medieval[5][3] = "3. 116 años";
		medieval[5][4] = "4. 112 años";
		medieval[6][0] = "¿Qué fue la Peste Negra?";
		medieval[6][1] = "1. Una epidemia de peste";
		medieval[6][2] = "2. Una pandemia de peste";
		medieval[6][3] = "3. Un olor muy fuerte";
		medieval[6][4] = "4. Un rey visigodo";
		medieval[7][0] = "¿Cuál fue la institución religiosa con mayor poder de toda la Edad Media?";
		medieval[7][1] = "1. La Iglesia Católica";
		medieval[7][2] = "2. La Iglesia Evangélica";
		medieval[7][3] = "3. El Islam";
		medieval[7][4] = "4. Google";
		medieval[8][0] = "¿Qué sistema politico predominó en toda Europa?";
		medieval[8][1] = "1. Democracia";
		medieval[8][2] = "2. Socialismo";
		medieval[8][3] = "3. Fascismo";
		medieval[8][4] = "4. Feudalismo";
		return medieval;
}
	public static String [][] bloqueCine (int numPregunta, int numRespuesta) {
		String cine [][] = new String [9][5];
		cine[0][0] = "¿Cuál fue la primera película en ganar el Óscar a Mejor Película?";
		cine[0][1] = "1. Titanic";
		cine[0][1] = "2. Torrente 3";
		cine[0][1] = "3. Alas";
		cine[0][1] = "4. Star Wars";		
		cine[1][0] = "¿Quién dirigió la trilogía de El Señor de los Anillos?";
		cine[1][1] = "1. Tarantino";
		cine[1][2] = "2. Almodóvar";
		cine[1][3] = "3. Peter Jackson";
		cine[1][4] = "4. J.R.R. Tolkien";
		cine[2][0] = "¿En qué película de 1994, Tom Hanks interpreta a un personaje que pasa su vida esperando un autobús?";
		cine[2][1] = "1. Indiana Jones";
		cine[2][2] = "2. Forrest Gump";
		cine[2][3] = "3. Naúfrago";
		cine[2][4] = "4. Grease";
		cine[3][0] = "¿Cuál fue la primera película de Pixar?";
		cine[3][1] = "1. Toy Story";
		cine[3][2] = "2. Cars";
		cine[3][3] = "3. Cenicienta";
		cine[3][4] = "4. Inside Out";
		cine[4][0] = "¿Cuál es el nombre del androide interpretado por Arnold Schwarzenegger en Terminator?";
		cine[4][1] = "1. Terrenator";
		cine[4][2] = "2. R2-D2";
		cine[4][3] = "3. Terminator";
		cine[4][4] = "4. Robocop";
		cine[5][0] = "¿En qué año se estrenó la primera película de Harry Potter?";
		cine[5][1] = "1. 2001";
		cine[5][2] = "2. 2005";
		cine[5][3] = "3. 2007";
		cine[5][4] = "4. 1996";
		cine[6][0] = "¿Qué película de Alfred Hitchcock se desarrolla en gran parte en la famosa escalera de caracol?";
		cine[6][1] = "1. El Resplandor";
		cine[6][2] = "2. Alarma en el Expreso";
		cine[6][3] = "3. La Ventana Indiscreta";
		cine[6][4] = "4. Psicosis";
		cine[7][0] = "¿Cuál es el nombre del jefe de la oficina en la versión estadounidense de The Office?";
		cine[7][1] = "1. Michael Jr. ";
		cine[7][2] = "2. Michael Jordan";
		cine[7][3] = "3. Michael Scott";
		cine[7][4] = "4. Michael Scofield";
		cine[8][0] = "¿Qué película de Quentin Tarantino se estrenó en 1994 y ganó la Palma de Oro en Cannes?";
		cine[8][1] = "1. Kill Bill";
		cine[8][2] = "2. Pulp Fiction";
		cine[8][3] = "3. El Resplandor";
		cine[8][4] = "4. Abierto hasta el Amanecer";
		return cine;
	}
	
	public static String [][] bloqueLiteratura (int numPregunta, int numRespuesta) {
		String literatura [][] = new String [9][5];
		literatura[0][0] = "¿Qué filósofo alemán escribió sobre la teoría del superhombre?";
		literatura[0][1] = "1. Kant";
		literatura[0][2] = "2. Nietsche";
		literatura[0][3] = "3. Freud";
		literatura[0][4] = "4. Aristóteles";
		literatura[1][0] = "¿Con qué seudónimo firmó su obra el escritor chileno Neftalí Ricardo Reyes";
		literatura[1][1] = "1. Pablo Neruda";
		literatura[1][2] = "2. Antonio León";
		literatura[1][3] = "3. Manuel Jiménez";
		literatura[1][4] = "4. Chivo González";
		literatura[2][0] = "¿A quiénes odiaban los Capulettos en la obra de Shakespeare?";
		literatura[2][1] = "1. Los Dantescos";
		literatura[2][2] = "2. Los Patrescos";
		literatura[2][3] = "3. Los Montescos";
		literatura[2][4] = "4. Los Sepescos.";
		literatura[3][0] = "¿Cuál es la alcahueta más famosa de la literatura española?";
		literatura[3][1] = "1. Bernarda Alba";
		literatura[3][2] = "2. La Celestina";
		literatura[3][3] = "3. Dulcinea";
		literatura[3][4] = "4. Dulceida";
		literatura[4][0] = "¿A qué escritor se atribuye el poema épico \"La Odisea\"?";
		literatura[4][1] = "1. Shakespeare";
		literatura[4][2] = "2. Cervantes";
		literatura[4][3] = "3. Federico García Lorca";
		literatura[4][4] = "4. Homero";
		literatura[5][0] = "¿Qué libro aparece en la Biblia entre el Génesis y el Levítico?";
		literatura[5][1] = "1. El Apocalipsis";
		literatura[5][2] = "2. La Muerte";
		literatura[5][3] = "3. La Humildad";
		literatura[5][4] = "4. El Éxodo";
		literatura[6][0] = "¿Cómo se llamaba el mayor conquistador de damas en la obra de Zorrilla?";
		literatura[6][1] = "1. Don Quijote";
		literatura[6][2] = "2. Lazarillo";
		literatura[6][3] = "3. Don Juan Tenorio";
		literatura[6][4] = "4. Max Estrella";
		literatura[7][0] = "¿Quién es el protagonista de las obras literarias inspiradas en Vlad el Empalador?";
		literatura[7][1] = "1. Kidd Keo";
		literatura[7][2] = "2. Drácula";
		literatura[7][3] = "3. Harry Potter";
		literatura[7][4] = "4. El Conde de Montecristo";
		literatura[8][0] = "¿En qué ciudad vivían Romeo y Julieta?";
		literatura[8][1] = "1. Roma";
		literatura[8][2] = "2. Venecia";
		literatura[8][3] = "3. Segovia";
		literatura[8][4] = "4. Verona";
		return literatura;
	}
	
	public static String [][] bloqueGeneral (int numPregunta, int numRespuesta) {
		String general [] [] = new String [9][5];
		general[0][0] = "¿Quién fue el primer presidente de la democracia española tras el franquismo?";
		general[0][1] = "1. Pedro Sánchez";
		general[0][2] = "2. Lopera";
		general[0][3] = "3. Adolfo Suárez";
	    general[0][4] = "4. Carrero Blanco";
		general[1][0] = "¿En qué año el hombre pisó la Luna por primera vez?";
		general[1][1] = "1. 1947";
		general[1][2] = "2. 1969";
		general[1][3] = "3. 1979";
	    general[1][4] = "4. 1967";
		general[2][0] = "¿Quién fue el primer presidente de Estados Unidos?";
		general[2][1] = "1. Abraham Lincoln";
		general[2][2] = "2. Donald Trump";
		general[2][3] = "3. George Washington";
	    general[2][4] = "4. Benjamin Franklin";
		general[3][0] = "¿En qué año se creó la Organización de las Naciones Unidas?";
		general[3][1] = "1. 1945";
		general[3][2] = "2. 1947";
		general[3][3] = "3. 1955";
	    general[3][4] = "4. 1991";
		general[4][0] = "¿Cuál es el río más caudaloso del mundo?";
		general[4][1] = "1. Nilo";
		general[4][2] = "2. Amazonas";
		general[4][3] = "3. Guadalquivir";
	    general[4][4] = "4. Misisipi";
		general[5][0] = "¿Cuál es la lengua más hablada del mundo?";
		general[5][1] = "1. Inglés";
		general[5][2] = "2. Español";
		general[5][3] = "3. Chino";
	    general[5][4] = "4. Francés";
		general[6][0] = "¿Cuál es la capital de Letonia?";
		general[6][1] = "1. Riga";
		general[6][2] = "2. Kiev";
		general[6][3] = "3. Tallin";
	    general[6][4] = "4. Helsinki";
		general[7][0] = "¿Qué famoso dúo musical participó en la banda sonora de la película \"Tron: Legacy\"?";
		general[7][1] = "1. Ramón y Cajal";
		general[7][2] = "2. Ortega y Gasset";
		general[7][3] = "3. Andy y Lucas";
	    general[7][4] = "4. Daft Punk";
		general[8][0] = "¿Qué cordillera separa Europa de Asia?";
		general[8][1] = "1. Los Alpes";
		general[8][2] = "2. Montes Urales";
		general[8][3] = "3. Sierra Morena";
	    general[8][4] = "4. Los Andes";
		return general;
	}
	
	public static String[][] bloqueMates (int numPregunta, int numRespuesta) {
		String mates[][] = new String[9][5];
		mates[0][0] = "Dime el factorial de 5.";
		mates[0][1] = "1. 15";
		mates[0][2] = "2. 5";
		mates[0][3] = "3. 1";
		mates[0][4] = "4. 120";
		mates[1][0] = "Resuelve la ecuación: 3x+5 = 20.";
		mates[1][1] = "1. 15";
		mates[1][2] = "2. 20";
		mates[1][3] = "3. 3";
		mates[1][4] = "4. 1";
		mates[2][0] = "¿Qué es una integral?";
		mates[2][1] = "1. Una antiderivación";
		mates[2][2] = "2. Una derivada";
		mates[2][3] = "3. Un tipo de pan";
		mates[2][4] = "4. Un variable de un número entero";
		mates[3][0] = "¿Cuál es el único número primo par?";
		mates[3][1] = "1. 2";
		mates[3][2] = "2. 0";
		mates[3][3] = "3. 4";
		mates[3][4] = "4. 1";
		mates[4][0] = "¿Cuántos segundos hay en un día?";
		mates[4][1] = "1. 3600";
		mates[4][2] = "2. 7200";
		mates[4][3] = "3. 46200";
		mates[4][4] = "4. 86400";
		mates[5][0] = "Dime cuánto vale π";
		mates[5][1] = "1. 3.14";
		mates[5][2] = "2. 6";
		mates[5][3] = "3. 4.17";
		mates[5][4] = "4. 3.16";
		mates[6][0] = "Dime de los 4 siguientes numeros cuál es compuesto: (4, 3, 11, 17)";
		mates[6][1] = "1. 3";
		mates[6][2] = "2. 11";
		mates[6][3] = "3. 4";
		mates[6][4] = "4. 17";
		mates[7][0] = "¿Quiénes fueron las primeras personas en hacer uso de los números negativos?";
		mates[7][1] = "1. Rusos";
		mates[7][2] = "2. Árabes";
		mates[7][3] = "3. Romanos";
		mates[7][4] = "4. Chinos";
		mates[8][0] = "¿Quién creó el sistema binario?";
		mates[8][1] = "1. Pitágoras";
		mates[8][2] = "2. Gottfried Leibniz";
		mates[8][3] = "3. Hermann Grassmann";
		mates[8][4] = "4. Heinrich Weber";
		return mates;
		
	}
	public static String[][] bloqueBiologia (int numPregunta, int numRespuesta) {
		String biology[][] = new String[9][5];
		biology[0][0] = "Elige cuál es la funcion del cloroplasto.";
		biology[0][1] = "1. Realizar la fotosíntesis";
		biology[0][2] = "2. Transportar los nutrientes";
		biology[0][3] = "3. Producir semillas a través de la reproducción sexual";
		biology[0][4] = "4. Contener y proteger a las semillas durante su desarrollo";
		biology[1][0] = "Una bacteria es...";
		biology[1][1] = "1. Un organismo procariota unicelular";
		biology[1][2] = "2. Un organismo eucariota unicelular";
		biology[1][3] = "3. Un organismo procariota pluricelular";
		biology[1][4] = "4. Un organismo eucariota pluricelular";
		biology[2][0] = "¿Es posible detener la infección de un virus usando antibióticos?";
		biology[2][1] = "1. Sí";
		biology[2][2] = "2. No";
		biology[2][3] = "3. Depende del virus";
		biology[2][4] = "4. Depende de la farmaceútica que comercialice el antibiótico";
		biology[3][0] = "El azucar es...";
		biology[3][1] = "1. Glucosa";
		biology[3][2] = "2. Fructosa";
		biology[3][3] = "3. Ambas respuestas son correctas";
		biology[3][4] = "4. Ninguna respuesta es correcta";
		biology[4][0] = "El proceso de masticación es un tipo de digestión....";
		biology[4][1] = "1. Mecánica";
		biology[4][2] = "2. Química";
		biology[4][3] = "3. Física";
		biology[4][4] = "4. Ninguna respuesta es correcta";
		biology[5][0] = "¿Cuál es la especie de animal vertebrado más longeva del mundo?";
		biology[5][1] = "1. El ser humano";
		biology[5][2] = "2. El elefante";
		biology[5][3] = "3. La ballena gris";
		biology[5][4] = "4. El tiburón boreal";
		biology[6][0] = "Una vaca es...";
		biology[6][1] = "1. Un rumiante";
		biology[6][2] = "2. Un roedor";
		biology[6][3] = "3. Un marsupial";
		biology[6][4] = "4. Un anfibio";
		biology[7][0] = "Y su alimentación es...";
		biology[7][1] = "1. Autótrofa";
		biology[7][2] = "2. Omnívora";
		biology[7][3] = "3. Carnívora";
		biology[7][4] = "4. Herbívora";
		biology[8][0] = "¿Qué teoría desarrolló Charles Darwin?";
		biology[8][1] = "1. Lamarckismo";
		biology[8][2] = "2. Evolución";
		biology[8][3] = "3. Creacionismo";
		biology[8][4] = "4. Beticismo";
		return biology;
	}
	public static String [][] bloqueFisica (int numPregunta, int numRespuesta) {
		String physics[][] = new String[9][5];
		physics[0][0] = "¿Qué mide un termómetro?";
		physics[0][1] = "1. Energía";
		physics[0][2] = "2. Tiempo";
		physics[0][3] = "3. Temperatura";
		physics[0][4] = "4. Distancia";
		physics[1][0] = "¿Cuál es la unidad de fuerza en el Sistema Internacional?";
		physics[1][1] = "1. Newton";
		physics[1][2] = "2. Julio";
		physics[1][3] = "3. Pascal";
		physics[1][4] = "4. Kilogramos";
		physics[2][0] = "¿Qué es el movimiento rectilíneo uniforme?";
		physics[2][1] = "1. Cuando la trayectoria es una línea recta y la velocidad es constante";
		physics[2][2] = "2. Cuando la trayectoria es una línea recta";
		physics[2][3] = "3. Cuando la velocidad es constante";
		physics[2][4] = "4. Ninguna de las respuestas es correcta";
		physics[3][0] = "¿Y el movimiento rectilíneo uniformemente acelerado?";
		physics[1][1] = "1. Cuando la trayectoria es recta";
		physics[1][2] = "2. Cuando la trayectoria es recta estando y la aceleración es constante";
		physics[1][3] = "3. Cuando la trayectoria es una línea recta y la velocidad es constante";
		physics[1][4] = "4. Ninguna es correcta";
		physics[4][0] = "La tierra es...";
		physics[4][1] = "1. El segundo planeta del Sistema Solar";
		physics[4][2] = "2. El tercer planeta del Sistema Solar";
		physics[4][3] = "3. El cuarto planeta del Sistema Solar";
		physics[4][4] = "4. El quinto planeta del Sistema Solar";
		physics[5][0] = "¿Qué es un agujero negro?";
		physics[5][1] = "1. Es un objeto con tal fuerza que ni siquiera la luz puede escapar de él";
		physics[5][2] = "2. Es un espacio hermético al que no llega la luz";
		physics[5][3] = "3. Es un objeto que no pertenece al Sistema Solar";
		physics[5][4] = "4. Es una estrella que se ha quedado sin energía";
		physics[6][0] = "¿Qué es una supernova?";
		physics[6][1] = "1. Una estrella muy grande";
		physics[6][2] = "2. Una explosión de cualquier cuerpo celeste";
		physics[6][3] = "3. Una explosión de una estrella";
		physics[6][4] = "4. Un cuerpo celeste muy grande";
		physics[7][0] = "¿Qué es la entropía?";
		physics[7][1] = "1. Es una magnitud física para un sistema termodinámico";
		physics[7][2] = "2. Es la ciencia que estudia los entropes";
		physics[7][3] = "3. Es un derivado de la miopía";
		physics[7][4] = "4. Es lo contrario a una utopía";
		physics[8][0] = "¿Qué dice la Ley de la Conservación de la Masa?";
		physics[8][1] = "1. La energía ni se crea ni se destruye, sólo se transforma";
		physics[8][2] = "2. La materia ni se crea ni se destruye, sólo se transforma";
		physics[8][3] = "3. La materia ni se transforma ni se crea, sólo se destruye";
		physics[8][4] = "4. La energía ni se destruye ni se transforma, sólo se crea";
		
		return physics;
	}
	
	public static boolean respuestaCorrecta (int opcion, int correcta) {
		boolean resultado=false;
		if (opcion==correcta) {
			resultado = true;
		}
		return resultado;
	}
}
