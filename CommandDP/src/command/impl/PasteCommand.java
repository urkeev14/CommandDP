/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.impl;

import command.Command;
import forms.EditorGUI;

public class PasteCommand extends Command {

    public PasteCommand(EditorGUI editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.isClipboardInitialized() || editor.isClipboardEmpty()) {
            return false;
        }
        
        backup();
        editor.appendText(editor.clipboard);
        return true;
    }

}
