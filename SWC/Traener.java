import java.util.*;

/**
*
* @Martin.Valhalla
* @Casper.ortismal
*/

public class Traener extends Ansat {

	
	public int subMenu() {
		Scanner console = new Scanner(System.in);
      int menu = -1;
      while (menu != 0){
         traenerMenu();
         int dum = 0;
         
         while(dum == 0){
            if(console.hasNextInt()){
               menu = console.nextInt(); 
               break;
            }else System.out.println("Ugyldigt input");
               dum = 1;
         }
               
         switch(menu){
            case 1: printDisciplin(); break;
            case 2: printKandidater(); break;
            case 3: printListe(); break;
            case 0: 
               Ansat a = new Ansat();
               a.menu();
               return 0;
            default: 
               System.out.println("Tast venligst et nummer der er fremvist");
               subMenu();
         
         }
      }
      return 0;            
	}
   
   public void traenerMenu(){
      System.out.println("Tast 1 for disciplinliste med tilknyttede medlemmer");
      System.out.println("Tast 2 for top 5 liste over disciplin"); //�ndres
      System.out.println("Tast 3 for liste over konkurrencesvoemmere");
      System.out.println("Tast 0 for at gaa tilbage\n<=="); 
   }
   
   /**
   *
   * Beskrivelse her
   */
   
	public void printDisciplin(){
		System.out.println("<==|_Kom_ind_|==>");
      //switch
	}
   
   /**
   *
   * Beskrivelse her
   */
   
   public void printKandidater(){
      System.out.println("<==|_Kom_ind_|==>");
      //switch
   }

   /**
   *
   * Beskrivelse her
   */  
    
   public void printListe(){
      System.out.println("<==|_Kom_ind_|==>");
   }
}