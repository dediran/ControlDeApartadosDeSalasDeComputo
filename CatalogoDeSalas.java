import java.util.Scanner;
public class CatalogoDeSalas {
   static Scanner leer = new Scanner(System.in);
    
    public void CatalogoDeSalas(MetSala s) {
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
         
            case 1://alta de una sala
               realizarAltaSala(s);
               break;
               
            case 2://consulta de una sala
               realizarconsultaIndividualSala(s);
               break;   
               
            case 3://consulta de todas las salas
               realizarConsultaGeneralSalas(s);
               break;
               
           case 4://Regresar al menu principal
            
               break; 
           default: 
           System.out.println("Opcion no valida...Precione Enter para Continuar ");
         } 
         
      } while (opc != 4);
    }
    private static void limpiarPausar(){
      leer.nextLine();
      leer.nextLine();
   }
   private static void realizarAltaSala(MetSala s){
      int idSala ,celda ,capacidad ,resp;
      boolean proyector;
      Sala sa;
      int contador = s.getContS(), numSalas = s.getNumSalas();
      if(contador < numSalas){
         System.out.println("\nALTA DE UNA SALA: ");
         System.out.print("Ingrese el id---: ");
         idSala = leer.nextInt();
         celda = s.busqueda(idSala);
         if(celda == -1){
            leer.nextLine(); // limpiar
            System.out.print("Tiene o no proyector [SI = 1][NO = 2]: ");
            resp = leer.nextInt();
            if(resp == 1){
               proyector = true;
            }else{
               proyector = false;
            }
            System.out.print("Capacidad-----: ");
            capacidad = leer.nextInt();
            sa = new Sala(idSala ,proyector ,capacidad);
            s.agregar(sa);
            System.out.print("Alta exitosa precione enter para continuar");
            leer.nextLine();
         } else {
            System.out.print("ya existe una Sala con ese id... precione enter para continuar");
            limpiarPausar();
         }
      }else {
         System.out.print("el catalogo ya esta lleno precione enter para continuar");
         limpiarPausar();
      }
      
   }
   
   private static void realizarconsultaIndividualSala(MetSala s){
      int celda,id;
      int contador = s.getContS();
      System.out.println("\nCONSULTA DE UNA SALA");
      if(contador > 0){
         System.out.print("Ingrese el ID de la Sala: ");
         id = leer.nextInt();
         celda = s.busqueda(id);
         if(celda != -1){
            System.out.println("----------------------------");
            System.out.print(s.getSala(celda).toString());
            System.out.println("----------------------------\n");
            System.out.println("****Precione Enter para Continuar****");
            limpiarPausar();
         }else{
            System.out.print("El ID de la Sala no existe...Precione Enter para Continuar");
            limpiarPausar();
         }
      }else{
         System.out.print("El catalogo esta vacio...Precione Enter para Continuar");
         limpiarPausar();
      }
   }
   
   private static void realizarConsultaGeneralSalas(MetSala s){
      if(s.getContS() == 0){
         System.out.print("\nNO hay Salas en el Catalogo...Precione Enter para Continuar");
         limpiarPausar();
      }else{
         for (int x = 0; x < s.getContS(); x++){
            System.out.println("----------------------------");
            System.out.print(s.getSala(x).toString());
            System.out.println("----------------------------\n");
         }
         System.out.println("***Precione Enter para Continuar***\n");
         limpiarPausar();
      }
   }
}