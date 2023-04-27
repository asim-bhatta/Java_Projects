import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player" + player + " enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (board[row][col] == ' ') {
                //place the element
                board[row][col] = player;
                gameOver = hasWon(board, player);
                if(gameOver){
                    System.out.println("Player" + player + " has won ");
                }
                else{

                }
            } else {
                System.out.println("Invalid move. Try again!");
            }
        }
    }
    public static void printBoard(char[][] board){

    }
    public static boolean hasWon(char[][] board, char player){

        return false;
    }
}