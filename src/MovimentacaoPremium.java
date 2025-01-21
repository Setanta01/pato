import java.util.Random;


public class MovimentacaoPremium {
    public Random random = new Random();
    private int x;
    private Turtle a;
    private Turtlehighiq b;

    public MovimentacaoPremium(Turtle a) {
        if (a == null) {
            throw new IllegalArgumentException("O objeto Turtle não pode ser nulo.");
        }
        this.a = a;
    }

    public MovimentacaoPremium(Turtlehighiq b) {
        if (b == null) {
            throw new IllegalArgumentException("O objeto Turtlehighiq não pode ser nulo.");
        }
        this.b = b;
    }


    public int getPosX() {
        return a != null ? a.getPosX() : b.getPosX();
    }

    public int getPosY() {
        return a != null ? a.getPosY() : b.getPosY();
    }


    public void setPos(int x, int y) {
        if (a != null) {
            a.setPos(x, y);
        } else {
            b.setPos(x, y);
        }
    }

    // Método para mover utilizando uma String
    public void mover(String bzin) {
        switch (bzin) {
            case "up":
                if (getPosY() >= 3) {
                    throw new MovimentoInvalidoException("Movimento 'up' é inválido: limite superior alcançado.");
                } else {
                    setPos(getPosX(), getPosY() + 1);
                }
                break;
            case "down":
                if (getPosY() <= 0) {
                    throw new MovimentoInvalidoException("Movimento 'down' é inválido: limite inferior alcançado.");
                } else {
                    setPos(getPosX(), getPosY() - 1);
                }
                break;
            case "left":
                if (getPosX() <= 0) {
                    throw new MovimentoInvalidoException("Movimento 'left' é inválido: limite esquerdo alcançado.");
                } else {
                    setPos(getPosX() - 1, getPosY());
                }
                break;
            case "right":
                if (getPosX() >= 3) {
                    throw new MovimentoInvalidoException("Movimento 'right' é inválido: limite direito alcançado.");
                } else {
                    setPos(getPosX() + 1, getPosY());
                }
                break;
            default:
                System.out.println("Movimento não identificado: " + bzin);
                break;
        }
    }

    // Método para mover utilizando um número
    public void mover(int czin) {
        switch (czin) {
            case 1: // up
                if (getPosY() >= 3) {
                    throw new MovimentoInvalidoException("Movimento '1' (up) é inválido: limite superior alcançado.");
                } else {
                    setPos(getPosX(), getPosY() + 1);
                }
                break;
            case 2: // down
                if (getPosY() <= 0) {
                    throw new MovimentoInvalidoException("Movimento '2' (down) é inválido: limite inferior alcançado.");
                } else {
                    setPos(getPosX(), getPosY() - 1);
                }
                break;
            case 3: // right
                if (getPosX() >= 3) {
                    throw new MovimentoInvalidoException("Movimento '3' (right) é inválido: limite direito alcançado.");
                } else {
                    setPos(getPosX() + 1, getPosY());
                }
                break;
            case 4: // left
                if (getPosX() <= 0) {
                    throw new MovimentoInvalidoException("Movimento '4' (left) é inválido: limite esquerdo alcançado.");
                } else {
                    setPos(getPosX() - 1, getPosY());
                }
                break;
            default:
                System.out.println("Movimento inválido: " + czin);
                break;
        }
    }

    // Método para mover aleatoriamente Turtle
    public void mover(Turtle a) {
        x = random.nextInt(4) + 1; // Gera um número entre 1 e 4
        try {
            a.lastX = a.posX;
            a.lastY = a.posY;
            mover(x);
            a.jogadasval++;
        } catch (MovimentoInvalidoException e) {
            System.out.println(e.getMessage());
            a.jogadasinval++;
        }
    }

    // Método para mover aleatoriamente Turtlehighiq
    public void mover(Turtlehighiq b) {
        x = random.nextInt(4) + 1; // Gera um número entre 1 e 4
        try {
            while (b.mem == x) {
                x = random.nextInt(4) + 1;
            }
            b.lastX = b.posX;
            b.lastY = b.posY;
            mover(x);
            b.jogadasval++;
        } catch (MovimentoInvalidoException e) {
            System.out.println(e.getMessage());
            b.jogadasinval++;
        }
        b.mem = x;
    }
}















/*import java.util.Random;
public class MovimentacaoPremium {
    public Random random = new Random();
    private int x;
    private Turtle a;
    private Turtlehighiq b;
    // Construtor para inicializar a movimentação da tartaruga
    public MovimentacaoPremium(){}

    public MovimentacaoPremium(Turtle a) {
        if (a == null) {
            throw new IllegalArgumentException("O objeto Turtle não pode ser nulo.");
        }
        this.a = a;
    }
    public MovimentacaoPremium(Turtlehighiq b){
        if (a == null) {
            throw new IllegalArgumentException("O objeto Turtle não pode ser nulo.");
        }
        this.b = b;        
    }

    // Método para mover utilizando uma String
    public void mover(String bzin) {
        switch (bzin) {
            case "up":
                if (a.getPosY() >= 3) {
                    throw new MovimentoInvalidoException("Movimento 'up' é inválido: limite superior alcançado.");
                } else {
                    a.setPos(a.getPosX(), a.getPosY() + 1);
                }
                break;
            case "down":
                if (a.getPosY() <= 0) {
                    throw new MovimentoInvalidoException("Movimento 'down' é inválido: limite inferior alcançado.");
                } else {
                    a.setPos(a.getPosX(), a.getPosY() - 1);
                }
                break;
            case "left":
                if (a.getPosX() <= 0) {
                    throw new MovimentoInvalidoException("Movimento 'left' é inválido: limite esquerdo alcançado.");
                } else {
                    a.setPos(a.getPosX() - 1, a.getPosY());
                }
                break;
            case "right":
                if (a.getPosX() >= 3) {
                    throw new MovimentoInvalidoException("Movimento 'right' é inválido: limite direito alcançado.");
                } else {
                    a.setPos(a.getPosX() + 1, a.getPosY());
                }
                break;
            default:
                System.out.println("Movimento não identificado: " + bzin);
                break;
        }
    }

    // Método para mover utilizando um número
    public void mover(int czin) {
        switch (czin) {
            case 1:
                if (a.getPosY() >= 3) {
                    throw new MovimentoInvalidoException("Movimento '1' (up) é inválido: limite superior alcançado.");
                } else {
                    a.setPos(a.getPosX(), a.getPosY() + 1);
                }
                break;
            case 2:
                if (a.getPosY() <= 0) {
                    throw new MovimentoInvalidoException("Movimento '2' (down) é inválido: limite inferior alcançado.");
                } else {
                    a.setPos(a.getPosX(), a.getPosY() - 1);
                }
                break;
            case 4:
                if (a.getPosX() <= 0) {
                    throw new MovimentoInvalidoException("Movimento '4' (left) é inválido: limite esquerdo alcançado.");
                } else {
                    a.setPos(a.getPosX() - 1, a.getPosY());
                }
                break;
            case 3:
                if (a.getPosX() >= 3) {
                    throw new MovimentoInvalidoException("Movimento '3' (right) é inválido: limite direito alcançado.");
                } else {
                    a.setPos(a.getPosX() + 1, a.getPosY());
                }
                break;
            default:
                System.out.println("Movimento inválido: " + czin);
                break;
        }
    }

    public void mover(Turtle a){
        x = random.nextInt(3) + 1;
        try {
            mover(x);
        } catch (MovimentoInvalidoException e) {
        }
        
        
    }
    public void mover(Turtlehighiq b){
        x = random.nextInt(3) + 1;
        try {
            while(b.mem == x){
                x = random.nextInt(3) + 1;
            }
            mover(x);
        } catch (MovimentoInvalidoException e) {
            b.mem = x;
        }
    }


}















/*public class MovimentacaoPremium {
    private Turtle a;
    private String bzin;
    private int czin;
    // Construtor para inicializar a movimentação da tartaruga
    public MovimentacaoPremium(Turtle a) {
        if (a == null) {
            throw new IllegalArgumentException("O objeto Turtle não pode ser nulo.");
        }
        this.a = a;
    }

    // Método para mover para cima
    public void mover(String bzin) {
        switch(bzin){
            case "up":
            if(a.posY >= 10){
                throw new IllegalArgumentException("Movimento inválido");
            }
            else{
                a.posY++;
            }
            break;
            case "down":
            if(a.posY <= 0){
                throw new IllegalArgumentException("Movimento inválido");
            }
            else{
                a.posY--;
            }
            break;
            case "left":
            if(a.posX <= 0){
                throw new IllegalArgumentException("Movimento inválido");
            }
            else{
            a.posX--;
            }
            break;
            case "right":
            if(a.posY >= 10){
                throw new IllegalArgumentException("Movimento inválido");
            }
            else{
            a.posX++;
            }
            break;
            default:
            System.out.println("Movimento não indentificado");
            break;
        }
    }
        public void mover(int czin) {
        switch(czin){
            case 1:
            a.posY++;
            break;
            case 2:
            a.posY--;
            break;
            case 4:
            a.posX--;
            break;
            case 3:
            a.posX++;
            break;
            default:
            System.out.println("Movimento invalido");
            break;
            
        }
    }
    
}*/