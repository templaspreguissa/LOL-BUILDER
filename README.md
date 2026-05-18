# ⚔️ Calculadora de Build — League of Legends (Java)

Projeto desenvolvido em **Java** para criação e análise de builds de itens do League of Legends.

O sistema permite selecionar itens de diferentes classes do jogo e calcular automaticamente os atributos totais da build.

---

## 📖 Sobre o Projeto

Este programa foi desenvolvido com o objetivo de simular a criação de builds do **League of Legends**.

O usuário pode escolher até **6 itens** entre diversas categorias:

- Lutador
- Assassino
- Atirador
- Mago
- Tank
- Suporte
- Botas

Após finalizar a seleção, o sistema calcula automaticamente os atributos acumulados da build.

---

## ✨ Funcionalidades

✔️ Seleção de até 6 itens.

✔️ Sistema dividido por classes.

✔️ Cálculo automático de:

- AD (Dano de Ataque)
- AP (Poder de Habilidade)
- HP
- Armadura
- Resistência Mágica
- Aceleração de Habilidade
- Velocidade de Ataque
- Velocidade de Movimento
- Letalidade
- Penetração Física
- Penetração Mágica
- Chance Crítica
- Mana
- Roubo de Vida
- Omnivamp
- Cura/Escudo

✔️ Soma automática do custo total em GOLD.

✔️ Organização dos itens por arquivos separados.

---

## 🛠️ Tecnologias Utilizadas

```txt
Java
Scanner (Entrada de dados)
Programação Orientada a Objetos (POO)
Switch Case
Arrays
```

---

## 📂 Estrutura do Projeto

```txt
📦 ItensLOL
 ┣ 📜 ItensLOL.java
 ┣ 📜 LUTADOR.java
 ┣ 📜 ASSASSINO.java
 ┣ 📜 ATIRADOR.java
 ┣ 📜 MAGO.java
 ┣ 📜 TANK.java
 ┣ 📜 SUPORTE.java
 ┗ 📜 BOTAS.java
```

---

## 🚀 Como Executar

Clone o repositório:

```bash
git clone https://github.com/SEUUSUARIO/ItensLOL.git
```

Entre na pasta:

```bash
cd ItensLOL
```

Compile o projeto:

```bash
javac *.java
```

Execute:

```bash
java ItensLOL
```

---

## 🎮 Exemplo de Uso

```txt
========== SLOT 1 DE ITEM ==========

Gostaria de selecionar qual tipo de item?

1 - Lutador
2 - Assassino
3 - Atirador
4 - Mago
5 - Tank
6 - Suporte
7 - Botas

Escolha: 3

Item escolhido:
Gume do Infinito

Item adicionado à build!

-------------------------------
CUSTO TOTAL DO INVENTÁRIO: 3400 GOLD
-------------------------------

Dano de Ataque (AD): 80
Chance de Crítico: 25%
```

---

## 💡 Melhorias Futuras

🔲 Mostrar os nomes dos itens escolhidos na build final.

🔲 Sistema de passivas completas.

🔲 Encerrar build antecipadamente.

🔲 Interface gráfica (Java Swing / JavaFX).

🔲 Sistema de pesquisa de item.

🔲 Comparador de builds.

---

## 👨‍💻 Autor

Desenvolvido por **Arthur Kyldare**

GitHub: https://github.com/templaspreguissa/LOL-BUILDER/edit/main/README.md

---

## 📄 Licença

Projeto desenvolvido para fins de estudo e aprendizado.
League of Legends® pertence à Riot Games.
