package keila.cursoemvideo.contabanco;

import java.util.Scanner;

/*
* Aqui eu fiz as atribuições com o tipo;
* Criei o métodos personalizados abrir, fechar, depositar, sacar e pagar mensalidade da conta,
* Dai montei os geters(void) e seters(tipo primitivo) vazios;
*  (e depois de inserir os metodos geters e seters, coloquei as condições dos metodos);
* por fim criei um estado atual para imprimir as informações;
* */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println("----------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da conta é: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    //metodo Personalizado
    public void abrirConta(String t){
        Scanner tec = new Scanner(System.in);
        this.setStatus(true);
        System.out.println("Digite seu nome: ");
        this.dono = tec.nextLine();
        System.out.println("Informe o número da conta a ser utilizado");
        this.numConta = tec.nextInt();
        System.out.println("Informe o Tipo da conta:\nCC - Conta Corrente\nCP - Conta Poupança: ");
        this.tipo = tec.nextLine();
        if (this.tipo.equals("CC")){
            this.setSaldo(50);
            System.out.println("Conta Aberta com Sucesso!");
        }else if (this.tipo.equals("CP")){
            this.setSaldo(150);
            System.out.println("Conta Aberta com Sucesso!");
        }

    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, porque ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta ainda não pode ser fechada, pois está em débito");
        }else {
            this.setStatus(false);
            System.out.println("Conta Fechada com sucesso");
        }
    }

    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        }else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else {
                System.out.println("Saldo insuficiente para sacar");
            }
        }else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if (this.tipo.equals("CC")){
            v = 12;
        }else {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }

    //metodo Especiais
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta (int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono (String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo (float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus (boolean status) {
        this.status = status;
    }
}
