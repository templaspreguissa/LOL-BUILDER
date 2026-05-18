public class BOTAS {
    int[] CDR = new int[6];
    int[] MR = new int[6];
    int[] ARMOR = new int[6];
    int[] PENETRAÇAOM = new int[6];
    int[] ATKSPEED = new int[6];
    int[] SPEED = new int[6];
    int[] Omnivamp = new int[6];
    int[] GOLD = new int[6];

    public void setItem(String itemL, int i) {
        switch (itemL) {
            case "Botas Galvanizadas":
            case "Botas Galvanizadas (Plated Steelcaps)":
                ARMOR[i] = 25;
                SPEED[i] = 45;
                GOLD[i] = 1200;
                break;
            case "Passos de Mercúrio":
            case "Passos de Mercúrio (Mercury's Treads)":
                MR[i] = 20;
                SPEED[i] = 45;
                GOLD[i] = 1250;
                break;
            case "Sapatos do Feiticeiro":
            case "Sapatos do Feiticeiro (Sorcerer's Shoes)":
                PENETRAÇAOM[i] = 12;
                SPEED[i] = 45;
                GOLD[i] = 1100;
                break;
            case "Botas Ionianas da Lucidez":
                CDR[i] = 10;
                SPEED[i] = 45;
                GOLD[i] = 900;
                break;
            case "Grevas do Berserker":
                ATKSPEED[i] = 25;
                SPEED[i] = 45;
                GOLD[i] = 1100;
                break;
            case "Botas da Rapidez":
            case "Botas da Rapidez (Boots of Swiftness)":
                SPEED[i] = 55;
                GOLD[i] = 1000;
                break;
            case "Grevas Gulosas":
            case "Grevas Gulosas (Gluttonous Greaves)":
                SPEED[i] = 45;
                Omnivamp[i] = 4;
                GOLD[i] = 1000;
                break;

            default:
                System.out.println("Item não reconhecido para cálculo de status.");
                break;
        }

    }
}