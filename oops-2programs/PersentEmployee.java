public class PersentEmployee extends Man{
    private int id;
    private int esal;
    private int tax;
    public PersentEmployee(int id, int esal, int tax){
        this.id=id;
        this.esal=esal;
    }
    public int gettax(){
        return tax;
    }
    public void settax(int tax){
        this.int tax=tax;
    }
    public int needs(){
        int gross_needs=this.sal this sal/100*this.gettax();
        return gross_needs;
    }
}