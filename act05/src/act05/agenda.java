package act05;

public class agenda {

    //Estructura de tipo arreglo
    private final int MAX = 300;
    private cliente[] Estructura = new cliente[MAX];

    ///Constructor que inicializa los
    //Objetos
    public agenda() {
        for (int e = 0; e < MAX; e++) {
            Estructura[e] = new cliente();
        }
    }

    public String busca(String dato) {
        String salida = dato + "No encontrado";
        for (int e = 0; e < MAX; e++) {
            if (Estructura[e].getOcupado() && (Estructura[e].getId().compareTo(dato) == 0)) {
                salida = "Id: " + Estructura[e].getId();
                salida = salida + "\nNombre: " + Estructura[e].getNombre();
                salida = salida + "\nCelular: " + Estructura[e].getCelular();
                salida = salida + "\nEmail: " + Estructura[e].getEmail();
                salida = salida + "\n------------\n";
                break;
            }
        }
        return salida;
    }

    public void inserta(cliente elemento) {
        for (int e = 0; e < MAX; e++) {
            if (Estructura[e].getOcupado() == false) {

                Estructura[e].setId(elemento.getId());
                Estructura[e].setNombre(elemento.getNombre());
                Estructura[e].setCelular(elemento.getCelular());
                Estructura[e].setEmail(elemento.getEmail());
                break;
            }
        }
    }

    public String extrae() {
        String salida = "";
        for (int e = 0; e < MAX; e++) {
            if (Estructura[e].getOcupado() == true) {

                salida = salida + "Id: " + Estructura[e].getId();
                salida = salida + "\nNombre: " + Estructura[e].getNombre();
                salida = salida + "\nCelular: " + Estructura[e].getCelular();
                salida = salida + "\nEmail: " + Estructura[e].getEmail();
                salida = salida + "\n------------\n";
            }
        }

        return salida;
    }

    public String consulta(String nom) {
        String salida = "";
        for (int e = 0; e < MAX; e++) {
            if (Estructura[e].getOcupado() && (Estructura[e].getNombre().contains(nom))) {
                salida = salida + "Id: " + Estructura[e].getId();
                salida = salida + "\nNombre: " + Estructura[e].getNombre();
                salida = salida + "\nCelular: " + Estructura[e].getCelular();
                salida = salida + "\nEmail: " + Estructura[e].getEmail();
                salida = salida + "\n------------\n";
            }
        }
        if (salida.compareTo("") == 0) {
            salida = "Ningun dato coincide";
        }
        return salida;

    }

}
