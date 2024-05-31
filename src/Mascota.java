import java.util.Date;

public class Mascota {

    private Animal animal;
    private Date fechaNacimiento;
    private String nombre;

    public Mascota(Animal animal, Date fechaNacimiento, String nombre) {
        this.animal = animal;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public Animal getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "animal=" + animal +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
