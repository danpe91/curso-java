package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Clase7 extends javax.swing.JFrame {

    public static final String separador = ", ";

    static {
        setLoolAndFeel();
    }

    public Clase7() {
        initComponents();
        getRootPane().setDefaultButton(llenarTablaButton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        llenarTablaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(miTabla);

        llenarTablaButton.setText("Llenar");
        llenarTablaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarTablaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(llenarTablaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(llenarTablaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarArchivoDefault(File file) {

        FileWriter fw;
        try {

            fw = new FileWriter(file, false);
            fw.write("Default11" + separador);
            fw.write("Default12" + separador);
            fw.write("Default13" + separador);
            fw.write("Default14" + separador);
            fw.write('\n');
            fw.write("Default21" + separador + "Default22" + separador + "Default23" + separador + "Default24");
            fw.write('\n');
            fw.write(String.format("Default31%sDefault32%sDefault33%sDefault34", separador, separador, separador));
            fw.close();
        } catch (IOException ioe) {
            
            ioe.printStackTrace();
            file.delete();
        }

    }

    private void llenarTablaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarTablaButtonActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) miTabla.getModel();

        dtm.getDataVector().removeAllElements();

        File file = new File("/home/daniel/Escritorio/archivoDeTexto");
        FileReader fr;
        BufferedReader br;
        String line, split[];
        InfoTabla info;
        List<InfoTabla> list = new LinkedList<>();

        if (!file.exists()) {
            try {
                file.createNewFile();
                llenarArchivoDefault(file);
            } catch (IOException ex) {
                Logger.getLogger(Clase7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {

            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {

                split = line.split(", ");
                System.out.println(line);

                info = new InfoTabla(split[0], split[1], split[2], split[3]);
                list.add(info);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Clase7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Clase7.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (InfoTabla i : list) {

            Object row[] = {
                i.getColumn1(),
                i.getColumn2(),
                i.getColumn3(),
                i.getColumn4(), "", ""
            };
            dtm.addRow(row);
        }

        Object titles[] = {
            "n1", "n2", "n3", "n4"
        };

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        dtm.setColumnIdentifiers(titles);
        if (list.isEmpty()) {
            Object row[] = {
                null,
                null,
                null,
                null
            };
            dtm.addRow(row);
        }

    }//GEN-LAST:event_llenarTablaButtonActionPerformed

    public static void setLoolAndFeel() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clase7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clase7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clase7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clase7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton llenarTablaButton;
    private javax.swing.JTable miTabla;
    // End of variables declaration//GEN-END:variables
}
