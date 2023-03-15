import java.util.Arrays;
class HelloWorld {
    public static int notContains(int[]array){
        //sort
        Arrays.sort(array);
        int res = 1;
        while(true){
        for(int i=0;i<array.length;i++){
            if(res==array[i]){
                res++;
                break;
            }
            if(i==array.length-1)
            return res;
        }
        if(res == array[array.length-1]) break;
        }
        return array[array.length-1]+1;
    }
    public static void main(String[] args) {
        int[] myNum = {-5, 0,1,30,3, 5, 40,1,2};
        System.out.println(notContains(myNum));
    }
    
}