public class TANK {
    int[] AD = new int[6];
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
            case "Máscara Abissal":
                HP[i] = 350;
                MR[i] = 45;
                CDR[i] = 15;
                GOLD[i] = 2650;
                break;
            case "Bandocanos":
            case "Bandocanos (Trailblazer)":
                HP[i] = 200;
                CDR[i] = 15;
                ARMOR[i] = 20;
                MR[i] = 20;
                GOLD[i] = 2300;
                break;
            case "Couraça do Defunto":
            case "Couraça do Defunto (Dead Man's Plate)":
                HP[i] = 350;
                ARMOR[i] = 55;
                SPEED[i] = 4;
                GOLD[i] = 2900;
                break;
            case "Força da Natureza":
                HP[i] = 400;
                MR[i] = 55;
                SPEED[i] = 4;
                GOLD[i] = 2800;
                break;
            case "Coração Congelado":
                ARMOR[i] = 75;
                MANA[i] = 400;
                CDR[i] = 20;
                GOLD[i] = 2500;
                break;
            case "Coração de Aço":
            case "Coração de Aço (Heartsteel)":
                HP[i] = 900;
                CURA[i] = 100;
                GOLD[i] = 3000;
                break;
            case "Resplendor do Vazio":
            case "Resplendor do Vazio (Hollow Radiance)":
                HP[i] = 400;
                MR[i] = 40;
                CDR[i] = 10;
                CURA[i] = 100;
                GOLD[i] = 2800;
                break;
            case "Jak'Sho, o Proteano":
                HP[i] = 350;
                ARMOR[i] = 45;
                MR[i] = 45;
                GOLD[i] = 3200;
                break;
            case "Rookern Lamúrico":
            case "Rookern Lamúrico (Kaenic Rookern)":
                HP[i] = 400;
                MR[i] = 80;
                CURA[i] = 100;
                GOLD[i] = 2900;
                break;
            case "Armadura do Susserano":
            case "Armadura do Susserano (Overlord's Bloodmail)":
                AD[i] = 30;
                HP[i] = 550;
                GOLD[i] = 3300;
                break;
            case "Protocinturão Hextec":
                AP[i] = 70;
                HP[i] = 300;
                CDR[i] = 20;
                GOLD[i] = 2650;
                break;
            case "Presságio de Randuin":
                HP[i] = 350;
                ARMOR[i] = 75;
                GOLD[i] = 2700;
                break;
            case "Semblante Espiritual":
                HP[i] = 400;
                MR[i] = 50;
                CDR[i] = 10;
                CURA[i] = 100;
                GOLD[i] = 2700;
                break;
            case "Égide de Fogo Solar":
            case "Égide de Fogo Solar (Sunfire Aegis)":
                HP[i] = 350;
                ARMOR[i] = 50;
                CDR[i] = 10;
                GOLD[i] = 2700;
                break;
            case "Armadura de Espinhos":
            case "Armadura de Espinhos (Thornmail)":
                HP[i] = 150;
                ARMOR[i] = 75;
                GOLD[i] = 2450;
                break;
            case "Hidra Titânica":
                AD[i] = 40;
                HP[i] = 600;
                GOLD[i] = 3300;
                break;
            case "Desespero Eterno":
                HP[i] = 400;
                ARMOR[i] = 50;
                CDR[i] = 15;
                GOLD[i] = 2800;
                break;
            case "Armadura de Warmog":
                HP[i] = 1000;
                CURA[i] = 100;
                GOLD[i] = 3100;
                break;
            case "Aproximação Invernal":
                HP[i] = 550;
                MANA[i] = 500;
                CDR[i] = 15;
                GOLD[i] = 2400;
                break;

            default:
                System.out.println("Item não reconhecido para cálculo de status.");
                break;
        }
    }
    }