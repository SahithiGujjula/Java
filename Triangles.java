package com.company;

public class Triangles {
    int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 1},
            {1, 2, 3, 4, 6},
            {6, 7, 8, 9, 1},
            {1, 2, 3, 4, 5}
    };
    int rows = matrix.length;
    int cols = matrix[0].length;

    public void myMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void reverseRightTriangle(){
        for(int i=rows-1; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void reverseLeftTriangle(){
        for(int i=rows-1; i>=0; i--){
            for(int j=0; j<cols ; j++){
                if((rows-1)-i <= j){
                    System.out.print(matrix[i][j] + " ");
                }else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void rightTriangle(){
        for (int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void leftTriangle() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols; j++) {

                if ((rows - 1) - i <= j){
                    System.out.print(matrix[i][j]+" ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        Triangles t = new Triangles();
        t.myMatrix();
        System.out.println();
        t.reverseLeftTriangle();
        t.reverseRightTriangle();
        t.rightTriangle();
        t.leftTriangle();

    }
}