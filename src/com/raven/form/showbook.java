/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author MSI
 */
public class showbook extends javax.swing.JPanel {

    /**
     * Creates new form showbook
     */
    public showbook() {
        initComponents();
        setBookDetails("", "", "", "", null); // Default values
    }

    /**
     * Set book details including image, name, author, branch, and id
     */
    void setBookDetails(String bookId, String name, String publisher, String branch, byte[] imageBytes) {
        // Set the image from byte array
       if (imageBytes != null) {
            // Resize the image to fit the label
            ImageIcon imageIcon = new ImageIcon(imageBytes);
            Image img = imageIcon.getImage();
            Image resizedImg = img.getScaledInstance(148, 198, Image.SCALE_SMOOTH);
            ImageIcon resizedImageIcon = new ImageIcon(resizedImg);
            jLabel1.setIcon(resizedImageIcon);
        } else {
            // Set a default image if imageBytes is null
            // For example, you can set a placeholder image
            jLabel1.setIcon(new ImageIcon("path_to_default_image.jpg"));
        }

        // Set other book details
        jLabel6.setText(name);
        jLabel7.setText(publisher);
        jLabel8.setText(branch);
        jLabel9.setText(bookId);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Book Name :");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Author :");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Branch :");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Id :");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText("jLabel6");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setText("jLabel7");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setText("jLabel8");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setText("jLabel9");
        jLabel9.setName("jLabel9"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))))
                .addContainerGap(308, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    
}
