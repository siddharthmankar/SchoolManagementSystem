package school.management.system;

/**
 * Created by Siddharth
 * */

public class Canteen {

    private int id;
    private String inventory;
    private int quantity;
    private int profit;
    private int expenditure;
    private int payexpenditure;
    private int receiveprofit;



    public Canteen(int id,String inventory,int quantity, int expenditure, int profit) {

        this.id=id;
        this.inventory=inventory;
        this.quantity=quantity;
        this.expenditure=expenditure;
        this.profit=profit;
        this.payexpenditure=0;
        this.receiveprofit=0;

    }

    public int getInventoryId() {
        return id;
    }

    public String getInventory() {
        return inventory;
    }

    public int getQuantity(){
        return quantity;
    }

    public void getProfit(int profit) {
    }

    public void getExpenditure(int expenditure) {
    }

    public void payExpenditure(int expenditure) {
        payexpenditure += expenditure;
        School.updateTotalMoneySpent(expenditure);
    }

    public void receiveProfit(int sponsorship) {
        receiveprofit += profit;
        School.updateTotalMoneyEarned(profit);
    }

    @Override
    public String toString() {
        return "Inventory: " + inventory + "\n"+
               "Expenditure: $" + expenditure + "\n"+
                "Profit: $" + profit + "\n";
    }


    public int getProfit() {
        return this.profit;
    }

    public int getExpenditure() {
        return this.expenditure;
    }
}

