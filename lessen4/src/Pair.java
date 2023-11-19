import java.util.ArrayList;
import java.util.List;
public class Pair<T, V> {
     private T quality;
     private V owner;
    Pair( T  quality, V owner){
        this.quality=quality;
        this.owner=owner;
    }
    public T getQuality(){
        return quality;
    }
    public V getOwner(){
        return owner;
    }
    public void  setQuality(T quality){
        this.quality=quality;
    }
    public void setOwner(V owner){
        this.owner=owner;
    }
    @Override
    public String toString(){
        return "("+ quality + ","+ owner+ ")";
    }

}
