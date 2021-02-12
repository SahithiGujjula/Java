public class XOROperationsInArray {
    public int xorOperation(int n, int start) {
        int result = 0;
        for(int i =0;i<n;i++){
            result = result ^ (start + 2*i);
        }

        return result;
    }

    public static void main(String[] args) {
        XOROperationsInArray r = new XOROperationsInArray();
        int res = r.xorOperation(5,0);
        System.out.println(res);
        res = r.xorOperation(14,5);
        System.out.println(res);
    }

}
