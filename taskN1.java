import java.util.*;
class HelloWorld {
    public static int singleNumber(int[]nums){
        Set<Integer> hash_Set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hash_Set.contains(nums[i])){
                hash_Set.add(nums[i]);
            }
            else{
               hash_Set.remove(nums[i]);
            }
        }
        return hash_Set.stream().findFirst().get();
    }
    public static void main(String[] args) {
        int[] myNum = {10, 20,10,30,20, 30, 40,50,40};
        System.out.println(singleNumber(myNum));
    }
    
}