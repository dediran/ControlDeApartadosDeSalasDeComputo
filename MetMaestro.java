public class MetMaestro{
   public final static int NUM_MAESTROS = 100; 
   //atributos
   private Maestro maestros[];
   private int contM;
   
   //constructor
   public MetMaestro(){
      maestros = new Maestro[NUM_MAESTROS];
      contM = 0;
   }
   public int getContM(){
      return contM;
   }
   
   public int busqueda(int idMaestro){
      for(int x = 0; x<contM; x++){
         if(maestros[x].getIdMaestro() == idMaestro){
            return x;
         }
      }
      return -1;
   }
   
   public void agregar(Maestro ma){
      maestros[contM] = ma;
      contM++;
   }
   
   public int getNumMaestros(){
      return NUM_MAESTROS;
   }
   public Maestro getMaestro(int celda){
      return maestros[celda];
   }
}