public class Usuario {

    private String idUsuario;
    private String nombre;
    private String correoElectronico;
    private int librosPrestados;

    // Constructor vacio
    public Usuario(){

    }

    // Constructor parametrizado completo
    public Usuario(String idUsuario, String nombre, String correoElectronico, int librosPrestados){
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.librosPrestados = librosPrestados;
    }


    // Constructor parametrizado solo con nombre, correo y libros
    public Usuario(String nombre, String correoElectronico, int librosPrestados){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.librosPrestados = librosPrestados;
    }

    // Constructor parametrizado por defecto con nombre y correo
    public Usuario(String nombre, String correoElectronico){
        this.nombre = "Usuario";
        this.correoElectronico = "Sin correo electronico";
    }

    // GETTERS para todos los atributos


    // GETTER de idUsuario
    public String getIdUsuario(){ return  this.idUsuario;}

    // GETTER de nombre
    public String getNombre(){ return this.nombre;}

    // GETTER de correoElectronico
    public String getCorreoElectronico(){ return  this.correoElectronico;}

    // GETTER de librosPrestados
    public int getLibrosPrestados(){return  this.librosPrestados;}


    // SETTERS para todos los atributos

    // SETTER de id usuario
    public void setIdUsuario(String idUsuario){
        if (idUsuario.isEmpty()){
            System.out.println("El ID de usuario no puede estar vacio");
        }
        else {
            this.idUsuario = idUsuario;
            System.out.println("ID de usuario actualizado correctamente: " + idUsuario);
        }
    }

    // SETTER nombre
    public void setNombre(String nombre){
        if (nombre.isEmpty()){
            System.out.println("El nombre no puede estar vacio");
        }
        else {
            this.nombre = nombre;
            System.out.println("Nombre actualizado correctamente: " + nombre);
        }
    }

    // SETTER correoElectronico
    public void setCorreoElectronico(String correoElectronico){
        if (correoElectronico.isEmpty()){
            System.out.println("El correo electronico no puede estar vacio");
        }
        else {
            this.correoElectronico = correoElectronico;
            System.out.println("Correo electronico actualizado correctamente: " + correoElectronico);
        }
    }

    // SETTER libros prestados
    public void setLibrosPrestados(int librosPrestados){
        if (librosPrestados <= 0){
            System.out.println("La cantidad de libros prestados no puede ser menor o igual a 0");
        }
        else {
            this.librosPrestados = librosPrestados;
            System.out.println("Libros prestados actualizado correctamente");
        }
    }


    @Override
    public String toString(){
        return "ID: " + this.idUsuario + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Correo electronico" + this.correoElectronico + "\n" +
                "Libros prestados: " + this.librosPrestados + "\n";
    }
}

