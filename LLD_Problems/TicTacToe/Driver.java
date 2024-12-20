package Patterns.LLD_Problems.TicTacToe;
public class Driver {
    public static void main(String[] args){

        TicTacToe ticTacToe=new TicTacToe();
        ticTacToe.initialize();
        System.out.println("Player won is : "+ticTacToe.startGame());


    }

}
