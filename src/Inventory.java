public class Inventory {
    private Weapon weapon;

     public Inventory() {
          this.weapon = new Weapon(0, 0, 0, "yumruk");
     }

     public void setWeapon(Weapon weapon)
     {
          this.weapon = weapon;
     }

     public Weapon getWeapon()
     {
          return this.weapon;
     }

     
}
