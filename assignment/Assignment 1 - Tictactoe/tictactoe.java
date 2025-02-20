import java.util.Scanner;

public class tictactoe {
    public static char board[] = {
        '_' , '_', '_',
        '_' , '_', '_',
        '_' , '_', '_'
    };

    public static Scanner scan = new Scanner(System.in);

    public static void cls(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.print(" " + board[i * 3 + j] + " "); 
                if (j < 2) {
                    System.out.print("|"); 
                }
            }
            System.out.println(); 
            if (i < 2) {
                System.out.println("---|---|---");
            }
        }
    }

    public static boolean placeOnBoard(int x , int y, int i){
        if(x < 0 || x > 2 || y < 0 || y > 2 || board[y * 3 + x] != '_'){
            System.out.println("Not Valid Input!");
            return false;
        }

        //player 1 = O , player 2 = X
        board[3 * y + x] = i == 1 ? 'O' : 'X';

        return true;
    }

    public static boolean winningGame(int pos){
        char check = pos == 1 ? 'O' : 'X';

        //check row
        for(int i = 0; i <= 6 ; i += 3){
            if(board[i] == check && board[i + 1] == check && board[i + 2] == check){
                return true;
            }
        } 
        //check collumn
        for(int i = 0 ;i < 3 ; i++){
            if(board[i] == check && board[i + 3] == check && board[i + 6] == check){
                return true;
            }
        }
        //check diagonal
        if(board[0] == check && board[4] == check && board[8] == check){
            return true;
        }

        if(board[2] == check && board[4] == check && board[6] == check){
            return true;
        }
        //tidak ada yang cocok
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Lets Play Tic Tac Toe");
        int x , y;
        int i = 1;
        boolean draw = true;
        int count = 0;
        while (true) { 
            printBoard();
            if(i == 1){
                System.out.println("Player 1");
            }else{
                System.out.println("Player 2");
            }
            System.out.print("Enter the row position you want to input [1 - 3]: "); 
            y = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the column position you want to input [1 - 3]: ");
            x = scan.nextInt();
            scan.nextLine();
            x--;
            y--;

            if(!placeOnBoard(x, y, i)){
                // System.out.println("Not Valid move");
                scan.nextLine();
                cls();
                continue;
            }

            if(winningGame(i)){
                cls();
                printBoard();
                System.out.println("Player " + i + "win");
                draw = false;
                break;
            }   

            i = i == 1 ? 2 : 1;
            count++;
            //cls
            cls();  

            if(count == 9){
                break;
            }
        }

        if(draw){
            printBoard();
            System.out.println("Game draw");
        }
    }

}
