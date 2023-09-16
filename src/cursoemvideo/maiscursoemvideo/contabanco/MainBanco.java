package keila.cursoemvideo.contabanco;

public class MainBanco {
    public static void main(String[] args) {
        ContaBanco contaBanco = new ContaBanco();

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("Gustavo");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p1.setNumConta(22222);
        p1.setDono("Joana");
        p1.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p1.estadoAtual();
        p1.estadoAtual();

    }
}
