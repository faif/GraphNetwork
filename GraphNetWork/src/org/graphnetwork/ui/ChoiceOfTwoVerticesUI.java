/*
 *   ChoiceOfTwoVerticesUI.java
 *
 *   Copyright (C) 2006, 2007 Alexander Technological Educational Institute of Thessaloniki
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 
 *   You should have received a copy of the GNU General Public License along
 *   with this program; if not, write to the Free Software Foundation, Inc.,
 *   51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 */

package org.graphnetwork.ui;

/**
 *
 * @author faif
 */
public class ChoiceOfTwoVerticesUI extends javax.swing.JDialog {
    private boolean buttonClicked;
    
    /**
     * @param names an array with the names of the vertices
     * @param tit the title of the window
     *
     */
    public ChoiceOfTwoVerticesUI(java.awt.Frame parent, boolean modal,
            Object names[], String tit) {
        super(parent, modal);
        initComponents();
        
        // fill the components with the names of the vertices
        fillComponWithVertNames(names);
        
        buttonClicked = false;
        
        setTitle(tit);
        
        calcPB.setToolTipText("<html><b>Show path:</b> calculate the best path according<br>"
                + "to the " + tit + " algorithm</html>");
    }
    
    /**
     * @return true if the show button was clicked
     */
    public boolean isShowButtonClicked() {
        return buttonClicked;
    }
    

    public void setVisible(boolean set) {
        /* center the dialog */
        pack();
        setLocationRelativeTo(this.getParent());
        
        /* call the parent setVisible */
        super.setVisible(set);
    }
    
    
    /**
     * Returns the selected item of the component
     *
     * @return an Object instance of the selection
     */
    public Object getSource() {
        return fromC.getSelectedItem();
    }
    
    /**
     * Returns the selected item of the component
     *
     * @return an Object instance of the selection
     */
    public Object getDestination() {
        return toC.getSelectedItem();
    }
    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        pathP3 = new javax.swing.JPanel();
        fromL = new javax.swing.JLabel();
        toL = new javax.swing.JLabel();
        fromC = new javax.swing.JComboBox();
        toC = new javax.swing.JComboBox();
        calcPB = new javax.swing.JButton();
        closeB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Src - Dst");
        setResizable(false);
        getAccessibleContext().setAccessibleName("");
        pathP3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Vertices")));
        fromL.setText("From");

        toL.setText("To");

        fromC.setToolTipText("The source vertex");

        toC.setToolTipText("The destination vertex");

        org.jdesktop.layout.GroupLayout pathP3Layout = new org.jdesktop.layout.GroupLayout(pathP3);
        pathP3.setLayout(pathP3Layout);
        pathP3Layout.setHorizontalGroup(
            pathP3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pathP3Layout.createSequentialGroup()
                .addContainerGap()
                .add(pathP3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fromL)
                    .add(toL))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pathP3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(toC, 0, 80, Short.MAX_VALUE)
                    .add(fromC, 0, 80, Short.MAX_VALUE))
                .addContainerGap())
        );
        pathP3Layout.setVerticalGroup(
            pathP3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pathP3Layout.createSequentialGroup()
                .add(pathP3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fromL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(fromC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pathP3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(toL)
                    .add(toC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        calcPB.setMnemonic('S');
        calcPB.setText("Show");
        calcPB.setToolTipText("");
        calcPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcPBActionPerformed(evt);
            }
        });

        closeB.setMnemonic('O');
        closeB.setText("Close");
        closeB.setToolTipText("Exit");
        closeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, pathP3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(calcPB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(closeB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(pathP3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(calcPB)
                    .add(closeB))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void calcPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcPBActionPerformed
        buttonClicked = true;
        dispose();
    }//GEN-LAST:event_calcPBActionPerformed
    
    private void closeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBActionPerformed
        dispose();
    }//GEN-LAST:event_closeBActionPerformed
    
    /**
     * Fill the components with the vertices names.
     * @param l an array which contains the names
     * of the vertices
     */
    private void fillComponWithVertNames(Object tmp[]) {
        for (int i=0; i<tmp.length; i++) {
            fromC.addItem(tmp[i]);
            toC.addItem(tmp[i]);
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcPB;
    private javax.swing.JButton closeB;
    private javax.swing.JComboBox fromC;
    private javax.swing.JLabel fromL;
    private javax.swing.JPanel pathP3;
    private javax.swing.JComboBox toC;
    private javax.swing.JLabel toL;
    // End of variables declaration//GEN-END:variables
    
}
