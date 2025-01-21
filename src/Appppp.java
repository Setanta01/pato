import java.util.Scanner;

public class Appppp {

    public static void main(String[] args) throws Exception {
        int tamanho = 4;
        Scanner scanner = new Scanner(System.in);
        Comida cereja = new Comida();
        int nhac;
                Turtle a = new Turtle(0,0,"pink");
                Turtle b = new Turtle("blue");
                MovimentacaoPremium movimento1 = new MovimentacaoPremium(a);
                MovimentacaoPremium movimento2 = new MovimentacaoPremium(b);

                System.out.println("Digite o X da comida");
                nhac = scanner.nextInt();
                cereja.x = nhac;
                System.out.println("Digite o Y da comida");
                nhac = scanner.nextInt();
                cereja.y = nhac;

                
                Bomba[] bombas;
                int numBombas;
                Parede[] paredes;
                int numParedes;
               System.out.println("Digite a quantidade de bombas:");
nhac = scanner.nextInt();
numBombas = nhac;
bombas = new Bomba[numBombas];
for (int i = 0; i < numBombas; i++) {
    bombas[i] = new Bomba(); // Inicializa a bomba
    System.out.println("Escolha a pos X da bomba " + (i + 1) + ":");
    nhac = scanner.nextInt();
    bombas[i].posX = nhac;
    System.out.println("Escolha a pos Y da bomba " + (i + 1) + ":");
    nhac = scanner.nextInt();
    bombas[i].posY = nhac;
}

System.out.println("Digite a quantidade de paredes:");
nhac = scanner.nextInt();
numParedes = nhac;
paredes = new Parede[numParedes];
for (int i = 0; i < numParedes; i++) {
    paredes[i] = new Parede(); // Inicializa a parede
    System.out.println("Escolha a pos X da parede " + (i + 1) + ":");
    nhac = scanner.nextInt();
    paredes[i].posX = nhac;
    System.out.println("Escolha a pos Y da parede " + (i + 1) + ":");
    nhac = scanner.nextInt();
    paredes[i].posY = nhac;
}     
                


                
                //

                

                // Declaração da matriz
                String[][] matriz = new String[tamanho][tamanho];
                
                // Preenchendo a matriz com os valores {posX, posY}
        for (int posX = 0; posX < tamanho; posX++) {
            for (int posY = 0; posY < tamanho; posY++) {
                if ((a.posX == posX && a.posY == posY) && (b.posX == posX && b.posY == posY)) {
                    matriz[posX][posY] = "{" + a.cor + " " + b.cor + "}";
                } else if (a.posX == posX && a.posY == posY) {
                    matriz[posX][posY] = "{" + a.cor + "     }";
                } else if (b.posX == posX && b.posY == posY) {
                    matriz[posX][posY] = "{" + b.cor + "     }";
                } else if (cereja.x == posX && cereja.y == posY) {
                    matriz[posX][posY] = "{CMD      }";
                } else if (isPositionBomb(posX, posY, bombas)) {
                    matriz[posX][posY] = "{BOMBA    }";
                } else if (isPositionWall(posX, posY, paredes)) {
                    matriz[posX][posY] = "{PAREDE   }";
                } else {
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
        int i1 = 0;
        int i2 = 0;
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
            if(count && a.ingame){
                movimento1.mover(a);
                count = false;
                i1++;
            }else if(b.ingame){
                movimento2.mover(b);
                count = true;
                i2++;
            }else{
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
            for (int q = 0; q < numParedes; q++){
                paredes[q].bater(a);
                paredes[q].bater(b);
            }

            for (int w = 0; w < numBombas; w++){
                bombas[w].bater(a);
                bombas[w].bater(b);
            }





        for (int posX = 0; posX < tamanho; posX++) {
            for (int posY = 0; posY < tamanho; posY++) {
                if ((a.posX == posX && a.posY == posY) && (b.posX == posX && b.posY == posY)) {
                    matriz[posX][posY] = "{" + a.cor + " " + b.cor + "}";
                } else if (a.posX == posX && a.posY == posY) {
                    matriz[posX][posY] = "{" + a.cor + "     }";
                } else if (b.posX == posX && b.posY == posY) {
                    matriz[posX][posY] = "{" + b.cor + "     }";
                } else if (cereja.x == posX && cereja.y == posY) {
                    matriz[posX][posY] = "{CMD      }";
                } else if (isPositionBomb(posX, posY, bombas)) {
                    matriz[posX][posY] = "{BOMBA    }";
                } else if (isPositionWall(posX, posY, paredes)) {
                    matriz[posX][posY] = "{PAREDE   }";
                } else {
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
                if(cereja.verificarComida(a)){
                    System.out.println("O " + a.cor + " ganhou com " + i1 + " jogadas");
                }else{
                    System.out.println("O " + b.cor + " ganhou com " + i2 + " jogadas");
                }
                System.out.println("O " + a.cor + " fez " + a.jogadasval + " validas e " + a.jogadasinval + " joga invalidas");
                System.out.println("O " + b.cor + " fez " + b.jogadasval + " validas e " + b.jogadasinval + " joga invalidas");
                break;

            }
            if((!a.ingame) && (!b.ingame)){
                System.out.println("O " + a.cor + " fez " + a.jogadasval + " validas e " + a.jogadasinval + " joga invalidas");
                System.out.println("O " + b.cor + " fez " + b.jogadasval + " validas e " + b.jogadasinval + " joga invalidas"); 
                break;
            }
            action = true;
    }
    
}
    private static boolean isPositionBomb(int x, int y, Bomba[] bombas) {
        for (Bomba bomba : bombas) {
            if (bomba.posX == x && bomba.posY == y) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPositionWall(int x, int y, Parede[] paredes) {
        for (Parede parede : paredes) {
            if (parede.posX == x && parede.posY == y) {
                return true;
            }
        }
        return false;
    }
}