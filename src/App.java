import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int tamanho = 11;
        Scanner scanner = new Scanner(System.in);
        Comida cereja = new Comida();
        int nhac;

        System.out.println("Digite o X da comida");
        nhac = scanner.nextInt();
        cereja.x = nhac;
        System.out.println("Digite o Y da comida");
        nhac = scanner.nextInt();
        cereja.y = nhac;

        


        
        //
        Turtle a = new Turtle(0,0,"red");
        MovimentacaoPremium movimento = new MovimentacaoPremium(a);

        // Declaração da matriz
        String[][] matriz = new String[tamanho][tamanho];

        // Preenchendo a matriz com os valores {posX, posY}
            for (int posX = 0; posX < tamanho; posX++) {
            for (int posY = 0; posY < tamanho; posY++) {
                if (a.posX == posX && a.posY == posY) {
                    matriz[posX][posY] = "{" + a.cor + "}";
                } else if(cereja.x == posX && cereja.y == posY){
                    matriz[posX][posY] = "{CMD)";
                }
                else {
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
        int i = 0;
        
        boolean action = true;
        while(true){
            while (action) {
            System.out.println("a");
            String kar = scanner.next();

    // Verifica se kar é "1", "2", "3" ou "4"
            if (kar.equals("1") || kar.equals("2") || kar.equals("3") || kar.equals("4")) {
                int von = Integer.valueOf(kar);
                movimento.mover(von);
                action = false;
            } 
    // Verifica se kar é "up", "down", "right" ou "left"
            else if (kar.equals("up") || kar.equals("down") || kar.equals("right") || kar.equals("left")) {
                movimento.mover(kar);
                action = false;
            } 
    // Caso contrário, continua no loop
            else {
                System.out.println("Entrada inválida. Tente novamente.");
                action = true;
            }
            }
            	
            for (int posX = 0; posX < tamanho; posX++) {
            for (int posY = 0; posY < tamanho; posY++) {
                if (a.posX == posX && a.posY == posY) {
                    matriz[posX][posY] = "{" + a.cor + "}";
                } else if(cereja.x == posX && cereja.y == posY){
                    matriz[posX][posY] = "{CMD)";
                }
                else {
                    matriz[posX][posY] = "{   }";
                }
            }
            }



            for (int posY = tamanho - 1; posY >= 0; posY--) { // Iteração do topo para baixo
            for (int posX = 0; posX < tamanho; posX++) {
                System.out.print(matriz[posX][posY] + " ");
            }
            System.out.println();

            }
            if (cereja.verificarComida(a)){
                break;

            }
            action = true;
    }
    
}

}