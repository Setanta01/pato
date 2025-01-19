public class Mapa {
     public static void main(String[] args) {
        // Tamanho da matriz
        int tamanho = 11;

        // Declaração da matriz
        String[][] matriz = new String[tamanho][tamanho];

        // Preenchendo a matriz com os valores {posX, posY}
        for (int posX = 0; posX < tamanho; posX++) {
            for (int posY = 0; posY < tamanho; posY++) {
                
                matriz[posX][posY] = "{}";
            }
        }

        // Exibindo a matriz
        for (int posX = 0; posX < tamanho; posX++) {
            for (int posY = 0; posY < tamanho; posY++) {
                System.out.print(matriz[posX][posY] + " ");
            }
            System.out.println();
        }
    }
}
