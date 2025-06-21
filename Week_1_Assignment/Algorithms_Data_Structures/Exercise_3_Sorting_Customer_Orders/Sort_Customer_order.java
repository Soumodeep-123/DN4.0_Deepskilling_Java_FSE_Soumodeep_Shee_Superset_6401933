//package practise.Algorithms_Data Structures.Exercise 3_Sorting Customer Orders;

class order{
    int orderId;
    String customerName;
    double totalPrice;

    public order(int orderId, String customerName, double totalPrice){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
    public void display(){
        System.out.println("Order ID: " + orderId + " Customer Name: " + customerName + " Total Price: " + totalPrice);
    }
}

public class Sort_Customer_order {

    public static void bubble_sort(order o[]){
        int n = o.length;
        for( int i = 0; i< n-1 ; i++){
            for(int j = 0; j< n-i-1 ; j++){
                if(o[j].totalPrice > o[j+1].totalPrice){

                    order temp = o[j];
                    o[j] = o[j+1];
                    o[j+1] = temp;
                }
            }
        }
    }

    public static void quicksort(order o[], int low, int high) {
        if (low < high) {
            int p = partition(o, low, high);
            quicksort(o, low, p - 1);
            quicksort(o, p + 1, high);
        }
    }

    public static int partition(order o[], int low, int high){
        double p = o[high].totalPrice;
        int i = low - 1; 
        for(int j = 0; i<j ; i++){
            if(o[j].totalPrice <= p){
                i++;
                order temp = o[i];
                o[i] = o[j];
                o[j] = temp;
            }
        }

        order temp = o[i+1];
        o[i+1] = o[high];
        o[high] = temp;
        return i+1;
    }




    public static void display(order o[]){
        int n = o.length;
        for(int i = n-1; i>= 0; i--){
            o[i].display();
        }
    }


    public static void main(String args[]) {
        order o[] = {
            new order(1, "Ram", 100),
            new order(2, "Juli", 900),
            new order(3, "don", 500),
            new order(4, "Rahul", 300),
            new order(5, "Koyel", 480),
            new order(6, "Sam", 600),
        };

        for (int i = 0; i < o.length; i++) {
            System.out.println("Order ID: " + o[i].orderId + ", Customer: " + o[i].customerName + ", Price: " + o[i].totalPrice);
        }

        System.err.println("before sort" );
        display(o);
        //System.err.println("after bubble sort" );
        //bubble_sort(o);
        //display(o);
        
        System.err.println("before sort" );
        display(o);
        System.err.println("after quick sort" );
        bubble_sort(o);
        display(o);

    }
    
}
