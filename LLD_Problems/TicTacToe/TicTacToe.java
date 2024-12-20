package Patterns.LLD_Problems.TicTacToe;

import Patterns.LLD_Problems.TicTacToe.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToe {

    public Board gameBoard;
    public Deque<Player> players;


    public void initialize(){
        players=new LinkedList<>();
        PlayingPieceO nought=new PlayingPieceO();
        PlayingPieceX cross=new PlayingPieceX();
        Player player1=new Player("Deepak",cross);
        Player player2=new Player("Leonor",nought);
        players.add(player1);
        players.add(player2);
        gameBoard=new Board(3);

    }
    public String startGame(){
        boolean noWinner=true;
        while(noWinner){
            Player playerTurn=players.removeFirst();
            gameBoard.printBoard();
            if(gameBoard.getFreeCells().isEmpty()){
                noWinner=false;
                continue;
            }

            System.out.println("Player : "+playerTurn.getPlayerName()+" Please enter the row and Columns :");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String[] value=s.split(",");
            int row=Integer.parseInt(value[0]);
            int col=Integer.parseInt(value[1]);
            boolean isAlreadyThere=gameBoard.addPiece(row,col, playerTurn.playingPiece);
            if(!isAlreadyThere){
                System.out.println("Please This Position is already filled Please try again... !!");
                players.addFirst(playerTurn);
                continue;
            }
            players.add(playerTurn);
            boolean isWinner=isThereWinner(row,col,playerTurn.playingPiece.pieceType);

            if(isWinner){
                gameBoard.printBoard();
                return playerTurn.getPlayerName();
            }


        }
        return "Match Tie...";
    }
    public boolean isThereWinner(int row,int col,PieceType pieceType){
        boolean rowMatch=true;
        boolean colMatch=true;
        boolean diagonalMatch=true;
        boolean antiDiagonalMatch=true;

        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[i][col]==null ||  gameBoard.board[i][col].pieceType!=pieceType){
                colMatch=false;
            }
        }
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[row][i]==null ||  gameBoard.board[row][i].pieceType!=pieceType){
                rowMatch=false;
            }
        }

        for(int i=0,j=0;i< gameBoard.size && j< gameBoard.size;i++,j++){
            if(gameBoard.board[i][j]==null ||  gameBoard.board[i][j].pieceType!=pieceType){
                diagonalMatch=false;
            }
        }
        for(int i=0,j=gameBoard.size-1;i< gameBoard.size && j>=0;i++,j--){
            if(gameBoard.board[i][j]==null ||  gameBoard.board[i][j].pieceType!=pieceType){
                antiDiagonalMatch=false;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
