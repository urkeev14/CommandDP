/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.impl;

import command.Command;
import forms.EditorGUI;

public class CutCommand extends Command {

    public CutCommand(EditorGUI editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textNotSelected()) {
            return false;
        }

        backup();
        String source = editor.getText();
        editor.setClipboardText(editor.getSelectedText());
        editor.setText(getCutString(source));
        
        return true;
    }

    private String getCutString(String source) {
        int startPosition = editor.getSelectionStart();
        int endPosition = editor.getSelectionEnd();
        
        String start = source.substring(0, startPosition);
        String end = source.substring(endPosition);
        return start + end;
    }

}
