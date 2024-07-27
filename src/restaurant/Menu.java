package restaurant;
/**
 * Use this class to test your Menu method. 
 * This class takes in two arguments:
 * - args[0] is the menu input file
 * - args[1] is the output file
 * 
 * This class:
 * - Reads the input and output file names from args
 * - Instantiates a new RUHungry object
 * - Calls the menu() method 
 * - Sets standard output to the output and prints the restaurant
 *   to that file
 * 
 * To run: java -cp bin restaurant.Menu menu.in menu.out
 * 
 */
public class Menu {
    public static void main(String[] args) {

	// 1. Read input files
	// Option to hardcode these values if you don't want to use the command line arguments
	   
        String inputFile = "menu.in";//args[0];
        String outputFile = "menu.out";//args[1];
	String inputFile1 = "stock.in";
        String inputFile2 = "order1.in";
        String inputFile3 = "donate1.in";
        String inputFile4 = "restock1.in";
        String inputFile5 = "transaction3.in";
        // String outputFile1 = "stock.out";
        

        // 2. Instantiate an RUHungry object
        RUHungry rh = new RUHungry();

	// 3. Call the menu() method to read the menu
        rh.menu(inputFile);
        rh.createStockHashTable(inputFile1);
        rh.updatePriceAndProfit();
        // StdIn.setFile(inputFile2);
        // int length = Integer.parseInt(StdIn.readLine());
        // for (int i = 0; i < length; i++) {
        //     int amount = StdIn.readInt();
        //     StdIn.readChar();
        //     String item = StdIn.readLine();
        //     rh.order(item, amount);
        // }
        // StdIn.setFile(inputFile3);
        // int length2 = Integer.parseInt(StdIn.readLine());
        // for (int a = 0; a < length2; a++) {
        //         int amount = StdIn.readInt();
        //         StdIn.readChar();
        //         String item = StdIn.readLine();
        //         rh.donation(item, amount);
        //     }
        //     StdIn.setFile(inputFile4);
        //     int length3 = Integer.parseInt(StdIn.readLine());
        //     for (int j = 0; j < length3; j++) {
        //         int amount = StdIn.readInt();
        //         StdIn.readChar();
        //         String item = StdIn.readLine();
        //         rh.restock(item, amount);
        //     }
            StdIn.setFile(inputFile5);
            int length4 = Integer.parseInt(StdIn.readLine());
            for (int h = 0; h < length4; h++) {
                String type = StdIn.readString();
                StdIn.readChar();
                int amount = StdIn.readInt();
                StdIn.readChar();
                String item = StdIn.readLine();
                if(type.equals("order")){
                        rh.order(item, amount);
                }
                if(type.equals("donation")){
                        rh.donation(item, amount);
                }
                if(type.equals("restock")){
                        rh.restock(item, amount);
                }
            }


	// 4. Set output file
	// Option to remove this line if you want to print directly to the screen
        //StdOut.setFile(outputFile);


	// 5. Print restaurant
        rh.printRestaurant();
    }
}
