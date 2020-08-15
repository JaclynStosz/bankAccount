
private class checking extends accountType
{
    public int transferLimit; //num of allotted monthly online transfers
    public boolean autoTransfer; //will money be transfered each month
    public double autoAmount; //amount transfered monthly
    
    public checking(){
        minOpen = 100;
        interest = 0.01;
        transferLimit = 10;
        autoTransfer = false;
        autoAmount = 0;
    }

}
