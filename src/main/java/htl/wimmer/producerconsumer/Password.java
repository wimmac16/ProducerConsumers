package htl.wimmer.producerconsumer;


public class Password {
    private String pwd;

    public Password(String pwd) {
        this.pwd = pwd;
    }
    
   public boolean check(String pw){
       return pw.equals(pwd);
   }
}
