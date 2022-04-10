package kullanıcıgirisi;
import java.util.*;
public class KullanıcıGirisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullanıcıAdı="java.proje"; 
        String sifre="147852";
        
        String username,password;
        System.out.println("Kullanıcı adını giriniz:");
        username = input.next();
        System.out.println("Şifrenizi giriniz:");
        password = input.next();
        //String değerlerde eşitlik için .equals kullanılır
        if(kullanıcıAdı.equals(username) && sifre.equals(password))
        {
            System.out.println("Kullanıcı adınız ve şifreniz doğru.");
            
        }
        else
        {
            System.out.println("Şifreniz yanlış.Sıfırlamak ister misiniz?");
            System.out.println("1-EVET");
            System.out.println("2-HAYIR");
        }
        
        int yeniSifre = input.nextInt();
        switch(yeniSifre)
        {
            case 1:
                System.out.print("Yeni şifreniz:" + input.nextLine());
                String newPassword = input.nextLine();
                if(newPassword.equals(147852)){
                    System.out.println("Yeni şifre, eski şifreyle aynı olamaz.");
               break;
                }
                else {
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                    break;
                }
            case 2:
                System.out.println("Şifre sıfırlanmadı.");
                break;
                
            
         
                
        }
        
       
                
            
        
            
        
    }
    
}
