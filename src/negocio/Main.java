package negocio;

public class Main {

    static void main() {

        NodoRed nodo1 = new NodoRed(1, 2);
        NodoRed nodo2 = new NodoRed(-34, -25);
        nodo1.conectar();
        nodo1.conectar();
        nodo1.conectar();
        nodo1.desconectar();
        nodo1.desconectar();
        nodo1.desconectar();

        int valor1 = NodoRed.consultarContador();
        System.out.println("Numero de nodos " + valor1);

        nodo2.conectar();
        nodo2.conectar();
        nodo2.conectar();
        nodo2.desconectar();
        nodo2.desconectar();
        nodo2.desconectar();

        int valor2 = NodoRed.consultarContador();
        System.out.println("Numero de nodos " + valor2);



    }
}
