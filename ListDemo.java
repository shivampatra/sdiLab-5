import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ListDemo{
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // List li = new ArrayList();
        // li.add("Apple");
        // li.add(false);
        // li.add(12.88);
        // li.add(123);
        // li.add(new Date());
        // // System.out.println(li);

        // for(Object obj:li){
        //     if(obj instanceof  String){
        //         String str = (String)obj;
        //         System.out.println(str);
        //     }
        //     else if(obj instanceof Integer){
        //         int n = (int)obj;
        //         System.out.println(n);
        //     }
        //     }
  
        List<String> li = new ArrayList<String>();
        li.add("Apple");
        li.add("false");
        li.add("12.88");
        li.add("123");
        li.add(new Date().toString());

        System.out.println(li);
        li.clear();
        System.out.println(li.contains("12.88"));    
        System.out.println(li); 
  
  
  
  
    }
}