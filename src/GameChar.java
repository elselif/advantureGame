public abstract class GameChar {
     
          private int id;
          private int damage;
          private int health;
          private int money;
          private String name;

     
          public GameChar(String name,int damage, int health, int money,int id)
          {    
               this.id = id;
               this.name = name;
               this.damage = damage;
               this.health = health;
               this.money = money;
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

          public void setName(String name)
          {
               this.name = name;
          }

          public int getId()
          {
               return this.id;
          }

          public void setId(int id)
          {
               this.id = id;
          }

          public void showInfo()
          {
               System.out.println("Karakter id : " + this.id);
               System.out.println("Karakter adı : " + this.name);
               System.out.println("Karakter hasarı : " + this.damage);
               System.out.println("Karakter canı : " + this.health);
               System.out.println("Karakter parası : " + this.money);
          }
     
          
     
     
}
