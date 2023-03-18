//echo por Ramses
public class Apartado {
   private int numApartado;
   private int idMaestro;
   private int idSala;
   private String fecha;
   private String hora;
    
   //constructor
   public Apartado(){}
   
   public Apartado(int numApartado ,int idMaestro ,int idSala ,String fecha ,String hora){
      this.numApartado = numApartado;
      this.idMaestro = idMaestro;
      this.idSala = idSala;
      this.fecha = fecha;
      this.hora = hora;
   }
   
   //metodos get
   public int getNumApartado(){
      return numApartado;
   }
   public int getIdMaestro(){
      return idMaestro;
   }
   public int getIdSala(){
      return idSala;
   }
   public String getFecha(){
      return fecha;
   }
   public String getHora(){
      return hora;
   }
}