package Atividade.App;

public class DeviceService {
    Scanner tec = new Scanner(System.in);
    public ArrayList<Device> devices = new ArrayList<>();

    public Device adicionarDevice(Device device) {
        if (Objects.isNull(device)) {
            System.out.println("Device não pode ser cadastrado.");
            return device;
        }
        devices.add(device);
        return device;
    }

    public ArrayList<Device> listarDevice() {
        if (devices.isEmpty()) {
            System.out.println("Não possui devices cadastrados.");
        }
        return devices;
    }

    public Device buscarDevice(Long deviceId){
        for (Device device : devices){
            if (device.getId().equals(deviceId)) {
                return device;
            }
        }
        System.out.println("Device não encontrado.");
        return null;
    }

    public Device novoDevice(){
        Device device = new Device();
        System.out.println("Informe a marca: ");
        device.setMarca(tec.next());
        System.out.println("Informe o modelo: ");
        device.setModelo(tec.next());
        System.out.println("Informe a quantidade de memória: ");
        device.setMemoria(tec.next());
        System.out.println("Informe o total de armazenamento: ");
        device.setArmazenamento(tec.nextLong());

        System.out.println("Deseja informar os apps instalados? [s/n]");
        String appsInstalados = tec.next();
        if (appsInstalados.equalsIgnoreCase("s")) {
            AplicativoService aplicativoService = new AplicativoService(); // Crie uma instância de AplicativoService
            device.setAplicativos(aplicativoService.appsInstalados()); // Chame o método a partir da instância
        }
        return device;
    }

    public Device editarDevice(Long deviceId) {
        for (Device editedDevice : devices) {
            if (editedDevice.getId().equals(deviceId)) {
                Device novoDevice = novoDevice();
                devices.set(devices.indexOf(editedDevice), novoDevice);
                System.out.println("Device editado com sucesso.");
                return novoDevice;
            }
        }
        System.out.println("Device não encontrado.");
        return null;
    }

    public Device editarDevice(Long deviceId, Device device){
        Device editedDevice = buscarDevice(deviceId);
        if (editedDevice != null) {
            // Implemente a lógica de edição com base no dispositivo 'device'
            return editedDevice;
        }
        System.out.println("Device não encontrado.");
        return null;
    }

    public void excluirDevice(Long deviceId){
        devices.removeIf(device -> device.getId().equals(deviceId));
    }
}
