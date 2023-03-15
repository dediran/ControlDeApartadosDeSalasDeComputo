//echo por manu
import java.util.Scanner;
public class CatalogoDeSalas {
   
   static Scanner leer = new Scanner(System.in);
    
    public void CatalogoDeSalas () {
      int opc;
      
      do {
         System.out.println("\nCATALOGO DE SALAS DISPONIBLES");
         System.out.println("[1] Alta de un paciente");
         System.out.println("[2] Consulta de paciente");
         System.out.println("[3] Consulta de todos los pacientes");
         System.out.println("[4] Regresar ");
         
         System.out.print("Opcion deseada? : ");
         opc = leer.nextInt();
         
         switch (opc) {
         
            case 1://alta de un paciente
               
               break;
               
            case 2://consulta de un paciente
            
            
               break;   
               
            case 3://consulta de todos los pacientes
            
               break;
               
           case 4://modificacion de un paciente
           
            
               break;
               
           
                 
                
         } 
         
      } while (opc != 6);
    }
    
}