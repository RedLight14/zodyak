import java.util.Scanner;

public class zodyak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int yıl,kalan;

        System.out.print("Dogdugunuz yili giriniz : ");
        yıl=inp.nextInt();

        kalan=yıl%12;

        switch (kalan)
        {
            case 0:
                System.out.print("Cin Zodyagı Burcunuz : Maymun");
                break;
            case 1:
                System.out.print("Cin Zodyagı Burcunuz : Horoz");
                break;
            case 2:
                System.out.print("Cin Zodyagı Burcunuz : Kopek");
                break;
            case 3:
                System.out.print("Cin Zodyagı Burcunuz : Domuz");
                break;
            case 4:
                System.out.print("Cin Zodyagı Burcunuz : Fare");
                break;
            case 5:
                System.out.print("Cin Zodyagı Burcunuz : Okuz");
                break;
            case 6:
                System.out.print("Cin Zodyagı Burcunuz : Kaplan");
                break;
            case 7:
                System.out.print("Cin Zodyagı Burcunuz : Tavsan");
                break;
            case 8:
                System.out.print("Cin Zodyagı Burcunuz : Ejderha");
                break;
            case 9:
                System.out.print("Cin Zodyagı Burcunuz : Yılan");
                break;
            case 10:
                System.out.print("Cin Zodyagı Burcunuz : At");
                break;
            case 11:
                System.out.print("Cin Zodyagı Burcunuz : Koyun");
                break;
        }
    }
    }
