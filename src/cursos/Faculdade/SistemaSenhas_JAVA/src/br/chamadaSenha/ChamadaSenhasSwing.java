package br.chamadaSenha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChamadaSenhasSwing {
    private SistemaSenhas sistema;
    private JLabel labelSenhaAtual;

    public ChamadaSenhasSwing() {
        sistema = new SistemaSenhas();

        JFrame frame = new JFrame("Chamada de Senhas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnPreferencial = new JButton("Chamar Senha Preferencial");
        btnPreferencial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chamarSenhaPreferencial();
            }
        });

        JButton btnNormal = new JButton("Chamar Senha Normal");
        btnNormal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chamarSenhaNormal();
            }
        });

        labelSenhaAtual = new JLabel("Senha Atual: N/A");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(btnPreferencial);
        panel.add(btnNormal);
        panel.add(labelSenhaAtual);

        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private void chamarSenhaPreferencial() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                sistema.gerarSenhaPreferencial();
                return null;
            }

            @Override
            protected void done() {
                atualizarLabelSenhaAtual();
            }
        };
        worker.execute();
    }

    private void chamarSenhaNormal() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                sistema.gerarSenhaNormal();
                return null;
            }

            @Override
            protected void done() {
                atualizarLabelSenhaAtual();
            }
        };
        worker.execute();
    }

    private void atualizarLabelSenhaAtual() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                labelSenhaAtual.setText("Senha Atual: " + sistema.getSenhaAtual().toString());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChamadaSenhasSwing();
            }
        });
    }
}

