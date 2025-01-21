public class Parede extends Obst {
    Turtle a;
    Turtlehighiq b;

    public void bater(Turtle a){
         if((posX == a.posX) && (posY == a.posY)){
            mov.setPos(a.lastX, a.lastY);
         }
    }
    public void bater(Turtlehighiq b){
         if((posX == b.posX) && (posY == b.posY)){
            mov.setPos(b.lastX, b.lastY);
         }       
    }

}
