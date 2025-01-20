public class Turtle {
    public int posX;
    public int posY;
    public String cor;
    public int comidas;

    
    public Turtle(int posX, int posY, String cor) {
        this.posX = posX;
        this.posY = posY;
        this.cor = cor;
        this.comidas = 0; 
    }

    public Turtle(String cor) {
        this(0, 0, cor);
    }
    public void setPos(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }
    public int getPosX(){
        return posX;
    }
    public int getPosY(){
        return posY;
    }
    public int getComidas() {
        return comidas;
    }
    public void comer() {
        comidas++;
    }
}
