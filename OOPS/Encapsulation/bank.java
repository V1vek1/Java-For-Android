// package OOPS.Encapsulation;

class Account {
    public String name;
    protected String email;
    private String password;

    //getters and setters
public String getPassword(){
    return this.password;
}

public void setPassword(String pass){
        this.password = pass;
}
}
public class bank {
   public static void main(String[] args) {
     Account account1 = new Account();
     account1.name ="Apna College";
     account1.email = "apnacollege@gmail.com";
     account1.setPassword("12345");
     System.out.println(account1.getPassword());
   }
}
