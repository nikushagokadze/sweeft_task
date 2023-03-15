class HelloWorld {
    static int minSplit(int amount)
    {  
        if(amount<=0){
            return 0;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c =Integer.MAX_VALUE;
        int d =Integer.MAX_VALUE;
        int e = Integer.MAX_VALUE;
        if(amount-1>=0)
        a = minSplit(amount-1)+1;
        if(amount-5>=0)
        b = minSplit(amount-5)+1;
        if(amount-10>=0)
        c = minSplit(amount-10)+1;
        if(amount-20>=0)
        d = minSplit(amount-20)+1;
        if(amount-50>=0)
        e = minSplit(amount-50)+1;
        int k1 = Math.min(a,b);
        int k2= Math.min(c,d);
        int k3=Math.min(k1,k2);
        int k4=Math.min(k3,e);
        return k4;
    }
    public static void main(String[] args) {
        int a=12;
        System.out.println(minSplit(a));
    }
    
}


