//echo por manu
import java.util.Scanner;
public class CatalogoDeSalas {
   
   static Scanner leer = new Scanner(System.in);
    
    public void CatalogoDeSalas () {
      int opc;
      //utilizacion para crear un objeton de un arreglo de 20
      
      do {
         System.out.println("\nCATALOGO DE SALAS DISPONIBLES");
         System.out.println("[1] Alta de sala");
         System.out.println("[2] Consulta de una sala");
         System.out.println("[3] Consulta de todas las salas");
         System.out.println("[4] Regresar al menu principal ");
         
         System.out.print("Opcion deseada? : ");
         opc = leer.nextInt();
         
         switch (opc) {
         
            case 1://alta de un paciente
               
               break;
               
            case 2://consulta de una sala
            
            
               break;   
               
            case 3://consulta de todas las salas
            
               break;
               
           case 4://Regresar al menu principal
            
               break; 
           default: 
           System.out.println("----Opcion no valida----- ");
         } 
         
      } while (opc != 5);
    }
    
}