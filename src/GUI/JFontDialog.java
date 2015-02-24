/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ml
 */
public class JFontDialog extends javax.swing.JDialog {

    
    private Font pismo;
    private Color barva;
     private Font puvpismo;
    private Color puvbarva;

    // private SimpleAttributeSet attributes;
    /**
     * Creates new form JFontDialog
     *
     * @param parent
     * @param modal
     * @param font
     * @param color
     */
    public JFontDialog(java.awt.Frame parent, boolean modal, Font font, Color color) {
        super(parent, modal); // vyvolá a provede instanci rodičovské třídy
        pismo = font;
        barva = color;
        puvpismo = font;
        puvbarva = color;
        initComponents();
        try {
            String[] fontList = GraphicsEnvironment.getLocalGraphicsEnvironment()
                    .getAvailableFontFamilyNames();
            for (String s : fontList) {
                typPisma.addItem(s);
            }

            String fontFamily = font.getFamily();
            for (int i = 0; i < typPisma.getItemCount(); i++) {
                if (fontFamily.equalsIgnoreCase(typPisma.getItemAt(i).toString())) {
                    typPisma.setSelectedIndex(i);
                    break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.getParent(), "Nastala chyba při načítání fontů!", "Chyba!", JOptionPane.ERROR_MESSAGE);
        }
        this.setUkazka();
    }

    public Font getPismo() {
        return pismo;
    }

    public Color getBarva() {
        return barva;
    }

    private void setUkazka() {
        // Nastavení aktuální velikosti písma
        velikostPisma.setValue(pismo.getSize());
        // Nastavení panelu pro zobrazení barvy písma
        barvaPisma.setOpaque(true);
        barvaPisma.setForeground(barva);
        barvaPisma.setBackground(barva);
        // Nastavení stylu písma - přepínače obyčejné, kurzíva a tučné
        if ((pismo.getStyle() & Font.BOLD) == Font.BOLD) {
            tucne.setSelected(true);
        } else if ((pismo.getStyle() & Font.ITALIC) == Font.ITALIC) {
            kurziva.setSelected(true);
        } else {
            obycejne.setSelected(true);
        }
        // Nastavení vzhledu písma a jeho barvy v ukázce
        ukazka.setFont(pismo);
        ukazka.setForeground(barva);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rezPismaButtonGroup = new javax.swing.ButtonGroup();
        obycejne = new javax.swing.JRadioButton();
        kurziva = new javax.swing.JRadioButton();
        tucne = new javax.swing.JRadioButton();
        velikostPisma = new javax.swing.JSpinner();
        typPisma = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();
        ukazka = new javax.swing.JLabel();
        barvaPisma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nastavení písma");
        setModal(true);
        setName("fontDialog"); // NOI18N

        rezPismaButtonGroup.add(obycejne);
        obycejne.setText("obyčejné");
        obycejne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obycejneActionPerformed(evt);
            }
        });

        rezPismaButtonGroup.add(kurziva);
        kurziva.setText("kurzíva");
        kurziva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurzivaActionPerformed(evt);
            }
        });

        rezPismaButtonGroup.add(tucne);
        tucne.setText("tučné");
        tucne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tucneActionPerformed(evt);
            }
        });

        velikostPisma.setModel(new javax.swing.SpinnerNumberModel(10, 8, 60, 1));
        velikostPisma.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                velikostPismaStateChanged(evt);
            }
        });

        typPisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typPismaActionPerformed(evt);
            }
        });

        jLabel1.setText("Typ písma");

        jLabel2.setText("Velikost písma");

        jLabel3.setText("Řez písma");

        jLabel4.setText("Barva písma");

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        stornoButton.setText("Storno");
        stornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoButtonActionPerformed(evt);
            }
        });

        ukazka.setBackground(new java.awt.Color(255, 255, 255));
        ukazka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ukazka.setText("Ukázka");
        ukazka.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ukazka.setOpaque(true);

        barvaPisma.setBackground(new java.awt.Color(0, 0, 0));
        barvaPisma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        barvaPisma.setOpaque(true);
        barvaPisma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barvaPismaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ukazka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tucne)
                                    .addComponent(kurziva)
                                    .addComponent(obycejne)
                                    .addComponent(typPisma, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barvaPisma, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(velikostPisma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OKButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stornoButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typPisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(velikostPisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obycejne)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kurziva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tucne)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(barvaPisma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ukazka, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(stornoButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_OKButtonActionPerformed

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
        pismo = puvpismo;
        barva = puvbarva;
        this.setVisible(false);
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void velikostPismaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_velikostPismaStateChanged
        pismo = new Font(pismo.getFamily(), pismo.getStyle(), (int) velikostPisma.getValue());
        this.setUkazka();
    }//GEN-LAST:event_velikostPismaStateChanged

    private void typPismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typPismaActionPerformed
        pismo = new Font((String) typPisma.getSelectedItem(), pismo.getStyle(), pismo.getSize());
        this.setUkazka();
    }//GEN-LAST:event_typPismaActionPerformed

    private void obycejneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obycejneActionPerformed
        pismo = pismo.deriveFont(Font.PLAIN);
        this.setUkazka();
    }//GEN-LAST:event_obycejneActionPerformed

    private void kurzivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurzivaActionPerformed
        pismo = pismo.deriveFont(Font.ITALIC);
        this.setUkazka();
    }//GEN-LAST:event_kurzivaActionPerformed

    private void tucneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tucneActionPerformed
        pismo = pismo.deriveFont(Font.BOLD);
        this.setUkazka();
    }//GEN-LAST:event_tucneActionPerformed

    private void barvaPismaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barvaPismaMouseClicked
        barva = JColorChooser.showDialog(this, "Vyber barvu textu", barva);
        this.setUkazka();
    }//GEN-LAST:event_barvaPismaMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel barvaPisma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton kurziva;
    private javax.swing.JRadioButton obycejne;
    private javax.swing.ButtonGroup rezPismaButtonGroup;
    private javax.swing.JButton stornoButton;
    private javax.swing.JRadioButton tucne;
    private javax.swing.JComboBox typPisma;
    private javax.swing.JLabel ukazka;
    private javax.swing.JSpinner velikostPisma;
    // End of variables declaration//GEN-END:variables
}
