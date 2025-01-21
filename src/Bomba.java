public class Bomba extends Obst{
    Turtle a;
    Turtlehighiq b;

    public void bater(Turtle a){
         if((posX == a.posX) && (posY == a.posY)){
            a.ingame = false;
         }
    }
    public void bater(Turtlehighiq b){
         if((posX == b.posX) && (posY == b.posY)){
            b.ingame = false;
         }       
    }
}
