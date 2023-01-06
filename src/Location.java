import java.util.Scanner;

public abstract class Location {
     private Player player; // Location sınıfı içerisinde Player sınıfından bir nesne oluşturduk.
     private String name;
     private int id;

     public static Scanner input = new Scanner(System.in);

     public Location(Player player, String name,int id)
     {
          this.player = player;
          this.name = name;
          this.id = id;
     }

     public void setName(String name)
     {
          this.name = name;
     }

     public String getName()
     {
          return this.name;
     }

     public void setPlayer(Player player)
     {
          this.player = player;
     }

     public Player getPlayer()
     {
          return this.player;
     }

     abstract boolean onLocation(); // Location sınıfı içerisinde onLocation() adında bir abstract metot oluşturduk. tüm alt sınıfları bu metodu override edecekler.

     

}
