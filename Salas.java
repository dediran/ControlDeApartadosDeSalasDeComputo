//echo por manuel
public class Salas {
   //atributos
   private int idSala;
   private boolean proyector;
   private int capacidad;
   
      //constructor para que inicialise a los atributos
      public Salas (int idSala, boolean proyector, int capacidad) {
      this.idSala = idSala;
      this.proyector = proyector;
      this.capacidad = capacidad;
      }
      //metodos get
      public int getIdSala () {
         return idSala;
      }
      public boolean getProyector () {
         return proyector;
      }
      public int getCapacidad () {
         return capacidad;
      }
      
      //metodo toString
      public String toString() {
         return "Datos de la Sala\n" + 
                "IdSala--------: " + idSala + "\n" +
                "Proyector----: " + proyector + "\n" +
                "Capacidad------: " + capacidad + " \n";
      }
}