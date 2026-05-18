
public class SUPORTE {
    int[] AP = new int[6];
    int[] CDR = new int[6];
    int[] MR = new int[6];
    int[] ARMOR = new int[6];
    int[] SPEED = new int[6];
    int[] CURA = new int[6];
    int[] MANA = new int[6];
    int[] HP = new int[6];
    int[] GOLD = new int[6];

    public void setItem(String itemL, int i) {
        switch (itemL) {
            case "Bandocanos":
            case "Bandocanos (Trailblazer)":
                HP[i] = 200;
                ARMOR[i] = 40;
                SPEED[i] = 5;
                GOLD[i] = 2400;
                break;
            case "Turíbulo Ardente":
                AP[i] = 45;
                CURA[i] = 10;
                SPEED[i] = 4;
                MANA[i] = 125;
                GOLD[i] = 2200;
                break;
            case "Auronúcleo":
            case "Auronúcleo (Dawncore)":
                AP[i] = 45;
                MANA[i] = 100;
                CDR[i] = 16;
                GOLD[i] = 2500;
                break;
            case "Eco de Helia":
                AP[i] = 35;
                HP[i] = 200;
                CDR[i] = 15;
                MANA[i] = 125;
                GOLD[i] = 2200;
                break;
            case "Juramento do Cavaleiro":
                HP[i] = 300;
                ARMOR[i] = 45;
                CDR[i] = 15;
                GOLD[i] = 2300;
                break;
            case "Medalhão dos Solari de Ferro":
                HP[i] = 200;
                ARMOR[i] = 25;
                MR[i] = 25;
                CDR[i] = 10;
                GOLD[i] = 2200;
                break;
            case "Bênção de Mikael":
                HP[i] = 250;
                CURA[i] = 12;
                CDR[i] = 15;
                MANA[i] = 100;
                GOLD[i] = 2300;
                break;
            case "Regenerador de Pedra Lunar":
                AP[i] = 25;
                HP[i] = 200;
                CDR[i] = 20;
                MANA[i] = 125;
                GOLD[i] = 2200;
                break;
            case "Redenção":
                HP[i] = 200;
                CURA[i] = 15;
                CDR[i] = 15;
                MANA[i] = 100;
                GOLD[i] = 2300;
                break;
            case "Hino Bélico de Shurelya":
                AP[i] = 45;
                CDR[i] = 15;
                MANA[i] = 125;
                SPEED[i] = 4;
                GOLD[i] = 2200;
                break;
            case "Cajado Aquafluxo":
                AP[i] = 35;
                CURA[i] = 8;
                MANA[i] = 125;
                GOLD[i] = 2250;
                break;
            case "Convergência de Zeke":
                HP[i] = 200;
                ARMOR[i] = 25;
                MR[i] = 25;
                CDR[i] = 10;
                GOLD[i] = 2200;
                break;
            case "Whispering Circlet":
                AP[i] = 90;
                CDR[i] = 20;
                MANA[i] = 150;
                break;
            default:
                System.out.println("Item não reconhecido para cálculo de status.");
                break;
        }
    }
}