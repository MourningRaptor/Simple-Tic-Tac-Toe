import java.util.Scanner;

//import java.io.IOError;
//import java.io.IOException;

public class Tester{


    public static void main(String args []){
        //Character[][] gameBoard  = new Character[3][3];
        int moves = 0;
        Scanner scan = new Scanner(System.in);
        Game newGame = new Game();
        newGame.intializeBoard();
        System.out.println("Tic Tac Toe!");
        System.out.println("");
        System.out.println("Current board:");
        newGame.printBoard();
        int row;
        int col;
       // do{
           while(!newGame.checkForWin()){
               
               System.out.println("MOVES: " + moves);
               moves++;

                System.out.println("Player " + newGame.getCurrentPlayerMarker() + " select which row and column you want to place your mark on.");
                row = scan.nextInt() - 1;
                col = scan.nextInt() - 1;
                while(newGame.placeMark(row, col) == false){

                    System.out.println("Spot already taken. Try again.");
                    row = scan.nextInt() - 1;
                    col = scan.nextInt() - 1;
                }
                if(newGame.isBoardFull(moves)){
                    System.out.println("The game was a tie!");
                    break;
                }
            newGame.printBoard();
            newGame.changePlayer();
           }
           newGame.changePlayer();

           if(!newGame.isBoardFull(moves)){
               System.out.println("Player " + newGame.getCurrentPlayerMarker() + " wins!");
           }


      //  }
       // while(!newGame.placeMark(row, col));

      

    }
}