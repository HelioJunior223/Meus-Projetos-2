import java.util.Scanner;

public class Gerenciar {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String BLACK = "\u001B[30m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        do {
            clearScreen();
            System.out.println(BLUE + "Minha Biblioteca" + RESET);
            System.out.println(GREEN + "0 - " + RESET + "Sair");
            System.out.println(GREEN + "1 - " + RESET + "Criar autor");
            System.out.println(GREEN + "2 - " + RESET + "Criar livro");
            System.out.println(GREEN + "3 - " + RESET + "Criar biblioteca");
            System.out.println(GREEN + "4 - " + RESET + "Adicionar livro");
            System.out.println(GREEN + "5 - " + RESET + "Emprestar livro");
            System.out.println(GREEN + "6 - " + RESET + "Devolver livro");
            try {
                op = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                op = 99;
            }

            switch (op) {
                case 0: {
                    clearScreen();
                    System.out.println("Sair....");
                    break;
                }
                case 1: {
                    clearScreen();
                    System.out.println("Digite o nome do autor");
                    String nome = sc.nextLine();
                    System.out.println("Digite o nacionalidade do autor");
                    String nacionalidade = sc.nextLine();
                    new Autor(nome, nacionalidade);
                    break;
                }
                case 2: {
                    clearScreen();
                    System.out.println("Digite o titulo");
                    String titulo = sc.nextLine();
                    int posicaoAutor = -1;
                    do {
                        clearScreen();
                        Autor.listarAutores();
                        try {
                            posicaoAutor = sc.nextInt();
                            sc.nextLine();
                            if (posicaoAutor >= Autor.getAutores().size()) {
                                System.out.println(RED + "Autor inválido" + RESET);
                            }
                        } catch (Exception e) {
                            System.out.println(RED + "Autor inválido" + RESET);
                            posicaoAutor = -1;
                        }
                    } while (posicaoAutor < 0);

                    Autor autor = Autor.getAutores().get(posicaoAutor);
                    new Livro(titulo, autor, true);
                    break;
                }
                // Resto dos casos...
                default: {
                    clearScreen();
                    System.out.println(RED + "Opção inválida" + RESET);
                    break;
                }
            }
            pause();
        } while (op != 0);
        sc.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pause() {
        System.out.println("\nPressione Enter para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {}
    }
}
