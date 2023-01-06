public abstract class NormalLocation extends Location {
     
     public NormalLocation(Player player,String name,int id)
     {
          super(player,name,id);
     }

     @Override
     boolean onLocation() {
          System.out.println("Normal Location");
          return true;
     }
}
