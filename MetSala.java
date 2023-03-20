public class MetSala{
   public final static int NUM_SALAS = 20;
   //atributos
   private Sala salas[];
   private int contS;

   //constructor
   public MetSala(){
      salas = new Sala[NUM_SALAS];
      contS = 0;
   }
   public int getContS(){
      return contS;
   }

   public int busqueda(int idSala){
      for(int x = 0; x<contS; x++){
         if(salas[x].getIdSala() == idSala){
            return x;
         }
      }
      return -1;
   }

   public void agregar(Sala sa){
      salas[contS] = sa;
      contS++;
   }

   public int getNumSalas(){
      return NUM_SALAS;
   }
   public Sala getSala(int celda){
      return salas[celda];
   }
}