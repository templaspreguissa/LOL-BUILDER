public class MAGO {
    int[] AP = new int[6];
    int[] CDR = new int[6];
    int[] MR = new int[6];
    int[] ARMOR = new int[6];
    int[] PENETRAÇAOM = new int[6];
    int[] ATKSPEED = new int[6];
    int[] SPEED = new int[6];
    int[] MANA = new int[6];
    int[] HP = new int[6];
    int[] GOLD = new int[6];

    public void setItem(String itemL, int i) {
        switch (itemL) {
            case "Abraço do Serafim":
            case "Abraço do Serafim (Cajado do Arcanjo)":
                AP[i] = 70;
                MANA[i] = 1000;
                CDR[i] = 25;
                GOLD[i] = 2900;
                break;
            case "Véu da Banshee":
                AP[i] = 105;
                MR[i] = 40;
                GOLD[i] = 3000;
                break;
            case "Tocha da Chama Negra":
            case "Tocha da Chama Negra (Blackfire Torch)":
                AP[i] = 80;
                MANA[i] = 600;
                CDR[i] = 20;
                GOLD[i] = 2800;
                break;
            case "Maldição Sanguinária":
                AP[i] = 65;
                HP[i] = 400;
                CDR[i] = 15;
                GOLD[i] = 2900;
                break;
            case "Ímpeto Cósmico":
                AP[i] = 70;
                HP[i] = 350;
                CDR[i] = 25;
                SPEED[i] = 4;
                GOLD[i] = 3000;
                break;
            case "Criptoflora":
            case "Criptoflora (Cryptbloom)":
                AP[i] = 75;
                PENETRAÇAOM[i] = 30;
                CDR[i] = 20;
                GOLD[i] = 3000;
                break;
            case "Protocinturão Hextec":
                AP[i] = 70;
                HP[i] = 300;
                CDR[i] = 20;
                GOLD[i] = 2650;
                break;
            case "Foco do Horizonte":
                AP[i] = 75;
                CDR[i] = 25;
                GOLD[i] = 2700;
                break;
            case "Tormento de Liandry":
                AP[i] = 60;
                HP[i] = 300;
                GOLD[i] = 3000;
                break;
            case "Perdição de Lich":
            case "Perdição de Lich (Lich Bane)":
                AP[i] = 100;
                SPEED[i] = 4;
                CDR[i] = 10;
                GOLD[i] = 2900;
                break;
            case "Companheiro de Luden":
            case "Companheiro de Luden (Luden's Companion)":
                AP[i] = 100;
                MANA[i] = 600;
                CDR[i] = 10;
                GOLD[i] = 2750;
                break;
            case "Malevolência":
            case "Malevolência (Malignance)":
                AP[i] = 90;
                MANA[i] = 600;
                CDR[i] = 15;
                GOLD[i] = 2700;
                break;
            case "Ladrão de Almas de Mejai":
                AP[i] = 20;
                HP[i] = 100;
                GOLD[i] = 1500;
                break;
            case "Morellonomicon":
                AP[i] = 75;
                HP[i] = 350;
                CDR[i] = 15;
                GOLD[i] = 2850;
                break;
            case "Dente de Nashor":
                AP[i] = 80;
                ATKSPEED[i] = 50;
                CDR[i] = 15;
                GOLD[i] = 2900;
                break;
            case "Capuz da Morte de Rabadon":
                AP[i] = 130;
                GOLD[i] = 3500;
                break;
            case "Criafendas":
            case "Criafendas (Riftmaker)":
                AP[i] = 70;
                HP[i] = 350;
                CDR[i] = 15;
                GOLD[i] = 3100;
                break;
            case "Bastão das Eras":
            case "Bastão das Eras (Rod of Ages)":
                AP[i] = 45;
                HP[i] = 350;
                MANA[i] = 500;
                GOLD[i] = 2600;
                break;
            case "Cetro de Cristal de Rylai":
                AP[i] = 65;
                HP[i] = 400;
                GOLD[i] = 2600;
                break;
            case "Chama Sombria":
            case "Chama Sombria (Shadowflame)":
                AP[i] = 110;
                PENETRAÇAOM[i] = 15;
                GOLD[i] = 3200;
                break;
            case "Ápice da Tempestade":
            case "Ápice da Tempestade (Stormsurge)":
                AP[i] = 90;
                PENETRAÇAOM[i] = 15;
                SPEED[i] = 6;
                GOLD[i] = 2800;
                break;
            case "Cajado do Vazio":
            case "Cajado do Vazio (Void Staff)":
                AP[i] = 95;
                PENETRAÇAOM[i] = 40;
                GOLD[i] = 3000;
                break;
            case "Ampulheta de Zhonya":
                AP[i] = 105;
                ARMOR[i] = 50;
                GOLD[i] = 3250;
                break;

            default:
                System.out.println("Item não reconhecido para cálculo de status.");
                break;
        }
    }
}