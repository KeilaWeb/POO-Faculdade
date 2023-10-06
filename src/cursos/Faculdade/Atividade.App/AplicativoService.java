package Atividade.App;

public class AplicativoService {
    Scanner tec = new Scanner(System.in);
    public ArrayList<Aplicativo> aplicativos = new ArrayList<>();

    public Aplicativo adicionarAplicativo(Aplicativo aplicativo){
        if (Objects.isNull(aplicativo)) {
            System.out.println("Aplicativo não pode ser cadastrado.");
            return aplicativo;
        }
        aplicativos.add(aplicativo);
        return aplicativo;
    }

    public ArrayList<Aplicativo> listarAplicativo(){
        return aplicativos;
    }

    public Aplicativo buscarAplicativo(Long aplicativoId){
        for (Aplicativo aplicativo : aplicativos){
            if (aplicativo.getId().equals(aplicativoId)) {
                return aplicativo;
            }
        }
        System.out.println("Aplicativo não encontrado.");
        return null;
    }

    public Aplicativo editarAplicativo(Long aplicativoId){
        for (Aplicativo aplicativo : aplicativos){
            if (aplicativo.getId().equals(aplicativoId)){
                // Implemente a lógica de edição
                return aplicativo;
            }
        }
        System.out.println("Aplicativo não encontrado.");
        return null;
    }

    public Aplicativo editarAplicativo(Long aplicativoId, Aplicativo aplicativo){
        for (Aplicativo app : aplicativos){
            if (app.getId().equals(aplicativoId)){
                // Implemente a lógica de edição com base no aplicativo 'aplicativo'
                return aplicativo;
            }
        }
        System.out.println("Aplicativo não encontrado.");
        return null;
    }

    public void excluirAplicativo(Long aplicativoId){
        aplicativos.removeIf(aplicativo -> aplicativo.getId().equals(aplicativoId));
    }

    public ArrayList<Aplicativo> appsInstalados(){
        System.out.println("--- APLICATIVOS INSTALADOS ---");
        for (Aplicativo aplicativo : aplicativos){
            System.out.println("Id: " + aplicativo.getId());
            System.out.println("APP: " + aplicativo.getAppName());
            System.out.println("Versão: " + aplicativo.getVersao());
        }

        ArrayList<Aplicativo> aplicativosList = new ArrayList<>();
        System.out.println("Escolha uma opção: ");
        System.out.println("1) Informar um app já cadastrado");
        System.out.println("2) Cadastrar um novo App");
        String opcao = tec.next();

        do {
            if (opcao.equals("1")) {
                System.out.println("Informe o ID do APP: ");
                Long appId = tec.nextLong();
                for (Aplicativo app : aplicativos) {
                    if (app.getId().equals(appId)) {
                        aplicativosList.add(app);
                    }
                }
            }
            System.out.println("Deseja informar outro App: [s/n]");
            opcao = tec.next();
        } while (opcao.equalsIgnoreCase("s"));

        if (opcao.equals("2")) {
            do {
                aplicativosList.add(cadastrarApp());
                System.out.println("Deseja cadastrar outro app? [s/n]");
                opcao = tec.next();
            } while (opcao.equalsIgnoreCase("s"));
        }
        return aplicativosList;
    }

    public Aplicativo cadastrarApp(){
        Aplicativo aplicativo = new Aplicativo();
        aplicativo.setId((long) aplicativos.size());
        System.out.println("Informe o Nome do App: ");
        aplicativo.setAppName(tec.next());
        System.out.println("Informe o App Id do App: ");
        aplicativo.setAppId(tec.next());
        System.out.println("Informe a versão do App: ");
        aplicativo.setVersao(tec.next());
        System.out.println("Informe a data da última atualização: [dd/MM/yyyy]");
        aplicativo.setUltimaAtualizacao(tec.next());
        return aplicativo;
    }
}

