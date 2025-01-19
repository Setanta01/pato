public class Turtle {
    public int posX;
    public int posY;
    public String cor;
    public int comidas;

    // Construtor para inicializar a tartaruga
    public Turtle(int posX, int posY, String cor) {
        this.posX = posX;
        this.posY = posY;
        this.cor = cor;
        this.comidas = 0; // Inicializa comidas como 0
    }
}