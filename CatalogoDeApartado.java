//echo por Ramses
import java.util.Scanner;
public class CatalogoDeApartado{
   static Scanner leer = new Scanner(System.in);
   
   public void CatalogoDeApartado(){
      int opc;
      
      do {
         System.out.println("\nCATALOGO DE APARTADOS");
         System.out.println("[1] Registrar Apartado");
         System.out.println("[2] Consultar Apartado");
         System.out.println("[3] Reporte de salas apartadas por maestro");
         System.out.println("[4] Reporte de salas apartadas por fecha");
         System.out.println("[5] Regresar al menu principal ");
         
         System.out.print("Opcion deseada? [1 - 5]: ");
         opc = leer.nextInt();
         switch (opc) {
            case 1://Registro de apartado
              
               break; 
            case 2://consultar Apartado
      
               break;    
            case 3://Reporte de apartados por maestro
            
               break;
           case 4://Reporte de apartados por fecha
            
               break; 
           case 5://Regresar al menu principal 
             
               break;    
           default: 
           System.out.println("Opcion no valida...Precione Enter para Continuar ");
           limpiarPausar();
         } 
      } while (opc != 5);
   }
  
   //metodos del catalogo
   private static void limpiarPausar(){
      leer.nextLine();
      leer.nextLine();
   }
   private static void registroApartado(){
   
   }
   private static void consultarApartado(){
   
   }
   private static void reporteApartadoMaestro(){
   
   }
   private static void reporteApartadoFecha(){
   
   }
}