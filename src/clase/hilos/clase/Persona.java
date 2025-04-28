package clase.hilos.clase;
import lombok.Setter;
import lombok.Getter;

public class Persona {
    @Getter @Setter private String nombre;
    @Getter @Setter private String fechaNacimiento;
    @Getter @Setter private String direccion;

    public Persona(){
    }

}
