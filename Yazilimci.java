
public class Yazilimci extends Calisan{
    
    
    private String diller;
    public Yazilimci(String ad,String soyad,int id,String diller)
    {
        super(ad,soyad,id);
        this.diller=diller;
    }
    
    public void formatat(String isletimsistemi)
    {
        System.out.println(getAd()+" " + isletimsistemi +"'ni yüklüyor...");
    }
    
    
    
    public void bilgilerigoster()//override
    {
        super.bilgilerigoster();
        System.out.println("Yazılımcının bildiği diller: "+diller);
        
    }
    
}
