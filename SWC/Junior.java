import java.util.*;
import java.io.*;

public class Junior extends Aktiv {
   
   public Junior (double pris){
      super(pris);
   }
   
   @Override
   public double getPris() { return super.getPris() + 1000.0; }
}