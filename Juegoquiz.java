import java.util.Scanner;

/**
 *
 * @author N
 */

    /**
     * @param args the command line arguments
     */
  class Main {
    public static void main(String[] args) {

        int falladas = 0;
        int falladasseg =0;
        int vida = 90;
        int correctas = 0;
        int prg = 0;
       String[] preguntas = {"Cuantos ojos de ender ocupa el portal del end?",
            "Quien NO pertenece a un videojuego?",
            "Como se llama el protagonista de halo?",
            "como se llama el personaje principal de red dead redemption 2?",
            "Cuanto poder tiene cristof en sparking prietos?",
            "Que espada usa zelda?",
            "Cual es el origen de TLOU?",
            "Quien SI es un sobreviviente de left for dead 1?"};

        String[][] respuestas = {{"9", "12", "6", "7"}, //P1
        {"Ghost", "Cloud", "Mario", "Estrada Ferreiro"}, //P2
        {"Gordo ramsey", "Spartan", "john", "johnson"}, //P3
        {"Butch", "Lamar", "Arthur", "Money"}, //P4
        {"ES MAS DE 8000!!!!", "0", "1 gorillon", "1000 thrembillones"}, //P5
        {"No usa", "Espada", "Hoja maestra", "Espada maestra"}, //P6
        {"Un hongo", "Un parasito", "Una bacteria", "Un virus"}, //P7
        {"Foster", "Francis", "Crane", "Richtofen"} //P8
    };

        int[] respuestacorrecta = {2, 4, 3, 3, 1, 4, 1, 2};

        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************************************************************");
        System.out.println("*                               EXAMEN GAMER                                *");
        System.out.println("*****************************************************************************");

        System.out.println("Bienvenidos a este examen gamer!");
        System.out.println("A continuacion probaremos tus conocimientos gamers");
        System.out.println("Tendras un indicador de vida inicial de 90, si llega a cero, se pierde la partida");
        System.out.println("Buena suerte!");
        System.out.println("Presiona 1 para continuar, presiona 0 para salir");

        int decision = scanner.nextInt();

        switch (decision) {

            case 0:
                System.exit(0);

            case 1:
                
                break;
                
            default:
                System.out.println("Ponte pilas, no andes poniendo cosas que ni al caso \n");

                break;
        }

        for (int k = 0; k < 8; k++) {
            if (vida > 0) {
            } else {
                System.out.println("\nHaz perdido toda tu aura...");
                System.out.println("FIN DEL JUEGO");
                System.exit(0);
            }
            System.out.println("\nVida:" + vida);
            System.out.println("*****************");
            System.out.println("** Pregunta: " + (k + 1) + " **");
            System.out.println("*****************");
            System.out.println(preguntas[k]);

            for (int q = 0; q < 4; q++) {
                System.out.println((q + 1) + ": " + respuestas[prg][q]);

            }

            prg++;

            decision = scanner.nextInt();
            switch (decision) {

                case 1:
                    if (decision == respuestacorrecta[k]) {
                        System.out.println("CORRECTO");
                        correctas++;
                        falladasseg =0;
                    } else {
                        System.out.println("INCORRECTO");
                        vida = vida - 30;
                        falladas++;
                        falladasseg++;
                        if(falladasseg>1){
                            vida=vida-10;
                        }
                    }
                    break;

                case 2:
                    if (decision == respuestacorrecta[k]) {
                        System.out.println("CORRECTO");
                        correctas++;
                        falladasseg =0;
                    } else {
                        System.out.println("INCORRECTO");
                        vida = vida - 30;
                        falladas++;
                        falladasseg++;
                        if(falladasseg>1){
                            vida=vida-10;
                        }
                    }
                    break;

                case 3:
                    if (decision == respuestacorrecta[k]) {
                        System.out.println("CORRECTO");
                        correctas++;
                        falladasseg =0;
                    } else {
                        System.out.println("INCORRECTO");
                        vida = vida - 30;
                        falladas++;
                        falladasseg++;
                        if(falladasseg>1){
                            vida=vida-10;
                        }
                    }
                    break;

                case 4:
                     if (decision == respuestacorrecta[k]) {
                        System.out.println("CORRECTO");
                        correctas++;
                        falladasseg =0;
                    } else {
                        System.out.println("INCORRECTO");
                        vida = vida - 30;
                        falladas++;
                        falladasseg++;
                        if(falladasseg>1){
                            vida=vida-10;
                        }
                    }
                    break;

                default:
                    System.out.println("Ponte pilas, no andes poniendo cosas que ni al caso");
                      vida = vida - 30;
                        falladas++;
                        falladasseg++;
                        if(falladasseg>1){
                            vida=vida-10;
                        }
                     break;
            }
        }

        System.out.println("""
                           
                           Lograste pasar el super quiz 64!
                           a continuacion mostraremos tus resultados:
                           Preguntas acertadas: """ + correctas
                + "\nPreguntas falladas: " + falladas);
                        System.exit(0);

    }
}
