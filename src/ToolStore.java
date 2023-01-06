public class ToolStore extends NormalLocation{
 
     public ToolStore(Player player,int id) {

          
          super(player, "Mağaza",2);
     }

     


     @Override
     public boolean onLocation()
     {
          System.out.println("mağazaya hoşgeldiniz!");
          System.out.println("1- Silahlar");
          System.out.println("2- Zırhlar");
          System.out.println("3- Çıkış");
          System.out.println("Seçiminiz : ");
          int selectCase = Location.input.nextInt();

          while(selectCase <1 || selectCase > 3)
          {
               System.out.println("Geçersiz seçim");
               System.out.println("Seçiminiz : ");
               selectCase = Location.input.nextInt();
          }

          switch(selectCase)
          {
               case 1:
                    printWeapon();
                    break;
               case 2: 
                    printArmor();
                    break;
               case 3:
                    System.out.println("Bir daha bekleriz");
                    return true;
          }

          return true;
     }

     public void printWeapon()
     {
          System.out.println("-------Silahlar-------  ");

          for(Weapon w : Weapon.weapons())
          {
               System.out.println(w.getId() + ": " + w.getName() + " : " + w.getDamage()  +  ":" + w.getPrice());
          }

          System.out.println("Seçiminiz : ");

          int selectWeapon = Location.input.nextInt();

          while(selectWeapon < 1 || selectWeapon > 3)
          {
               System.out.println("Geçersiz seçim");
               System.out.println("Seçiminiz : ");
               selectWeapon = Location.input.nextInt();
          }

          Weapon selectedWeapon = Weapon.getWeaponObj(selectWeapon);

          if(selectedWeapon != null)
          {
               if(selectedWeapon.getPrice() > this.getPlayer().getMoney())
               {
                    
                    System.out.println("Yeterli paranız yok");
               }
               else
               {
                    //satın alma işlemi
                    System.out.println(selectedWeapon.getName() + " silahını aldınız");
                    int balance  = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki silahanız: " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni silahanız: " + this.getPlayer().getInventory().getWeapon().getName());
               }
          }

          
          
     }






     public void printArmor()
     {
          System.out.println("-------Zırhlar-------");
     }




}

