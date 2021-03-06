/**
 * 
 */
package recursion;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ronak Goyal
 *  thanks -Tushar Roy for this code.
 */
public class NQueen {
	
	class Position {
        int row, col;
        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public Position[] solveNQueenOneSolution(int n) {
        Position[] positions = new Position[n];
        boolean hasSolution = solveNQueenOneSolutionUtil(n, 0, positions);
        if (hasSolution) {
            return positions;
        } else {
            return new Position[0];
        }
    }

    private boolean solveNQueenOneSolutionUtil(int n, int row, Position[] positions) {
        if (n == row) {
            return true;
        }
        int col;
        for (col = 0; col < n; col++) {
            boolean foundSafe = true;

            //check if this row and col is not under attack from any previous queen.
            for (int queen = 0; queen < row; queen++) {
                if (positions[queen].col == col || positions[queen].row - positions[queen].col == row - col ||
                        positions[queen].row + positions[queen].col == row + col) {
                    foundSafe = false;
                    break;
                }
            }
            if (foundSafe) {
                positions[row] = new Position(row, col);
                if (solveNQueenOneSolutionUtil(n, row + 1, positions)) {
                    return true;
                }
            }
        }
        return false;
    }

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		NQueen nq = new NQueen();
//System.out.println("Enter n");
//Scanner sc = new Scanner(System.in);
//int input = sc.nextInt();
//Position[] res = nq.solveNQueenOneSolution(input);
//for(int i = 0;i<res.length;i++){
//	System.out.println( res[i].row +","+ res[i].col) ;
//}
//	}
    public static void main(String args[]) {
        NQueen s = new NQueen();
        Position[] positions = s.solveNQueenOneSolution(6);
        Arrays.stream(positions).forEach(position -> System.out.println(position.row + " " + position.col));
    }
}
