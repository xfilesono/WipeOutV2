
package wipeout;
/**
 * @author Ono
 * @company CapsCode
 */

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class WipeOut extends JFrame {

    /**
     * Creates new form WipeOut
     */
    public WipeOut() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setVisible(true);
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox1.setVisible(false);
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 150, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 600));

        jButton1.setBackground(new java.awt.Color(125, 176, 227));
        jButton1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButton1.setText("Choose Folder");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(125, 176, 227));
        jButton2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButton2.setText("Choose File Type");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(125, 176, 227));
        jButton3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButton3.setText("List Pictures");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton3.setBorderPainted(false);
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(125, 176, 227));
        jButton4.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButton4.setText("Delete Same Pictures");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton4.setBorderPainted(false);
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni Bk BT", 2, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("..Wipe Out..");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jComboBox1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jpg", "Jpeg", "Png", "Bmp", "Gif", "Tif" }));
        jComboBox1.setSelectedIndex(2);
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), null, null));
        jComboBox1.setEnabled(false);

        jList1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "The Pictures", "are going", "to show here..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setToolTipText("");
        jScrollPane1.setViewportView(jList1);

        jList2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "The Pictures' size", "are going", "to show here..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jList3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Similar files", "are given", "on the right..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jList4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Files that the program", "finds and deletes", "similar to the files..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wipeout/images/wipeoutlogo150x150.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Names of the Pics");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sizes of the Pics (byte)");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Same Pictures");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("v.2.0 - CapsCode Inc.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(632, 632, 632)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jComboBox1.setVisible(true);
        jComboBox1.setEnabled(true);
        jButton3.setEnabled(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JFileChooser dosyaSec = new JFileChooser();
        dosyaSec.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int sec = dosyaSec.showOpenDialog(null);
        folder = dosyaSec.getSelectedFile().getAbsolutePath();
        // test için 
        // JOptionPane.showMessageDialog(null, klasor);
        jButton2.setEnabled(true);
        jLabel1.setText("Chosen Folder: " + folder);
        
        // Kodun en son satırı olacak
        jLabel1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        File dosya = new File(folder);
        
        String fileType[] = new String[3];
        fileType[0] = jComboBox1.getSelectedItem().toString();
        fileType[1] = fileType[0].toLowerCase();
        // test için 
        // JOptionPane.showMessageDialog(null, fileType[1]);
        fileType[2] = fileType[0].toUpperCase();
        // test için 
        // JOptionPane.showMessageDialog(null, fileType[2]);
        
        FilenameFilter fil;
        fil = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(fileType[0]);
            }
        };
        
        FilenameFilter fil2;
        fil2 = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(fileType[1]);
            }
        };
        
        FilenameFilter fil3;
        fil3 = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(fileType[2]);
            }
        };
        
            File[] liste1 = dosya.listFiles(fil);
            File[] liste2 = dosya.listFiles(fil2);
            File[] liste3 = dosya.listFiles(fil3);
            
            listModel1 = new DefaultListModel();
            listModel2 = new DefaultListModel();
                
            if(dosya.isDirectory()) {
                for(File dosya_nesne : liste1){
                    if(dosya_nesne.isFile()) {
                        String dosya_adi = dosya_nesne.getName();
                        listModel1.addElement("" + dosya_adi);
                        long buyukluk = dosya_nesne.length();
                        listModel2.addElement(Long.toString(buyukluk));
                    }
                }
                for(File dosya_nesne : liste2){
                    if(dosya_nesne.isFile()) {
                        String dosya_adi = dosya_nesne.getName();
                        listModel1.addElement("" + dosya_adi);
                        long buyukluk = dosya_nesne.length();
                        listModel2.addElement(Long.toString(buyukluk));
                    }
                }
                for(File dosya_nesne : liste3){
                    if(dosya_nesne.isFile()) {
                        String dosya_adi = dosya_nesne.getName();
                        listModel1.addElement("" + dosya_adi);
                        long buyukluk = dosya_nesne.length();
                        listModel2.addElement(Long.toString(buyukluk));
                    }
                }
                if(!listModel1.isEmpty()) {
                    jList1.setModel(listModel1);
                    jList2.setModel(listModel2);
                    jButton4.setEnabled(true);
                }
                else {
                    listModel1.addElement("No Files of the");
                    listModel1.addElement("Specified Type Found");
                    listModel1.addElement("in the Folder...");
                    listModel2.addElement("No Files of the");
                    listModel2.addElement("Specified Type Found");
                    listModel2.addElement("in the Folder...");
                    jList1.setModel(listModel1);
                    jList2.setModel(listModel2);
                }
            }
            
            try {
                dosyayiTemizle();
            }
            catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dosyayiTemizle() throws IOException {
        File dosya = new File(DeleteFiles.txt);
        //System.out.println("Test Amaçlı");
        if (!dosya.exists()) {
            dosya.createNewFile();
            
        }
        else if(dosya.exists()){
            dosya.delete();
            dosya.createNewFile();
        }
        else {
            
        }
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        listModel3 = new DefaultListModel();
        listModel4 = new DefaultListModel();
        
        int dosyadakiElemanlar = 0 ;
        
        for(int i = 0 ; i < listModel1.size() ; i++) {
            if(listModel2.elementAt(i) != null) {
                //JOptionPane.showMessageDialog(null, i);
                for(int j = i+1 ; j < listModel1.size() ; j++) {
                    
                    int eleman1 = Integer.parseInt((String) listModel2.elementAt(i));
                    int eleman2 = Integer.parseInt((String) listModel2.elementAt(j));
                    
                    if(eleman1 == eleman2) {                        
                        listModel3.addElement(listModel1.elementAt(i));
                        listModel4.addElement(listModel1.elementAt(j));
                        // Silinen dosyaların birden fazla aynısı olduğunda silinen dosyayı tekrar silmeye çalışıyor ??
                        // Bu hatayı düzeltmem lazım !!!
                        DeleteFiles yeni = new DeleteFiles();
                        yeni.dosyalariSil((String) listModel1.elementAt(j)
                                , folder + "\\" +(String)listModel1.elementAt(j));
                    }
                }
            }
            dosyadakiElemanlar = i+1;
        }
        
        if (listModel1.isEmpty()) {
            listModel5 = new DefaultListModel();
            listModel5.addElement("File not found");
            listModel5.addElement("in the folder...");
            jList3.setModel(listModel5);
            jList4.setModel(listModel5);
        }
        else if(listModel3.isEmpty() && listModel4.isEmpty()) {
            listModel5 = new DefaultListModel();
            listModel5.addElement("Among " + dosyadakiElemanlar + " files;" + jComboBox1.getSelectedItem().toString());
            listModel5.addElement("no files");
            listModel5.addElement("with the same size");
            listModel5.addElement("were found...");
            
            jList3.setModel(listModel5);  
            jList4.setModel(listModel5);
            
        }
        else {
            jList3.setModel(listModel3);
            jList4.setModel(listModel4);
        }
        
        if (DeleteFiles.hicDosyaSilindiMi < 1){
            DeleteFiles.silinenler = "Deleted Files\n________________\n"
                    + "No Files Deleted Because,\nNo Files of Same Size Be Found..";
            JOptionPane.showMessageDialog(null, DeleteFiles.silinenler);
        }            
        else {
            JOptionPane.showMessageDialog(null, DeleteFiles.silinenler);
        }
        jButton3.doClick();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(WipeOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WipeOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WipeOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WipeOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WipeOut().setVisible(true);
            }
        });
    }

    // Variables Declaration - it can be modify by developer
    private DefaultListModel listModel1;
    private DefaultListModel listModel2;
    private DefaultListModel listModel3;
    private DefaultListModel listModel4;
    private DefaultListModel listModel5;
    public String folder;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
