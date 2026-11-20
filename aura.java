import java.util.Scanner;

class Main{

public static void main(String[] args){

int falladas=0;
int vida =90;
int correctas =0;
int prg =0;
  String[] preguntas = {"Cuantos ojos de ender ocupa el portal del end?",
                        "george",
                        "Como se llama el prota de halo?",
                        "como se llama el personaje principal de red dead redemption 2?",
                        "Cuanto poder tiene gordoy en gordokai tenpochi ZERO?",
                        "Que espada usa zelda?",
                        "Cual es el origen de TLOU?",
                        "Quien SI es un sobreviviente de left for dead 1?"};

String[][] respuestas ={ {"9","12","6","7"}, //P1
                         {"sigma","bateman","mario","floyd"}, //P2
                         {"Gordo ramsey","Cristof","john","Nigga"}, //P3
                         {"Butch","Lamar","Arthur","Money"}, //P4
                         {"ES MAS DE 8000!!!!","0","1 gorillon","1000 thrembillones"}, //P5
                         {"La espada pendeja","Espada","Hoja maestra","Espada maestra"}, //P6
                         {"Un hongo","Un parasito","Una bacteria","Un virus"},  //P7
                         {"Foster","Francis","Crane","Richtofen"}  //P8
                         };

int[] respuestacorrecta={2,4,3,3,1,4,1,2};

    
Scanner scanner = new Scanner(System.in);

System.out.println("*****************************************************************************");
System.out.println("*                         EXAMEN GAMER                                      *");         
System.out.println("*****************************************************************************");


System.out.println("Bienvenidos a este examen gamer!");
System.out.println("A continuacion probaremos tus conocimientos gamers");         
System.out.println("Tendras un indicador de vida inicial de 90, si llega a cero, se pierde la partida");
         System.out.println("Buena suerte!");
         System.out.println("Presiona 1 para continuar, presiona 0 para salir");

 int decision=scanner.nextInt();

  switch (decision){
    
    case 0:
      System.exit(0);
    
    case 1:  
      break;
 default:
      System.out.println("Ponte pilas, no andes poniendo cosas que ni al caso \n");
          
        break;
  }


  
        for (int k = 0; k<8; k++){
System.out.println("*****************");            
System.out.println("** Pregunta: " + (k+1)+ " **");
System.out.println("*****************");  
System.out.println(preguntas[k]);

            for (int q=0; q<4; q++){
             System.out.println((q+1) +": "+ respuestas[prg][q]);   
                
            }
          
         prg++;    

        decision=scanner.nextInt();      
    switch (decision){
    
   
    case 1:  
      if(decision==respuestacorrecta[k]){
          System.out.println("inteliegemtw");
      } else{
         System.out.println("baboso"); 
      }
       break;
            
     case 2:
      if(decision==respuestacorrecta[k]){
          System.out.println("inteliegemtw");
      } else{
         System.out.println("baboso"); 
      }       
   break;
           
      case 3:
       if(decision==respuestacorrecta[k]){
          System.out.println("inteliegemtw");
      } else{
         System.out.println("baboso"); 
      }      
     break;

      case 4:
        if(decision==respuestacorrecta[k]){
          System.out.println("inteliegemtw");
      } else{
         System.out.println("baboso"); 
      }    
      break;

        
 default:
      System.out.println("Ponte pilas, no andes poniendo cosas que ni al caso \n");
          
        break;
  }
        } 

System.out.println("\n gay over");
    
         
}
}
