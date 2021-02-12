public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int l = encoded.length;
        int[] arr = new int[l+1]; // since we have the first item
        arr[0] = first; // new array's first item is already given
        for (int i = 0; i < l; i++) {
            arr[i+1] = arr[i] ^ encoded[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        DecodeXORedArray obj =new DecodeXORedArray();
        int[] r = obj.decode(new int[] {1,2,3}, 1);
        obj.print(r);
        r = obj.decode(new int[]{6,2,7,3}, 4);
        obj.print(r);
    }

    public void print(int[] res){
        for (int num : res) {
            System.out.println(num);
        }
    }

}
