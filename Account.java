abstract class Account extends Bank{
    private int acc_id;
    private String acc_name;
    private int acc_sal;
     
         public int getacc_id() {
        return acc_id;
    }

    public void setacc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public String getacc_name(){
        return acc_name;
    }
    public void  setacc_name(String acc_name){
        this.acc_name=acc_name;
    }

      public int getacc_sal(){
            return acc_sal;
        }
      public void setacc_sal(int acc_sal){
            this.acc_sal=acc_sal;
        }
    
}