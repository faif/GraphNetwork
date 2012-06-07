/*
 *   Random.java
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

/**
 *
 * @author faif
 */
public class Random {
    
    
    /**
     * Returns a random positive number between 1 and a
     * maximum value given by the user
     * @param n the maximum value to return
     * @return the random value between 1 and n
     */ 
    public static int getRandomPositiveInteger(int n) {
        return (int)(Math.random() * n) + 1;
    }
    
    /**
     * Returns a random positive float between
     * a minimum and a maximum value given by the user
     * @param min the minimum value to return
     * @param max the maximum value to return
     * @return a float value between min and max
     */ 
    public static float getRandomPositiveFloatLim(float min, float max) {
        return (float)((Math.random() * (max-min))) + min;
    }
    
    /**
     * Returns a random positive int between
     * a minimum and a maximum value given by the user
     * @param min the minimum value to return
     * @param max the minimum value to return
     * @return an integer value between min and max
     */ 
    public static int getRandomPositiveIntegerLim(int min, int max) {
        return (int)((Math.random() * (max-min))) + min;
    }   
}
