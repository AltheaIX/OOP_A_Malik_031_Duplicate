import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("---- Stock Management Meny ----");
            System.out.println("1. ADD NEW ITEM");
            System.out.println("2. DISPLAY ALL ITEMS");
            System.out.println("3. REDUCE ITEM STOCK");
            System.out.println("0. EXIT");
            System.out.print("CHOOSE OPTION: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch(option){
                case 1:
                    try{
                        System.out.print("Enter item name: ");
                        String itemName = scanner.nextLine();
                        System.out.print("Enter item stock: ");
                        int stock = scanner.nextInt();
                        scanner.nextLine();

                        items.add(new Item(itemName, stock));
                        System.out.printf("Item %s successfully added.\n",  itemName);
                    } catch (InputMismatchException e) {
                        System.out.println("Stock input must be a number");
                        scanner.nextLine();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("---- ITEM LIST (STOCK) ----");

                    int i = 0;
                    for(Iterator<Item> itemsIterator = items.iterator(); itemsIterator.hasNext(); i++){
                        Item currentItem = itemsIterator.next();
                        System.out.printf("%d. Name: %s, Stock: %d\n", i, currentItem.getName(),  currentItem.getStock());
                    }
                    System.out.println();
                    break;
                case 3:
                    try {
                        System.out.println("---- REDUCE ITEM STOCK (SELECT TO REDUCE STOCK) ----");
                        System.out.print("Enter item index: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        Item currentItem = items.get(index);

                        System.out.print("Enter the amount of stock to reduce: ");
                        int amountToReduce = scanner.nextInt();

                        if(currentItem.getStock() < amountToReduce){
                            throw new InsufficientStockException("Stock must be higher than amount to reduce");
                        }

                        int reducedStock = currentItem.getStock() - amountToReduce;
                        currentItem.setStock(reducedStock);
                        System.out.printf("%s successfully reduced. Remaining Stock: %d\n", currentItem.getName(), reducedStock);
                    } catch(InsufficientStockException e){
                        System.out.println(e.getMessage());
                    } catch(IndexOutOfBoundsException e){
                        System.out.println("Invalid index.");
                    } catch(InputMismatchException e){
                        System.out.println("Input must be a number");
                        scanner.nextLine();
                    }
                    System.out.println();
                    break;
                case 0:
                    items.clear();
                    scanner.close();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}