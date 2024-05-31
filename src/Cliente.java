
import java.util.HashSet;

public class Cliente {

    private HashSet<Mascota> mascotas = new HashSet<>();
    private boolean clienteFrecuente;
    private String email;
    private String nombre;

    public boolean tieneMascota() {
        return this.mascotas.isEmpty();
    }


    public Cliente(String nombre, String email, boolean clienteFrecuente) {
        this.nombre = nombre;
        this.email = email;
        this.clienteFrecuente = clienteFrecuente;
    }

    public boolean isClienteFrecuente() {
        return clienteFrecuente;
    }

    public String getEmail() {
        return email;
    }

    public void agregarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    public HashSet<Mascota> getMascotas() {
        return mascotas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "mascotas=" + mascotas +
                ", clienteFrecuente=" + clienteFrecuente +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
