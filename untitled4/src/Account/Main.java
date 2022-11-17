package Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerAcc managerAcc = new ManagerAcc();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("đăng nhập");
            System.out.println("đăng kí");
            System.out.println("đổi mật khẩu");
            System.out.println("Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    managerAcc.login();
                    break;
                case 2:
                    Account account1 = managerAcc.creatAcc();
                    managerAcc.dangki(account1);
                    break;
                case 3:
                    managerAcc.edit();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
