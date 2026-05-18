import java.util.Scanner;


    public class ItensLOL {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LUTADOR meuLutador = new LUTADOR();
            ASSASSINO meuAssassino = new ASSASSINO();
            ATIRADOR meuAtirador = new ATIRADOR();
            MAGO meuMago = new MAGO();
            TANK meuTank = new TANK();
            SUPORTE meuSuporte = new SUPORTE();
            BOTAS minhasBotas = new BOTAS();

            int[] AD          = new int[6];
            int[] AP          = new int[6];
            int[] CDR         = new int[6];
            int[] MR          = new int[6];
            int[] ARMOR       = new int[6];
            int[] LETALIDADE  = new int[6];
            int[] PENETRAÇAOM = new int[6];
            int[] PENETRAÇAOD = new int[6];
            int[] ATKSPEED    = new int[6];
            int[] SPEED       = new int[6];
            int[] CRIT        = new int[6];
            int[] CURA        = new int[6];
            int[] MANA        = new int[6];
            int[] HP          = new int[6];
            int[] Omnivamp    = new int[6];
            int[] LifeStell   = new int[6];
            int[] GOLD        = new int[6];
            String ItemL = " ";
            for (int i = 0; i < 6; i++) {
                System.out.println("\n========== SLOT " + (i + 1) + " DE ITEM ==========");
                System.out.println("Gostaria de selecionar qual tipo de item?");
                System.out.println("1 - Lutador\n2 - Assassino\n3 - Atirador\n4 - Mago\n5 - Tank\n6 - Suporte\n7 - Botas");

                int tipo = Integer.parseInt(sc.nextLine().replaceAll("[^0-9]", ""));

                switch (tipo) {
                    case 1:
                        System.out.println("==================================================");
                        System.out.println("⚔️ Força da Trindade");
                        System.out.println("Valor: 3333 GOLD");
                        System.out.println("Atributos: +36 AD | +30% VATK | +333 HP | +15CDR");
                        System.out.println("Passiva: Lamina Arcana: Dano adicional no proximo AA | Apressar: Aumento de velocidade de ataque apos atacar");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🩸 Armadura do Susserano ");
                        System.out.println("Valor: 3300 GOLD");
                        System.out.println("Atributos: +40 AD | +500 HP");
                        System.out.println("Passiva: Tirania: Ganha AD com base no HP adicional | Retribuição: Ganha AD com base no HP perdido");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🪓 Hidra Raivosa");
                        System.out.println("Valor: 3300 GOLD");
                        System.out.println("Atributos: +70 AD | +20 AH | +10% Roubo de Vida");
                        System.out.println("Ativo: Crescente Raivoso: Dano físico em área e cura | Passiva: Fenda: Ataques causam dano em área");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🐢 Hidra Titânica");
                        System.out.println("Valor: 3300 GOLD");
                        System.out.println("Atributos: +50 AD | +550 HP");
                        System.out.println("Ativo: Crescente Titânico: Reseta o AA e causa dano com base no HP | Passiva: Fenda: Dano ao contato em cone");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("💃 Dança da Morte");
                        System.out.println("Valor: 3200 GOLD");
                        System.out.println("Atributos: +60 AD | +40 Armadura | +15 AH");
                        System.out.println("Passiva: Ignorar Dor: Dano sofrido é convertido em sangramento | Desafiante: Eliminações removem o dano e curam");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("👣 Quebra-Passos");
                        System.out.println("Valor: 3300 GOLD");
                        System.out.println("Atributos: +50 AD | +25% VATK | +450 HP");
                        System.out.println("Ativo: Onda de Choque: Causa dano e lentidão massiva em área | Passiva: Têmpera: Velocidade de movimento ao atacar");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("👼 Anjo Guardião");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +55 AD | +45 Armadura");
                        System.out.println("Passiva: Graça Salvadora: Ressuscita o campeão com 50% de HP e 30% de Mana após 4s de estase");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🥊 Sinal de Sterak");
                        System.out.println("Valor: 3100 GOLD");
                        System.out.println("Atributos: +400 HP");
                        System.out.println("Passiva: Garras que Retêm: 50% do AD Base como AD Adicional | Linha de Vida: Escudo massivo ao ficar com pouco HP");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("⚔️ Espada do Rei Destruído");
                        System.out.println("Valor: 3200 GOLD");
                        System.out.println("Atributos: +40 AD | +25% VATK | +10% Roubo de Vida");
                        System.out.println("Passiva: Fio da Névoa: Dano baseado no HP atual do alvo | Sombras Vorazes: Causar 3 AAs rouba velocidade de movimento");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("☄️ Aurora e Crepúsculo ");
                        System.out.println("Valor: ");
                        System.out.println("Atributos: +70 AD | +700 HP | +20 AH");
                        System.out.println("Passiva: Golpe do Escudo de Luz: O primeiro ataque contra um campeão garante um Crítico e cura o usuário");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🍕 Fome Eterna ");
                        System.out.println("Valor: ");
                        System.out.println("Atributos: +95 AD | +25 AH | +12% Roubo de Vida");
                        System.out.println("Ativo/Passivo: Versão melhorada da Hidra Raivosa com status brutos superiores");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🦇 Mandíbula de Malmortius");
                        System.out.println("Valor: 3100 GOLD");
                        System.out.println("Atributos: +70 AD | +40 MR | +15 AH");
                        System.out.println("Passiva: Linha de Vida: Escudo mágico ao ficar com baixo HP | Garra: Ganha 10% de Vampirismo Universal ao ativar");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🐉 Lança de Shojin");
                        System.out.println("Valor: 3100 GOLD");
                        System.out.println("Atributos: +55 AD | +300 HP | +20 AH");
                        System.out.println("Passiva: Força do Dragão: Aumento de AH para habilidades não-ult | Vontade Focada: Habilidades ganham dano acumulativo");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌌 Céu Dividido");
                        System.out.println("Valor: 3100 GOLD");
                        System.out.println("Atributos: +45 AD | +450 HP | +15 AH");
                        System.out.println("Passiva: Golpe do Escudo de Luz: Crítico garantido e cura no primeiro ataque contra cada campeão");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🪓 Cutelo Negro");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +55 AD | +400 HP | +20 AH");
                        System.out.println("Passiva: Esquartejar: Ataques reduzem a armadura do alvo (acumulativo) | Fervor: Ganha velocidade de movimento ao atacar");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("💠 Hexoplaca Experimental");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +55 AD | +25% VATK | +300 HP");
                        System.out.println("Passiva: Sobrecarga: Usar a Ultimate garante velocidade de ataque e velocidade de movimento massiva");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🏚️ Quebracascos ");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +65 AD | +350 HP | +5% Velocidade de Movimento");
                        System.out.println("Passiva: Capitão: Cada 5º ataque em torres/campeões causa dano extra | Tropa de Invasão: Fortalece tropas grandes próximas");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🗡️ Serrespada Quintec");
                        System.out.println("Valor: 2800 GOLD");
                        System.out.println("Atributos: +45 AD | +250 HP | +15 AH");
                        System.out.println("Passiva: Punição: Causa 40% de Feridas Dolorosas em alvos com dano físico");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌑 Eclipse");
                        System.out.println("Valor: 2800 GOLD");
                        System.out.println("Atributos: +70 AD | +15 AH");
                        System.out.println("Passiva: Lua Perpétua: Atingir um campeão com 2 ataques/habilidades causa dano e garante um escudo");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌩️ Limite da Razão");
                        System.out.println("Valor: 2800 GOLD");
                        System.out.println("Atributos: +40% VATK | +50 MR | +20% Tenacidade");
                        System.out.println("Passiva: Conflito: Ataques causam dano mágico ao contato");
                        System.out.println("==================================================");

                        System.out.println("Qual sera seu " + (i + 1) + " item?");
                        ItemL = sc.nextLine().trim();

                        meuLutador.setItem(ItemL, i);

                        AD[i] = meuLutador.AD[i];
                        AP[i] = meuLutador.AP[i];
                        CDR[i] = meuLutador.CDR[i];
                        MR[i] = meuLutador.MR[i];
                        ARMOR[i] = meuLutador.ARMOR[i];
                        LETALIDADE[i] = meuLutador.LETALIDADE[i];
                        PENETRAÇAOM[i] = meuLutador.PENETRAÇAOM[i];
                        PENETRAÇAOD[i] = meuLutador.PENETRAÇAOD[i];
                        ATKSPEED[i] = meuLutador.ATKSPEED[i];
                        SPEED[i] = meuLutador.SPEED[i];
                        CRIT[i] = meuLutador.CRIT[i];
                        CURA[i] = meuLutador.CURA[i];
                        MANA[i] = meuLutador.MANA[i];
                        HP[i] = meuLutador.HP[i];
                        Omnivamp[i] = meuLutador.Omnivamp[i];
                        LifeStell[i] = meuLutador.LifeStell[i];
                        GOLD[i] = meuLutador.GOLD[i];

                        System.out.println("Item " + ItemL + " adicionado à build!");
                        break;
                    case 2:
                        System.out.println("==================================================");
                        System.out.println("🏚️ Quebastiao");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +65 AD | +350 HP | +5% Velocidade de Movimento");
                        System.out.println("Passiva: Capitão do Bordo: Cada 5º ataque básico causa dano bônus em torres e alvos próximos");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("👼 Anjo Guardião");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +55 AD | +45 Armadura");
                        System.out.println("Passiva: Graça Salvadora: Ressuscita com 50% de HP e 30% de Mana após 4s de estase (CD: 300s)");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🏹 Lembrete Mortal");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +40 AD | +35% Pen. Armadura | +25% Chance de Crítico");
                        System.out.println("Passiva: Sepulcro: Causa 40% de Feridas Dolorosas ao causar dano físico");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🛡️ Limiar da Noite");
                        System.out.println("Valor: 2800 GOLD");
                        System.out.println("Atributos: +50 AD | +15 Letalidade | +250 HP");
                        System.out.println("Passiva: Bastião: Garante um escudo de feitiço que bloqueia a próxima habilidade inimiga");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("💰 A Coletora");
                        System.out.println("Valor: 3200 GOLD");
                        System.out.println("Atributos: +60 AD | +25% Chance de Crítico | +12 Letalidade");
                        System.out.println("Passiva: Morte e Impostos: Executa inimigos com menos de 5% de HP e concede +25 de ouro");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("❄️ Rancor de Serylda");
                        System.out.println("Valor: 3200 GOLD");
                        System.out.println("Atributos: +45 AD | +15 AH | +22 (+ Letalidade) Pen. Armadura");
                        System.out.println("Passiva: Frio Penetrante: Habilidades causam lentidão a inimigos com menos de 50% de HP");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🏛️ Hubris");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +60 AD | +18 Letalidade | +15 AH");
                        System.out.println("Passiva: Eminência: Ao abater um campeão, ganha uma estátua e AD bônus temporário por 60s");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("⚡ Cicloespada Voltática");
                        System.out.println("Valor: 2900 GOLD");
                        System.out.println("Atributos: +55 AD | +18 Letalidade | +15 AH");
                        System.out.println("Passiva: Energizado: Ataques causam 100 de dano bônus e lentidão massiva por 0.75s");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("💀 Hidra Profana");
                        System.out.println("Valor: 3300 GOLD");
                        System.out.println("Atributos: +60 AD | +18 Letalidade | +20 AH");
                        System.out.println("Ativo: Talho Herético: Dano em área que aumenta contra alvos com menos de 50% de HP");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("👻 Lâmina Fantasma de Youmuu");
                        System.out.println("Valor: 2700 GOLD");
                        System.out.println("Atributos: +60 AD | +18 Letalidade");
                        System.out.println("Ativo: Passo Fantasma: Ganha velocidade de movimento e ignora colisão com unidades");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("👁️ Glaive Sombria");
                        System.out.println("Valor: 2600 GOLD");
                        System.out.println("Atributos: +50 AD | +15 Letalidade | +15 AH");
                        System.out.println("Passiva: Apagão: Revela sentinelas e armadilhas próximas, desativando-as");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🏹 Arco do Axioma");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +55 AD | +18 Letalidade | +25 AH");
                        System.out.println("Passiva: Fluxo: Eliminações restituem 10% (+ Letalidade) do tempo de recarga da Ultimate");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🐍 Presa da Serpente");
                        System.out.println("Valor: 2500 GOLD");
                        System.out.println("Atributos: +55 AD | +15 Letalidade");
                        System.out.println("Passiva: Quebra-Escudos: Causar dano reduz a eficácia de escudos recebidos pelo alvo");
                        System.out.println("==================================================");

                        System.out.println("Qual sera seu " + (i + 1) + " item?");
                        ItemL = sc.nextLine().trim();

                        meuAssassino.setItem(ItemL, i);

                        AD[i] = meuAssassino.AD[i];
                        CDR[i] = meuAssassino.CDR[i];
                        ARMOR[i] = meuAssassino.ARMOR[i];
                        LETALIDADE[i] = meuAssassino.LETALIDADE[i];
                        PENETRAÇAOD[i] = meuAssassino.PENETRAÇAOD[i];
                        SPEED[i] = meuAssassino.SPEED[i];
                        CRIT[i] = meuAssassino.CRIT[i];
                        HP[i] = meuAssassino.HP[i];
                        GOLD[i] = meuAssassino.GOLD[i];

                        System.out.println("Item " + ItemL + " adicionado à build!");
                        break;
                    case 3:
                    System.out.println("==================================================");
                    System.out.println("⚔️ Espada do Rei Destruído");
                    System.out.println("Valor: 3200 GOLD");
                    System.out.println("Atributos: +40 AD | +25% VATK | +10% Roubo de Vida");
                    System.out.println("Passiva: Fio da Névoa: Dano baseado no HP atual | Sombras Vorazes: 3 hits roubam velocidade de movimento");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("🩸 A Sedenta por Sangue");
                    System.out.println("Valor: 3400 GOLD");
                    System.out.println("Atributos: +80 AD | +18% Roubo de Vida");
                    System.out.println("Passiva: Escudo Ícor: Cura excessiva vira escudo | Saciado: Ganha AD bônus acima de 70% de vida");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("💠 Hexoplaca Experimental (Hexoptics)");
                    System.out.println("Valor: 3000 GOLD");
                    System.out.println("Atributos: +55 AD | +25% VATK | +300 HP");
                    System.out.println("Passiva: Sobrecarga: Usar a Ultimate garante 30% VATK e 15% de Vel. Movimento por 8s");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("🛡️ Arcoescudo Imortal");
                    System.out.println("Valor: 3000 GOLD");
                    System.out.println("Atributos: +50 AD | +25% Crítico");
                    System.out.println("Passiva: Linha de Vida: Ganha um escudo massivo ao cair abaixo de 30% de HP");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("💎 Gume do Infinito");
                    System.out.println("Valor: 3400 GOLD");
                    System.out.println("Atributos: +80 AD | +25% Crítico");
                    System.out.println("Passiva: Perfeição: Aumenta o Dano de Acerto Crítico em 40%");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("🐙 Mata-Cráquens");
                    System.out.println("Valor: 3100 GOLD");
                    System.out.println("Atributos: +50 AD | +40% VATK | +7% Vel. Movimento");
                    System.out.println("Passiva: Derrubar: Cada 3º ataque causa dano bônus (aumenta se focar o mesmo alvo)");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("🏹 Lembranças do Lord Dominik");
                    System.out.println("Valor: 3000 GOLD");
                    System.out.println("Atributos: +45 AD | +25% Crítico | +35% Pen. Armadura");
                    System.out.println("Passiva: (Nota: Dano adicional com base da vida maxima");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("💧 Manamune (Muramana)");
                    System.out.println("Valor: 2900 GOLD");
                    System.out.println("Atributos: +35 AD | +500 Mana | +15 AH");
                    System.out.println("Passiva: Awe: Ganha AD com base na Mana máxima | Choque: Habilidades e AAs causam dano extra");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("🦇 Mandíbula de Malmortius");
                    System.out.println("Valor: 3100 GOLD");
                    System.out.println("Atributos: +70 AD | +40 MR | +15 AH");
                    System.out.println("Passiva: Linha de Vida: Escudo Mágico ao ficar com HP baixo e ganha 10% de Vampirismo Universal");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("👼 Anjo Guardião");
                    System.out.println("Valor: 3000 GOLD");
                    System.out.println("Atributos: +55 AD | +45 Armadura");
                    System.out.println("Passiva: Graça Salvadora: Ressuscita com 50% de HP e 30% de Mana (300s de CD)");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("🗡️ Cimitarra de Mercúrio");
                    System.out.println("Valor: 3300 GOLD");
                    System.out.println("Atributos: +40 AD | +50 MR | +20% Tenacidade");
                    System.out.println("Ativo: Mercúrio: Remove todos os efeitos de CC e ganha Vel. de Movimento");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("☠️ Lembrete Mortal");
                    System.out.println("Valor: 3000 GOLD");
                    System.out.println("Atributos: +40 AD | +35% Pen. Armadura | +25% Crítico");
                    System.out.println("Passiva: Sepulcro: Aplica 40% de Feridas Dolorosas por 3s");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("⚡ Adagas Velozes de Navori (Flickerblade)");
                    System.out.println("Valor: 2600 GOLD");
                    System.out.println("Atributos: +40% VATK | +25% Crítico | +7% Vel. Movimento");
                    System.out.println("Passiva: Transcendência: Ataques reduzem o tempo de recarga das habilidades não-ultimas em 15%");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("💃 Dançarina Fantasma");
                    System.out.println("Valor: 2600 GOLD");
                    System.out.println("Atributos: +60% VATK | +25% Crítico | +12% Vel. Movimento");
                    System.out.println("Passiva: Valsa Espectral: Ganha fantasmagoria (ignora colisão) ao atacar");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("🔭 Canhão Fumegante");
                    System.out.println("Valor: 2600 GOLD");
                    System.out.println("Atributos: +35% VATK | +25% Crítico | +7% Vel. Movimento");
                    System.out.println("Passiva: Atirador de Elite: Ataques Energizados ganham 150 de alcance extra");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("🌀 Furacão de Runaan");
                    System.out.println("Valor: 2600 GOLD");
                    System.out.println("Atributos: +40% VATK | +25% Crítico | +7% Vel. Movimento");
                    System.out.println("Passiva: Fúria do Vento: Ataques disparam projéteis em 2 alvos próximos");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("⚡ Faca de Statikk");
                    System.out.println("Valor: 2900 GOLD");
                    System.out.println("Atributos: +50 AD | +40% VATK | +7% Vel. Movimento");
                    System.out.println("Passiva: Eletrochoque: Abates ou ataques disparam raios que causam dano mágico em área");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("🏁 Terminus");
                    System.out.println("Valor: 3000 GOLD");
                    System.out.println("Atributos: +35 AD | +30% VATK");
                    System.out.println("Passiva: Sombra/Luz: Ataques alternam entre ganhar Pen. de Armadura/MR e Resistências");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("💰 A Coletora");
                    System.out.println("Valor: 3200 GOLD");
                    System.out.println("Atributos: +60 AD | +25% Crítico | +12 Letalidade");
                    System.out.println("Passiva: Morte e Impostos: Executa alvos com menos de 5% de HP");
                    System.out.println("==================================================");

                    System.out.println("==================================================");
                    System.out.println("🏹 Flecha de Yun Tal (Wildarrow)");
                    System.out.println("Valor: 3200 GOLD");
                    System.out.println("Atributos: +65 AD | +25% Crítico");
                    System.out.println("Passiva: Serrilha Lunar: Acertos críticos causam sangramento de 35% do AD por 2s");
                    System.out.println("==================================================");

                        System.out.println("Qual sera seu " + (i + 1) + " item?");
                        ItemL = sc.nextLine().trim();
                        meuAtirador.setItem(ItemL, i);

                        AD[i] = meuAtirador.AD[i];
                        CDR[i] = meuAtirador.CDR[i];
                        MR[i] = meuAtirador.MR[i];
                        ARMOR[i] = meuAtirador.ARMOR[i];
                        LETALIDADE[i] = meuAtirador.LETALIDADE[i];
                        PENETRAÇAOD[i] = meuAtirador.PENETRAÇAOD[i];
                        ATKSPEED[i] = meuAtirador.ATKSPEED[i];
                        SPEED[i] = meuAtirador.SPEED[i];
                        CRIT[i] = meuAtirador.CRIT[i];
                        MANA[i] = meuAtirador.MANA[i];
                        HP[i] = meuAtirador.HP[i];
                        LifeStell[i] = meuAtirador.LifeStell[i];
                        GOLD[i] = meuAtirador.GOLD[i];

                        System.out.println("Item " + ItemL + " adicionado à build!");
                        break;


                    case 4:

                        System.out.println("==================================================");
                        System.out.println("👼 Abraço do Serafim (Cajado do Arcanjo)");
                        System.out.println("Valor: 2900 GOLD");
                        System.out.println("Atributos: +70 AP | +600 Mana | +25 AH");
                        System.out.println("Passiva: Awe: Ganha AP com base na Mana | Linha de Vida: Escudo azul ao ficar com pouco HP");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🛡️ Véu da Banshee");
                        System.out.println("Valor: 3100 GOLD");
                        System.out.println("Atributos: +120 AP | +50 MR");
                        System.out.println("Passiva: Anular: Garante um escudo de feitiço que bloqueia a próxima habilidade inimiga");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🔥 Tocha da Chama Negra (Blackfire Torch)");
                        System.out.println("Valor: 2800 GOLD");
                        System.out.println("Atributos: +90 AP | +600 Mana | +25 AH");
                        System.out.println("Passiva: Labareda: Habilidades queimam o alvo | Chama Negra: Ganha AP por cada campeão queimado");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🩸 Maldição Sanguinária");
                        System.out.println("Valor: Upgrade Grátis ");
                        System.out.println("Atributos: +110 AP | +500 HP");
                        System.out.println("Passiva: Versão aprimorada da queima de HP da Liandry");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌀 Ímpeto Cósmico");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +80 AP | +250 HP | +25 AH | +5% Vel. Movimento");
                        System.out.println("Passiva: Dança do Feitiço: Causar dano de habilidade garante Velocidade de Movimento");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌸 Criptoflora (Cryptbloom)");
                        System.out.println("Valor: 2850 GOLD");
                        System.out.println("Atributos: +70 AP | +15 AH | +30% Pen. Mágica");
                        System.out.println("Passiva: Do Além: Abates criam uma nova de cura que recupera vida dos aliados");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🚀 Protocinturão Hextec");
                        System.out.println("Valor: 2600 GOLD");
                        System.out.println("Atributos: +60 AP | +300 HP | +15 AH");
                        System.out.println("Ativo: Disparo Supersônico: Avança à frente e dispara projéteis de fogo");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🔭 Foco do Horizonte");
                        System.out.println("Valor: 2700 GOLD");
                        System.out.println("Atributos: +90 AP | +20 AH");
                        System.out.println("Passiva: Hiperdisparo: Revela e aumenta o dano causado a inimigos atingidos à longa distância");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🎭 Tormento de Liandry");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +90 AP | +300 HP");
                        System.out.println("Passiva: Tormento: Habilidades queimam o alvo com base no HP máximo | Sofrimento: Ganha dano extra em combate");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🪄 Perdição de Lich (Lich Bane)");
                        System.out.println("Valor: 3100 GOLD");
                        System.out.println("Atributos: +100 AP | +15 AH | +8% Vel. Movimento");
                        System.out.println("Passiva: Lâmina Arcana: Próximo AA após habilidade causa dano massivo (escala com AP)");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("💎 Companheiro de Luden (Luden's Companion)");
                        System.out.println("Valor: 2900 GOLD");
                        System.out.println("Atributos: +95 AP | +600 Mana | +25 AH");
                        System.out.println("Passiva: Carregar: Acumula disparos que causam dano extra ao atingir habilidades");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("😈 Malevolência (Malignance)");
                        System.out.println("Valor: 2700 GOLD");
                        System.out.println("Atributos: +80 AP | +600 Mana | +20 AH");
                        System.out.println("Passiva: Névoa do Ódio: Sua Ultimate ganha AH e queima o chão abaixo dos inimigos atingidos");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("📖 Ladrão de Almas de Mejai");
                        System.out.println("Valor: 1500 GOLD (Requer Lacre Sombrio)");
                        System.out.println("Atributos: +20 AP | +100 HP");
                        System.out.println("Passiva: Glória: Ganha AP por abates e assistências (até 25 acúmulos)");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("📜 Morellonomicon");
                        System.out.println("Valor: 2200 GOLD");
                        System.out.println("Atributos: +90 AP | +15 AH");
                        System.out.println("Passiva: Aflição: Aplica 40% de Feridas Dolorosas com dano mágico");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🦷 Dente de Nashor");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +90 AP | +15 AH | +50% VATK");
                        System.out.println("Passiva: Mordida de Icathia: Ataques básicos causam dano mágico bônus ao contato");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🎩 Capuz da Morte de Rabadon");
                        System.out.println("Valor: 3600 GOLD");
                        System.out.println("Atributos: +140 AP");
                        System.out.println("Passiva: Poder Mágico: Aumenta o seu Poder de Habilidade total em 35%");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🏔️ Criafendas (Riftmaker)");
                        System.out.println("Valor: 3100 GOLD");
                        System.out.println("Atributos: +80 AP | +350 HP | +15 AH");
                        System.out.println("Passiva: Infusão do Vazio: Ganha dano extra em combate longo | Converte parte do dano em cura");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌳 Bastão das Eras (Rod of Ages)");
                        System.out.println("Valor: 2600 GOLD");
                        System.out.println("Atributos: +50 AP | +400 HP | +400 Mana");
                        System.out.println("Passiva: Eternidade: Ganha HP/Mana por tempo (até 10 min) e um nível ao completar");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("❄️ Cetro de Cristal de Rylai");
                        System.out.println("Valor: 2600 GOLD");
                        System.out.println("Atributos: +75 AP | +400 HP");
                        System.out.println("Passiva: Gelo: Habilidades causam 30% de lentidão por 1s");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🔥 Chama Sombria (Shadowflame)");
                        System.out.println("Valor: 3200 GOLD");
                        System.out.println("Atributos: +115 AP | +12 Pen. Mágica");
                        System.out.println("Passiva: Florescer das Sombras: Causar dano a inimigos com menos de 35% de vida causa Crítico Mágico");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("⚡ Ápice da Tempestade (Stormsurge)");
                        System.out.println("Valor: 2900 GOLD");
                        System.out.println("Atributos: +95 AP | +10 Pen. Mágica | +5% Vel. Movimento");
                        System.out.println("Passiva: Invasão da Tempestade: Causar 35% de HP em 3s atinge o alvo com um raio");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("💎 Cajado do Vazio (Void Staff)");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +95 AP | +40% Pen. Mágica");
                        System.out.println("Passiva: Único item com 40% de penetração bruta");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("⏳ Ampulheta de Zhonya");
                        System.out.println("Valor: 3250 GOLD");
                        System.out.println("Atributos: +120 AP | +50 Armadura");
                        System.out.println("Ativo: Estase: Torna-se invulnerável e inalvejável por 2.5s");
                        System.out.println("==================================================");

                        System.out.println("Qual sera seu " + (i + 1) + " item?");
                        ItemL = sc.nextLine().trim();

                        meuMago.setItem(ItemL, i);

                        AP[i] = meuMago.AP[i];
                        CDR[i] = meuMago.CDR[i];
                        MR[i] = meuMago.MR[i];
                        ARMOR[i] = meuMago.ARMOR[i];
                        PENETRAÇAOM[i] = meuMago.PENETRAÇAOM[i];
                        ATKSPEED[i] = meuMago.ATKSPEED[i];
                        SPEED[i] = meuMago.SPEED[i];
                        MANA[i] = meuMago.MANA[i];
                        HP[i] = meuMago.HP[i];
                        GOLD[i] = meuMago.GOLD[i];

                        System.out.println("Item " + ItemL + " adicionado à build!");
                        break;

                    case 5:

                        System.out.println("==================================================");
                        System.out.println("🎭 Máscara Abissal");
                        System.out.println("Valor: 2500 GOLD");
                        System.out.println("Atributos: +350 HP | +45 MR | +15 AH");
                        System.out.println("Passiva: Destruir: Nearby enemy champions take 12% more magic damage.");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🏎️ Bandocanos (Trailblazer)");
                        System.out.println("Valor: 2400 GOLD");
                        System.out.println("Atributos: +200 HP | +40 Armadura | +5% Vel. Movimento");
                        System.out.println("Passiva: Abrir Caminho: Enquanto se move, ganha velocidade extra. Deixa um rastro que acelera aliados");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("💀 Couraça do Defunto (Dead Man's Plate)");
                        System.out.println("Valor: 2900 GOLD");
                        System.out.println("Atributos: +300 HP | +45 Armadura | +5% Vel. Movimento");
                        System.out.println("Passiva: Naufragado: Ganha velocidade de movimento e o próximo ataque causa dano e lentidão");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌬️ Força da Natureza");
                        System.out.println("Valor: 2800 GOLD");
                        System.out.println("Atributos: +400 HP | +55 MR | +5% Vel. Movimento");
                        System.out.println("Passiva: Inabalável: Tomar dano mágico concede acúmulos. No máximo de stacks, ganha MR e Velocidade");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("❄️ Coração Congelado");
                        System.out.println("Valor: 2500 GOLD");
                        System.out.println("Atributos: +70 Armadura | +400 Mana | +20 AH");
                        System.out.println("Passiva: Carícia do Inverno: Reduz a velocidade de ataque de inimigos próximos | Duro como Pedra: Reduz dano de AAs");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🩸 Coração de Aço (Heartsteel)");
                        System.out.println("Valor: 3000 GOLD");
                        System.out.println("Atributos: +900 HP | +200% Regeneração de Vida");
                        System.out.println("Passiva: Consumo Colossal: Ataque carregado contra campeões causa dano e concede HP Máximo permanente");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("✨ Resplendor do Vazio (Hollow Radiance)");
                        System.out.println("Valor: 2800 GOLD");
                        System.out.println("Atributos: +450 HP | +40 MR | +10 AH");
                        System.out.println("Passiva: Imolar: Queima inimigos próximos | Desolar: Ao matar uma unidade, causa uma explosão mágica");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("👹 Jak'Sho, o Proteano");
                        System.out.println("Valor: 3200 GOLD");
                        System.out.println("Atributos: +300 HP | +50 Armadura | +50 MR");
                        System.out.println("Passiva: Resiliência do Vazio: Em combate contra campeões, ganha acúmulos que aumentam suas resistências em 30%");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🛡️ Rookern Lamúrico (Kaenic Rookern)");
                        System.out.println("Valor: 2800 GOLD");
                        System.out.println("Atributos: +400 HP | +80 MR | +150% Regeneração de Vida");
                        System.out.println("Passiva: Ruína dos Magos: Após 12s sem dano, ganha um escudo mágico equivalente a 18% do seu HP");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("👑 Armadura do Susserano (Overlord's Bloodmail)");
                        System.out.println("Valor: 3300 GOLD");
                        System.out.println("Atributos: +40 AD | +500 HP");
                        System.out.println("Passiva: Tirania: Ganha AD com base no HP adicional | Retribuição: Ganha AD com base no HP perdido");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🚀 Protocinturão Hextec");
                        System.out.println("Valor: 2600 GOLD");
                        System.out.println("Atributos: +60 AP | +300 HP | +15 AH");
                        System.out.println("Ativo: Disparo Supersônico: Avança e dispara projéteis de fogo (reseta AA)");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🛡️ Presságio de Randuin");
                        System.out.println("Valor: 2700 GOLD");
                        System.out.println("Atributos: +350 HP | +75 Armadura");
                        System.out.println("Ativo: Humildade: Causa lentidão a inimigos próximos e reduz o dano de acertos críticos neles em 30%");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌿 Semblante Espiritual");
                        System.out.println("Valor: 2700 GOLD");
                        System.out.println("Atributos: +450 HP | +60 MR | +10 AH | +100% Regeneração");
                        System.out.println("Passiva: Vitalidade Infinita: Aumenta todas as curas e escudos recebidos em 25%");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🔥 Égide de Fogo Solar (Sunfire Aegis)");
                        System.out.println("Valor: 2700 GOLD");
                        System.out.println("Atributos: +350 HP | +50 Armadura");
                        System.out.println("Passiva: Imolar: Causa dano mágico por segundo a inimigos próximos (aumenta ao atacar campeões)");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌵 Armadura de Espinhos (Thornmail)");
                        System.out.println("Valor: 2450 GOLD");
                        System.out.println("Atributos: +350 HP | +80 Armadura");
                        System.out.println("Passiva: Espinhos: Ao receber um AA, reflete dano mágico e aplica 40% de Feridas Dolorosas");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🐢 Hidra Titânica");
                        System.out.println("Valor: 3300 GOLD");
                        System.out.println("Atributos: +50 AD | +550 HP");
                        System.out.println("Ativo: Crescente Titânico: Próximo AA causa dano em área baseado no HP e reseta o ataque");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("⛓️ Desespero Eterno (Unending Despair)");
                        System.out.println("Valor: 2800 GOLD");
                        System.out.println("Atributos: +400 HP | +55 Armadura | +10 AH");
                        System.out.println("Passiva: Angústia: A cada 7s em combate, causa dano mágico a inimigos próximos e se cura");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🍖 Armadura de Warmog");
                        System.out.println("Valor: 3300 GOLD");
                        System.out.println("Atributos: +1000 HP | +5% Vel. Movimento");
                        System.out.println("Passiva: Coração de Warmog: Se tiver +1500 HP bônus, cura vida rapidamente fora de combate");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("❄️ Aproximação Invernal (Fimbulwinter)");
                        System.out.println("Valor: 2400 GOLD");
                        System.out.println("Atributos: +400 HP | +800 Mana | +15 AH");
                        System.out.println("Passiva: Eternidade: Ao causar CC em campeões, consome mana para ganhar um escudo");
                        System.out.println("==================================================");

                        System.out.println("Qual sera seu " + (i + 1) + " item?");
                        ItemL = sc.nextLine().trim();

                        meuTank.setItem(ItemL, i);

                        AD[i] = meuTank.AD[i];
                        AP[i] = meuTank.AP[i];
                        CDR[i] = meuTank.CDR[i];
                        MR[i] = meuTank.MR[i];
                        ARMOR[i] = meuTank.ARMOR[i];
                        SPEED[i] = meuTank.SPEED[i];
                        CURA[i] = meuTank.CURA[i];
                        MANA[i] = meuTank.MANA[i];
                        HP[i] = meuTank.HP[i];
                        GOLD[i] = meuTank.GOLD[i];

                        System.out.println("Item " + ItemL + " adicionado à build!");
                        break;


                    case 6:


                        System.out.println("==================================================");
                        System.out.println("🏎️ Bandocanos (Trailblazer)");
                        System.out.println("Valor: 2400 GOLD");
                        System.out.println("Atributos: +200 HP | +40 Armadura | +5% Vel. Movimento");
                        System.out.println("Passiva: Abrir Caminho: Enquanto se move, ganha velocidade e deixa um rastro que acelera aliados");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🔥 Turíbulo Ardente");
                        System.out.println("Valor: 2300 GOLD");
                        System.out.println("Atributos: +45 AP | +10% Poder de Cura/Escudo | +4% Vel. Movimento | 125% Base Mana Regen");
                        System.out.println("Passiva: Santificar: Curar/Escudar aliados concede Velocidade de Ataque e Dano Mágico ao contato");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("💠 Auronúcleo (Dawncore)");
                        System.out.println("Valor: 2700 GOLD");
                        System.out.println("Atributos: +60 AP | +100% Regen. Mana | +16 AH");
                        System.out.println("Passiva: Primeira Luz: Ganha Poder de Cura/Escudo e AP para cada 100% de Regen. de Mana base");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🎐 Eco de Helia");
                        System.out.println("Valor: 2200 GOLD");
                        System.out.println("Atributos: +40 AP | +200 HP | +20 AH | +125% Regen. Mana");
                        System.out.println("Passiva: Sifão de Alma: Acertar inimigos gera fragmentos; Curar aliados consome fragmentos para curar mais e dar dano");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🤝 Juramento do Cavaleiro");
                        System.out.println("Valor: 2200 GOLD");
                        System.out.println("Atributos: +300 HP | +40 Armadura | +10 AH");
                        System.out.println("Ativo: Promessa: Designa um aliado como Parceiro | Passiva: Sacrifício: Redireciona parte do dano do aliado para você");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("☀️ Medalhão dos Solari de Ferro");
                        System.out.println("Valor: 2200 GOLD");
                        System.out.println("Atributos: +200 HP | +30 Armadura | +30 MR | +10 AH");
                        System.out.println("Ativo: Devoção: Concede um escudo em área para aliados próximos");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌿 Bênção de Mikael");
                        System.out.println("Valor: 2300 GOLD");
                        System.out.println("Atributos: +250 HP | +12% Poder de Cura/Escudo | +15 AH | +100% Regen. Mana");
                        System.out.println("Ativo: Purificar: Remove todos os efeitos de CC (exceto arremessos) de um aliado e o cura");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌙 Regenerador de Pedra Lunar");
                        System.out.println("Valor: 2200 GOLD");
                        System.out.println("Atributos: +30 AP | +250 HP | +20 AH | +125% Regen. Mana");
                        System.out.println("Passiva: Graça Estelar: Curas e escudos ricocheteiam para o aliado mais próximo ou fortalecem o alvo original");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌈 Redenção");
                        System.out.println("Valor: 2300 GOLD");
                        System.out.println("Atributos: +200 HP | +15% Poder de Cura/Escudo | +15 AH | +100% Regen. Mana");
                        System.out.println("Ativo: Intervenção: Revela uma área e, após 2.5s, cura aliados e dá dano em inimigos (pode usar morto)");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🎺 Hino Bélico de Shurelya");
                        System.out.println("Valor: 2200 GOLD");
                        System.out.println("Atributos: +40 AP | +15 AH | +125% Regen. Mana | +5% Vel. Movimento");
                        System.out.println("Ativo: Inspirar: Concede um surto de Velocidade de Movimento para você e aliados próximos");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌊 Cajado Aquafluxo");
                        System.out.println("Valor: 2300 GOLD");
                        System.out.println("Atributos: +40 AP | +8% Poder de Cura/Escudo | +100% Regen. Mana");
                        System.out.println("Passiva: Corredeiras: Curar/Escudar um aliado concede AP e AH a ambos");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("❄️ Convergência de Zeke");
                        System.out.println("Valor: 2200 GOLD");
                        System.out.println("Atributos: +200 HP | +30 Armadura | +30 MR | +20 AH");
                        System.out.println("Passiva: Tempestade de Gelo: Ao usar a Ultimate, cria uma nevasca ao seu redor que dá dano e lentidão");
                        System.out.println("==================================================");


                        System.out.println("==================================================");
                        System.out.println("🎵 Canção de Sangue (Bloodsong)");
                        System.out.println("Valor: Evolução da Missão");
                        System.out.println("Passiva: Lâmina Arcana: Próximo AA após habilidade dá dano extra e expõe a fraqueza (alvo sofre mais dano)");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🛡️ Oposição Celestial");
                        System.out.println("Valor: Evolução da Missão");
                        System.out.println("Passiva: Bênção da Montanha: Reduz o dano sofrido de campeões. Ao quebrar, causa lentidão em área");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("✨ Criasonhos (Dream Maker)");
                        System.out.println("Valor: Evolução da Missão");
                        System.out.println("Passiva: Enviado dos Sonhos: Curar/Escudar um aliado envia bolhas que reduzem o dano sofrido e aumentam o dano dele");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🛷 Trenó do Solstício");
                        System.out.println("Valor: Evolução da Missão");
                        System.out.println("Passiva: Ir de Trenó: Causar CC em um campeão concede HP e Velocidade de Movimento a você e um aliado");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("💥 Espinho de Reino de Zaz'Zak");
                        System.out.println("Valor: Evolução da Missão");
                        System.out.println("Passiva: Explosão do Vazio: Causar dano de habilidade provoca uma explosão que causa % de HP máximo");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🌸 Whispering Circlet ");
                        System.out.println("Valor: Upgrade Grátis (Ornn)");
                        System.out.println("Atributos: +90 AP | +20 AH | +150% Regen. Mana");
                        System.out.println("Passiva: Versão fortalecida do Auronúcleo");
                        System.out.println("==================================================");

                        System.out.println("Qual sera seu " + (i + 1) + " item?");
                        ItemL = sc.nextLine().trim();

                        meuSuporte.setItem(ItemL, i);

                        AP[i] = meuSuporte.AP[i];
                        CDR[i] = meuSuporte.CDR[i];
                        MR[i] = meuSuporte.MR[i];
                        ARMOR[i] = meuSuporte.ARMOR[i];
                        SPEED[i] = meuSuporte.SPEED[i];
                        CURA[i] = meuSuporte.CURA[i];
                        MANA[i] = meuSuporte.MANA[i];
                        HP[i] = meuSuporte.HP[i];
                        GOLD[i] = meuSuporte.GOLD[i];

                        System.out.println("Item " + ItemL + " adicionado à build!");
                        break;

                    case 7:

                        System.out.println("==================================================");
                        System.out.println("👞 Botas Galvanizadas (Plated Steelcaps)");
                        System.out.println("Valor: 1200 GOLD");
                        System.out.println("Atributos: +25 Armadura | +45 Velocidade de Movimento");
                        System.out.println("Passiva: Plaqueamento: Reduz o dano de ataques básicos recebidos em 12%");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("👟 Passos de Mercúrio (Mercury's Treads)");
                        System.out.println("Valor: 1200 GOLD");
                        System.out.println("Atributos: +30 MR | +45 Velocidade de Movimento");
                        System.out.println("Passiva: Tenacidade: Reduz a duração de efeitos de controle de grupo em 30%");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🔥 Sapatos do Feiticeiro (Sorcerer's Shoes)");
                        System.out.println("Valor: 1100 GOLD");
                        System.out.println("Atributos: +15 Penetração Mágica | +45 Velocidade de Movimento");
                        System.out.println("Passiva: Ideal para maximizar o dano mágico contra alvos com pouca MR");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("⌛ Botas Ionianas da Lucidez");
                        System.out.println("Valor: 1000 GOLD");
                        System.out.println("Atributos: +15 AH | +45 Velocidade de Movimento");
                        System.out.println("Passiva: Clarividência: Concede 10 de Aceleração de Feitiço de Invocador (Flash, Incendiar, etc)");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🏹 Grevas do Berserker");
                        System.out.println("Valor: 1100 GOLD");
                        System.out.println("Atributos: +35% VATK | +45 Velocidade de Movimento");
                        System.out.println("Passiva: O principal item de velocidade de ataque para Atiradores e Lutadores");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🕊️ Botas da Rapidez (Boots of Swiftness)");
                        System.out.println("Valor: 1000 GOLD");
                        System.out.println("Atributos: +60 Velocidade de Movimento");
                        System.out.println("Passiva: Celeridade: Reduz a eficácia de efeitos de lentidão sofridos em 25%");
                        System.out.println("==================================================");

                        System.out.println("==================================================");
                        System.out.println("🩸 Grevas Gulosas (Gluttonous Greaves)");
                        System.out.println("Valor: 1000 GOLD ");
                        System.out.println("Atributos: +45 Move Speed | +4% Omnivamp");
                        System.out.println("Passiva: Slay: Ganha 1% de Omnivamp por eliminação de campeão (acumula até 6 vezes)");
                        System.out.println("==================================================");

                        System.out.println("Qual sera seu " + (i + 1) + " item?");
                        ItemL = sc.nextLine().trim();

                        minhasBotas.setItem(ItemL, i);

                        CDR[i] = minhasBotas.CDR[i];
                        MR[i] = minhasBotas.MR[i];
                        ARMOR[i] = minhasBotas.ARMOR[i];
                        PENETRAÇAOM[i] = minhasBotas.PENETRAÇAOM[i];
                        ATKSPEED[i] = minhasBotas.ATKSPEED[i];
                        SPEED[i] = minhasBotas.SPEED[i];
                        Omnivamp[i] = minhasBotas.Omnivamp[i];
                        GOLD[i] = minhasBotas.GOLD[i];

                        System.out.println("Item " + ItemL + " adicionado à build!");
                        break;
                    default:
                        System.out.println("Nao esta na lista de opçoes.");
                        break;
                }
            }
            int totalAD = 0, totalAP = 0, totalCDR = 0, totalMR = 0, totalARMOR = 0;
            int totalLetalidade = 0, totalPenM = 0, totalPenD = 0, totalAtkSpeed = 0;
            int totalSpeed = 0, totalCrit = 0, totalCura = 0, totalMana = 0;
            int totalHP = 0, totalOmni = 0, totalLifeSteal = 0, totalGold = 0;

            totalAD = AD[0] + AD[1] + AD[2] + AD[3] + AD[4] + AD[5];
            totalAP = AP[0] + AP[1] + AP[2] + AP[3] + AP[4] + AP[5];
            totalCDR = CDR[0] + CDR[1] + CDR[2] + CDR[3] + CDR[4] + CDR[5];
            totalMR = MR[0] + MR[1] + MR[2] + MR[3] + MR[4] + MR[5];
            totalARMOR = ARMOR[0] + ARMOR[1] + ARMOR[2] + ARMOR[3] + ARMOR[4] + ARMOR[5];
            totalLetalidade = LETALIDADE[0] + LETALIDADE[1] + LETALIDADE[2] + LETALIDADE[3] + LETALIDADE[4] + LETALIDADE[5];
            totalPenM = PENETRAÇAOM[0] + PENETRAÇAOM[1] + PENETRAÇAOM[2] + PENETRAÇAOM[3] + PENETRAÇAOM[4] + PENETRAÇAOM[5];
            totalPenD = PENETRAÇAOD[0] + PENETRAÇAOD[1] + PENETRAÇAOD[2] + PENETRAÇAOD[3] + PENETRAÇAOD[4] + PENETRAÇAOD[5];
            totalAtkSpeed = ATKSPEED[0] + ATKSPEED[1] + ATKSPEED[2] + ATKSPEED[3] + ATKSPEED[4] + ATKSPEED[5];
            totalSpeed = SPEED[0] + SPEED[1] + SPEED[2] + SPEED[3] + SPEED[4] + SPEED[5];
            totalCrit = CRIT[0] + CRIT[1] + CRIT[2] + CRIT[3] + CRIT[4] + CRIT[5];
            totalCura = CURA[0] + CURA[1] + CURA[2] + CURA[3] + CURA[4] + CURA[5];
            totalMana = MANA[0] + MANA[1] + MANA[2] + MANA[3] + MANA[4] + MANA[5];
            totalHP = HP[0] + HP[1] + HP[2] + HP[3] + HP[4] + HP[5];
            totalOmni = Omnivamp[0] + Omnivamp[1] + Omnivamp[2] + Omnivamp[3] + Omnivamp[4] + Omnivamp[5];
            totalLifeSteal = LifeStell[0] + LifeStell[1] + LifeStell[2] + LifeStell[3] + LifeStell[4] + LifeStell[5];
            totalGold = GOLD[0] + GOLD[1] + GOLD[2] + GOLD[3] + GOLD[4] + GOLD[5];


            System.out.println("Agora com isto informado como sera que ficou sua build?");

            System.out.println("-------------------------------");
            System.out.println("CUSTO TOTAL DO INVENTÁRIO: " + totalGold + " gold");
            System.out.println("-------------------------------");

            System.out.println("--- STATUS TOTAIS DOS ITENS ---");

            if (totalAD > 0) System.out.println("Dano de Ataque (AD): " + totalAD);
            if (totalAP > 0) System.out.println("Poder de Habilidade (AP): " + totalAP);
            if (totalHP > 0) System.out.println("Vida (HP): " + totalHP);
            if (totalARMOR > 0) System.out.println("Armadura: " + totalARMOR);
            if (totalMR > 0) System.out.println("Resistência Mágica: " + totalMR);
            if (totalCDR > 0) System.out.println("Aceleração de Habilidade (CDR): " + totalCDR);
            if (totalAtkSpeed > 0) System.out.println("Velocidade de Ataque: " + totalAtkSpeed + "%");
            if (totalSpeed > 0) System.out.println("Velocidade de Movimento: " + totalSpeed);
            if (totalLetalidade > 0) System.out.println("Letalidade: " + totalLetalidade);
            if (totalPenD > 0) System.out.println("Penetração de Armadura: " + totalPenD + "%");
            if (totalPenM > 0) System.out.println("Penetração Mágica: " + totalPenM);
            if (totalCrit > 0) System.out.println("Chace de Crítico: " + totalCrit + "%");
            if (totalMana > 0) System.out.println("Mana: " + totalMana);
            if (totalLifeSteal > 0) System.out.println("Roubo de Vida: " + totalLifeSteal + "%");
            if (totalOmni > 0) System.out.println("Omnivamp: " + totalOmni + "%");
            if (totalCura > 0) System.out.println("Poder de Cura/Escudo: " + totalCura + "%");
// Coisas para fazer - Passivas do itens, Quais itens estao, Conseguir finalizar antes a Build.


        }
    }
