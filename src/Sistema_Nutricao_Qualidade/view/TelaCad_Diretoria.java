/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema_Nutricao_Qualidade.view;

import java.sql.Connection;
import javax.swing.JOptionPane;
import sistema_nutricao_qualidade.conexao.ConexaoDAO;
import sistema_nutricao_qualidade.controller.DiretoriaDAO;
import sistema_nutricao_qualidade.model.Cadastro_Usuario;
import sistema_nutricao_qualidade.model.Diretoria;

/**
 *
 * @author Juliana
 */
public class TelaCad_Diretoria extends javax.swing.JFrame {

    /**
     * Creates new form TelaCad_Diretoria
     */
    public TelaCad_Diretoria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ftfCelular = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        ftfTelefone = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtNomeDiretoria = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtConsId = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        btnPagianInicial = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabelMensagen = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpar.setBackground(new java.awt.Color(102, 153, 255));
        btnLimpar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Nutricao_Qualidade/views/icones/limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, -1, -1));

        btnAtualizar.setBackground(new java.awt.Color(102, 153, 255));
        btnAtualizar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Nutricao_Qualidade/views/icones/Atualizar arquivo.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(0, 204, 0));
        btnSalvar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Nutricao_Qualidade/views/icones/save-file.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Nutricao_Qualidade/views/icones/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 102, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Nutricao_Qualidade/views/icones/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        jLabel21.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("*Campos obrigatórios.");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, -1));

        txtIdUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtIdUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtIdUsuario.setToolTipText("Insira o ID no usuário que deseja incluir os dados.");
        getContentPane().add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 70, -1));

        jLabel27.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("ID usuário:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 250, -1));

        jLabel28.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Email:*");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        ftfCelular.setBackground(new java.awt.Color(255, 255, 255));
        ftfCelular.setForeground(new java.awt.Color(0, 0, 0));
        try {
            ftfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfCelularActionPerformed(evt);
            }
        });
        getContentPane().add(ftfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 210, -1));

        jLabel26.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Celular:*");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        ftfTelefone.setBackground(new java.awt.Color(255, 255, 255));
        ftfTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            ftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(ftfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 220, -1));

        jLabel25.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Telefone: ");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        txtSobrenome.setBackground(new java.awt.Color(255, 255, 255));
        txtSobrenome.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 290, -1));

        jLabel24.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Sobrenome:*");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        txtNomeDiretoria.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeDiretoria.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNomeDiretoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 230, -1));

        jLabel23.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Nome:*");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 51, 0));
        jLabel9.setText("Dados Diretoria");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CADASTRAR DIRETORIA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(399, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1000, -1));

        btnPesquisar.setBackground(new java.awt.Color(102, 153, 255));
        btnPesquisar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Nutricao_Qualidade/views/icones/buscar 32px.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Consultar Cadastro Diretoria");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        txtConsId.setBackground(new java.awt.Color(255, 255, 255));
        txtConsId.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtConsId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, -1));

        jLabel35.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("ID:");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnPagianInicial.setBackground(new java.awt.Color(204, 204, 204));
        btnPagianInicial.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnPagianInicial.setForeground(new java.awt.Color(153, 153, 153));
        btnPagianInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Nutricao_Qualidade/views/icones/home 1 32px.png"))); // NOI18N
        btnPagianInicial.setText("Página Inicial");
        btnPagianInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagianInicialActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagianInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 51, 0));
        jLabel8.setText("QualiNutri ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, 70));

        jLabelMensagen.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelMensagen.setForeground(new java.awt.Color(255, 153, 0));
        jLabelMensagen.setText("Empresa de Consultoria em Nutrição e Qualidade.");
        getContentPane().add(jLabelMensagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 300, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Nutricao_Qualidade/view/imagens/puzzle (1) 64px.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema_Nutricao_Qualidade/view/imagens/borrao-abstrato-de-pastel-lindo-cor-de-rosa-pessego-ceu-tom-quente-fundo-para-design-como-bannerslid.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagianInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagianInicialActionPerformed
        Tela_Principal telaprinc = new Tela_Principal();
        telaprinc.setVisible(true);
    }//GEN-LAST:event_btnPagianInicialActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        int idPesquisa = Integer.parseInt(txtConsId.getText());

        DiretoriaDAO dirDao = new DiretoriaDAO();
        Diretoria dir = dirDao.consultar(idPesquisa);

        if (dir == null) {
            JOptionPane.showMessageDialog(this, " ID Diretoria não encontrado!");
        } else {
            txtNomeDiretoria.setText(dir.getNome());
            txtSobrenome.setText(dir.getSobrenome());
            ftfTelefone.setText(dir.getTelefone());
            ftfCelular.setText(dir.getCelular());
            txtEmail.setText(dir.getEmail());

            Cadastro_Usuario usuario = dir.getUsuario();

            if (usuario != null) {
                txtIdUsuario.setText(String.valueOf(usuario.getId()));
            } else {
                txtIdUsuario.setText("");
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void ftfCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfCelularActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Diretoria dir = new Diretoria();
        DiretoriaDAO dirDao = new DiretoriaDAO();

        int idConsId = Integer.parseInt(txtConsId.getText());
        String nome = txtNomeDiretoria.getText();
        String sobrenome = txtSobrenome.getText();
        String telefone = ftfTelefone.getText();
        String celular = ftfCelular.getText();
        String email = txtEmail.getText();
        int idUsuario = Integer.parseInt(txtIdUsuario.getText());

        dir.setId(idConsId);
        dir.setNome(nome);
        dir.setSobrenome(sobrenome);
        dir.setTelefone(telefone);
        dir.setCelular(celular);
        dir.setEmail(email);

        if (idUsuario != 0) {
            Cadastro_Usuario usuario = new Cadastro_Usuario();
            usuario.setId(idUsuario);
            dir.setUsuario(usuario);
        } else {
            dir.setUsuario(null);
        }

        int resposta = dirDao.atualizar(dir);
        System.out.println(dir.getId());

        if (resposta == 1) {
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
            this.limparCampos();
        } else if (resposta == 1062) {
            JOptionPane.showMessageDialog(null, "Diretoria já cadastrada");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao tentar atualizar Diretoria");
        }

        limparCampos();

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        String nome = txtNomeDiretoria.getText();
        String sobrenome = txtSobrenome.getText();
        String email = txtEmail.getText();
        String telefone = ftfTelefone.getText();
        String celular = ftfCelular.getText();

        int idUsuario = Integer.parseInt(txtIdUsuario.getText());

        if (emptyFields()) {
            return;
        }

        if (strValidacao()) {
            JOptionPane.showMessageDialog(null, "Erro de validação. Verifique os campos.");
            return;

        } else {

            Diretoria dir = new Diretoria();

            Cadastro_Usuario usuario = new Cadastro_Usuario();
            usuario.setId(idUsuario);

            if (idUsuario != 0) {
                dir.setUsuario(usuario);
            } else {
                dir.setUsuario(null);
            }

            dir.setNome(nome);
            dir.setSobrenome(sobrenome);
            dir.setEmail(email);
            dir.setTelefone(telefone);
            dir.setCelular(celular);

            DiretoriaDAO dirDao = new DiretoriaDAO();
            dirDao.salvar(dir);

            JOptionPane.showMessageDialog(null, "Dados incluidos com sucesso");
            limparCampos();

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int id = Integer.parseInt(txtConsId.getText());
        DiretoriaDAO dirdao = new DiretoriaDAO();
        boolean excluido = dirdao.excluir(id);

        if (excluido) {
            JOptionPane.showMessageDialog(null, "Cadastro Diretoria excluído com sucesso!");
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a diretoria");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void limparCampos() {
        txtConsId.setText("");
        txtNomeDiretoria.setText("");
        txtSobrenome.setText("");
        ftfTelefone.setText("");
        ftfCelular.setText("");
        txtEmail.setText("");
        txtIdUsuario.setText("");
        txtNomeDiretoria.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCad_Diretoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCad_Diretoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCad_Diretoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCad_Diretoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCad_Diretoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPagianInicial;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField ftfCelular;
    private javax.swing.JFormattedTextField ftfTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMensagen;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtConsId;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNomeDiretoria;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables

    private boolean strValidacao() {

        boolean validacao = true;

        String strTeste = txtNomeDiretoria.getText();
        boolean palavra = strTeste.matches("[a-zA-Z]*");
        String strTeste1 = txtSobrenome.getText();
        boolean palavra1 = strTeste1.matches("[a-zA-Z]*");
        String strTeste2 = ftfTelefone.getText();
        boolean palavra2 = strTeste2.matches("[(][0-9]{2}[)][0-9]{4,}[-][0-9]{4}");
        String strTeste3 = ftfCelular.getText();
        boolean palavra3 = strTeste3.matches("[(][0-9]{2}[)][0-9]{4,}[-][0-9]{4}");
        String strTeste4 = txtEmail.getText();
        boolean palavra4 = strTeste4.matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}");

        if (palavra == false) {
            JOptionPane.showMessageDialog(null, "Digite apenas letras.");

        } else if (palavra1 == false) {
            JOptionPane.showMessageDialog(null, "Digite apenas letras.");

        } else if (palavra2 == false) {
            JOptionPane.showMessageDialog(null, "Telefone deve ser digitado no formato (xx)xxxxx-xxxx");

        } else if (palavra3 == false) {
            JOptionPane.showMessageDialog(null, "O Número de celular deve ser digitado no formato xxx.xxx.xxx-xx");

        } else if (palavra4 == false) {
            JOptionPane.showMessageDialog(null, "E-mail precisa ser no formato nome@dominio.com.br ");

        } else {
            validacao = false;

        }

        return validacao;
    }

    private boolean emptyFields() {

        boolean empty = true;

        if (txtNomeDiretoria.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Campo Nome precisa ser preenchido.");

        } else if (txtSobrenome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Campo Sobrenome precisa ser preenchido.");

        } else if (ftfTelefone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Campo Telefone precisa ser preenchido.");

        } else if (ftfCelular.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Campo Celular precisa ser preenchido.");

        } else if (txtEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Campo Email precisa ser preenchido.");

        } else {

            empty = false;
        }

        return empty;
    }

}