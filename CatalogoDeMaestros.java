
import java.util.Scanner;
public class CatalogoDeMaestros{
   static Scanner leer = new Scanner(System.in);
   
   public void CatalogoDeMaestros(MetMaestro m){
      int opc;
      do{
         System.out.println("\nUNIVERSIDAD ZAPOTLATENA - CATÁLOGO DE MAESTROS");
         System.out.println("[1] Alta de un Maestro");
         System.out.println("[2] consulta de un individual de un maestro");
         System.out.println("[3] consulta de todos los maestros");
         System.out.println("[4] Regresar al menu Principal");
         System.out.print("[1 - 4] ¿Opcion deseada?");
         opc = leer.nextInt();
         switch(opc){   
            case 1://Alta de un Maestro
               realizarAltaMaestro(m);
               break;       
            case 2://consulta de un Maestro individual
               realizarconsultaIndividualMaestro(m);
               break;   
            case 3://consulta de todos los Maestros
               realizarConsultaGeneralMaestros(m);
               break;   
            case 4://Regresar al menu principal
               return;
               //break;     
            default:
               System.out.print("opcion no valida...Presione Enter para Continuar");
               limpiarPausar();      
         }
      }while(opc != 6 );
   }
   
   //metodos de Catalogo de maestros
   
   private static void limpiarPausar(){
      leer.nextLine();
      leer.nextLine();
   }
   private static void realizarAltaMaestro(MetMaestro m){
      int idMaestro ,celda;
      String nombre,academia;
      Maestro ma;
      int contador = m.getContM(), numMaestros = m.getNumMaestros();
      if(contador < numMaestros){
         System.out.println("\nALTA DE UN MAESTRO: ");
         System.out.print("Ingrese el id---: ");
         idMaestro = leer.nextInt();
         celda = m.busqueda(idMaestro);
         if(celda == -1){
            leer.nextLine(); // limpiar
            System.out.print("nombre-------: ");
            nombre = leer.nextLine();
            System.out.print("Academia-----: ");
            academia = leer.nextLine();
            ma = new Maestro(idMaestro ,nombre ,academia);
            m.agregar(ma);
            System.out.print("Alta exitosa precione enter para continuar");
            leer.nextLine();
         } else {
            System.out.print("ya existe un maestro con ese id... precione enter para continuar");
            limpiarPausar();
         }
      }else {
         System.out.print("el catalogo ya esta lleno...precione enter para continuar");
         limpiarPausar();
      }
      
   }
   
   private static void realizarconsultaIndividualMaestro(MetMaestro m){
      int celda,id;
      int contador = m.getContM();
      System.out.println("\nCONSULTA DE UN MAESTRO");
      if(contador > 0){
         System.out.print("Ingrese el id del maestro: ");
         id = leer.nextInt();
         celda = m.busqueda(id);
         if(celda != -1){
            System.out.println("----------------------------");
            System.out.print(m.getMaestro(celda).toString());
            System.out.println("----------------------------\n");
            System.out.println("****Precione Enter para Continuar****");
            limpiarPausar();
         }else{
            System.out.print("El ID del Maestro no existe...Precione Enter para Continuar");
            limpiarPausar();
         }
      }else{
         System.out.print("El catalogo esta vacio...Precione Enter para Continuar");
         limpiarPausar();
      }
   }
   
   private static void realizarConsultaGeneralMaestros(MetMaestro m){
      System.out.println("\nCONSULTA GENERAL");
      if(m.getContM() == 0){
         System.out.print("\nNO hay Maestros en el Catalogo...Precione Enter para Continuar");
         limpiarPausar();
      }else{
         for (int x = 0; x < m.getContM(); x++){
            System.out.println("----------------------------");
            System.out.print(m.getMaestro(x).toString());
            System.out.println("----------------------------\n");
         }
         System.out.println("***Precione Enter para Continuar***\n");
         limpiarPausar();
      }
   }  
}