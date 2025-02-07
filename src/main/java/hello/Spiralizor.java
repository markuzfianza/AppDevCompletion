package hello;

import java.util.Arrays;

public class Spiralizor {

    public static int[][] spiralize(int size) {
      if (size < 5) {
            return null;  // to make sure minimum is 5x5
      }

        return spiralize(new int[size][size]);  // set the new spiral size
    }

    public static int[][] spiralize(int[][] arr) {    // recursion
        int[][] fill = fill(arr);

        final int height = fill.length;
        final int width = fill[0].length;
        int lastY = height / 2;
        int lastX = width % 2 == 0 ? width / 2 - 1 : width / 2;

        // extra variants
        if (height == 5) {
            lastX = 1;
            lastY = 3;
        } else if ((height - 5) % 4 == 0) {
            lastX--;
            lastY++;
        }

        int y = 1, x = 0, dirX = 1, dirY = 0, i = 0;
        int leftBorder = 0, rightBorder = width - 1;
        int upperBorder = 0, lowerBorder = height - 1;

        while (true) {
            if (x == rightBorder && y == upperBorder + 1) {
                x--;
                y++;
                dirX = 0;
                dirY = 1;
                upperBorder += 2;
            } else if (x == leftBorder && y == lowerBorder - 1) {
                x++;
                y--;
                dirX = 0;
                dirY = -1;
                lowerBorder -= 2;
            } else if (y == lowerBorder && x == rightBorder - 1) {
                y--;
                x--;
                dirX = -1;
                dirY = 0;
                rightBorder -= 2;
            } else if (y == upperBorder && x == leftBorder + 1) {
                y++;
                x++;
                dirX = 1;
                dirY = 0;
                leftBorder += 2;
            }
            fill[y][x] = 0;

            if (y == lastY && x == lastX) {
                break;
            }

            x += dirX;
            y += dirY;
            i++;
        }

        return fill;
    }

  // method for filling each row
    public static int[][] fill(int[][] arr) {
        for (int[] row : arr) {
            Arrays.fill(row, 1);
        }
        return arr;
    }
}



