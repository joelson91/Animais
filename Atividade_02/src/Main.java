public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(4); // Velocidade máxima definida no construtor
        bicicleta.imprimirEstados();
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.setMarcha(4);
        bicicleta.imprimirEstados();
        bicicleta.frear();
        bicicleta.imprimirEstados();
    }
}