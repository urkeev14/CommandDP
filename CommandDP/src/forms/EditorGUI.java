/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import command.Command;
import command.history.CommandHistory;
import command.impl.CopyCommand;
import command.impl.CutCommand;
import command.impl.PasteCommand;

/**
 *
 * @author urosv
 */
public class EditorGUI extends javax.swing.JFrame {

    public String clipboard;
    private CommandHistory history = new CommandHistory();

    /**
     * Creates new form EditorGUI
     */
    public EditorGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jbtnCopy = new javax.swing.JButton();
        jbtnPaste = new javax.swing.JButton();
        jbtnUndo = new javax.swing.JButton();
        jbtnCut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text editor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 242, 242));
        jPanel1.setAutoscrolls(true);

        jTextArea.setColumns(20);
        jTextArea.setLineWrap(true);
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        jbtnCopy.setBackground(new java.awt.Color(76, 155, 247));
        jbtnCopy.setText("Ctrl + C");
        jbtnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCopyActionPerformed(evt);
            }
        });

        jbtnPaste.setBackground(new java.awt.Color(255, 220, 91));
        jbtnPaste.setText("Ctrl + V");
        jbtnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteActionPerformed(evt);
            }
        });

        jbtnUndo.setBackground(new java.awt.Color(214, 64, 71));
        jbtnUndo.setText("Ctrl + Z");
        jbtnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUndoActionPerformed(evt);
            }
        });

        jbtnCut.setBackground(new java.awt.Color(76, 155, 247));
        jbtnCut.setText("Ctrl + X");
        jbtnCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnCopy)
                .addGap(18, 18, 18)
                .addComponent(jbtnCut)
                .addGap(18, 18, 18)
                .addComponent(jbtnPaste)
                .addGap(18, 18, 18)
                .addComponent(jbtnUndo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCopy)
                    .addComponent(jbtnCut)
                    .addComponent(jbtnPaste)
                    .addComponent(jbtnUndo))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCopyActionPerformed
        executeCommand(new CopyCommand(this));
    }//GEN-LAST:event_jbtnCopyActionPerformed

    private void jbtnCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCutActionPerformed
        executeCommand(new CutCommand(this));
    }//GEN-LAST:event_jbtnCutActionPerformed

    private void jbtnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteActionPerformed
        executeCommand(new PasteCommand(this));
    }//GEN-LAST:event_jbtnPasteActionPerformed

    private void jbtnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUndoActionPerformed
        undo();
    }//GEN-LAST:event_jbtnUndoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JButton jbtnCopy;
    private javax.swing.JButton jbtnCut;
    private javax.swing.JButton jbtnPaste;
    private javax.swing.JButton jbtnUndo;
    // End of variables declaration//GEN-END:variables

    public String getText() {
        return this.jTextArea.getText();
    }

    public void setText(String backup) {
        this.jTextArea.setText(backup);
    }

    public void appendText(String clipboard) {
        this.jTextArea.insert(clipboard, this.jTextArea.getCaretPosition());
    }

    public String getSelectedText() {
        return this.jTextArea.getSelectedText();
    }

    public boolean isClipboardInitialized() {
        return clipboard == null;
    }

    public boolean isClipboardEmpty() {
        return clipboard.isEmpty();
    }

    public boolean textNotSelected() {
        return this.jTextArea.getSelectedText().isEmpty();
    }

    public void setClipboardText(String text) {
        this.clipboard = text;
    }

    public int getSelectionStart() {
        return this.jTextArea.getSelectionStart();
    }

    public int getSelectionEnd() {
        return this.jTextArea.getSelectionEnd();
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty()) {
            return;
        }

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
