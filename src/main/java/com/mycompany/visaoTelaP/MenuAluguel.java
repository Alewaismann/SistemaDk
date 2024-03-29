/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visaoTelaP;

import com.mycompany.dao.daoAluguel;
import com.mycompany.ferramentas.DadosTemporarios;
import com.mycompany.modelo.ModAluguel;
import com.mycompany.modelo.ModCliente;
import com.mycompany.modelo.ModProduto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandre.9930
 */
public class MenuAluguel extends javax.swing.JFrame {

    /**
     * Creates new form MenuAluguel
     */
    public MenuAluguel() {
        initComponents();
        
        
        setLocationRelativeTo(null);
        
        existeDadosTemporarios();
        
        try{
            daoAluguel aluguel = new daoAluguel();
            
            tfId.setText(String.valueOf(aluguel.buscarProximoId()));
        }catch(Exception e){
        
        }
       tfId.setVisible(false);
       tfIdProduto.setVisible(false);
       tfIdCliente.setVisible(false);
    }
    
    private Boolean existeDadosTemporarios(){        
        if(DadosTemporarios.tempObjectCliente instanceof ModCliente){
//            int id = ((ModProduto) DadosTemporarios.tempObject).getId();
//            String nome = ((ModProduto) DadosTemporarios.tempObject).getNome();
//            Double preco = ((ModProduto) DadosTemporarios.tempObject).getPreco();
//            String descricao = ((ModProduto) DadosTemporarios.tempObject).getDescricao();
//            String categoria = DadosTemporarios.categoriaProdutoVenda;
//           // String marca = DadosTemporarios.marcaProdutoVenda;
//            int idCliente = DadosTemporarios.idUsuarioLogado;
//            
//            int proximoIdPedido = new daoAluguel().buscarProximoId();
//            
//           // tfIdPedido.setText(String.valueOf(proximoIdPedido));
//            tfIdCliente.setText(String.valueOf(idCliente));
//            tfIdProduto.setText(String.valueOf(id));
//            
//            
//            LbCliente.setText(nome);
//            LbProduto.setText(nome);
//            //labelPreco.setText(String.valueOf(preco));
//            //labelCategoriaProduto.setText(categoria);
//            //labelMarcaProduto.setText(marca);
//            //taDescricao.setText(descricao);
//            
//            DadosTemporarios.tempObject = null;
//            DadosTemporarios.categoriaProdutoVenda = null;
//          //DadosTemporarios.marcaProdutoVenda = null;
            
            tfIdCliente.setText(String.valueOf(((ModCliente) DadosTemporarios.tempObjectCliente).getId()));
            LbCliente.setText(((ModCliente) DadosTemporarios.tempObjectCliente).getNome());

            tfIdProduto.setText(String.valueOf(((ModProduto) DadosTemporarios.tempObjectProduto).getId()));
            LbProduto.setText(((ModProduto) DadosTemporarios.tempObjectProduto).getNome());
            
            return true;
        }else
            return false;
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfIdCliente = new javax.swing.JTextField();
        tfIdProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LbCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LbProduto = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfData_Dev = new javax.swing.JTextField();
        tfData_Al = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmação");

        tfIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdProdutoActionPerformed(evt);
            }
        });

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jLabel1.setText("Confirme os dados:");

        jLabel2.setText("O cliente");

        LbCliente.setText("nome");

        jLabel3.setText("está alugando o produto");

        LbProduto.setText("nome");

        jLabel4.setText("Preço Aluguel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfData_Al, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfData_Dev, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfPreco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LbCliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LbProduto))
                                .addComponent(jLabel1)
                                .addComponent(jButton2)))
                        .addGap(18, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LbCliente)
                    .addComponent(jLabel3)
                    .addComponent(LbProduto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfData_Al, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfData_Dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdProdutoActionPerformed
       
    }//GEN-LAST:event_tfIdProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            //LocalDateTime now = LocalDateTime.now();  

            daoAluguel aluguel = new daoAluguel();
            
            int id = Integer.parseInt(tfId.getText());
            int idCliente = Integer.parseInt(tfIdCliente.getText());
            int idProduto = Integer.parseInt(tfIdProduto.getText());
            String dataAluguel = LocalDateTime.now().toString();
            double total = Double.parseDouble(tfPreco.getText());
//            String dataPedido = now.toString();
          //  int quantidade = Integer.parseInt(labelQuantidadeCompra.getText());
            
            aluguel.inserir(id, idCliente, idProduto,dataAluguel , tfData_Dev.getText(), total);

            JOptionPane.showMessageDialog(null, "Aluguel feito com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Houve um problema ao tentar salvar o aluguel!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbCliente;
    private javax.swing.JLabel LbProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfData_Al;
    private javax.swing.JTextField tfData_Dev;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfIdCliente;
    private javax.swing.JTextField tfIdProduto;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
