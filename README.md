# 🐾 Virtual Pet

Bem-vindo ao **Simulador de Animal de Estimação Virtual**!  
Neste projeto, você terá a chance de **cuidar do seu próprio bichinho virtual** enquanto aprende conceitos essenciais da **programação orientada a objetos em Java**.

---

## 🎯 Objetivo

O jogador deve cuidar do bichinho virtual até que ele atinja a **idade 50**, mantendo seus níveis de fome, felicidade, cansaço, higiene e necessidades fisiológicas sob controle.

---

## ⚙️ Funcionalidades

###  Atributos do Bichinho

- `nome`: Nome do pet
- `fome`: Aumenta com o tempo
- `felicidade`: Diminui com o tempo
- `cansaço`: Aumenta ao brincar
- `idade`: Aumenta a cada ciclo
- `banheiro`: Aumenta quando o pet se alimenta
- `sujeira`: Aumenta quando o pet brinca

### 🛠️ Métodos (Comportamentos)

- `alimentar()`: Diminui fome, aumenta vontade de ir ao banheiro
- `brincar()`: Aumenta felicidade e sujeira, também cansa o pet
- `descansar(horas)`: Reduz o cansaço proporcional às horas
- `verificarStatus()`: Mostra todos os status do pet
- `passarTempo()`: Simula a passagem do tempo, atualizando idade, fome, felicidade, cansaço

---

##  Regras do Jogo

-  **Vitória**: Chegar à idade 50
-  **Derrota** se:
  - Fome ≥ 100
  - Felicidade ≤ 0
  - Cansaço ≥ 100
  - Banheiro ≥ limite (ex: 80)
  - Sujeira ≥ limite (ex: 80)

### Ciclo de tempo (a cada dia que passa):

- Fome: +3
- Felicidade: −3
- Cansaço: +10
- Idade: +1

---


---

## 📂 Estrutura do Projeto

📁 src/
├── VirtualPet.java // Classe com atributos e métodos do pet
├── Game.java // Lógica do jogo e menu interativo
└── Main.java // Inicializa e executa o jogo



---

## ▶️ Como Rodar o Jogo

```bash
git clone https://github.com/seu-usuario/bichinho-virtual-java.git
cd bichinho-virtual-java/src

javac *.java
java Main

