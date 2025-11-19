import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       String key = "20";
       int hashCode = key.hashCode();
       int tableSize = 16;
       int index = hashCode & (tableSize - 1);

        System.out.println("hashCode : " + hashCode);
        System.out.println("Index Location : " + index);



    }
}