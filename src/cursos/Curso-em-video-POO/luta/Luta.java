package keila.cursoemvideo.luta;

public class Luta {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[5];

        l[0] = new Lutador("Rodrigo", "França", 32, 1.95f,98.6f, 21,2,1);
        l[1] = new Lutador("Felipe", "Japão", 30, 1.85f,88.6f, 18,7,1);
        l[2] = new Lutador("Antonio", "EUA", 40, 1.89f,82.6f, 19,3,2);
        l[3] = new Lutador("Adam", "Russia", 20, 1.79f,62.6f, 12,3,3);
        l[4] = new Lutador("Kevin", "Brasil", 18, 1.82f,68.6f, 2,4,13);

        l[0].status();
        l[1].status();
        l[2].status();
        l[3].status();
        l[4].status();
    }
}
