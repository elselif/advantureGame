import java.util.Scanner;

public class Game {
     





     public static Scanner input = new Scanner(System.in);

     public void start()
     {
          System.out.println("Macera oyununa hoşgeldiniz");
          System.out.println("Lütfen bir isim giriniz :");
          String playerName = input.nextLine();
          
       

          Player player = new Player(playerName);
          System.out.println("Sayın" + player.getName() + "hoşgeldiniz");

          System.out.println("lütfen bir karakter seçiniz");
          player.selectChar();
          
          while(true)
          {
             player.selectLoc();  
          }

        

          
     }
}
