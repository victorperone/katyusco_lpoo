/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliente Preferencial
 */
public class Adiciona_menu extends javax.swing.JFrame {
    banco_de_dados Data = new banco_de_dados();
    
    public Adiciona_menu() {
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

        adiciona_animal = new javax.swing.JButton();
        Adiciona_macaco = new javax.swing.JButton();
        Adiciona_humano = new javax.swing.JButton();
        Adiciona_mamifero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Campo_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Campo_Peso = new javax.swing.JTextField();
        Adiciona_cavalo = new javax.swing.JButton();
        Adiciona_anfibio = new javax.swing.JButton();
        Adiciona_beija_Flor = new javax.swing.JButton();
        Adiciona_reptil = new javax.swing.JButton();

        adiciona_animal.setText("Animal");
        adiciona_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adiciona_animalActionPerformed(evt);
            }
        });

        Adiciona_macaco.setText("Macaco");
        Adiciona_macaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adiciona_macacoActionPerformed(evt);
            }
        });

        Adiciona_humano.setText("Homem");
        Adiciona_humano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adiciona_humanoActionPerformed(evt);
            }
        });

        Adiciona_mamifero.setText("Mamifero");
        Adiciona_mamifero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adiciona_mamiferoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Peso:");

        Adiciona_cavalo.setText("Cavalo");
        Adiciona_cavalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adiciona_cavaloActionPerformed(evt);
            }
        });

        Adiciona_anfibio.setText("Anfibio");
        Adiciona_anfibio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adiciona_anfibioActionPerformed(evt);
            }
        });

        Adiciona_beija_Flor.setText("Beija-Flor");
        Adiciona_beija_Flor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adiciona_beija_FlorActionPerformed(evt);
            }
        });

        Adiciona_reptil.setText("Reptil");
        Adiciona_reptil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adiciona_reptilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Campo_Peso)
                            .addComponent(Campo_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Adiciona_humano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Adiciona_macaco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Adiciona_cavalo))
                            .addComponent(Adiciona_mamifero))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Adiciona_anfibio)
                .addGap(48, 48, 48)
                .addComponent(Adiciona_reptil)
                .addGap(45, 45, 45)
                .addComponent(Adiciona_beija_Flor)
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adiciona_animal)
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Campo_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Campo_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adiciona_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Adiciona_humano, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Adiciona_macaco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Adiciona_cavalo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Adiciona_beija_Flor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Adiciona_mamifero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Adiciona_anfibio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Adiciona_reptil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)))
                .addGap(43, 43, 43))
        );

        setSize(new java.awt.Dimension(656, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Adiciona_macacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adiciona_macacoActionPerformed
        Macaco animal = new Macaco();
        animal.setNome(this.Campo_Nome.getText());
        animal.setPeso(Float.parseFloat(this.Campo_Peso.getText()));
        
        try {
            this.Data.Adiciona_animal(animal);
        } catch (IOException ex) {
            Logger.getLogger(Adiciona_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Adiciona_macacoActionPerformed

    private void Adiciona_humanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adiciona_humanoActionPerformed
        Homem animal = new Homem();
        animal.setNome(this.Campo_Nome.getText());
        animal.setPeso(Float.parseFloat(this.Campo_Peso.getText()));
        
        try {
            this.Data.Adiciona_animal(animal);
        } catch (IOException ex) {
            Logger.getLogger(Adiciona_menu.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Adiciona_humanoActionPerformed

    private void Adiciona_cavaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adiciona_cavaloActionPerformed
        Cavalo animal = new Cavalo();
        animal.setNome(this.Campo_Nome.getText());
        animal.setPeso(Float.parseFloat(this.Campo_Peso.getText()));
        
        try {
            this.Data.Adiciona_animal(animal);
        } catch (IOException ex) {
            Logger.getLogger(Adiciona_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Adiciona_cavaloActionPerformed

    private void adiciona_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adiciona_animalActionPerformed
        Animais animal = new Animais();
        animal.setNome(this.Campo_Nome.getText());
        animal.setPeso(Float.parseFloat(this.Campo_Peso.getText()));
        
        try {
            this.Data.Adiciona_animal(animal);
        } catch (IOException ex) {
            Logger.getLogger(Adiciona_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adiciona_animalActionPerformed

    private void Adiciona_beija_FlorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adiciona_beija_FlorActionPerformed
        Beija_Flor animal = new  Beija_Flor();
        animal.setNome(this.Campo_Nome.getText());
        animal.setPeso(Float.parseFloat(this.Campo_Peso.getText()));
        
        try {
            this.Data.Adiciona_animal(animal);
        } catch (IOException ex) {
            Logger.getLogger(Adiciona_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Adiciona_beija_FlorActionPerformed

    private void Adiciona_mamiferoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adiciona_mamiferoActionPerformed
        Mamifero animal = new Mamifero();
        animal.setNome(this.Campo_Nome.getText());
        animal.setPeso(Float.parseFloat(this.Campo_Peso.getText()));
        //System.out.println("--->" + animal.getTipo());
        try {
            this.Data.Adiciona_animal(animal);
        } catch (IOException ex) {
            Logger.getLogger(Adiciona_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Adiciona_mamiferoActionPerformed

    private void Adiciona_anfibioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adiciona_anfibioActionPerformed
        Anfibios animal = new Anfibios();
        animal.setNome(this.Campo_Nome.getText());
        animal.setPeso(Float.parseFloat(this.Campo_Peso.getText()));
        
        try {
            this.Data.Adiciona_animal(animal);
        } catch (IOException ex) {
            Logger.getLogger(Adiciona_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Adiciona_anfibioActionPerformed

    private void Adiciona_reptilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adiciona_reptilActionPerformed
        Reptil animal = new Reptil();
        animal.setNome(this.Campo_Nome.getText());
        animal.setPeso(Float.parseFloat(this.Campo_Peso.getText()));
        
        try {
            this.Data.Adiciona_animal(animal);
        } catch (IOException ex) {
            Logger.getLogger(Adiciona_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Adiciona_reptilActionPerformed

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
            java.util.logging.Logger.getLogger(Adiciona_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adiciona_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adiciona_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adiciona_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adiciona_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adiciona_anfibio;
    private javax.swing.JButton Adiciona_beija_Flor;
    private javax.swing.JButton Adiciona_cavalo;
    private javax.swing.JButton Adiciona_humano;
    private javax.swing.JButton Adiciona_macaco;
    private javax.swing.JButton Adiciona_mamifero;
    private javax.swing.JButton Adiciona_reptil;
    private javax.swing.JTextField Campo_Nome;
    private javax.swing.JTextField Campo_Peso;
    private javax.swing.JButton adiciona_animal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
