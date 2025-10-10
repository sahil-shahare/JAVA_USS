package Interface;

public class Interface_0 {
    public static void main(String[] args) {
        I_UPI ip = new Phone_pe();

        System.out.println(ip.sendmoney_to_account("123456", 40002.53));
    }
}

interface I_UPI {
    double total = 0;

    public String sendmoney_to_account(String account_number, double amount);

    public String recievemoney(String number, double amount);
}

class Phone_pe implements I_UPI {
    double total = 0;

    @Override
    public String sendmoney_to_account(String account_number, double amount) {
        return "Money send to: " + account_number + " Amount : " + amount;
    }

    @Override
    public String recievemoney(String number, double amount) {
        this.total = amount;
        return null;
    }
}