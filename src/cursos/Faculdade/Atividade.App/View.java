package Atividade.App;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
    Scanner tec = new Scanner(System.in);
    private DeviceService deviceService = new DeviceService();

    public void menu() {
        System.out.println("--- MENU ---");
        System.out.println("1) Gestão de device");
        System.out.println("2) Gestão de Aplicativos");
        System.out.print("Informe a opção desejada: ");
        String opcao = tec.next();

        if (opcao.equalsIgnoreCase("1")) {
            gestaoDeDevice();
        }
        if (opcao.equalsIgnoreCase("2")) {
            gestaoDeAplicativos(); // Corrigido o nome do método
        }
        System.out.println("Opção Inválida.");
    }

    public void gestaoDeDevice() {
        System.out.println(" --- MENU DE DEVICES ---");
        System.out.println("1) Cadastrar um novo Device");
        System.out.println("2) Listar Devices cadastrados");
        System.out.println("3) Pesquisar um Device");
        System.out.println("4) Editar um Device");
        System.out.println("5) Remover um Device");

        System.out.println("Informe a opção desejada");
        switch (tec.nextInt()){
            case 1:
                System.out.println("--- Cadastrar um novo Device ---");
                Device novoDevice = novoDevice();
                deviceService.adicionarDevice(novoDevice);
                break;
            case 2:
                System.out.println("--- Devices cadastrados ---");
                listarDevices(deviceService.listarDevice());
                break;
            case 3:
                System.out.println("--- Buscar um device cadastrado ---");
                Long deviceId = buscarDevice();
                Device device = deviceService.buscarDevice(deviceId);
                if (device != null) {
                    //tem que ir algo aqui
                } else {
                    System.out.println("Device não encontrado.");
                }
                break;
            case 4:
                System.out.println("--- Editar os dados de um device ---");
                editarDevice();
                break;
            case 5:
                System.out.println("--- Remover um device ---");
                Long idParaRemover = removerDevice();
                deviceService.excluirDevice(idParaRemover);
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }

    public void editarDevice() {
        System.out.println("1) Informar os novos dados");
        System.out.println("2) Editar método");
        System.out.print("Informe a opção desejada: ");

        int opcao = tec.nextInt();
        if (opcao == 1) {
            // Implemente a lógica para editar os dados do dispositivo
        } else if (opcao == 2) {
            System.out.print("Informe o ID do device: ");
            Long deviceId = tec.nextLong();
            // Implemente a lógica para editar o dispositivo pelo ID
        } else {
            System.out.println("Opção Inválida!");
        }
    }

    public Device novoDevice() {
        Device device = new Device();

        System.out.println("Informe a marca: ");
        device.setMarca(tec.next());
        System.out.println("Informe o modelo: ");
        device.setModelo(tec.next());
        System.out.println("Informe o total de memória (em GB): ");
        device.setMemoria(tec.nextLong());
        System.out.println("Informe o total de armazenamento (em GB): ");
        device.setArmazenamento(tec.nextLong());

        return device;
    }

    public Long removerDevice() {
        System.out.print("Informe o ID a ser removido: ");
        return tec.nextLong();
    }

    public Long buscarDevice() {
        System.out.print("Informe o ID do dispositivo desejado: ");
        return tec.nextLong();
    }

    public void listarDevices(ArrayList<Device> devices) {
        if (!devices.isEmpty()) {
            for (Device device : devices) {
                System.out.println("Id: " + device.getId());
                System.out.println("Marca: " + device.getMarca());
                System.out.println("Modelo: " + device.getModelo());
                System.out.println("Total de memória: " + device.getMemoria() + " GB");
                System.out.println("Total de armazenamento: " + device.getArmazenamento() + " GB");
            }
        } else {
            System.out.println("Nenhum dispositivo cadastrado.");
        }
    }

    public void gestaoDeAplicativos() {
        System.out.println(" --- MENU DE Aplicativos ---");
        System.out.println("1) Cadastrar um novo Aplicativo");
        System.out.println("2) Listar Aplicativos cadastrados");
        System.out.println("3) Pesquisar um Aplicativo");
        System.out.println("4) Editar um Aplicativo");
        System.out.println("5) Remover um Aplicativo");

        System.out.print("Informe a opção desejada: ");
    }
