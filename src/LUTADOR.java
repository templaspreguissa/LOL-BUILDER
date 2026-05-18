public class LUTADOR {
    int[] AD = new int[6];
    int[] AP = new int[6];
    int[] CDR = new int[6];
    int[] MR = new int[6];
    int[] ARMOR = new int[6];
    int[] LETALIDADE = new int[6];
    int[] PENETRAÇAOM = new int[6];
    int[] PENETRAÇAOD = new int[6];
    int[] ATKSPEED = new int[6];
    int[] SPEED = new int[6];
    int[] CRIT = new int[6];
    int[] CURA = new int[6];
    int[] MANA = new int[6];
    int[] HP = new int[6];
    int[] Omnivamp = new int[6];
    int[] LifeStell = new int[6];
    int[] GOLD = new int[6];


    public void setItem(String itemL, int i) {
        switch (itemL) {
            case "Força da Trindade":
                AD[i] = 36;
                ATKSPEED[i] = 30;
                HP[i] = 333;
                CDR[i] = 15;
                GOLD[i] = 3333;
                break;
            case "Hidra Raivosa":
                AD[i] = 65;
                CDR[i] = 15;
                LifeStell[i] = 12;
                GOLD[i] = 3300;
                break;
            case "Céu Dividido":
                AD[i] = 45;
                HP[i] = 400;
                CDR[i] = 10;
                GOLD[i] = 3100;
                break;
            case "Armadura do Susserano":
                AD[i] = 30;
                HP[i] = 550;
                GOLD[i] = 3300;
                break;
            case "Hidra Titanica":
                AD[i] = 40;
                HP[i] = 600;
                GOLD[i] = 3300;
                break;
            case "Dança da Morte":
                AD[i] = 60;
                ARMOR[i] = 50;
                CDR[i] = 15;
                GOLD[i] = 3300;
                break;

            case "Quebra Passos":
                AD[i] = 40;
                ATKSPEED[i] = 25;
                HP[i] = 450;
                GOLD[i] = 3300;
                break;

            case "Anjo Guardiao":
                AD[i] = 55;
                ARMOR[i] = 45;
                GOLD[i] = 3200;
                break;

            case "Sinal de Sterak":
                HP[i] = 400;
                GOLD[i] = 3200;
                break;

            case "Espada do Rei Destruido":
                AD[i] = 40;
                ATKSPEED[i] = 25;
                LifeStell[i] = 10;
                GOLD[i] = 3200;
                break;

            case "Aurora e Crepusculo":
                HP[i] = 350;
                AP[i] = 70;
                CDR[i] = 20;
                ATKSPEED[i] = 25;
                GOLD[i] = 3100;
                break;

            case "Fome Eterna":
                AD[i] = 65;
                Omnivamp[i] = 5;
                GOLD[i] = 3100;
                break;

            case "Mandibula de Malmorbios":
                AD[i] = 60;
                CDR[i] = 15;
                MR[i] = 40;
                GOLD[i] = 3100;
                break;

            case "Lança de Shojin":
                AD[i] = 45;
                HP[i] = 450;
                GOLD[i] = 3100;
                break;

            case "Cutelo Negro":
                AD[i] = 40;
                HP[i] = 400;
                CDR[i] = 20;
                GOLD[i] = 3000;
                break;

            case "Hexoplaca Esperimental":
                AD[i] = 40;
                ATKSPEED[i] = 20;
                HP[i] = 450;
                GOLD[i] = 3000;
                break;

            case "Quebracascos":
                AD[i] = 40;
                HP[i] = 500;
                SPEED[i] = 4;
                GOLD[i] = 3000;
                break;

            case "Serrespada Quintec":
                AD[i] = 45;
                HP[i] = 450;
                CDR[i] = 15;
                GOLD[i] = 3000;
                break;

            case "Eclipse":
                AD[i] = 70;
                CDR[i] = 15;
                GOLD[i] = 2800;
                break;

            case "Limite da Razao":
                ATKSPEED[i] = 40;
                MR[i] = 50;
                GOLD[i] = 2800;
                break;

            default:
                System.out.println("Item não reconhecido para cálculo de status.");
                break;
        }
    }
    }