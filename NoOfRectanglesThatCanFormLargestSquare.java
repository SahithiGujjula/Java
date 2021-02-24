public class NoOfRectanglesThatCanFormLargestSquare {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int count = 0;
        for(int[]rectangle: rectangles){
            int len = Math.min(rectangle[0],rectangle[1]); //when i=0,[2,3]--> len=2
            //when i=3,[3,7]-->len=3
            if(len>maxLen){ //here len>maxLen--> 2>0,3>0
                maxLen = len; //therefore maxLen=2 changes to maxLen=3 when i=1
                count = 1;
            }
            else if(len==maxLen){ //len=maxLen i.e 3 when i=2
                count++;    //count =1+1+1
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NoOfRectanglesThatCanFormLargestSquare n = new NoOfRectanglesThatCanFormLargestSquare();
        int num = n.countGoodRectangles(new int[][]{{2,3},{3,7},{4,3},{3,7}});
        System.out.println(num);
    }
}
