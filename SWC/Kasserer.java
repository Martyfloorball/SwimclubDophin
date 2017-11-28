import java.util.*; // for Scanner
import java.io.*; // for PrintStream


public class Kasserer extends Ansat {
   
   public Kasserer(){}
   
   public Kasserer(String fornavn, String efternavn, String restance){
      super.setFornavn(fornavn);
      super.setEfternavn(efternavn);
      super.setRestance(restance);   
      
      
   }

	public void subMenu()throws Exception {
		Scanner console = new Scanner(System.in);
      int menu = -1;
      while(menu != 0){
         subMenuInfo();
         
         super.testConsoleInput(console);
         
         switch(this.menu){
            case 1: 
               visRestance();
               
               //if else 
               //om det er konkurrence sv�mmer eller motion
               //gem i fil dertil
               menu = 0;
               break;
            case 2:
               betalingsstatus();
               
               menu = 0;
               break;
            case 0: 
               this.menu = -1; //for at den ikke ogs� hopper ud af ansats menu
               super.menu(); //menu hos ansat
               break;
            default: 
               System.out.println("Tast venligst et nummer der er fremvist\n");
               subMenu();
         }
         break; //for kun at komme ud af dette loop
      }
	}
   
   public void subMenuInfo(){
<<<<<<< HEAD
      System.out.printf("%-20s%s\n%-20s%s\n", "PRINT RESTANCELISTE", "TRYK 1", "RETURNER", "TRYK 0");
=======
      System.out.println("Tast 1 for at printe restance");
      System.out.println("Tast 2 for at printe betalingsstatus");
      System.out.print("Tast 0 for at gaa tilbage\n<==\n");
>>>>>>> a0b9114d86bb589c953630637576cbf73e44dd88
   }

   
   /**
   * Beskrivelse her
   */
   public void betalingsstatus() throws Exception {
      Scanner status = new Scanner(new File("visRestance.txt"));
      while(status.hasNextLine()){
            
            String sline = status.nextLine();
               System.out.println(sline.toString());
             }
   }
   
   /**
   * Beskrivelse her
   */
   public void visRestance() throws Exception{
      Scanner RestanceKonti = new Scanner(new File("visRestance.txt"));
      
      List<Kasserer> vis = new ArrayList<>();
      while(RestanceKonti.hasNextLine()){
         String line = RestanceKonti.nextLine();
         Scanner token = new Scanner(line);
         
         String navn = token.next();
         super.setFornavn(navn);
         
         String enavn = token.next();
         super.setEfternavn(enavn);
         
         String rest = token.next();
         super.setRestance(rest);
         
         if(rest.equals("Restance")){
           
           System.out.println(line.toString()); 
         } 
         
         Kasserer kas = new Kasserer(super.getFornavn(), super.getEfternavn(), super.getRestance());
         vis.add(kas);
         }  
   }
   
   public String toString() {
      return super.getFornavn()+" "+super.getEfternavn()+" "+ super.getRestance();
   }
   
   public void redigerKontigent(){
      System.out.println("Hej konti");
   }
}