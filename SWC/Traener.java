import java.util.*;
import java.io.*;

/**
* @Martin.Valhalla
* @Casper.ortismal
*/

public class Traener extends Ansat {

	/**
   * beskrivelse her
   */
	public int subMenu()throws Exception{
		Scanner console = new Scanner(System.in);
      int menu = -1;
      while (menu != 0){
         traenerMenu();
         
         super.testConsoleInput(console);               
         
         switch(this.menu){
            case 1: printDisciplin(); break; //tilf�j switch
            case 2: printKandidater(); break; //tilf�j switch
            case 3: printListe(); break; //printe fra konkurrencesv�mmere fil
            case 4: registrerStaevne(console); break; //tilf�jer navn + st�vne til fil
            case 0: 
               this.menu = -1; //for at den ikke ogs� hopper ud af ansats menu
               super.menu(); //menu hos ansat
               break;
            default: 
               System.out.println("Tast venligst et nummer der er fremvist");
               subMenu();
         }
         break;
      }
      return 0;            
	}
   
   public void traenerMenu(){
      System.out.println("Tast 1 for disciplinliste med tilknyttede medlemmer");
      System.out.println("Tast 2 for top 5 liste over disciplin"); //�ndres
      System.out.println("Tast 3 for liste over konkurrencesvoemmere");
      System.out.println("Tast 4 for at registrere deltagelse i staevne");
      System.out.println("Tast 0 for at returnere\n<=="); 
   }
   
   /**
   * Beskrivelse her
   */
   
	public void printDisciplin(){
		System.out.println("<==|_Kom_ind_|==>");
      //switch
	}
   
   /**
   * Beskrivelse her
   */
   
   public void printKandidater(){
      System.out.println("<==|_Kom_ind_|==>");
      //switch
   }

   /**
   * Beskrivelse her
   */  
    
    public void printListe()throws Exception{
   
   Scanner konkurrence = new Scanner(new File("konkurrenceSvoemmere.txt")); 
   
   System.out.printf("%-10s %-10s %-7s %-11s %-15s %-15s\n", "Fornavn", "Efternavn", "Alder", "Medlemskab", "Disciplin", "Tid");
   System.out.println("------------------------------------------------------------------");
   
   while(konkurrence.hasNextLine()){
      
      String fornavn = konkurrence.next();
      String efternavn = konkurrence.next();
      int alder = konkurrence.nextInt();
      String medlemskab = konkurrence.next();
      String disciplin = konkurrence.next();
      String tid = konkurrence.next();
      
      System.out.printf("%-10s %-10s %-7d %-11s %-15s %s\n", fornavn, efternavn, alder, medlemskab, disciplin, tid);
      System.out.println(konkurrence.nextLine() + "  ");
      
   }
   System.out.println();
   subMenu();
   }   
   //Beskrivelse
   
   public void registrerStaevne(Scanner console)throws Exception{
      System.out.println("Indtast fornavn");
      super.setFornavn(console.next());
      System.out.println("Indtast efternavn");
      super.setEfternavn(console.next());
      System.out.println("Indtast staevnenavn");
      super.setStaevneNavn(console.next());
      System.out.println("Indtast bedste staevnetid");
      super.setStaevneTid(console.nextDouble());
      System.out.println("Indtast placering");
      super.setPlacering(console.nextInt());
      
      //valg af disciplin
      Formand refMetode = new Formand();
      refMetode.vaelgDisciplin(console);
      
      saveToFile(refMetode);
      
      subMenu();
   }
   
   /**
   * Den laver et metodekald p� vaelgDisciplin i formand klasse
   * og sammenligner Disciplin.
   * Udf�re den p�g�lende case for disciplinen.
   */
   
   public void saveToFile(Formand refMetode)throws Exception{
      switch(refMetode.getDisciplin()){
         case "Crawl":
            Crawl gemCrawl = new Crawl(super.getFornavn(),super.getEfternavn(), super.getStaevneNavn(), super.getStaevneTid(), super.getPlacering(), refMetode.getDisciplin());
            break;
         case "Brystsvoemning":
            Brystsvoemning gemBrystsvoemning = new Brystsvoemning(super.getFornavn(),super.getEfternavn(), super.getStaevneNavn(), super.getStaevneTid(), super.getPlacering(), refMetode.getDisciplin());
            break;
         case "Rygcrawl":
            Rygcrawl gemRygcrawl = new Rygcrawl(super.getFornavn(),super.getEfternavn(), super.getStaevneNavn(), super.getStaevneTid(), super.getPlacering(), refMetode.getDisciplin());
            break;
         case "Butterfly":
            Butterfly gemButterfly = new Butterfly(super.getFornavn(),super.getEfternavn(), super.getStaevneNavn(), super.getStaevneTid(), super.getPlacering(), refMetode.getDisciplin());
            break;
         case "Hundesvoemning":
            Hundesvoemning geHundesvoemning = new Hundesvoemning(super.getFornavn(),super.getEfternavn(), super.getStaevneNavn(), super.getStaevneTid(), super.getPlacering(), refMetode.getDisciplin());
            break;   
         default:
            break;
      }
   }
}