
import java.util.HashMap;
import java.util.Scanner;

//package practise.Algorithms_Data Structures.Exercise 1_Inventory Management System;

class product {
    int productId;
    String productName;
    int quantity;
    double price;

    public product(int productId,String productName, int quantity, double price){
        this.productId = productId;
        this .productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void display(){
        System.out.println("Id: " + productId + "  Name: " + productName + "  Quantity: " + quantity + "  Price: " + price);
    }
}

class inventoryoperation{
    private HashMap<Integer, product> inventory = new HashMap<>();

    public void addproduct(product p){
        if(inventory.containsKey(p.productId)){
            System.out.println(" already exists.");
        } else {
            inventory.put(p.productId, p);
            System.out.println("Product added successfully.");
        }

    }

    public void update(int productId,String productName, int quantity, double price){
        product p = inventory.get(productId);
        if(p != null){
            p.productName = productName;
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated ");
        } else{
            System.err.println("Product not found");
        }
    }

    public void delete(int productId){
        if(inventory.containsKey(productId)){
            inventory.remove(productId);
            System.out.println("Product deleted successfully.");
        } else {
            System.err.println("Product not found");
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (product p : inventory.values()) {
                p.display();
            }
        }
    }

}

public class Inventory_management {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        inventoryoperation i = new inventoryoperation();
        boolean flag = true;
        
        while(flag){
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Product Id ");
                    int id = sc.nextInt();
                    System.out.print("Enter Product name ");
                    String name = sc.next();
                    System.out.print("Enter Product Quantity ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Product price ");
                    double price = sc.nextDouble();
                    product p = new product(id, name, quantity, price);
                    i.addproduct(p);
                    break;

                case 2:
                    System.out.print("Enter Product Id to update" );
                    int uid = sc.nextInt();
                    System.out.print("Enter Product name ");
                    String uname = sc.next();
                    System.out.print("Enter Product Quantity ");
                    int uquantity = sc.nextInt();
                    System.out.println("Enter Product price ");
                    double uprice = sc.nextDouble();
                    //product p1 = new product(uid, uname, uquantity, uprice);
                    i.update(uid, uname, uquantity, uprice);
                    break;

                case 3:
                    System.out.print("Enter Product Id to delete ");
                    int d = sc.nextInt();
                    i.delete(d);
                    break;

                case 4:
                    System.out.println("Products in inventory : " );
                    i.displayInventory();
                    break;

                case 5:
                    System.out.println("Exit.");
                    flag = false;
                    break;

                default:
                    System.out.println("Try again");
            }
        }

    }
}
