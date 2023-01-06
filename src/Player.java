public class Player {
     private int damage;
     private int health;
     private int money;
     private String name;
     private String charName;

     

     public Player(String name)
     {
          this.name = name;
     }

     public void setCharName(String charName)
     {
          this.charName = charName;
     }

     public String getCharName()
     {
          return this.charName;
     }

     public void setDamage(int damage)
     {
          this.damage = damage;
     }

     public int getDamage()
     {
          return this.damage;
     }

     public void setHealth(int health)
     {
          this.health = health;
     }

     public int getHealth()
     {
          return this.health;
     }

     public void setMoney(int money)
     {
          this.money = money;
     }

     public int getMoney()
     {
          return this.money;
     }

     public String getName()
     {
          return this.name;
     }

     public void selectChar()
     {
          

          GameChar[] charList = {new Samurai(),new Knight(),new Archer()};

          


          for (GameChar gameChar : charList) {
               gameChar.showInfo();
               System.out.println("-----------------------");
          }

          System.out.println("Karakterler: Samuray \t Hasar : 5 \t Sağlık : 21 \t Para : 15");

     }


}
