public class Maestro {
   
   private int idMaestro;
   private String nombre;
   private String academia;
   
   //constructores
      
   public Maestro(int idMaestro, String nombre, String academia){
      this.idMaestro = idMaestro;
      this.nombre = nombre;
      this.academia = academia;
   }
   
   //metodos get
   
   public int getIdMaestro(){
      return idMaestro;
   }
   
   public String getNombre(){
      return nombre;
   }
   
   public String getacademia(){
      return academia;
   }
   
   public String toString(){
      return "Datos del Maestro\n" + 
             "ID--------: " + idMaestro + "\n"+
             "Nombre----: " + nombre + "\n" +
             "Academia--: " + academia + "\n"; 
   }
}