public class FlipingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        flipImage(A);
        invertImage(A);
        return A;
    }
    public void flipImage(int[][] A){ // to reverse the row
        for(int i=0;i<A.length;i++){
            int n = A[i].length-1; // end--> col size
            int j=0; //start
            while(j<=n){
                int res = A[i][j];
                A[i][j] = A[i][n];
                A[i][n] = res;
                j++;
                n--;
            }
        }
    }
    public void invertImage(int[][] A){ // to replace 1's with 0's and 0's with 1's
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==0)
                    A[i][j]=1;
                else
                    A[i][j]=0;
            }
        }
    }

    public static void main(String[] args) {
        FlipingAnImage f = new FlipingAnImage();
        int[][] res = f.flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}});
        f.print(res);
    }

    public void print(int[][] res) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
