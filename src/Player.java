
public class Player {
     private int damage;
     private int health;
     private int money;
     private String name;
     private String charName;

     private Inventory inventory;

     
     

     public Player(String name)
     {
          this.name = name;
          this.inventory = new Inventory();
     }

     public void setInventory (Inventory inventory)
     {
          this.inventory = inventory;
     }

     public Inventory getInventory()
     {
          return this.inventory;
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

          System.out.println("Karakterler : ");
          System.out.println("-----------------------");



          for (GameChar gameChar : charList) {
               gameChar.showInfo();
               System.out.println("-----------------------");
          }

          System.out.println("-----------------------");

          System.out.println("Lütfen bir karakter seçiniz :");

          int selectChar = Game.input.nextInt();

          switch(selectChar)
          {
               case  1 :
                    initPlayer(new Samurai());
                    break;
               case  2 :
                    initPlayer(new Archer());
                    break;
               case  3 :
                    initPlayer(new Knight());
                    break;
               default :
                    initPlayer(new Samurai());
               
          }
          System.out.println("Seçtiğiniz karakter : " + this.getCharName());

     }

     public void initPlayer(GameChar gameChar)
     {
          this.setCharName(gameChar.getName());
          this.setDamage(gameChar.getDamage());
          this.setHealth(gameChar.getHealth());
          this.setMoney(gameChar.getMoney());
     }

     public Location location = null;

     public void selectLoc()
     {
          
          Location[] locList = {new ToolStore(this, damage), new Safehouse(this,damage)};

          System.out.println("Lütfen bir lokasyon seçiniz : ");

          for (int i = 0; i < locList.length; i++) {
               System.out.println(locList[i].getName());
          }

          int selectLoc = Game.input.nextInt();

          switch(selectLoc)
          {
               case  1 :
                    location = new ToolStore(this,damage);
                    break;
               case  2 :
                    location = new Safehouse(this,damage);
                    break;
               default :
                    location = new Safehouse(this,damage);

          }

          location.onLocation();

          System.out.println("Seçtiğiniz lokasyon : " + locList[selectLoc-1].getName());

          if(!location.onLocation())
          {
               System.out.println("Oyun bitti");
               return;
          }
     }

}
