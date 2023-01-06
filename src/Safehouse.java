public class Safehouse extends NormalLocation {
     public Safehouse(Player player,int id) {
          super(player, "Güvenli Ev",1);
     }

   

     @Override
     public boolean onLocation() {
          System.out.println("güvenli evdesiniz,canınız yenilendi");
          return true;
     }
}
