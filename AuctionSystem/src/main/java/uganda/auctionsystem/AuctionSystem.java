
package uganda.auctionsystem;

        import java.util.Scanner;

/**
 *
 * @author anita
 */

//expected out put if  users enters the following;RegNo: UBA123X  
//Cost: 20,000,000  
//Balance: 3,000,000  

//Bidder1: Emma 21,000,000  
//Bidder2: Anita 23,000,000  
//Bidder3: Peter 22,500,000  

//Deposits: 10,000,000  
//Expenses: 1,000,000

//out  put will show as below;
//Highest Bidder: Anita  
//Winning Bid: 23000000  
//Balance Remaining: 13000000  
//Profit Made: 2000000


        public class AuctionSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Vehicle details
        System.out.print("Enter vehicle registration number: ");
        String regNo = input.nextLine();

        System.out.print("Enter vehicle cost: ");
        double vehicleCost = input.nextDouble();

        System.out.print("Enter balance left on the vehicle: ");
        double balance = input.nextDouble();

        // Bidders
        String highestBidder = "";
        double highestBid = 0;

        for (int i = 1; i <= 3; i++) {
            input.nextLine(); // clear buffer

            System.out.print("\nEnter name of bidder " + i + ": ");
            String name = input.nextLine();

            System.out.print("Enter bid amount: ");
            double bid = input.nextDouble();

            if (bid > highestBid) {
                highestBid = bid;
                highestBidder = name;
            }
        }

        System.out.println("\nHighest Bidder: " + highestBidder);
        System.out.println("Winning Bid: " + highestBid);

        // Deposits and expenses
        System.out.print("\nEnter total deposits made: ");
        double deposits = input.nextDouble();

        System.out.print("Enter total expenses incurred: ");
        double expenses = input.nextDouble();

        // Total investment
        double totalCost = vehicleCost + expenses;

        // Balance after payment
        double remainingBalance = highestBid - deposits;

        // Profit or loss
        double profitOrLoss = highestBid - totalCost;

        // Output
        System.out.println("\n----- VEHICLE SALE SUMMARY -----");
        System.out.println("Registration Number: " + regNo);
        System.out.println("Vehicle Cost: " + vehicleCost);
        System.out.println("Expenses: " + expenses);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Winning Bid: " + highestBid);
        System.out.println("Deposits Paid: " + deposits);
        System.out.println("Balance Remaining: " + remainingBalance);

        if (profitOrLoss > 0) {
            System.out.println("Profit Made: " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss Made: " + Math.abs(profitOrLoss));
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
    

