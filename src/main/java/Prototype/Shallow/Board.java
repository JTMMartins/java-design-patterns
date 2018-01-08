package Prototype.Shallow;

import java.util.Random;
import java.util.UUID;

public class Board {

    private static Hero[][] board= new Hero[20][20];
    private static Random rand=new Random();

    public Hero add (Hero hero){

        int x=0,y=0;
        boolean positionAvailable=false;

        while(positionAvailable==false) {
             x=randomX();
             y=randomY();
            positionAvailable=isEmpty(x,y);
        }

        hero.setID(UUID.randomUUID());
        board[x][y]=hero;
        return board[x][y];
    }

    public int randomX(){
        return rand.nextInt(21);
    }

    public int randomY(){
        return rand.nextInt(21);
    }

    public boolean isEmpty(int x, int y){
        if (board[x][y]==null){
            return true;
        }
        return false;
    }
}
