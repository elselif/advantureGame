public class Weapon {
     private String name;
     private int id;
     private int damage;
     private int price;

     public Weapon(int id, int damage, int price, String name)
     {
          this.id = id;
          this.damage = damage;
          this.price = price;
          this.name = name;
     }


     public void setId(int id)
     {
          this.id = id;
     }

     public int getId()
     {
          return this.id;
     }

     public void setDamage(int damage)
     {
          this.damage = damage;
     }

     public int getDamage()
     {
          return this.damage;
     }

     public void setPrice(int price)
     {
          this.price = price;
     }

     public int getPrice()
     {
          return this.price;
     }

     public void setName(String name)
     {
          this.name = name;
     }

     public String getName()
     {
          return this.name;
     }

     public static Weapon[] weapons()
     {
          Weapon[] weapons = new Weapon[3];
          weapons[0] = new Weapon(1, 10, 10,"tabanca");
          weapons[1] = new Weapon(2, 20, 200,"kılıç");
          weapons[2] = new Weapon(3, 30, 300,"tüfek");

          return weapons;
     }

     public static Weapon getWeaponObj(int id)
     {
          for(Weapon w : Weapon.weapons())
          {
               if(w.getId() == id)
               {
                    return w;
               }
          }

          return null;
     }



}
