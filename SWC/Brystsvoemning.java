import java.util.*;
import java.io.*;

/**
* @Martin.Valhalla
*/

public class Brystsvoemning extends Medlem{ 
   
   public Brystsvoemning(String fornavn, String efternavn, int alder, String medlemsskab, String disciplin, double tid, String dato)throws Exception{
      super.setFornavn(fornavn);
      super.setEfternavn(efternavn);
      super.setAlder(alder);
      super.setMedlemsskab(medlemsskab);
      super.setDisciplin(disciplin);
      super.setTid(tid);
      super.setDato(dato);
            
      //gemmer til fil
      super.saveIt("brystsvoemning.txt");
   }
   
   @Override   
   public String toString(){
      return super.getFornavn()+" "+super.getEfternavn()+" "+super.getAlder()+" "
               +super.getMedlemsskab()+" "+super.getDisciplin()+" "+super.getTid()+" "+super.getDato();
   }
}