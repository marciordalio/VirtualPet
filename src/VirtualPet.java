public class VirtualPet {
    String nome;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;
    int nivelDeCansaco = 0;
    int idade = 1;
    int horasDeDescanso = 0;

    int nivelDeBanheiro = 0; // 🚻 Vontade de ir ao banheiro
    int nivelDeSujeira = 0;  // 🧼 Sujeira

    public VirtualPet(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome -= 15;
        if (nivelDeFome < 0) nivelDeFome = 0;

        nivelDeBanheiro += 20;
        if (nivelDeBanheiro > 100) nivelDeBanheiro = 100;

        System.out.println(nome + " foi alimentado. 🍖");
        System.out.println(nome + " está com mais vontade de ir ao banheiro. 🚻");
    }

    public void brincar() {
        nivelFelicidade += 15;
        if (nivelFelicidade > 100) nivelFelicidade = 100;

        nivelDeSujeira += 20;
        if (nivelDeSujeira > 100) nivelDeSujeira = 100;

        System.out.println(nome + " está brincando e ficou mais feliz 🎾.");
        System.out.println("Porém ficou mais sujo! 🧼");
    }

    public void descansar(int horas) {
        horasDeDescanso += horas;
        System.out.println(nome + " descansou por " + horas + " horas. 😴");

        if (horasDeDescanso >= 8) {
            nivelDeCansaco = 0;
            horasDeDescanso = 0;
            System.out.println(nome + " está completamente descansado! 💤");
        } else {
            nivelDeCansaco -= horas * 10;
            if (nivelDeCansaco < 0) nivelDeCansaco = 0;
        }
    }

    public void irAoBanheiro() {
        if (nivelDeBanheiro >= 20) {
            System.out.println(nome + " foi ao banheiro! 🚽 Alívio total.");
            nivelDeBanheiro = 0;
            nivelFelicidade += 5;
            if (nivelFelicidade > 100) nivelFelicidade = 100;
        } else {
            System.out.println(nome + " não está com vontade de ir ao banheiro agora. 😅");
        }
    }

    public void darBanho() {
        if (nivelDeSujeira >= 20) {
            System.out.println(nome + " tomou um banho! 🛁 Agora está limpinho.");
            nivelDeSujeira = 0;
            nivelFelicidade += 5;
            if (nivelFelicidade > 100) nivelFelicidade = 100;
        } else {
            System.out.println(nome + " ainda está limpinho e não precisa de banho agora. 😇");
        }
    }

    public void idade() {
        idade += 1;
        if (idade > 50) idade = 50;
        System.out.println(nome + " cresceu mais um pouco. 🎂");
    }

    public void cansar() {
        nivelDeCansaco += 10;
        if (nivelDeCansaco > 100) nivelDeCansaco = 100;
        System.out.println(nome + " ficou mais cansado. 🥱");
    }

    public void verificarStatus() {
        System.out.println("\n📊 Status atual de " + nome + ":");
        System.out.println("🍖 Nível de fome: " + nivelDeFome);
        System.out.println("🎾 Nível de felicidade: " + nivelFelicidade);
        System.out.println("💤 Nível de cansaço: " + nivelDeCansaco);
        System.out.println("🧻 Vontade de ir ao banheiro: " + nivelDeBanheiro + "/100");
        System.out.println("🧼 Nível de sujeira: " + nivelDeSujeira + "/100");
        System.out.println("🕐 Horas de descanso acumuladas: " + horasDeDescanso + "/8");
        System.out.println("🎂 Idade: " + idade);
    }

    public void passarTempo() {
        nivelDeFome += 3;
        nivelDeCansaco += 10;
        nivelFelicidade -= 3;
        nivelDeBanheiro += 5;
        nivelDeSujeira += 5;

        if (nivelDeFome > 100) nivelDeFome = 100;
        if (nivelDeCansaco > 100) nivelDeCansaco = 100;
        if (nivelDeBanheiro > 100) nivelDeBanheiro = 100;
        if (nivelDeSujeira > 100) nivelDeSujeira = 100;
        if (nivelFelicidade < 0) nivelFelicidade = 0;

        if (nivelDeBanheiro >= 100) {
            System.out.println("💩 Oops! " + nome + " não aguentou e fez no chão... 😳");
            nivelFelicidade -= 10;
            nivelDeBanheiro = 0;
            if (nivelFelicidade < 0) nivelFelicidade = 0;
        }

        System.out.println(nome + " está ficando mais faminto, cansado, entediado, sujo e com mais vontade de ir ao banheiro. ⏳");
    }

    public boolean verificarSePerdeu() {
        if (nivelDeFome >= 100) {
            System.out.println(nome + " ficou com muita fome e você perdeu o jogo. 😢");
            return true;
        }
        if (nivelDeCansaco >= 100) {
            System.out.println(nome + " ficou extremamente cansado e você perdeu o jogo. 😴");
            return true;
        }
        if (nivelFelicidade <= 0) {
            System.out.println(nome + " ficou muito triste e você perdeu o jogo. 😢");
            return true;
        }
        if (nivelDeBanheiro >= 100) {
            System.out.println(nome + " ficou apertado demais e você perdeu o jogo. 🚽💥");
            return true;
        }
        if (nivelDeSujeira >= 100) {
            System.out.println(nome + " ficou tão sujo que ficou doente... você perdeu o jogo. 🦠😢");
            return true;
        }
        return false;
    }
}
