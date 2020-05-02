/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.impl;

import command.Command;
import forms.EditorGUI;


public class CopyCommand extends Command {

    public CopyCommand(EditorGUI editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.getSelectedText();
        return false;
    }
    
}
