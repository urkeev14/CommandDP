/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import forms.EditorGUI;

/**
 *
 * @author urosv
 */
public abstract class Command {
    
    public EditorGUI editor;
    private String backup;

    public Command(EditorGUI editor) {
        this.editor = editor;
    }
    
    public void backup(){
        backup = editor.getText();
    }
    public void undo(){
        editor.setText(backup);
    }

    public abstract boolean execute();
    
}
