
public class Program5{
    public static void main(String[] args){
        int rMiles = 286;
        int kMiles = 412;
        int pMiles = 361;
        int bMiles = 161;
        
        int rGallons = 9;
        int kGallons = 40;
        int pGallons = 18;
        int bGallons = 11;
        
        double rMilesPerGal = (double) rMiles / rGallons;
        double kMilesPerGal = (double) kMiles / kGallons;
        double pMilesPerGal = (double) pMiles / pGallons;
        double bMilesPerGal = (double) bMiles / bGallons;
        
        System.out.println("Mushroom Cup Prix Racer average Miles per Gallon");
        System.out.printf("\tRoyale averaged %.1f", rMilesPerGal); System.out.println(" m/g");
        System.out.printf("\tKoopa King averaged %.1f", kMilesPerGal); System.out.println(" m/g");
        System.out.printf("\tPipe Frame averaged %.1f", pMilesPerGal); System.out.println(" m/g");
        System.out.printf("\tBadwagon averaged %.1f", bMilesPerGal); System.out.println(" m/g");
    }
}
