//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Autor autor1 = new Autor("11-00", "Gabriel","Colombiano", 1990);
    Libro lacabezaroja = new Libro("00099", "La cabeza roja", autor1, 2009, 30.000, 56);
    Usuario juanManuel = new Usuario("34-34", "Juan manuel", "juanma@gmail.com", 7);

    System.out.println("======================");
    System.out.println(" LIBRO");
    System.out.println("====================== \n \n");
    System.out.println(lacabezaroja.toString() + "\n \n");
    System.out.println("======================");
    System.out.println("AUTOR");
    System.out.println("====================== \n \n");
    System.out.println(autor1.toString() + "\n \n");
    System.out.println("======================");
    System.out.println("USUARIO");
    System.out.println("====================== \n \n");
    System.out.println(juanManuel.toString() + "\n \n");


}
