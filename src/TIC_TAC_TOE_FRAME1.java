
import static java.awt.Color.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TIC_TAC_TOE_FRAME1 extends javax.swing.JFrame {

   private String turn;
   private int xCount;
   private int oCount;
   private int totalCount;
   
    public TIC_TAC_TOE_FRAME1() {   //Tic_tac_toe as constructor
        initComponents();
        turn = "O";
        xCount = 0;
        oCount = 0;
        totalCount = 0;
    }
    private void choosePlayer(){   //setting value of turn as 0 or x
        
        if(turn.equals("O")){
            
            turn= "X";
        }else{
            
            turn = "O";
        }
    }
    public void updateScore(){  
        
        xscore.setText(String.valueOf(xCount));
        oscore.setText(String.valueOf(oCount));
    }

    public void checkWin(){
        
        String b1 = button1.getText();
        String b2 = button2.getText();
        String b3 = button3.getText();
        String b4 = button4.getText();
        String b5 = button5.getText();
        String b6 = button6.getText();
        String b7 = button7.getText();
        String b8 = button8.getText();
        String b9 = button9.getText();
        
        if((b1.equals(b2) && b2.equals(b3)) && !b1.equals("")){  //cheacking if both the vaues are equals then we have to check for only single buttons
            
            JOptionPane.showMessageDialog(this,"Player " + turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            
            button1.setBackground(orange);
            button2.setBackground(orange);
            button3.setBackground(orange);
            
            
            if(turn.equals("O")){
                oCount++;
            }else{
                
                xCount++;
            }
            
            updateScore();
            
            
        }else if((b4.equals(b5) && b5.equals(b6)) && !b4.equals("")){
            
            JOptionPane.showMessageDialog(this,"Player " + turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            
            button4.setBackground(orange);
            button5.setBackground(orange);
            button6.setBackground(orange);
            
            
            if(turn.equals("O")){
                oCount++;
            }else{
                
                xCount++;
            }
            
            updateScore();
            
            
        }else if((b7.equals(b8) && b8.equals(b9)) && !b7.equals("")){
            
            JOptionPane.showMessageDialog(this,"Player " + turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            
            button7.setBackground(orange);
            button8.setBackground(orange);
            button9.setBackground(orange);
            
            
            if(turn.equals("O")){
                oCount++;
            }else{
                
                xCount++;
            }
            
            updateScore();
            
            
        }if((b1.equals(b4) && b4.equals(b7)) && !b1.equals("")){
            
            JOptionPane.showMessageDialog(this,"Player " + turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            
            button1.setBackground(orange);
            button4.setBackground(orange);
            button7.setBackground(orange);
            
            
            if(turn.equals("O")){
                oCount++;
            }else{
                
                xCount++;
            }
            
            updateScore();
            
        }else if((b2.equals(b5) && b5.equals(b8)) && !b2.equals("")){
            
            JOptionPane.showMessageDialog(this,"Player " + turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            
            button2.setBackground(orange);
            button5.setBackground(orange);
            button8.setBackground(orange);
            
            
            if(turn.equals("O")){
                oCount++;
            }else{
                
                xCount++;
            }
            
            updateScore();
            
            
        }else if((b3.equals(b6) && b6.equals(b9)) && !b3.equals("")){
            
            JOptionPane.showMessageDialog(this,"Player " + turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            
            button3.setBackground(orange);
            button6.setBackground(orange);
            button9.setBackground(orange);
            
            
            if(turn.equals("O")){
                oCount++;
            }else{
                
                xCount++;
            }
            
            updateScore();
            
        }else if((b1.equals(b5) && b5.equals(b9)) && !b1.equals("")){
            
            JOptionPane.showMessageDialog(this,"Player " + turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            
            button1.setBackground(orange);
            button5.setBackground(orange);
            button9.setBackground(orange);
            
            
            if(turn.equals("O")){
                oCount++;
            }else{
                
                xCount++;
            }
            
            updateScore();
            
        }if((b3.equals(b5) && b7.equals(b3)) && !b3.equals("")){
            
            JOptionPane.showMessageDialog(this,"Player " + turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            
            button5.setBackground(orange);
            button7.setBackground(orange);
            button3.setBackground(orange);
            
            
            if(turn.equals("O")){
                oCount++;
            }else{
                
                xCount++;
            }
            
            updateScore();
            
        }else if( totalCount == 9){
            
             JOptionPane.showMessageDialog(this,"Draw ! " ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
             resetGame();
            
        }
        
    }
   public void invokeButton(JButton button)
   {
        if(!button.getText().equals(""))
        {
            return;
            
        }
        
        totalCount++;
        
        button.setText(turn);
        
        
        if(turn.equals("O")){
            
            button.setForeground(magenta);
            
        }else{
            
            button.setForeground(red);
        }
        
        checkWin();
        
        choosePlayer();
   }
   
   public void resetGame(){
       
       button1.setText("");
       button2.setText("");
       button3.setText("");
       button4.setText("");
       button5.setText("");
       button6.setText("");
       button7.setText("");
       button8.setText("");
       button9.setText("");
       
       //other method setBackground
       //button1.removeAll();
       
       button1.setBackground(white);
       button2.setBackground(white);
       button3.setBackground(white);
       button4.setBackground(white);
       button5.setBackground(white);
       button6.setBackground(white);
       button7.setBackground(white);
       button8.setBackground(white);
       button9.setBackground(white);
       
       
       totalCount = 0;
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE GAME");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        button2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        exitbutton.setBackground(new java.awt.Color(255, 51, 51));
        exitbutton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        exitbutton.setText("EXIT");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        resetbutton.setBackground(new java.awt.Color(51, 204, 255));
        resetbutton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        resetbutton.setText("RESET");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SCORECARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("PLAYER X :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setText("PLAYER O :");

        xscore.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        xscore.setText("0");

        oscore.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        oscore.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xscore)
                    .addComponent(oscore))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(xscore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(oscore))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(resetbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(121, 121, 121))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
       JFrame frame = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame,"confirm if you want to Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
           
           System.exit(0);
       }
               
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       
//        if(!button1.getText().equals(""))
//        {
//            return;
//        }
//        button1.setText(turn);
//        if(turn.equals("O")){
//            button1.setForeground(magenta);
//        }else{
//            button1.setForeground(red);
//        }
//        choosePlayer();

    
      invokeButton(button1);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
      
        invokeButton(button2);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        
        invokeButton(button3);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
       
        invokeButton(button4);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
       
        invokeButton(button5);
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
      
        invokeButton(button6);
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
       
        invokeButton(button7);
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
       
        invokeButton(button8);
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
       
        invokeButton(button9);
    }//GEN-LAST:event_button9ActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        
        resetGame();
        
    }//GEN-LAST:event_resetbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_FRAME1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel oscore;
    private javax.swing.JButton resetbutton;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables
}
