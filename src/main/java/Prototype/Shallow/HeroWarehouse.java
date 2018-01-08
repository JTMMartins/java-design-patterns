package Prototype.Shallow;

import java.util.HashMap;
import java.util.Map;


public class HeroWarehouse {

      private static Map<String, Hero> heroShop=new HashMap<>();

      public Hero add(Hero hero){
          String className = hero.getClass().getSimpleName();
          heroShop.put(className,hero);
          return heroShop.get(className);
      }

      public Hero get(String Herotype){
          return heroShop.get(Herotype);
      }
}
