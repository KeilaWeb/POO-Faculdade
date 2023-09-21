public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorPessoas gestor = new GestorPessoas();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Pessoa");
            System.out.println("2 - Remover Pessoa");
            System.out.println("3 - Buscar Pessoa");
            System.out.println("4 - Limpar Vetor");
            System.out.println("5 - Ordenar Vetor");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe a idade da pessoa: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do teclado

                    Pessoa pessoa = new Pessoa(nome, idade);
                    gestor.addPessoa(pessoa);
                    break;
                case 2:
                    System.out.print("Informe o índice da pessoa a ser removida: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do teclado
                    gestor.removePessoa(indice);
                    break;
                case 3:
                    System.out.print("Informe o nome da pessoa a ser buscada: ");
                    String nomeBusca = scanner.nextLine();
                    Pessoa pessoaEncontrada = gestor.buscarPessoa(nomeBusca);
                    if (pessoaEncontrada != null) {
                        System.out.println("Pessoa encontrada: " + pessoaEncontrada);
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;
                case 4:
                    gestor.limparPessoas();
                    System.out.println("Vetor limpo.");
                    break;
                case 5:
                    gestor.ordenarPessoas();
                    System.out.println("Vetor ordenado por nome.");
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("Pessoas no vetor:");
            List<Pessoa> pessoas = gestor.getPessoas();
            for (int i = 0; i < pessoas.size(); i++) {
                System.out.println(i + ": " + pessoas.get(i));
            }
        }
    }
}
    /*Neste código, você pode adicionar, remover, buscar,
    limpar e ordenar pessoas no vetor usando um menu interativo.
        A classe GestorPessoas é responsável por gerenciar todas essas
        operações no vetor pessoas. Certifique-se de seguir as opções do
            menu para realizar as operações desejadas.*/





