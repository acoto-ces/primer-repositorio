package principal;

public class Herencia  extends Usuario{

    private int nivelAcceso;

    public Herencia(
            String nombre,
            String apellido,
            String paisDeNacimiento,
            String mail,
            String contraseña,
            int nivelAcceso

    ) {



        super (nombre, apellido, paisDeNacimiento, mail, contraseña);

        this.nivelAcceso = nivelAcceso;

      }

    public int getNivelAcceso (){
        return  nivelAcceso;
    }

}
