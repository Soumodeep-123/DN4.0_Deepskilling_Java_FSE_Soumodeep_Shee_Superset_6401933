import java.util.*;

class product{
    int productId;
    String productName;
    String category;

    public product(int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void print(){
        System.err.println("Category: " + category);
        System.err.println("Product ID: " + productId + " Product Name: " + productName );
    }
}



public class BinarySearchMethod {

    public static product BinarySearch(List<product> p, String productName){
        
        Collections.sort(p, (p1,p2) -> p1.productName.compareToIgnoreCase(p2.productName));

        int low = 0;
        int high = p.size()-1;
        while(low <= high){
            int mid = (low + high) / 2;
            product midp = p.get(mid);
            int cmp = productName.compareToIgnoreCase(midp.productName);
            
            if(cmp == 0){
                return midp;
            } else if(cmp > 0){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null; 

    }



    public static void main(String arg[]) {
        product prod[] = {
            new product(1, "Laptop", "Electronics"),
            new product(2, "smartphone", "Electronics"),
            new product(3, "shoes", "Footwear"),
            new product(4, "shirt", "Clothing"),
            new product(5, "tv", "Appliances")
        };

        String targetCategory = "Electronics";
        String targetProductName = "Laptop";

        // Filter by category
        List<product> filtered = new ArrayList<>();
        for (product p : prod) {
            if (p.category.equalsIgnoreCase(targetCategory)) {
                filtered.add(p);
            }
        }

        // Binary search by productName in filtered list
        product result = BinarySearch(filtered, targetProductName);
        if (result != null) {
            System.out.println("Product found: " + result.productName + " (ID: " + result.productId + ")");
            result.print();
        } else {
            System.out.println("Product not found.");
        }
    }
    
    
}
