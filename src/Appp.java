import java.util.Scanner;

public class Appp {
    public static void main(String[] args) throws Exception {
        int tamanho = 4;
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
        Turtle a = new Turtle(0,0,"pink");
        Turtlehighiq b = new Turtlehighiq("blue");
        MovimentacaoPremium movimento1 = new MovimentacaoPremium(a);
        MovimentacaoPremium movimento2 = new MovimentacaoPremium(b);
        

        // Declaração da matriz
        String[][] matriz = new String[tamanho][tamanho];

        // Preenchendo a matriz com os valores {posX, posY}
            for (int posX = 0; posX < tamanho; posX++) {
            for (int posY = 0; posY < tamanho; posY++) {
                if ((a.posX == posX && a.posY == posY) && (b.posX == posX && b.posY == posY)){
                    matriz[posX][posY] = "{" + a.cor +" " + b.cor + "}";
                }
                else if (a.posX == posX && a.posY == posY) {
                    matriz[posX][posY] = "{" + a.cor + "     }";
                } else if(b.posX == posX && b.posY == posY){
                    matriz[posX][posY] = "{" + b.cor + "     }";
                } else if(cereja.x == posX && cereja.y == posY){
                    matriz[posX][posY] = "{CMD     }";
                }
                else {
                    matriz[posX][posY] = "{         }";
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
        boolean count = true;
        boolean action = true;
        while(true){
           /* while (action) {
            System.out.println("a");
            String kar = scanner.next();

    // Verifica se kar é "1", "2", "3" ou "4"
            if (kar.equals("1") || kar.equals("2") || kar.equals("3") || kar.equals("4")) {
                try{
                int von = Integer.valueOf(kar);
                movimento.mover(von);
                action = false;
                }catch(MovimentoInvalidoException e){
                System.out.println("Movimento Invalido");
            }
            } 
    // Verifica se kar é "up", "down", "right" ou "left"
            else if (kar.equals("up") || kar.equals("down") || kar.equals("right") || kar.equals("left")) {
                try{
                movimento.mover(kar);
                action = false;
                }catch(MovimentoInvalidoException e){
                    System.out.println("Movimento Invalido");
                }
            } 
    // Caso contrário, continua no loop
            else {
                System.out.println("Entrada inválida. Tente novamente.");
                action = true;
            }
            }*/
            if(count){
                movimento1.mover(a);
                count = false;
            }else{
                movimento2.mover(b);
                count = true;
            }
            System.out.println("");

            /*for (int posX = 0; posX < tamanho; posX++) {
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
            }*/
            for (int posX = 0; posX < tamanho; posX++) {
            for (int posY = 0; posY < tamanho; posY++) {
                if ((a.posX == posX && a.posY == posY) && (b.posX == posX && b.posY == posY)){
                    matriz[posX][posY] = "{" + a.cor +" " + b.cor + "}";
                }
                else if (a.posX == posX && a.posY == posY) {
                    matriz[posX][posY] = "{" + a.cor + "     }";
                } else if(b.posX == posX && b.posY == posY){
                    matriz[posX][posY] = "{" + b.cor + "     }";
                } else if(cereja.x == posX && cereja.y == posY){
                    matriz[posX][posY] = "{CMD      }";
                }
                else {
                    matriz[posX][posY] = "{         }";
                }
            }
            }


            for (int posY = tamanho - 1; posY >= 0; posY--) { // Iteração do topo para baixo
            for (int posX = 0; posX < tamanho; posX++) {
                System.out.print(matriz[posX][posY] + " ");
            }
            System.out.println();

            }
            if (cereja.verificarComida(a) || cereja.verificarComida(b)){
                break;

            }
            action = true;
    }
    
}

}