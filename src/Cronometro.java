/**
 *
 * @modificado por ziero, autor original author Viruz
 */

public class Cronometro extends javax.swing.JFrame {
    CronometroThread cronometro;
    Object source;
    private int diferenciaX;
       private int diferenciaY;
    /**
     * Creates new form Cronometro
     */
    public Cronometro() {
        initComponents();
        cronometro = new CronometroThread(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unccked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JLabel();
        dragonText = new javax.swing.JLabel();
        dragonBotton = new javax.swing.JButton();
        baronText = new javax.swing.JLabel();
        BaronBotton = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        start = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        masBotton = new javax.swing.JButton();
        menosBotton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jungler Timer");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        display.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display.setText("0 : 0 : 10");

        dragonText.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        dragonText.setText("0 : 0 : 0");

        dragonBotton.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        dragonBotton.setText("Dragon");
        dragonBotton.setFocusable(false);
        dragonBotton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dragonBotton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dragonBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dragonBottonActionPerformed(evt);
            }
        });

        baronText.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        baronText.setText("0 : 0 : 0");
        baronText.setPreferredSize(new java.awt.Dimension(34, 90));
        baronText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                baronTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                baronTextFocusLost(evt);
            }
        });

        BaronBotton.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        BaronBotton.setText("Baron");
        BaronBotton.setFocusable(false);
        BaronBotton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BaronBotton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BaronBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaronBottonActionPerformed(evt);
            }
        });
        BaronBotton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BaronBottonFocusGained(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setBorderPainted(false);

        start.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        start.setText("Iniciar");
        start.setFocusable(false);
        start.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        start.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jToolBar1.add(start);

        stop.setText("Fin");
        stop.setEnabled(false);
        stop.setFocusable(false);
        stop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });
        jToolBar1.add(stop);

        masBotton.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        masBotton.setText("+");
        masBotton.setFocusable(false);
        masBotton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        masBotton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        masBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masBottonActionPerformed(evt);
            }
        });
        jToolBar1.add(masBotton);

        menosBotton.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        menosBotton.setText("-");
        menosBotton.setFocusable(false);
        menosBotton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menosBotton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menosBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosBottonActionPerformed(evt);
            }
        });
        jToolBar1.add(menosBotton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BaronBotton)
                .addGap(18, 18, 18)
                .addComponent(baronText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dragonBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dragonText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display)
            .addComponent(baronText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(BaronBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dragonText)
                .addComponent(dragonBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        start.setEnabled(true);
        stop.setEnabled(false);
        // pause.setEnabled(false);
        cronometro.setLive(false);
        cronometro.setGo(false);
        cronometro.setSegundos(0);
    }//GEN-LAST:event_stopActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        source = evt.getSource();
        if(source == start){
            cronometro.createThread();
            cronometro.setLive(true);
            cronometro.setGo(true);
            start.setEnabled(false);
            //  pause.setEnabled(true);
            stop.setEnabled(true);
        }
    }//GEN-LAST:event_startActionPerformed

    private void dragonBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dragonBottonActionPerformed
        cronometro.setBandera(2); // TODO add your handling code here:
    }//GEN-LAST:event_dragonBottonActionPerformed

    private void baronTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_baronTextFocusLost
        //            cronometro.setBandera(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_baronTextFocusLost

    private void baronTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_baronTextFocusGained
        //cronometro.setBandera(2);        // TODO add your handling code here:
    }//GEN-LAST:event_baronTextFocusGained

    private void masBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masBottonActionPerformed
cronometro.setBandera2(1);        // TODO add your handling code here:
    }//GEN-LAST:event_masBottonActionPerformed

    private void menosBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosBottonActionPerformed
        cronometro.setBandera2(2);  // TODO add your handling code here:
    }//GEN-LAST:event_menosBottonActionPerformed

    private void BaronBottonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BaronBottonFocusGained
        // cronometro.setBandera(2);   // TODO add your handling code here:
    }//GEN-LAST:event_BaronBottonFocusGained

    private void BaronBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaronBottonActionPerformed
        cronometro.setBandera(1);

        // baronText.getBaron().setText(""+hr+" : "+min+6+" : "+seg);      // TODO add your handling code here:
    }//GEN-LAST:event_BaronBottonActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        diferenciaX = evt.getXOnScreen() - this.getLocationOnScreen().x;
diferenciaY = evt.getYOnScreen() - this.getLocationOnScreen().y; // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
      this.setLocation(evt.getXOnScreen() - diferenciaX, evt.getYOnScreen() - diferenciaY);  // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    public int a;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaronBotton;
    private javax.swing.JLabel baronText;
    private javax.swing.JLabel display;
    private javax.swing.JButton dragonBotton;
    private javax.swing.JLabel dragonText;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton masBotton;
    private javax.swing.JButton menosBotton;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the display
     */
    public javax.swing.JLabel getDisplay() {
        return display;
    }
      public javax.swing.JLabel getBaron() {
        return baronText;
    }
      public javax.swing.JLabel getDragon() {
        return dragonText;
    }

    /**
     * @param display the display to set
     */
    public void setDisplay(javax.swing.JLabel display) {
        this.display = display;
    }
}