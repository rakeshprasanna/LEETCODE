import java.util.Arrays;
//import java.util.Scanner;

public class CodeRun {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int sizeofArray = input.nextInt();
        int[] arr ={2,14,18,22,22};
//        for(int i : arr){
//            arr[i]= input.nextInt();
//            ++i;
//        }
        boolean isDuplicate = containsDuplicate(arr);
        System.out.println(isDuplicate);

    }
    static boolean containsDuplicate(int[] numbs) {
        Arrays.sort(numbs);
        for(int i=0;i<numbs.length-1;++i){
            if(numbs[i]==numbs[i+1]) return true;
        }
        return false;}
}
