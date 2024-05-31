import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Animales que admite la veterinaria
        Animal gato = new Animal();
        Animal perro = new Animal();
        Animal hamster = new Animal();


        Mascota teo = new Mascota(perro, new Date(2018, Calendar.APRIL, 21), "Teo");
        Mascota eva = new Mascota(perro, new Date(2018, Calendar.APRIL, 21), "Eva");
        Mascota luna = new Mascota(perro, new Date(2001, Calendar.JULY, 10), "Luna");
        Mascota rodo = new Mascota(hamster, new Date(2023, Calendar.APRIL, 2), "Rodo");
        Mascota jaxy = new Mascota(perro, new Date(2015, Calendar.APRIL, 2), "jaxy");

        Mascota marmolada = new Mascota(gato, new Date(2023, Calendar.APRIL, 2), "Marmolada");
        Mascota cuaz = new Mascota(gato, new Date(2023, Calendar.APRIL, 2), "Cuaz");
        Mascota maga = new Mascota(perro, new Date(2023, Calendar.APRIL, 2), "Maga");
        Mascota garfield = new Mascota(gato, new Date(2023, Calendar.APRIL, 2), "Garfield");


        // Martin tiene 2 gatos y una perra
        Cliente martin = new Cliente("Martin", "martin@martin.com", false);
        Mascota gollum = new Mascota(gato, new Date(2021, Calendar.DECEMBER, 11), "Gollum");
        Mascota olivia = new Mascota(gato, new Date(2019, Calendar.NOVEMBER, 1), "Olivia");
        martin.agregarMascota(gollum);
        martin.agregarMascota(olivia);
        martin.agregarMascota(eva);

        // Baltazar tiene un gato y una perra
        Cliente baltazar = new Cliente("Baltazar","baltazar@gmail.com", true);
        Mascota cloe = new Mascota(gato, new Date(2023, Calendar.APRIL, 2), "Cloe");
        Mascota roma = new Mascota(perro, new Date(2023, Calendar.APRIL, 2), "Roma");
        baltazar.agregarMascota(cloe);
        baltazar.agregarMascota(roma);

        // Jorge tiene 2 perros
        Cliente jorge = new Cliente("Baltazar","baltazar@gmail.com", false);
        baltazar.agregarMascota(jaxy);
        baltazar.agregarMascota(luna);

        // Matias tiene 1 perro
        Mascota renata = new Mascota(perro, new Date(2021, Calendar.NOVEMBER, 3), "Renata");
        Cliente matias = new Cliente("Matias", "matias@otero.com", true);
        matias.agregarMascota(renata);

        // Clientes sin mascota asignada
        Cliente juli = new Cliente("Julieta", "juli@juli.com", true);

        HashSet<Cliente> clientes = new HashSet<>();
        clientes.add(martin);
        clientes.add(baltazar);
        clientes.add(jorge);
        clientes.add(matias);

        System.out.println(clientes);

        





    }


}