package Strategy_Design_Pattern.Practice_1;

public class Google_Maps {
    static Google_Maps Route=null;
   public interface Route_Strategy{
       public void getroute(String src, String desc,String mode);
   }
}
