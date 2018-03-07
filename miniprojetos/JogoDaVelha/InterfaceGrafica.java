/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import javax.swing.JOptionPane;

/**
 *
 * @author vcper
 */
public class InterfaceGrafica extends javax.swing.JFrame {

    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    
    int NumeroDeVitoriasJogador1 = 0;
    int NumeroDeVitoriasJogador2 = 0;
    int PrtidasEmpatadas = 0;
    
    public InterfaceGrafica() {
        initComponents();
    }
    
    public void JogadorAtivo(){
        
        if (Jogador1Ativo == true){
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        } else {
            Jogador1Ativo = true;
            Jogador2Ativo = false;
        }
        JogadorVencedor("X");
        JogadorVencedor("O");
        
    }
    
    public void JogadorVencedor(String jogador){
        
        //----------------------- VERIFICANDO AS LINHAS -----------------------
        if (B1.getLabel().equals(jogador) && B2.getLabel().equals(jogador) &&
                B3.getLabel().equals(jogador)){
            if (B1.getLabel().equals("X")){
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
            
        }
        if (B4.getLabel().equals(jogador) && B5.getLabel().equals(jogador) &&
                B6.getLabel().equals(jogador)){
            if (B4.getLabel().equals("X")){
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
            
        }
        if (B7.getLabel().equals(jogador) && B8.getLabel().equals(jogador) &&
                B8.getLabel().equals(jogador)){
            if (B7.getLabel().equals("X")){
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
            
        }
        
        //---------------------- VERIFICANDO AS COLUNAS ----------------------
        if (B1.getLabel().equals(jogador) && B4.getLabel().equals(jogador) &&
                B7.getLabel().equals(jogador)){
            if (B1.getLabel().equals("X")){
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
            
        }
        if (B2.getLabel().equals(jogador) && B5.getLabel().equals(jogador) &&
                B8.getLabel().equals(jogador)){
            if (B2.getLabel().equals("X")){
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
            
        }
        if (B3.getLabel().equals(jogador) && B6.getLabel().equals(jogador) &&
                B9.getLabel().equals(jogador)){
            if (B3.getLabel().equals("X")){
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        
        }
        
        //--------------------- VERIFICANDO AS DDIAGONAIS ---------------------
        if (B1.getLabel().equals(jogador) && B5.getLabel().equals(jogador) &&
                B9.getLabel().equals(jogador)){
            if (B1.getLabel().equals("X")){
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
            
        }
        if (B3.getLabel().equals(jogador) && B5.getLabel().equals(jogador) &&
                B7.getLabel().equals(jogador)){
            if (B3.getLabel().equals("X")){
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
            
        }
        
        //----------------------- VERIFICANDO EMPATE -----------------------
        if (!B1.getLabel().equals("") && !B2.getLabel().equals("") && 
                !B3.getLabel().equals("") && !B4.getLabel().equals("") && 
                !B5.getLabel().equals("") && !B6.getLabel().equals("") && 
                !B7.getLabel().equals("") && !B8.getLabel().equals("") && 
                !B9.getLabel().equals("")){
            Vencedor("Empate");
        }
    }
    
    
    
    public void Vencedor(String JogadorVencedor){
        
        if (JogadorVencedor.equals("Jogador 1")){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador 1");
            //Incrementa o numero de vitorias do jogador
            NumeroDeVitoriasJogador1++;
            //Atualiza o numero de vitorias na interface grafica
            NumeroDeVitoriasDoJogador1.setText("Número de Vitórias: " + 
                    NumeroDeVitoriasJogador1);
            LimparCampos();
        }
        if (JogadorVencedor.equals("Jogador 2")){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador 2");
            //Incrementa o numero de vitorias do jogador
            NumeroDeVitoriasJogador2++;
            //Atualiza o numero de vitorias na interface grafica
            NumeroDeVitoriasDoJogador2.setText("Número de Vitórias: " + 
                    NumeroDeVitoriasJogador2);
            LimparCampos();
        }
        if (JogadorVencedor.equals("Empate")){
            JOptionPane.showMessageDialog(null, "Jogo Empatou");
            //Incrementa o numero de empates
            PrtidasEmpatadas++;
            //Atualiza o numero de empates na interface grafica
            
            LimparCampos();
        }
        
    }
    
    public void LimparCampos(){
        B1.setLabel("");
        B2.setLabel("");
        B3.setLabel("");
        B4.setLabel("");
        B5.setLabel("");
        B6.setLabel("");
        B7.setLabel("");
        B8.setLabel("");
        B9.setLabel("");
        Jogador1Ativo = true;
        Jogador2Ativo = false;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new java.awt.Button();
        B2 = new java.awt.Button();
        B3 = new java.awt.Button();
        B4 = new java.awt.Button();
        B5 = new java.awt.Button();
        B6 = new java.awt.Button();
        B7 = new java.awt.Button();
        B8 = new java.awt.Button();
        B9 = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Ranking = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        SobreOJogo = new javax.swing.JButton();
        SairDoJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(220, 220, 220))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Jogador 1           Símbolo X:");

        NumeroDeVitoriasDoJogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeVitoriasDoJogador1.setText("Número de Vitórias: 0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Jogador 2          Símbolo O:");

        NumeroDeVitoriasDoJogador2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeVitoriasDoJogador2.setText("Número de Vitórias: 0");

        Ranking.setText("Ranking");
        Ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(NumeroDeVitoriasDoJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NumeroDeVitoriasDoJogador2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Ranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumeroDeVitoriasDoJogador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumeroDeVitoriasDoJogador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ranking)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        NovoJogo.setText("Novo Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        SobreOJogo.setText("Sobre o Jogo");
        SobreOJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreOJogoActionPerformed(evt);
            }
        });

        SairDoJogo.setText("Sair do Jogo");
        SairDoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SobreOJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(SairDoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NovoJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SobreOJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(SairDoJogo))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
                                        
    
    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        
        if (Jogador1Ativo == true){
            if (B1.getLabel().equals("")){
                B1.setLabel("X");
                JogadorAtivo();
            } 
        } else {
            if (B1.getLabel().equals("")){
            B1.setLabel("O");
            JogadorAtivo();
            }

        }

    }//GEN-LAST:event_B1ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        LimparCampos();
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
       
        if (Jogador1Ativo == true){
            if (B2.getLabel().equals("")){
                B2.setLabel("X");
                JogadorAtivo();
            } 
        } else {
            if (B2.getLabel().equals("")){
            B2.setLabel("O");
            JogadorAtivo();
            }

        }

    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        
        if (Jogador1Ativo == true){
            if (B3.getLabel().equals("")){
                B3.setLabel("X");
                JogadorAtivo();
            } 
        } else {
            if (B3.getLabel().equals("")){
            B3.setLabel("O");
            JogadorAtivo();
            }

        }

    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
            
        if (Jogador1Ativo == true){
            if (B4.getLabel().equals("")){
                B4.setLabel("X");
                JogadorAtivo();
            } 
        } else {
            if (B4.getLabel().equals("")){
            B4.setLabel("O");
            JogadorAtivo();
            }

        }

    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
            
        if (Jogador1Ativo == true){
            if (B5.getLabel().equals("")){
                B5.setLabel("X");
                JogadorAtivo();
            } 
        } else {
            if (B5.getLabel().equals("")){
            B5.setLabel("O");
            JogadorAtivo();
            }

        }

    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
            
        if (Jogador1Ativo == true){
            if (B6.getLabel().equals("")){
                B6.setLabel("X");
                JogadorAtivo();
            } 
        } else {
            if (B6.getLabel().equals("")){
            B6.setLabel("O");
            JogadorAtivo();
            }

        }

    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
            
        if (Jogador1Ativo == true){
            if (B7.getLabel().equals("")){
                B7.setLabel("X");
                JogadorAtivo();
            } 
        } else {
            if (B7.getLabel().equals("")){
            B7.setLabel("O");
            JogadorAtivo();
            }

        }

    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
            
        if (Jogador1Ativo == true){
            if (B8.getLabel().equals("")){
                B8.setLabel("X");
                JogadorAtivo();
            } 
        } else {
            if (B8.getLabel().equals("")){
            B8.setLabel("O");
            JogadorAtivo();
            }

        }

    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
            
        if (Jogador1Ativo == true){
            if (B9.getLabel().equals("")){
                B9.setLabel("X");
                JogadorAtivo();
            } 
        } else {
            if (B9.getLabel().equals("")){
            B9.setLabel("O");
            JogadorAtivo();
            }

        }

    }//GEN-LAST:event_B9ActionPerformed

    private void SobreOJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreOJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SobreOJogoActionPerformed

    private void SairDoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoJogoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairDoJogoActionPerformed

    private void RankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingActionPerformed
        Dados_jogadores d = new Dados_jogadores();
        d.setVisible(true);
        
    }//GEN-LAST:event_RankingActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button B1;
    private java.awt.Button B2;
    private java.awt.Button B3;
    private java.awt.Button B4;
    private java.awt.Button B5;
    private java.awt.Button B6;
    private java.awt.Button B7;
    private java.awt.Button B8;
    private java.awt.Button B9;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador1;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador2;
    private javax.swing.JButton Ranking;
    private javax.swing.JButton SairDoJogo;
    private javax.swing.JButton SobreOJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
