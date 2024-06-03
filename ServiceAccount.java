public class ServiceAccount extends Account{
    private int min_bal =500;

    public int getmin_bal(){
        return min_bal;
    }
    public void setmin_bal(int min_bal){
        this.min_bal = min_bal;
    }
      public int tot_bal(){
        int bal=this.getacc_sal();
         getmin_bal();
        return bal;
      }

}