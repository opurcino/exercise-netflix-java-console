import java.util.Scanner;

public class neflix {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva o seu nome: ");
        String nome = teclado.next();

        System.out.println("Bem vindo a Netflix " + nome + "!");

        System.out.println("Indique qual o seu plano: \n1 - (BASICO)\n2 - (PADRÃO)\n3 - (PREMIUM)");
        int opcao = teclado.nextInt();

        String nomePlano = "";

        switch (opcao) {
            case 1:
                nomePlano = "Basico";
                System.out.println("Seu plano é: Resolução 720p - 1 tela disponível");
                break;
            case 2:
                nomePlano = "Padrão";
                System.out.println("Seu plano é: Resolução 1080p (Full HD) - 2 telas disponíveis");
                break;
            case 3:
                nomePlano = "Premium";
                System.out.println("Seu plano é: Resolução 4K + HDR - 4 telas disponíveis");
                break;
            default:
                nomePlano = "Invalido";
                System.out.println("Código de plano inválido!");
                break;
        }

        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();

        String categoria = "";

        if(idade < 12){
            categoria = "Categoria: Infantil (Desenhos e Animações)";
        } else if(idade >= 12 && idade <= 17){
            categoria = "Categoria: Adolescente (Séries Teen e Aventura)";
        } else if(idade >= 18){
            categoria = "Categoria: Adulto (Filmes de Ação e Documentários)";
        }

        System.out.println("De que país está acessando a Netflix?");
        String pais = teclado.next().toLowerCase();
        if(pais.equals("brasil")){
            System.out.println("Mensagem Especial!!");
            System.out.println("Destaque: Assista agora produções originais brasileiras!");
        }

        System.out.println("\n--- RESUMO DO PERFIL ---");
        System.out.println("Seu usuario: " + nome);
        System.out.println("Seu plano: " + nomePlano);
        System.out.println("Sua idade: " + idade);
        System.out.println("Acesso liberada para " + categoria);
        System.out.println("Seu país: " + pais);

        teclado.close();
    }
}