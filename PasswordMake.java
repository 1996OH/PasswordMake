import java.util.Random;
import java.util.Scanner;

public class Main {	  
  public static void main(String[] args) {
	  String Password ;
	  Scanner scanner = new Scanner(System.in);
      System.out.println("パスワードの桁数を入力してください。");
      int num = scanner.nextInt();
      Password = makePassord(num);
      System.out.println(Password);
      scanner.close();
      System.out.println("完了");
  }

private static String makePassord(int num) {
	  String keyWord[] = new String[4];{
		  keyWord[0] = "abcdefghijklmnopqrstuvwxyz";
		  keyWord[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		  keyWord[2] = "1234567890";
		  keyWord[3] = "!#$%&()@<>?_";
		  }
      Random rand = new Random();
      int num2 = num;
      String newPassword = "";

    for(int i = 0 ; i < num2 ; i++){
      int ramNum  = rand.nextInt(4);
      int ramNum2 = rand.nextInt(keyWord[ramNum].length());
      String key = keyWord[ramNum].substring(ramNum2,(ramNum2 +1));
      newPassword = newPassword + key;
      }
    return newPassword;
  }

}