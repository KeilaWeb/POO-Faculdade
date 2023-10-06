package Atividade.App;

import java.util.ArrayList;

public class DeviceService {
    public ArrayList<Device> devices = new ArrayList<>();

    public Device adicionarDevice(Device device){
        //TODO: desenvolver lógica

        return device;
    }

    public ArrayList<Device> listarDevice(){
        //TODO: desenvolver lógica

        return this.devices;
    }

    public Device buscarDevice(Long deviceId){
        Device device = new Device();
        //TODO: desenvolver lógica

        return device;
    }

    public Device editarDevice(Long deviceId){
        Device device = new Device();
        //TODO: desenvolver lógica

        return device;
    }

    public Device editarDevice(Long deviceId, Device device){
        Device editedDevice = new Device();
        //TODO: desenvolver lógica

        return editedDevice;
    }

    public void excluirDevice(Long deviceId){
        //TODO: desenvolver lógica

    }

}
