import java.util.Scanner;

public class CatalogoDeApartado{
   static Scanner leer = new Scanner(System.in);
   
   public void CatalogoDeApartado(MetApartado a, MetMaestro m ,MetSala s){
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
               registroApartado(a, m, s);  
               break; 
            case 2://consultar un Apartado
               consultarApartado(a ,m ,s);
               break;    
            case 3://Reporte de apartados por maestro
               reportarApartadosPorMaestro(a ,m ,s);
               break;
           case 4://Reporte de apartados por fecha
               reportarApartadoPorFecha(a ,m ,s);
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
   private static void registroApartado(MetApartado a ,MetMaestro m ,MetSala s){
      int idMaestro ,celdaM ,celdaS ,idSala, celdaF, celdaH, resp;
      String fecha, hora;
      
      Apartado ap;
      if(a.getContA() < a.getTamApartados()){
         int numApartado = a.getContA() + 1;
         System.out.printf("\nNumero de Apartado: %d\n", numApartado);
         System.out.print("Ingrese el ID del maestro: ");
         idMaestro = leer.nextInt();
         celdaM = m.busqueda(idMaestro);
         if(celdaM != -1){
            System.out.printf("Nombre del Maestro: %s\n" ,m.getMaestro(celdaM).getNombre());
            System.out.print("Ingrese el ID de sala: ");
            idSala = leer.nextInt();
            celdaS = s.busqueda(idSala);
            if(celdaS != -1){
               leer.nextLine();
               System.out.printf("Capacidad de la sala %d\n", s.getSala(celdaS).getCapacidad());
               System.out.print("Ingrese la fecha: ");
               fecha = leer.nextLine();
               celdaF = a.busquedaF(fecha);
               if(celdaF == -1 || celdaF != -1) {
                  System.out.print("Ingrese la hora");
                  hora = leer.nextLine();
                  celdaH = a.busquedaH(hora);
                  if(celdaH == -1){
                     System.out.print("Estas seguro de registrar el apartado? [si = 1][no = 2]");
                     resp = leer.nextInt();
                     if(resp == 1){
                        ap = new Apartado(numApartado ,idMaestro ,idSala ,fecha ,hora);
                        a.agregar(ap);
                        System.out.println("\n***EL Registro se guardo Exitosamente***");
                     }else{
                        System.out.println("\n***EL registro NO se guardo***");
                     }         
                  } else {
                     System.out.print("ya esta apartada esa hora");
                  }
               }else{
                  
               }
            }else{
               System.out.print("El ID de la Sala no Existe...Precione Enter para Continuar");
               limpiarPausar();   
            }
         }else{
            System.out.print("El ID del Maestro no Existe...Precione Enter para Continuar");
            limpiarPausar();
         }
      }else{
         System.out.print("No hay Salas o Maestros Registrados...Precione Enter para Continuar");
         limpiarPausar();
      }
   }
   private static void consultarApartado(MetApartado a ,MetMaestro m, MetSala s){
      int val,id;
      int contador = a.getContA();
      System.out.println("\nCONSULTA DE UN REGISTRO");
      if(contador > 0){
         System.out.print("Ingrese el id del Apartado: ");
         id = leer.nextInt();
         val = a.busquedaA(id);
         if(val != -1){
            int primerDireccion = a.getApartado(val).getIdSala();
            int primerDireccionM = a.getApartado(val).getIdMaestro();
            String segundaDireccionM = m.getMaestro(m.busqueda(primerDireccionM)).getNombre();
            int segundaDireccion = s.getSala(s.busqueda(primerDireccion)).getCapacidad();
            System.out.println("----------------------------");
            System.out.printf("ID del maestro: %d\n" ,primerDireccionM);
            System.out.printf("Nombre del Maestro: %s\n", segundaDireccionM);
            System.out.printf("ID de la Sala: %d\n" ,primerDireccion);
            System.out.printf("Capacidad de Sala: %d\n", segundaDireccion);
            System.out.printf("Fecha: %s \n",a.getApartado(val).getFecha());
            System.out.printf("Hora: %s \n",a.getApartado(val).getHora());
            System.out.println("----------------------------\n");
            System.out.println("****Precione Enter para Continuar****");
            limpiarPausar();
         }else{
            System.out.print("El ID del Apartado no existe...Precione Enter para Continuar");
            limpiarPausar();
         }
      }else{
         System.out.print("El catalogo esta vacio...Precione Enter para Continuar");
         limpiarPausar();
      }
   }
   private static void reportarApartadosPorMaestro(MetApartado a ,MetMaestro m, MetSala s){
      int id, val;
      int contador = a.getContA();
      System.out.println("\nCATALOGO DE REGISTROS");
      if(contador > 0){
         System.out.print("Ingrese ID del maestro: ");
         id = leer.nextInt();
         val = m.busqueda(id);
         if(val != -1){
            int primerDireccionM = a.getApartado(val).getIdMaestro();
            String segundaDireccionM = m.getMaestro(m.busqueda(primerDireccionM)).getNombre();
            System.out.printf("Nombre del Maestro: %s\n\t", segundaDireccionM);
            for(int x = 0; x <= a.contReM(id); x++){
               if(a.getApartado(x).getIdMaestro() == id){
                  System.out.println("----------------------------");
                  System.out.printf("Numero de Apartado: %d \n\t",x +1);
                  System.out.printf("\n- ID de Sala: %d",a.getApartado(x).getIdSala());
                  System.out.printf("\n- Capacidad de sala %d Personas",s.getSala(s.busqueda(a.getApartado(x).getIdSala())).getCapacidad());
                  System.out.printf("\n- Fecha: %s",a.getApartado(x).getFecha());
                  System.out.printf("\n- Hora: %s\n",a.getApartado(x).getHora());
                  System.out.printf("----------------------------\n\n");
               }
            }
            System.out.println("***Precione Enter para Continuar***\n");
            limpiarPausar();
         }else{
            System.out.println("\nEsa ID no Existe...Precione Enter para continuar: ");
            limpiarPausar();
         }    
      }else{
         System.out.println("\nEl Catalogo de Registros esta Vacio...Precione Enter para continuar: ");
         leer.nextLine();
      }
   }  
   
   private static void reportarApartadoPorFecha(MetApartado a ,MetMaestro m, MetSala s){
      String fecha;
      int val;
      int contador = a.getContA();
      System.out.println("\nCATALOGO DE REGISTROS");
      leer.nextLine();
      if(contador > 0){
         System.out.print("Ingrese la fecha: ");
         fecha = leer.nextLine();
         val = a.busquedaF(fecha);
         if(val != -1){
            String fechaIMP = a.getApartado(val).getFecha();
            System.out.printf("FECHA: %s\n\t", fechaIMP);
            for(int x = 0; x <= a.contReF(fecha); x++){
               if(a.getApartado(x).getFecha() == fecha){
                  System.out.println("----------------------------\n");
                  System.out.printf("Numero de Apartado: %d \n\t\t",x +1);
                  System.out.printf("\n- ID de Sala: %d",a.getApartado(x).getIdSala());
                  System.out.printf("\n- Capacidad de sala %d Personas",s.getSala(s.busqueda(a.getApartado(x).getIdSala())).getCapacidad());
                  System.out.printf("\n- ID del Maestro: %s",a.getApartado(x).getIdMaestro());
                  System.out.printf("\n- Nombre del Maestro: %s",m.getMaestro(m.busqueda(a.getApartado(x).getIdMaestro())).getNombre());
                  System.out.printf("\n- Hora: %s\n",a.getApartado(x).getHora());
                  System.out.printf("----------------------------\n\n");
               }
            }
            System.out.println("***Precione Enter para Continuar***\n");
            limpiarPausar();
         }else{
            System.out.print("\nEsa Fecha no existe...precione Enter para Continuar ");
            limpiarPausar();
         }
      }else{
         System.out.print("\nEl catalogo de registros esta Vacio...precione Enter para Continuar ");
         limpiarPausar();
      }   
   }
}