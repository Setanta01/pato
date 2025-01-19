public class MovimentacaoPremium {
    private int posX; // Coordenada X
    private int posY; // Coordenada Y

    // Construtor para inicializar as coordenadas
    public MovimentacaoPremium(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    // Método para mover para cima
    public void up() {
        posX += 1; // Incrementa o eixo X
    }

    // Método para mover para baixo
    public void down() {
        posX -= 1; // Decrementa o eixo X
    }

    // Método para mover para a direita
    public void right() {
        posY += 1; // Incrementa o eixo Y
    }

    // Método para mover para a esquerda
    public void left() {
        posY -= 1; // Decrementa o eixo Y
    }

    // Métodos para obter as posições atuais
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    // Método para exibir as coordenadas atuais
    public void showPosition() {
        System.out.println("Posição atual: (" + posX + ", " + posY + ")");
    }
}