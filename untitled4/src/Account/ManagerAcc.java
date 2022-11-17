package Account;

import java.util.*;

public class ManagerAcc {
    static Scanner scanner = new Scanner(System.in);
    Account account = new Account();
    HashMap<String, Account> accountList = new HashMap();

    public void dangki(Account account1) {
        accountList.put(account.getUsername(), account1);
    }


    public Account creatAcc() {
        Account account1 = new Account();
        System.out.println("nhâp tài khoản");
        String username = scanner.nextLine();
        System.out.println("nhập mật khẩu");
        String password = String.valueOf(scanner.nextLine());
        if (accountList.containsKey(username)) {
            System.out.println("tai khoan đã tồn tại");

        } else {
            account1 = new Account(username, password);
        }
        return account1;
    }

    public void edit() {
        String username = account.getUsername();
        System.out.println("doi mat khau");
        accountList.get(account.getUsername()).setPassword(String.valueOf(scanner.nextLine()));

    }

    public void login() {
        System.out.println("nhap tai khoan");
        String username = scanner.nextLine();
        System.out.println("nhập mật khẩu");
        String password = String.valueOf(scanner.nextLine());
        if (username.equals(accountList.get(account.getUsername()).getUsername())) {
            while (!password.equals(accountList.get(account.getUsername()).getPassword())) {
                System.out.println("sai mat khau vui lòng nhập lại");
                System.out.println("nhập lại mật khẩu");
                password = String.valueOf(scanner.nextLine());
            }
        } else {
            System.out.println("tài khoản không tồn tại vui longf đăng kí ");
        }
    }
}






