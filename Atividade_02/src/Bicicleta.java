public class Bicicleta implements IBicicleta {
    private int velocidade, marcha;
    private final int velocidadeMaxima;

    // Inicializa o objeto com uma velocidade máxima definida pelo usuário
    public Bicicleta(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void setMarcha(int marcha) {
        if (marcha >= 0 && marcha < 5) {
            this.marcha = marcha;
        }
    }

    @Override
    public void acelerar() {
        if (this.velocidade < this.velocidadeMaxima) {this.velocidade++;}
    }

    @Override
    public void frear() {
        if (this.velocidade > 0) {this.velocidade--;}
    }

    @Override
    public void imprimirEstados() {
        System.out.println("Velocidade: " + this.velocidade
                + "Km Marcha: " + this.marcha
                + " Velocidade máxima: " + this.velocidadeMaxima +"Km");
    }
}