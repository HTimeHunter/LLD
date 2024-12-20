package com.pattern;

/**
 * com.pattern.Order class:
 * It doesn't know the concrete payment strategy that user has picked.
 * It uses common strategy interface to
 * delegate collecting payment data to strategy object.
 * It can be used to save order to DB.
 */
public class Order {
    private int totalCost=0;
    private boolean isClosed=false;

    public void processOrder(PayStrategy payStrategy){
        payStrategy.collectPaymentDetails();
        //here, we can collect and store payment data from strategy.
    }

    public void setTotalCost(int cost){
        this.totalCost+=cost;
    }

    public int getTotalCost(){
        return totalCost;
    }

    public boolean isClosed(){
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
