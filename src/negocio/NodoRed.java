package negocio;

public class NodoRed {

    //Atributos
    private int id;
    private int capacidad;
    private int conexiones;
    private static int contador;

    //Constructor


    public NodoRed(int id, int capacidad) {
        setId(id);
        conexiones = 0;
        setCapacidad(capacidad);
        if(getId()!= -1 && getCapacidad() != 0 && getConexiones() != -1){
            contador++;
        }
    }



    //Getters y setters

    public void setId(int id) {
        this.id=-1;
        if(id>=0){
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    private static int getContador() {
        return contador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = 0;
        if(capacidad>0){
            this.capacidad = capacidad;
        }
    }

    public int getConexiones() {
        return conexiones;
    }

    public void setConexiones(int conexiones) {
        this.conexiones = -1;
        if(conexiones>=0 && conexiones <= getCapacidad()){
            this.conexiones = conexiones;
        }
        else{
            System.out.println("Rechazado");
        }
    }

    //Metodos

    public boolean conectar(){
        if(getConexiones() < getCapacidad()){
            conexiones++;
            System.out.println("Se aumento una vez. True");
            return true;
        }
        System.out.println("No se aumento");
        return false;
    }

    public boolean desconectar(){
        if(conexiones>0){
            conexiones--;
            System.out.println("Se disminuyo una vez. True");
            return true;
        }
        System.out.println("No se disminuyo");
        return false;
    }

    public static int consultarContador(){
        return getContador();
    }
}
