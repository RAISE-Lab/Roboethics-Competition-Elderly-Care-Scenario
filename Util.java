import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Util {    
    public static String[] getNames(Entity[] arr){
        String[] out = new String[arr.length];
        for (int i = 0; i < arr.length ; i++){
            out[i] = arr[i].name;
        }
        return out;
    }   
}
