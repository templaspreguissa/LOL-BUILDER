public class ATIRADOR {
    int[] AD = new int[6];
    int[] CDR = new int[6];
    int[] MR = new int[6];
    int[] ARMOR = new int[6];
    int[] LETALIDADE = new int[6];
    int[] PENETRAÇAOD = new int[6];
    int[] ATKSPEED = new int[6];
    int[] SPEED = new int[6];
    int[] CRIT = new int[6];
    int[] MANA = new int[6];
    int[] HP = new int[6];
    int[] LifeStell = new int[6];
    int[] GOLD = new int[6];

    public void setItem(String itemL, int i) {
        switch (itemL) {
            case "Espada do Rei Destruído":
                AD[i] = 40;
                ATKSPEED[i] = 25;
                LifeStell[i] = 10;
                GOLD[i] = 3200;
                break;
            case "A Sedenta por Sangue":
                AD[i] = 80;
                LifeStell[i] = 15;
                GOLD[i] = 3400;
                break;
            case "Hexoplaca Experimental":
            case "Hexoplaca Experimental (Hexoptics)":
                AD[i] = 40;
                ATKSPEED[i] = 20;
                HP[i] = 450;
                GOLD[i] = 3000;
                break;
            case "Arcoescudo Imortal":
                AD[i] = 55;
                CRIT[i] = 25;
                GOLD[i] = 3000;
                break;
            case "Gume do Infinito":
                AD[i] = 75;
                CRIT[i] = 25;
                GOLD[i] = 3500;
                break;
            case "Mata-Cráquens":
                AD[i] = 45;
                ATKSPEED[i] = 40;
                SPEED[i] = 4;
                GOLD[i] = 3000;
                break;
            case "Lembranças do Lord Dominik":
                AD[i] = 35;
                PENETRAÇAOD[i] = 35;
                CRIT[i] = 25;
                GOLD[i] = 3300;
                break;
            case "Manamune":
            case "Manamune (Muramana)":
                AD[i] = 35;
                MANA[i] = 500;
                CDR[i] = 15;
                GOLD[i] = 2900;
                break;
            case "Mandíbula de Malmortius":
                AD[i] = 60;
                CDR[i] = 15;
                MR[i] = 40;
                GOLD[i] = 3100;
                break;
            case "Anjo Guardião":
                AD[i] = 55;
                ARMOR[i] = 45;
                GOLD[i] = 3200;
                break;
            case "Cimitarra de Mercúrio":
                AD[i] = 50;
                MR[i] = 35;
                LifeStell[i] = 10;
                GOLD[i] = 3200;
                break;
            case "Lembrete Mortal":
                AD[i] = 35;
                PENETRAÇAOD[i] = 30;
                CRIT[i] = 25;
                GOLD[i] = 3000;
                break;
            case "Adagas Velozes de Navori":
            case "Adagas Velozes de Navori (Flickerblade)":
                ATKSPEED[i] = 40;
                CRIT[i] = 25;
                SPEED[i] = 4;
                GOLD[i] = 2650;
                break;
            case "Dançarina Fantasma":
                ATKSPEED[i] = 65;
                CRIT[i] = 25;
                SPEED[i] = 10;
                GOLD[i] = 2650;
                break;
            case "Canhão Fumegante":
                ATKSPEED[i] = 35;
                CRIT[i] = 25;
                SPEED[i] = 4;
                GOLD[i] = 2650;
                break;
            case "Furacão de Runaan":
                ATKSPEED[i] = 40;
                CRIT[i] = 25;
                SPEED[i] = 4;
                GOLD[i] = 2650;
                break;
            case "Faca de Statikk":
                AD[i] = 45;
                ATKSPEED[i] = 30;
                SPEED[i] = 4;
                GOLD[i] = 2700;
                break;
            case "Terminus":
                AD[i] = 30;
                ATKSPEED[i] = 35;
                GOLD[i] = 3000;
                break;
            case "A Coletora":
                AD[i] = 50;
                LETALIDADE[i] = 10;
                CRIT[i] = 25;
                GOLD[i] = 3000;
                break;
            case "Flecha de Yun Tal":
            case "Flecha de Yun Tal (Wildarrow)":
                AD[i] = 50;
                ATKSPEED[i] = 40;
                GOLD[i] = 3100;
                break;

            default:
                System.out.println("Item não reconhecido para cálculo de status.");
                break;
        }
    }
    }