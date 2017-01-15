/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

/**
 *
 * @author Jawes
 */
public class Backgammon extends JFrame {

    /**
     * Creates new form Backgammon
     */
    int  player1chips[] = new int[6], player2chips[] = new int[6], previous[] = new int[6];
    boolean yourturn, gameover, win;

    public Backgammon() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new JLabel(new ImageIcon("Background.jpg")));
        initComponents();
        myinit();

    }

    @Override
    public void paint(Graphics g) {

        int x = 300, y = 0;
        super.paint(g);
        g.setColor(Color.blue);
        if (gameover) {
            if (win) {
                jLabel6.setText("Player 1 Wins");
            } else {
                jLabel6.setText("Player 2 Wins");
            }
        }
        for (int i = 0; i < 6; i++) {
            if (x % 2 != 0) {
                x += 175;
            } else {
                x += 180;
            }
            y = 958;
            for (int j = 0; j < player1chips[i]; j++) {
                g.fillOval(x, y, 80, 80);
                y -= 80;
            }

        }
        x = 300;
        for (int i = 0; i < 6; i++) {
            if (x % 2 != 0) {
                x += 175;
            } else {
                x += 180;
            }
            y = 40;
            for (int j = 0; j < previous[i]; j++) {
                g.fillOval(x, y, 80, 80);
                y += 80;
            }

        }
        try {
            Thread.sleep(1000);     //make computer wait one second before he plays
            x = 300;
        } catch (InterruptedException e) {

        }
        for (int i = 0; i < 6; i++) {
            if (x % 2 != 0) {
                x += 175;
            } else {
                x += 180;
            }
            y = 40;
            for (int j = 0; j < player2chips[i]; j++) {
                g.fillOval(x, y, 80, 80);
                y += 80;
            }

        }
        for (int i = 0; i < 6; i++) {
            previous[i] = player2chips[i];
        }
        jLabel1.setText("Your Turn!");
    }

    public void myinit() {
        resize(1938, 1048);
        for (int i = 0; i < 6; i++) {
            player1chips[i] = 0;
            player2chips[i] = 0;
            previous[i] = 0;
        }
        yourturn = true;
        gameover = false;
        win = false;
        jLabel6.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Roll Dice!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Your Turn!");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Player 1's last roll:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Player 2's last roll:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Player 1------->");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Player2------->");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void movecomputer() {
        Random random = new Random();
        int rollvalue1 = random.nextInt(6) + 1, rollvalue2 = random.nextInt(6) + 1;   //generate random numbers
        jLabel1.setText("Player 2's Turn!");
        if (player2chips[rollvalue1 - 1] < rollvalue1) {   //validate
            player2chips[rollvalue1 - 1]++;    //increment chip counter at random number's position
        }
        if (player2chips[rollvalue2 - 1] < rollvalue2) {
            player2chips[rollvalue2 - 1]++;
        }

        jLabel3.setText("Player 2's last roll: (" + rollvalue1 + "," + rollvalue2 + ")");
        yourturn = true;

        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!gameover) {
            Random random = new Random();
            int rollvalue1 = random.nextInt(6) + 1, rollvalue2 = random.nextInt(6) + 1;   //generate random numbers
            jLabel2.setText("Player 1's last roll: (" + rollvalue1 + "," + rollvalue2 + ")");

            jLabel1.setText("Your Turn!");
            if (player1chips[rollvalue1 - 1] < rollvalue1) {
                player1chips[rollvalue1 - 1]++;    //increment chip counter at random number's position
            }
            if (player1chips[rollvalue2 - 1] < rollvalue2) {
                player1chips[rollvalue2 - 1]++;
            }
            yourturn = false;
            boolean w = true;
            //check for gameover and who wins
            for (int i = 0; i < 6; i++) {
                if (player1chips[i] != i + 1) {
                    w = false;
                }
            }
            if (w) {
                win = true;
                gameover = true;
            }
            if (!win) {
                movecomputer();
                w = false;
                for (int i = 0; i < 6; i++) {
                    if (player2chips[i] != i + 1) {
                        w = true;
                    }
                }
                if (!w) {
                    win = false;
                    gameover = true;
                }
            }
            repaint();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Backgammon().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
