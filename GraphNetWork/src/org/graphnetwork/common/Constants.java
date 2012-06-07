/*
 *   Constants.java
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


package org.graphnetwork.common;

/**
 *
 * @author faif
 *
 */
public interface Constants {
    
    static public final String EMPTY = "";          /* an empty string */
    
    static public final String NEWLINE =
            System.getProperty("line.separator");   /* newline */
    
    static public final String FILESEP =
            System.getProperty("file.separator");   /* file separator */
    
    static public final String UDIR =
            System.getProperty("user.dir");   /* user's current directory */
}
