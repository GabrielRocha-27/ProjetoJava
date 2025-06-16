package gui;

import gui.ListarCursosView;
import javax.swing.JOptionPane;
import modelo.Curso;
import dao.CursoDAO;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import util.Validador;
import java.util.List;

public class Tela_Curso extends javax.swing.JFrame {

    
    public Tela_Curso() {
        initComponents();
    }
    
    // Método auxiliar
    private void limparCampos() {
        jTextFieldNomeCurso.setText("");
        jTextFieldCargaHorariaCurso.setText("");
        jTextFieldQtdAlunos.setText("");
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCadastrarCurso = new javax.swing.JButton();
        btnListarCurso = new javax.swing.JButton();
        jTextFieldNomeCurso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCargaHorariaCurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldQtdAlunos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnManual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 188, 191));

        btnCadastrarCurso.setBackground(new java.awt.Color(19, 31, 38));
        btnCadastrarCurso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarCurso.setForeground(new java.awt.Color(217, 217, 217));
        btnCadastrarCurso.setText("Cadastrar Curso");
        btnCadastrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCursoActionPerformed(evt);
            }
        });

        btnListarCurso.setBackground(new java.awt.Color(19, 31, 38));
        btnListarCurso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListarCurso.setForeground(new java.awt.Color(217, 217, 217));
        btnListarCurso.setText("Listar Todos Cursos");
        btnListarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCursoActionPerformed(evt);
            }
        });

        jTextFieldNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCursoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 10, 13));
        jLabel1.setText("Nome do Curso");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 10, 13));
        jLabel2.setText("Carga Horaria do Curso");

        jTextFieldCargaHorariaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCargaHorariaCursoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 10, 13));
        jLabel3.setText("Quantidade Limite de Aluno");

        jTextFieldQtdAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQtdAlunosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 10, 13));
        jLabel4.setText("Cadastro de Curso");

        btnManual.setBackground(new java.awt.Color(19, 31, 38));
        btnManual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManual.setForeground(new java.awt.Color(217, 217, 217));
        btnManual.setText("Manual do Projeto");
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldQtdAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCargaHorariaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnListarCurso))
                            .addComponent(btnManual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jTextFieldNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCargaHorariaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQtdAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnManual, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCursoActionPerformed
        try {
        String nome = jTextFieldNomeCurso.getText().trim();
        int cargaHoraria = Integer.parseInt(jTextFieldCargaHorariaCurso.getText().trim());
        int limiteAlunos = Integer.parseInt( jTextFieldQtdAlunos.getText().trim());

        // Validação
        if (!Validador.validarNome(nome)) {
            JOptionPane.showMessageDialog(this, "Nome do curso inválido! Mínimo 3 caracteres.");
            return;
        }

        if (!Validador.validarCargaHoraria(cargaHoraria)) {
            JOptionPane.showMessageDialog(this, "Carga horária inválida! Mínimo 20 horas.");
            return;
        }

        if (!Validador.validarLimiteAlunos(limiteAlunos)) {
            JOptionPane.showMessageDialog(this, "Quantidade de alunos inválida! Mínimo 1 aluno.");
            return;
        }

        // Criando o curso
        Curso curso = new Curso(nome, cargaHoraria, limiteAlunos);

        // Salvando no banco
        CursoDAO dao = new CursoDAO();
        boolean sucesso = dao.inserir(curso);

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Curso cadastrado com sucesso!");
            limparCampos(); // Método opcional para limpar os campos
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar curso.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Carga horária e quantidade de alunos devem ser números.");
    }
        
    }//GEN-LAST:event_btnCadastrarCursoActionPerformed
        // CERTO!
    private void jTextFieldQtdAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQtdAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQtdAlunosActionPerformed

    private void btnListarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCursoActionPerformed
        CursoDAO dao = new CursoDAO(); // instancia seu DAO
        List<Curso> listaCursos = dao.listar(); // busca os cursos do banco

        ListarCursosView tela = new ListarCursosView(); // abre a nova tela
        tela.preencherTabela(listaCursos); // envia os dados para a jTable1
        tela.setVisible(true); // exibe a tela
    }//GEN-LAST:event_btnListarCursoActionPerformed

    private void jTextFieldCargaHorariaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCargaHorariaCursoActionPerformed
        jTextFieldCargaHorariaCurso.requestFocus(); // Vai para o próximo campo
    }//GEN-LAST:event_jTextFieldCargaHorariaCursoActionPerformed

    private void jTextFieldNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCursoActionPerformed
        jTextFieldCargaHorariaCurso.requestFocus(); // Vai para o próximo campo
    }//GEN-LAST:event_jTextFieldNomeCursoActionPerformed

    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
        InputStream inputStream = getClass().getResourceAsStream("/docs/Manual.pdf");
if (inputStream != null) {
    try {
        // Cria arquivo temporário
        File tempFile = File.createTempFile("Manual", ".pdf");
        tempFile.deleteOnExit();

        // Grava conteúdo do InputStream no arquivo temporário
        Files.copy(inputStream, tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

        // Abre o arquivo com o programa padrão do sistema
        Desktop.getDesktop().open(tempFile);

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Erro ao abrir o manual: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(this, "Arquivo do manual não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnManualActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Curso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Curso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Curso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Curso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Curso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCurso;
    private javax.swing.JButton btnListarCurso;
    private javax.swing.JButton btnManual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCargaHorariaCurso;
    private javax.swing.JTextField jTextFieldNomeCurso;
    private javax.swing.JTextField jTextFieldQtdAlunos;
    // End of variables declaration//GEN-END:variables


}
