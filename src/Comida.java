public class Comida {
    public int x;
    public int y;
    public Comida(){}
    public Comida(int x, int y){
        this.x = x;
        this.y = y;
        }
    
    public boolean verificarComida(Turtle a){
        if (a == null){
            throw new IllegalArgumentException("O objeto Turtle não pode ser nulo.");
        }else{
            return this.x == a.posX && this.y == a.posY;
        }
    }
    public boolean verificarComida(Turtlehighiq b){
        if (b == null){
            throw new IllegalArgumentException("O objeto Turtle não pode ser nulo.");
        }else{
            return this.x == b.posX && this.y == b.posY;
        }
    }
    }
