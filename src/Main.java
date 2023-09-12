public class Main {
    public static void main(String[] args) {
        Cao c1 = new Cao("Totó", "Macho", 6, 30, "Amarelo", "Vira-lata");
        Baleia b1 = new Baleia("Pérola", "Fêmea", 20, 1000, "Azul", "");

        System.out.println("-----------------");
        c1.dados();
        System.out.println("-----------------");
        c1.respirar();
        System.out.println("-----------------");
        c1.comer();
        System.out.println("-----------------");
        c1.latir();
        System.out.println("-----------------");

        b1.dados();
        System.out.println("-----------------");
        b1.respirar();
        System.out.println("-----------------");
        b1.comer();
        System.out.println("-----------------");
        b1.mergulhar();
        System.out.println("-----------------");
    }
}