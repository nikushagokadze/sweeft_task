import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class my_data_structure {
    private Map<Integer, Integer> for_index;
    private ArrayList<Integer> resizable_array;
 
    public my_data_structure() {
        for_index = new HashMap<Integer,Integer>();
        resizable_array = new ArrayList<Integer>();
    }
    public int size(){
        return resizable_array.size();
    }
    public int get(int a){
        for (int key : for_index.keySet()) {
                if(for_index.get(key) == a){
                    return key;
                }
        }
        return -1;
    }
    public void add(int a) {
        if(for_index.containsKey(a)){
            System.out.println("element already exists");
        }
        else {
            int s = resizable_array.size();
            for_index.put(a, s);
            resizable_array.add(a);
        }
    }
    public void remove(int a) {
        if(!for_index.containsKey(a)){
            System.out.println("element does not exists");
        }else{
            int last_element_idx = resizable_array.size() - 1;
            int last_element = resizable_array.get(last_element_idx);
            int order = for_index.get(a);
            int curr_element = resizable_array.get(order);
            for_index.remove(a);
            resizable_array.set(order, last_element);
            resizable_array.remove(last_element_idx);
            for_index.put(last_element, order);
        }
    }
    public static void main(String[] args) {
        my_data_structure test = new my_data_structure();
        test.add(5);
        test.add(17);
        test.add(80);
        test.add(70);
        test.remove(80);
        test.add(50);
        test.remove(5);
        for(int i=0;i<test.size();i++){
            System.out.println(test.get(i));
        }
    }
}
