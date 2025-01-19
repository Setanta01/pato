public class App {
    public static void main(String[] args) throws Exception {
        int tamanho = 11;

        // Instância do objeto Turtle
        Turtle a = new Turtle();
        a.posX = 0; // Coordenada X
        a.posY = 0; // Coordenada Y
        a.cor = "red";

        // Declaração da matriz
        String[][] matriz = new String[tamanho][tamanho];

        // Preenchendo a matriz com os valores {posX, posY}
        for (int posX = 0; posX < tamanho; posX++) {
            for (int posY = 0; posY < tamanho; posY++) {
                if (a.posX == posX && a.posY == posY) {
                    matriz[posX][posY] = "{" + a.cor + "}";
                } else {
                    matriz[posX][posY] = "{   }";
                }
            }
        }

        // Exibindo a matriz com (0, 0) no canto inferior esquerdo
        for (int posY = tamanho - 1; posY >= 0; posY--) { // Iteração do topo para baixo
            for (int posX = 0; posX < tamanho; posX++) {
                System.out.print(matriz[posX][posY] + " ");
            }
            System.out.println();
        }
        while(true){

        }
    }
}