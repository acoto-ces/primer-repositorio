package principal;

public class Usuario {

    private String nombre;
    private String mail;
    private String contraseña;


    public Usuario (String nombre, String mail, String contraseña) {
        this.nombre = nombre;
        this.mail = nombre;
        this.contraseña = contraseña;

    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getMail() {
        return mail;
    }
}



