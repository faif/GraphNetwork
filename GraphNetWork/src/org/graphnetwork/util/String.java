/*
 *   String.java
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

package org.graphnetwork.util;
import java.util.Vector;
import java.util.StringTokenizer;

/**
 *
 * @author faif
 */
public class String {    
    
    /**
     * Extracts the contents of an array to a
     * String variable and returns it
     * @param a the array with the contents
     * @param s the string between each element (data separator)
     * @return the String representation of the array
     */
    public static java.lang.String extractStringFromArray(Object a[], String s) {
        java.lang.String str=new java.lang.String();
        for (int i=0; i < a.length; i++) {
            if (i != a.length-1)
                str += a[i].toString() + s;
            else
                str += a[i].toString();
        }
        return str;
    }

    /**
     * Extracts the contents of a String to an
     * array
     * @param s the String with the contents to be extracted
     * @return the array with the contents of the String
     */
    public static Object[] extractArrayFromString(java.lang.String s) {
        Vector v = new Vector();
        
        /* extract each value from the
         * string and save it to a vector */
        StringTokenizer st = new
                StringTokenizer((java.lang.String)s);
        
        while (st.hasMoreTokens()) {
            v.add(st.nextToken());
        }
        
        return v.toArray();        
    }
    
}
