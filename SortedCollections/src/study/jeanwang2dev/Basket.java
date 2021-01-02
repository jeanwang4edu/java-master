package study.jeanwang2dev;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jean on 1/2/21.
 */
public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if( item != null && quantity > 0 ) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> getItems(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String str = "\nShopping basket " + name + " contains " + list.size() + " items\n";
        double totalCost = 0.0;
        for( Map.Entry<StockItem, Integer> item : list.entrySet() ){
            str += item.getKey() + ", " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return str + "Total cost " + totalCost;
    }
}
