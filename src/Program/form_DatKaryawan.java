/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author Crack
 */
public class form_DatKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form form_DatKaryawan
     */
    public form_DatKaryawan() {
        initComponents();
    }
    
     public form_DatKaryawan(String Nama){
        txt_Nama.setText(Nama);
        
    }
     
     public void tampilkan_Nama(String Nama){
         txt_Nama.setText(Nama);
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grup_Status = new javax.swing.ButtonGroup();
        lbl_LabelJudul = new javax.swing.JLabel();
        label_ = new javax.swing.JLabel();
        txt_Nama = new javax.swing.JTextField();
        txt_TempatLahir = new javax.swing.JTextField();
        label_1 = new javax.swing.JLabel();
        label_2 = new javax.swing.JLabel();
        txt_Tgl = new javax.swing.JTextField();
        txt_Bln = new javax.swing.JTextField();
        txt_Thn = new javax.swing.JTextField();
        cmb_Pendidikan = new javax.swing.JComboBox<>();
        label_4 = new javax.swing.JLabel();
        label_5 = new javax.swing.JLabel();
        cmb_StatusKaryawan = new javax.swing.JComboBox<>();
        btn_Tambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DataKaryawan = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_TampilNilai = new javax.swing.JTextArea();
        label_6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        label_7 = new javax.swing.JLabel();
        rb_Menikah = new javax.swing.JRadioButton();
        rb_Mahsiswa = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_LabelJudul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_LabelJudul.setText("FORM DATA KARYAWAN");

        label_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_.setText("Nama Lengkap");

        label_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_1.setText("Tempat Lahir");

        label_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_2.setText("Tgl-Bln-Thn Lahir");

        cmb_Pendidikan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "S1", "S2", "D3", "D4" }));

        label_4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_4.setText("Pendidikan");

        label_5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_5.setText("Status Karyawan");

        cmb_StatusKaryawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status", "Kontrak", "Tetap" }));

        btn_Tambah.setText("Tambah");
        btn_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TambahActionPerformed(evt);
            }
        });

        tbl_DataKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_DataKaryawan);

        txt_TampilNilai.setColumns(20);
        txt_TampilNilai.setRows(5);
        jScrollPane2.setViewportView(txt_TampilNilai);

        label_6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_6.setText("<< Menampilkan Nilai");

        label_7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_7.setText("Status ");

        grup_Status.add(rb_Menikah);
        rb_Menikah.setText("Menikah");

        grup_Status.add(rb_Mahsiswa);
        rb_Mahsiswa.setText("Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(lbl_LabelJudul))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(label_6))
                            .addComponent(btn_Tambah))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_1)
                            .addComponent(label_))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_4)
                                .addGap(73, 73, 73)
                                .addComponent(cmb_Pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_StatusKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(151, 151, 151))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_2)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_Bln, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_Thn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(rb_Menikah)))
                        .addGap(18, 18, 18)
                        .addComponent(rb_Mahsiswa)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbl_LabelJudul)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label_)
                                .addComponent(txt_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmb_Pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_4)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(label_1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_TempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_5)
                                .addComponent(cmb_StatusKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_2)
                            .addComponent(txt_Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Bln, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_Thn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_7))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_Menikah)
                            .addComponent(rb_Mahsiswa))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btn_Tambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_6)
                        .addGap(70, 70, 70))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TambahActionPerformed
        
        txt_TampilNilai.setText("Namaku : "+txt_Nama.getText());
        txt_TampilNilai.append("\nTempat Lahir : "+txt_TempatLahir.getText());
        txt_TampilNilai.append("\nTgl Bulan Lahir : "+txt_Tgl.getText() +"-"+txt_Bln.getText()+"-"+txt_Thn.getText() );
        txt_TampilNilai.append("\nPendidikan : "+cmb_Pendidikan.getSelectedItem());
        txt_TampilNilai.append("\nStatus Karyawan : "+cmb_StatusKaryawan.getSelectedItem());
        if(rb_Menikah.isSelected()){
            txt_TampilNilai.append("\nStatus : "+rb_Menikah.getText());
        }
        else if(rb_Mahsiswa.isSelected()){
            txt_TampilNilai.append("\nStatus : "+rb_Mahsiswa.getText());
        }
        
        int a; int b;
        a = Integer.parseInt(txt_Tgl.getText());
        b = Integer.parseInt(txt_Bln.getText());
        
        txt_TampilNilai.append("\n\nPenjumlahan : "+(a+b));
    }//GEN-LAST:event_btn_TambahActionPerformed

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
            java.util.logging.Logger.getLogger(form_DatKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_DatKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_DatKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_DatKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_DatKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Tambah;
    private javax.swing.JComboBox<String> cmb_Pendidikan;
    private javax.swing.JComboBox<String> cmb_StatusKaryawan;
    private javax.swing.ButtonGroup grup_Status;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_;
    private javax.swing.JLabel label_1;
    private javax.swing.JLabel label_2;
    private javax.swing.JLabel label_4;
    private javax.swing.JLabel label_5;
    private javax.swing.JLabel label_6;
    private javax.swing.JLabel label_7;
    private javax.swing.JLabel lbl_LabelJudul;
    private javax.swing.JRadioButton rb_Mahsiswa;
    private javax.swing.JRadioButton rb_Menikah;
    private javax.swing.JTable tbl_DataKaryawan;
    private javax.swing.JTextField txt_Bln;
    private javax.swing.JTextField txt_Nama;
    private javax.swing.JTextArea txt_TampilNilai;
    private javax.swing.JTextField txt_TempatLahir;
    private javax.swing.JTextField txt_Tgl;
    private javax.swing.JTextField txt_Thn;
    // End of variables declaration//GEN-END:variables
}
