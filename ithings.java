
package mygames;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;
import java.io.File;
import javax.sound.sampled.*;
    

public class ithings extends javax.swing.JFrame {

    private String[] imagePaths = {"src\\mygames\\ithings\\cpu.jpg", "src\\mygames\\ithings\\headphone.jpg", "src\\mygames\\ithings\\keyboard.jpg", "src\\mygames\\ithings\\monitor.jpg","src\\mygames\\ithings\\mouse.jpg", "src\\mygames\\ithings\\printer.jpg", "src\\mygames\\ithings\\router.jpg", "src\\mygames\\ithings\\speaker.jpg", "src\\mygames\\ithings\\usb.jpg"};
    private String[] answers = {"cpu", "headphone", "keyboard", "monitor", "mouse", "printer", "router", "speaker", "usb"};
    private int[] levels = {0, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
    private String correctAnswer;
    private int hintIndex = 0;
    private int coins = 0;
    private Timer timer;
    private int secondsLeft = 30;
    private int currentLevel = 1;
    private int correctGuessCount = 0;
    private int lastDisplayedIndex = -1;
    
       private Clip clip;
       
    public ithings() {
        initComponents();
        startGame();
        coins = 0;
        updateCoinsLabel();
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagelabel = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        hintbutton = new javax.swing.JButton();
        submitbutton = new javax.swing.JButton();
        answerfield = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        timelabel = new javax.swing.JLabel();
        COINSLABEL = new javax.swing.JLabel();
        levellabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(imagelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 300, 210));

        backbutton.setBackground(new java.awt.Color(153, 204, 255));
        backbutton.setFont(new java.awt.Font("Press Start 2P", 0, 12)); // NOI18N
        backbutton.setForeground(new java.awt.Color(255, 255, 255));
        backbutton.setText("BACK");
        backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 130, 40));

        hintbutton.setBackground(new java.awt.Color(153, 204, 255));
        hintbutton.setFont(new java.awt.Font("Press Start 2P", 0, 12)); // NOI18N
        hintbutton.setForeground(new java.awt.Color(255, 255, 255));
        hintbutton.setText("HINT");
        hintbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hintbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(hintbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 130, 40));

        submitbutton.setBackground(new java.awt.Color(153, 204, 255));
        submitbutton.setFont(new java.awt.Font("Press Start 2P", 0, 12)); // NOI18N
        submitbutton.setForeground(new java.awt.Color(255, 255, 255));
        submitbutton.setText("SUBMIT");
        submitbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(submitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 130, 40));

        answerfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerfieldActionPerformed(evt);
            }
        });
        getContentPane().add(answerfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 260, 30));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        timelabel.setFont(new java.awt.Font("Press Start 2P", 0, 12)); // NOI18N
        timelabel.setForeground(new java.awt.Color(255, 255, 255));

        COINSLABEL.setFont(new java.awt.Font("Press Start 2P", 0, 12)); // NOI18N
        COINSLABEL.setForeground(new java.awt.Color(255, 255, 255));

        levellabel.setFont(new java.awt.Font("Press Start 2P", 0, 12)); // NOI18N
        levellabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(COINSLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(levellabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(timelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(COINSLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(levellabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 490, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mygames/javabg.jpeg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(640, 590));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 480, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void answerfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerfieldActionPerformed
        checkAnswer();
    }//GEN-LAST:event_answerfieldActionPerformed

    private void hintbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintbuttonActionPerformed
        provideHint();
        updateCoinsLabel();
    }//GEN-LAST:event_hintbuttonActionPerformed

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        checkAnswer();
    }//GEN-LAST:event_submitbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to go back?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION) {

            categories categoriesFrame = new categories();
            categoriesFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_backbuttonActionPerformed
    private void startGame() {
        if (timer != null && timer.isRunning()) {
        timer.stop();
    }
        
    Random random = new Random();
    int randomIndex;
    do {
        randomIndex = random.nextInt(imagePaths.length);
    } while (randomIndex == lastDisplayedIndex); // Ensure the new index is different from the last one
    lastDisplayedIndex = randomIndex; // Update lastDisplayedIndex
    String imagePath = imagePaths[randomIndex];
    correctAnswer = answers[randomIndex];

        //image label to display the randomly selected image
        ImageIcon image = new ImageIcon(imagePath);
        imagelabel.setIcon(image);

        // Slevel label 
        levellabel.setText("Guessed Correctly: " + correctGuessCount);


        resetTimer();

        startTimer();
    }
       private void startTimer() {
    timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            secondsLeft--;
            if (secondsLeft <= 0) {
                // Handle game over when time runs out
                timer.stop();
                JOptionPane.showMessageDialog(ithings.this, "Time's up!");
                categories categoriesFrame = new categories();
                categoriesFrame.setVisible(true);
                dispose();
            }
            updateTimeLabel();
        }
    });
    timer.start();
}

     @Override
    public void dispose() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        super.dispose();
    }       
        

    private void updateTimeLabel() {
        timelabel.setText("Time: " + formatTime(secondsLeft));
    }

    private String formatTime(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        DecimalFormat formatter = new DecimalFormat("00");
        return formatter.format(minutes) + ":" + formatter.format(remainingSeconds);
    }
    
     private void resetTimer() {
        secondsLeft = 30;
        updateTimeLabel();
        
    }
    
    private void checkAnswer() {
    String userAnswer = answerfield.getText().trim();

    if (userAnswer.isEmpty()) {
        playMusic("src\\mygames\\SFX\\wrong.wav");
        JOptionPane.showMessageDialog(this, "Please input an answer!");
        return;
    }
    
    if (userAnswer.equalsIgnoreCase(correctAnswer)) {
        playMusic("src\\mygames\\SFX\\correctanswer.wav");
        JOptionPane.showMessageDialog(this, "Congratulations! You guessed it right!");
        

        coins++;
        updateCoinsLabel(); 
        

        increaseLevel();


        startGame();
    } else {
        playMusic("src\\mygames\\SFX\\wrong.wav");
        JOptionPane.showMessageDialog(this, "Sorry, wrong answer. Try again!");
        answerfield.setText("");
    }
}


private void increaseLevel() {
    correctGuessCount++; 
    if (currentLevel < levels.length) {
        currentLevel++; 
        levellabel.setText("Guessed Correctly: " + correctGuessCount);
        answerfield.setText("");
  
    } else {
        JOptionPane.showMessageDialog(this, "Congratulations! You've completed all levels!");
    }
}


private void provideHint() {
    if (coins <= 0) {
        playMusic("src\\mygames\\SFX\\nomorecoin.wav");
        JOptionPane.showMessageDialog(this, "You don't have enough coins for a hint!");
        return;
    }
  
    coins--;
    

    hintIndex++;
    if (hintIndex <= correctAnswer.length()) {
        playMusic("src\\mygames\\SFX\\coin.wav");
        String hint = correctAnswer.substring(0, hintIndex);
        answerfield.setText(hint);
    } else {
        JOptionPane.showMessageDialog(this, "No more hints available for this word!");
    }
}

private void updateCoinsLabel() {
    COINSLABEL.setText("Coins: " + coins);
}

    private void playMusic(String filepath) {
        try {
            File file = new File(filepath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }           
    }

    
    private void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
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
            java.util.logging.Logger.getLogger(ithings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ithings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ithings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ithings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ithings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COINSLABEL;
    private javax.swing.JTextField answerfield;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton hintbutton;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel levellabel;
    private javax.swing.JButton submitbutton;
    private javax.swing.JLabel timelabel;
    // End of variables declaration//GEN-END:variables
}
