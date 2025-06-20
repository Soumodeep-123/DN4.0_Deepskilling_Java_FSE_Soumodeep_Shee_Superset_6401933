

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


public class SearchFunction {

    public static product LinearSearch(product p[], String category, String productName){
        
        for(int i =0; i<p.length; i++){
            if(p[i].category.equalsIgnoreCase(category)){
                if(p[i].productName.equalsIgnoreCase(productName)){
                    return p[i];
                }
            }
        }
        return null;
    }


   
    public static void main(String arg[]) {
        product p[] = {
            new product(1, "Laptop", "Electronics"),
            new product(2, "smartphone", "Electronics"),
            new product(3, "shoes", "Footwear"),
            new product(4, "shirt", "Clothing"),
            new product(5, "tv", "Appliances")
        };

        product r = LinearSearch(p, "Electronics", "laptop");
        product r1 = LinearSearch(p, "Electronics", "pc");
        if(r != null){
            System.err.println("Product found: " + r.productName + " (ID: " + r.productId + ")");
            r.print();
        } else {
            System.err.println("Product not found.");
        }
        if(r1 != null){
            System.err.println("Product found: ");
            r1.print();
        } else {
            System.err.println("Product not found.");
        }
    }
    
}
