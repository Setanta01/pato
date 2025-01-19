public class MovimentacaoPremium {
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
            a.posY++;
            break;
            case "down":
            a.posY--;
            break;
            case "left":
            a.posX--;
            break;
            case "right":
            a.posX++;
            break;
            default:
            System.out.println("Movimento invalido");
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
    
}