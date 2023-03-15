public class Maestro {
   
   private int id;
   private String nombre;
   private String academia;
   
   //constructores
   
   public Maestro(int id, String nombre, String academia){
      this.id = id;
      this.nombre = nombre;
      this.academia = academia;
   }
   
   //metodos get
   
   public int getId(){
      return id;
   }
   
   public String getNombre(){
      return nombre;
   }
   
   public String getacademia(){
      return academia;
   }
   
   public String toString(){
      return "Datos del Maestro\n" + 
             "ID--------: " + id + "\n"+
             "Nombre----: " + nombre + "\n" +
             "Academia--: \n\t\t-" + academia; 
   }
   

}
