/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author lmcqueen
 */
public class Notes implements Serializable{
    
    private ArrayList<String> notes;

    public Notes() {
    }
    
    public ArrayList<String> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<String> notes) {
        this.notes = notes;
    }
    
    public void addNote(String note){
        this.notes.add(note);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.notes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Notes other = (Notes) obj;
        if (!Objects.equals(this.notes, other.notes)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Note{" + "notes=" + notes + '}';
    }
    
    
}
