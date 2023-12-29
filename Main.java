
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz...");
        String islemler="İşlemler\n"
                        +"1-Yazılımcı İşlemleri\n"
                        +"2-Yönetici İşlemleri\n"
                        +"Çıkış için q basınız...";
        
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");
        
        
        while(true)
        {
            System.out.println("İşlemi seçiniz: ");
            String islem=scanner.nextLine();
            
            if(islem.equals("q"))
            {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1"))
            {
                System.out.println("********Yazılımıcı İşlemleri********");
                Yazilimci yazilimci=new Yazilimci("Elif","Cihat",1,"C Sharp,C");
                String Yazilimciislem="1-Format At\n"
                                     +"2-Bilgileri Göster\n"
                                     +"Çıkış için q basınız...";
                
                System.out.println(Yazilimciislem);
                while(true)
                {
                
                    System.out.println("İşlemi Seçiniz: ");
                    String yislem=scanner.nextLine();
                    
                    
                    if(yislem.equals("q"))
                    {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if(yislem.equals("1"))
                    {
                        System.out.println("İşletim sistemini giriniz:  ");
                        String isletimsistemi=scanner.nextLine();
                        yazilimci.formatat(isletimsistemi);
                    }
                    else if(yislem.equals("2"))
                    {
                        System.out.println("---Yazılımcı Bilgileri---\n");
                        yazilimci.bilgilerigoster();
                    }
                    else 
                    {
                        System.out.println("Geçersiz işlem girildi...");
                    }
                    
                }
                
                
                
            }
            else if(islem.equals("2"))
            {
                System.out.println("*******Yönetici İşlemleri********");
                Yonetici yonetici=new Yonetici("Mahircan","Savaş",2,1);
                String yislem="1- Zam Yapma\n"
                        +"2- Bilgileri Göster"
                        +"Çıkış için q basın";
                System.out.println(yislem);
                
                
                while(true)
                {
                    System.out.println("Yapmak istediğiniz işlemi giriniz: ");
                    String yislemm=scanner.nextLine();
                    if(yislemm.equals("q"))
                    {
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if(yislemm.equals("1"))
                    {
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz? : ");
                        int zammiktar=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamyap(zammiktar);
                    }
                    else if(yislemm.equals("2"))
                    {
                        yonetici.bilgilerigoster();
                    }
                    else
                    {
                        System.out.println("Geçersiz işlem girildi...");
                    }
                    
                    
                    
                }
                    
                    
                    
                    
            }
            else
            {
                System.out.println("Geçersiz işlem girildi...");
            }
        }
        
    }
    
}
