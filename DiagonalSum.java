public class DiagonalSum {

    public int diagonalSum(int[][] mat) {
        int size= mat[0].length; //length of columns --> 3
        int sum = 0;
        int i;
        int j = 0;
        for(i=0;i<size;i++){ //loop for columns
            sum+=mat[i][j];
            j++;
        }
        j = mat.length-1; //length of rows-1 -->3-1=2
        for(i=0;i<size;i++){ //loop for rows
            if(i!=j){
                sum+=mat[i][j];
            }
            j--;
        }
        return sum;
    }

    public static void main(String[] args) {
        DiagonalSum d = new DiagonalSum();
        int result = d.diagonalSum(new int[][] {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}});
        System.out.println(result);
    }
}
