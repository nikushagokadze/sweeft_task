class HelloWorld {
    static int wrap(int leftStears){
        if(leftStears<=0){
            return 1;
        }
        if(leftStears>1){
            return wrap(leftStears-1)+wrap(leftStears-2);
        }
        else {
            return wrap(leftStears-1);
        }
    }
    static int countVariants(int stearsCount)
    {  
        if(stearsCount==0)return 0;
        else return wrap(stearsCount);
    }
    public static void main(String[] args) {
        int a=4;
        System.out.println(countVariants(a));
    }
    
}