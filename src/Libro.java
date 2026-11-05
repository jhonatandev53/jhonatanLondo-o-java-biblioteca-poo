public class Libro {

    private String isbn;
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private double precio;
    private int stock;

    // Constructor vacio
    public Libro(){

    }

    // Constructor parametrizado completo
    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion, double precio, int stock){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
        this.stock = stock;
    }

    // Constructor omitiendo precio y stock temporalmente
    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;

    }

    // Constructor parametrizado usando Solo isbn, titulo y autor
    public Libro(String isbn, String titulo, Autor autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;

    }

    // GETTERS para todos los atributos

    // GETTER isbn
    public String getIsbn(){
        return this.isbn;
    }

    // GETTER titulo
    public String getTitulo(){
        return this.titulo;
    }

    // GETTER autor
    public Autor getAutor(){
        return this.autor;
    }

    // GETTER año de publicación
    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }

    // GETTER precio
    public double getPrecio(){
        return this.precio;
    }

    // GETTER stock
    public int getStock(){
        return this.stock;
    }


    // SETTTERS PARA TODOS LOS ATRIBUTOS

    // SETTER isbn
    public void setIsbn(String isbn){
        if (isbn.isEmpty()){
            System.out.println("El ISB no puede estar vacio");
        }
        else {
            this.isbn = isbn;
            System.out.println("ISBN actualizado correctamente: " + isbn);
        }

    }

    // SETTER titulo
    public void setTitulo(String titulo){
        if (titulo.isEmpty()){
            System.out.println("El titulo del libro no puede estar vacio");
        }
        else {
            this.titulo = titulo;
            System.out.println("Titulo actualizado correctamente: " + titulo);
        }

    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    // SETTTER año
    public void setAnioPublicacion(int anioPublicacion){
        if (anioPublicacion <= 500){
            System.out.println("El año de publicación no puede ser menor a 500");
        }
        else {
            this.anioPublicacion = anioPublicacion;
            System.out.println("Año de publicación actualizado correctamente: " + anioPublicacion);
        }

    }


    // SETTER precio
    public void setPrecio(double precio){
        if (precio <= 0){
            System.out.println("El precio no puede ser negativo");
        }
        else {
            this.precio = precio;
            System.out.println("Precio actualizado con exito: " + precio);
        }

    }


    // SETTTER stock
    public void setStock(int stock){
        if (stock < 0){
            System.out.println("El estoy no puede ser negativo");
        }
        else {
            this.stock = stock;
            System.out.println("Stock actualizado con exito: " + stock);
        }

    }

    @Override
    public String toString(){
        return "ISBN: " + this.isbn + "\n" +
                "Libro: " + this.titulo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Año de publicación: " + this.anioPublicacion + "\n" +
                "Precio: " + this.precio + "\n" +
                "Stock: " + this.stock + "\n";
    }


}
