class HelloWorld {
    static String add(String str1, String str2)
    {  
        int s = 0;
        int c = 0;
        int l1 = str1.length()-1;
        int l2 = str2.length()-1;
        StringBuilder res =  new StringBuilder();
        while(true){
            s = c;
            if(l1>=0){
                s = s+str1.charAt(l1)-'0';
            }
            if(l2>=0){ 
                s = s+str2.charAt(l2)-'0';
            }
            l1=l1-1;
            l2=l2-1;
            int tmp = s%2;
            c = s/2;
            res.append((char)(tmp+'0'));
            if(l1<0 && l2<0 && c != 1) break;
        }
        String r = res.reverse().toString();
        return r;
    }
    public static void main(String[] args) {
        System.out.println(add("1010","1111"));
    }
    
}