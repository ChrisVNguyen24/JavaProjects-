/* ChessBoard.java:  Uses nested-loops to draw a chess board with
 * tan and brown squares.
 */

import java.awt.Color;

public class ChessBoard {

    public static void main (String [] args) {

        final int RADIUS = 25,       // squares are 50x50
                  WIDTH = RADIUS*16, // fit window to board size
                  HEIGHT = WIDTH,    // "
                  ROWS = 8,          // Chess boards are 8 x 8
                  COLUMNS = ROWS;    // "
        final Color BROWN = new Color (139,69,19);
        final Color TAN = new Color (210,180,140);

                // Set up the graphics environment

        StdDraw.setCanvasSize(WIDTH,HEIGHT);
        StdDraw.setXscale(0,WIDTH-1);
        StdDraw.setYscale(0,HEIGHT-1);

                // Your code goes here!
        int i,j,k = 0, l = 0;
        
        for(i = 25; i < ROWS * 50; i = i + 50, l++) {
          
          if(l % 2 == 0) k = 0;
          else k = 1;
          
          for(j = 25; j < COLUMNS * 50; j = j + 50) {
          
            if(k % 2 == 0) {
              StdDraw.setPenColor(BROWN);
              StdDraw.filledSquare(j, i, RADIUS);
            
            }
            
            else {
              StdDraw.setPenColor(TAN);
              StdDraw.filledSquare(j, i, RADIUS);
            }
            k++;

          }
        }

    } // main

} // ChessBoard