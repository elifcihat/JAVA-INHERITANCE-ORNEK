
public class Yonetici extends Calisan{
    
    private int sorumlukisisayisi;
    
    public Yonetici(String ad,String soyad,int id,int sorumlukisisayisi)
    {
        super(ad,soyad,id);
        this.sorumlukisisayisi=sorumlukisisayisi;
        
    }
    
    public void bilgilerigoster()
    {
        super.bilgilerigoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı :"+sorumlukisisayisi);
    }
    
    public void zamyap(int zammiktarı)
    {
        System.out.println(getAd()+ zammiktarı +" TL zam yaptı... ");
    }
    
}
