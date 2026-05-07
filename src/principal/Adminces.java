package principal;

public class Adminces {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(
            "Agustin",
            "Coto",
            "Uruguay",
                "acoto@gmail.com",
                "1234"
        );
        System.out.println(usuario1.getApellido());
        System.out.println(usuario1.getMail());
        System.out.println(usuario1.getPaisDeNacimiento());

    }
}
