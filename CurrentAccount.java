public class CurrentAccount extends Account{
    private int min_bal=1000;

    public int getmin_bal(){
        return getmin_bal;
    }
    public void setmin_bal(int min_bal){
        this.min_bal=min_bal;
    }
     public int cal_back(){
        int bal= this.getacc_bal();
        getmin_bal();
        return bal;
     }

}