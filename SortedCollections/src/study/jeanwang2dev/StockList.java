package study.jeanwang2dev;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jean on 12/31/20.
 */
public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if( item != null ) {
            // return the item if it is inStock, if not, return item passed in
            // check if we already have quantities of this item
            // if variable inStock equals to item then it means can not find it in the list
            // if variable inStock not equals to item then it means it found it in the list
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // stock item in list, adjust the quantity of the current item with
            // the value prior to addStock function
            if((inStock != item)){
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String itemName, int quantity) {
        StockItem inStock = list.getOrDefault(itemName, null);
        if( inStock != null && inStock.quantityInStock() >= quantity && quantity > 0){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    // return null if not find anything
    public StockItem get(String itemName){
        return list.get(itemName);
    }

    public Map<String, StockItem> getItems(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        // return all the items in the list
        // a complete stock list
        String str = "\nStock List\n";
        double totalCost = 0.0;
        // loop through a map
        for( Map.Entry<String, StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
            str += stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
            str += String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;

        }
        return str + "Total stock value " + totalCost;
    }


}
