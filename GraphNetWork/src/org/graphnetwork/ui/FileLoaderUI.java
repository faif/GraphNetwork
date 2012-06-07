/*
 *   FileLoaderUI.java
 *
 *   Copyright (C) 2006, 2007 Alexander Technological Educational Institute of Thessaloniki
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 
 *   You should have received a copy of the GNU General Public License along
 *   with this program; if not, write to the Free Software Foundation, Inc.,
 *   51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 */

package org.graphnetwork.ui;

/* swing and awt classes */
import javax.swing.*;

/* core java classes */
import java.io.File;

/* my classes */
import org.graphnetwork.ui.io.ExtensionFilter;

public class FileLoaderUI {
    private File f;                 // to check the filesystem (file exists, etc)
    private String name;            // name of a file
    private String path;            // path of a file
    private boolean loaded=false;   // flag to know if the file is loaded or not

    /**
     * Display a JFileChooser
     * @param title the title of the file chooser
     */
    public FileLoaderUI(String title) {
        JFrame parent=new JFrame(); //never shown
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle(title);
        fc.addChoosableFileFilter(new ExtensionFilter("txt", "Plain text files"));
        
        int result = fc.showDialog(parent, "Load");
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File f = fc.getSelectedFile();
                if (f != null && f.isFile()) { // make sure the user didn't choose a directory
                    name=f.getName();
                    path=f.getAbsolutePath();
                    loaded=true;
                }
            } catch (Exception e) {
                System.err.println(e);
            }
            
        }
        
    } //FileLoaderUI
    
    /**
     * @return true if the file is correctly loaded
     */
    public boolean isFileLoaded() {
        return loaded;
    }
    
    /**
     * @return name the filename
     */    
    public String getFileName() {
        return name;
    }

    /**
     * @return the loaded file
     */
    public File getFile() {
        return f;
    }
    
    /**
     * @return path the path of the file
     */    
    public String getFilePath() {
        return path;
    }
}
