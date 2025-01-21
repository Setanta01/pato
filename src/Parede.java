public class Parede extends Obst {


    public void bater(Turtle a){
         if((posX == a.posX) && (posY == a.posY)){
            a.posX = a.lastX;
            a.posY = a.lastY;
         }
    }
    public void bater(Turtlehighiq b){
         if((posX == b.posX) && (posY == b.posY)){
            b.posX = b.lastX;
            b.posY = b.lastY;
         }       
    }

}
