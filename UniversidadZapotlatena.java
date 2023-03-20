import java.util.Scanner;
public class UniversidadZapotlatena {
   static Scanner leer = new Scanner(System.in);
   public static void main (String args[]){  
      int opc;
      //Invocacion de los catalogos
      CatalogoDeApartado catalogoApartado = new CatalogoDeApartado();
      CatalogoDeMaestros catalogoMaestros = new CatalogoDeMaestros();
      CatalogoDeSalas catalogoSalas = new CatalogoDeSalas();
      //objetos de los catalogos
      MetMaestro m = new MetMaestro();
      MetApartado a = new MetApartado();
      MetSala s = new MetSala();
      do{
         System.out.println("\nCATALOGO UNIVERSIDAD ZAPOTLATENA");
         System.out.println("[1] Catalogo de maestros");
         System.out.println("[2] Catalogo de salas");
         System.out.println("[3] Control de apartados de salas");
         System.out.println("[4] Finalizar programa");
         System.out.print("Opcion deseada? [1 - 4]: ");
         opc = leer.nextInt();
         switch(opc){
         case 1://catalogo de maestros
            catalogoMaestros.CatalogoDeMaestros(m);   
            break;
         case 2://catalogo de Salas
            catalogoSalas.CatalogoDeSalas(s);
            break;
         case 3://Catalogo de Control de apartados
            catalogoApartado.CatalogoDeApartado(a,m,s);
            break;
         case 4://finalizar programa
            System.out.print("\nPrograma Finalizado");
            break; 
         default:
            System.out.print("Opccion no valida...Precione Enter para Continuar");
            limpiarPausar();
         }
      }while(opc != 4);
   }
   
   private static void limpiarPausar(){
      leer.nextLine();
      leer.nextLine();
   }
}