package principal;

public class Adminces {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(
            "Agustin",
            "agustin@gmail.com",
            "1234"
        );

        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getMail());

    }
}
