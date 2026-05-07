package principal;

public class Usuario {

    private String nombre;
    private String apellido;
    private String paisDeNacimiento;
    private String mail;
    private String contraseña;


    //Constructor
    public Usuario (String nombre, String apellido, String paisDeNacimiento, String mail, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisDeNacimiento = paisDeNacimiento;
        this.mail = mail;
        this.contraseña = contraseña;

    }

    public Usuario() {
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPaisDeNacimiento() {
        return paisDeNacimiento;
    }
    public String getMail() {
        return mail;

    }
    public String getContraseña() {
        return contraseña;
    }



    //Setters
        public void SetNombre(String nombre){
            this.nombre = nombre;
        }

    public void setApellido(String apellido) {
            this.apellido = apellido;
        }

    public void setPaisDeNacimiento(String paisDeNacimiento) {
            this.paisDeNacimiento = paisDeNacimiento;
        }

    public void setMail(String mail) {
            this.mail = mail;
        }

    public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

}













