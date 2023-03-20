public class MetApartado{
   public final static int TAM_APARTADOS = 300;
   
   private Apartado apartados[];
   private int contA;
   
   public MetApartado(){
      apartados = new Apartado[TAM_APARTADOS];
      contA = 0;
   }
   public int getContA(){
      return contA;
   }
   
   public void agregar(Apartado ap){
      apartados[contA] = ap;
      contA++;
   }
   
   public int obtenerSala(int valorCapa){
      return valorCapa;   
   }
   
   public int busquedaA(int id){
      for(int x = 0; x< contA; x++){
         if(apartados[x].getNumApartado() == id){
            return x;
         }
      }
      return -1;
   }
   public int contReM(int id){
      int contRepM = 0;
      for(int x=0; x < contA; x++) {
         if(apartados[x].getIdMaestro() == id) {
            contRepM++;
         }
      }
      return contRepM;
   }
   
   public int contReF(String fecha){
      int contRepF = 0;
      for(int x=0; x < contA; x++) {
         if(apartados[x].getFecha() == fecha) {
            contRepF++;
         }
      }
      return contRepF;
   }
   public int busquedaF( String fecha) {
      for(int x=0; x < contA; x++) {
         if( apartados[x].getFecha() == fecha ) {
              return x;
         }
      }
      return -1;
   }
   
   public int busquedaH(String hora) {
      for(int x=0; x < contA; x++) {
         if( apartados[x].getHora() == hora ) {
              return x;
         }
      }
      return -1;
   }
   
   public int getTamApartados(){
      return TAM_APARTADOS;
   }
   public Apartado getApartado(int celda){
      return apartados[celda];
   }
}