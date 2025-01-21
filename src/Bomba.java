public class Bomba extends Obst{


    public void bater(Turtle a){
         if((posX == a.posX) && (posY == a.posY)){
            a.ingame = false;
            posX = -1;
            posY = -1;
         }
    }
    public void bater(Turtlehighiq b){
         if((posX == b.posX) && (posY == b.posY)){
            b.ingame = false;
            posX = -1;
            posY = -1;
         }       
    }
}
