public class Autor {

    private String idAutor;
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;

    // Constructor (vacio)
    public Autor() {

    }

    // Constructor parametrizado por defecto con solo nombre
    public Autor(String nombre) {
        this.nombre = "Autor anonimo";
    }

    // Constructor parametrizado con todos los atributos
    public Autor(String idAutor, String nombre, String nacionalidad, int anioNacimiento) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
    }


    // Constructor parametrizado por defecto para año de nacimiento
    public Autor(int anioNacimiento) {
        this.anioNacimiento = 000;
    }

    // GETTERS PARA TODOS LOS ATRIBUTOS


    // Get idAutor
    public String getIdAutor() {
        return this.idAutor;
    }

    // Get nombre
    public String getNombre() {
        return this.nombre;
    }

    // Get nacionalidad
    public String getNacionalidad() {
        return this.nacionalidad;
    }

    // Get anioNacimiento
    public int getAnioNacimiento() {
        return this.anioNacimiento;
    }

    // SETTERS PARA TODOS LOS ATRIBUTOS

    // SETTER IdAutor
    public void setIdAutor(String idAutor){
        if (idAutor == ""){
            System.out.println("No se permiten ID'S vacios");
        }
        else {
            this.idAutor = idAutor;
            System.out.println("ID autor actualizado con exito");
        }

    }

    // SETTER nombre
    public void setNombre(String nombre){
        if (nombre == ""){
            System.out.println("El nombre no puede estar vacio");
        }
        else {
            this.nombre = nombre;
            System.out.println("Nombre actualizado con exito: (nuevo nombre) " + nombre);
        }

    }

    // SETTER nacionalidad
    public void setNacionalidad(String nacionalidad){
        if (nacionalidad == ""){
            System.out.println("La nacionalidad no puede estar vacia");
        }
        else {
            this.nacionalidad = nacionalidad;
            System.out.println("Nacionalidad actualizada con exito: (nueva nacionalidad) " + nacionalidad);
        }

    }

    // SETTER anioNacimiento
    public void setAnioNacimiento(int anioNacimiento){
        if (anioNacimiento <= 800){
            System.out.println("Digite un año de nacimiento valido");
        }
        else {
            this.anioNacimiento = anioNacimiento;
            System.out.println("Año de nacimiento actualizado con exito (nuevo año) " + anioNacimiento);
        }

    }

    @Override
    public String toString(){

        return "Autor: " + this.nombre + "\n" +
                "ID: " + this.idAutor + "\n" +
                "Nacionalidad: " + this.nacionalidad + "\n" +
                "Año nacimiento: " + this.anioNacimiento;
    }
}
