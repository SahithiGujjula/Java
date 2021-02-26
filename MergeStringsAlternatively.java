public class MergeStringsAlternatively {
    public String mergeAlternately(String w1, String w2) {
        char [] c=new char[w1.length()+w2.length()]   ;
        int i=0,j=0;
        while(i<w1.length()&&i<w2.length()){

            c[j++]=w1.charAt(i);
            c[j++]=w2.charAt(i);
            i++;
        }
        while(i<w1.length()){

            c[j++]=w1.charAt(i++);

        }
        while(i<w2.length()){

            c[j++]=w2.charAt(i++);

        }

        return new String(c);

    }

    public static void main(String[] args) {
        MergeStringsAlternatively ms = new MergeStringsAlternatively();
        String res = ms.mergeAlternately("Diary","milk");
        System.out.print(res);
    }
}
