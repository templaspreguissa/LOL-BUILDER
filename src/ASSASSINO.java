
public class ASSASSINO {
    int[] AD = new int[6];
    int[] CDR = new int[6];
    int[] ARMOR = new int[6];
    int[] LETALIDADE = new int[6];
    int[] PENETRAÇAOD = new int[6];
    int[] SPEED = new int[6];
    int[] CRIT = new int[6];
    int[] HP = new int[6];
    int[] GOLD = new int[6];

    public void setItem(String itemL, int i) {
        switch (itemL) {
            case "Quebastiao":
                AD[i] = 40;
                HP[i] = 500;
                SPEED[i] = 4;
                GOLD[i] = 3000;
                break;
            case "Anjo Guardião":
                AD[i] = 55;
                ARMOR[i] = 45;
                GOLD[i] = 3200;
                break;
            case "Lembrete Mortal":
                AD[i] = 35;
                PENETRAÇAOD[i] = 30;
                CRIT[i] = 25;
                GOLD[i] = 3000;
                break;
            case "Limiar da Noite":
                AD[i] = 50;
                LETALIDADE[i] = 15;
                HP[i] = 250;
                GOLD[i] = 3000;
                break;
            case "A Coletora":
                AD[i] = 50;
                LETALIDADE[i] = 10;
                CRIT[i] = 25;
                GOLD[i] = 3000;
                break;
            case "Rancor de Serylda":
                AD[i] = 45;
                PENETRAÇAOD[i] = 35;
                CDR[i] = 15;
                GOLD[i] = 3000;
                break;
            case "Hubris":
                AD[i] = 60;
                LETALIDADE[i] = 18;
                CDR[i] = 15;
                GOLD[i] = 2950;
                break;
            case "Cicloespada Voltática":
                AD[i] = 55;
                LETALIDADE[i] = 18;
                CDR[i] = 10;
                GOLD[i] = 3000;
                break;
            case "Hidra Profana":
                AD[i] = 55;
                LETALIDADE[i] = 18;
                CDR[i] = 10;
                GOLD[i] = 2850;
                break;
            case "Lâmina Fantasma de Youmuu":
                AD[i] = 55;
                LETALIDADE[i] = 18;
                SPEED[i] = 4;
                GOLD[i] = 2800;
                break;
            case "Glaive Sombria":
                AD[i] = 60;
                LETALIDADE[i] = 18;
                CDR[i] = 15;
                GOLD[i] = 2800;
                break;
            case "Arco do Axioma":
                AD[i] = 55;
                LETALIDADE[i] = 18;
                CDR[i] = 20;
                GOLD[i] = 2750;
                break;
            case "Presa da Serpente":
                AD[i] = 55;
                LETALIDADE[i] = 15;
                GOLD[i] = 2500;
                break;

            default:
                System.out.println("Item não reconhecido para cálculo de status.");
                break;
        }
    }
    }