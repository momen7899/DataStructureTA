package com.datastructure;


import java.util.*;

public class Sudoku {

    private final int[][] sudoku = new int[9][9];

    public void solve() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = input.nextInt();
            }
        }

        if (solveSudoku()) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++)
                    System.out.print(sudoku[i][j] + " ");
                System.out.println("");
            }
        } else {
            System.out.println("No soultion exists");
        }
    }

    boolean isSafe(int col, int row, int num) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == num) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == num)
                return false;
        }
        col /= 3;
        col *= 3;
        row /= 3;
        row *= 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[i + row][j + col] == num)
                    return false;
            }
        }
        return true;
    }

    boolean solveSudoku() {
        int row = 0;
        int col = 0;
        boolean isEmpty = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    isEmpty = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if (isEmpty)
                break;
        }
        if (!isEmpty)
            return true;

        for (int num = 1; num <= 9; num++) {
            if (isSafe(col, row, num)) {
                sudoku[row][col] = num;
                if (solveSudoku())
                    return true;
                else {
                    sudoku[row][col] = 0;
                }
            }
        }
        return false;
    }
}
