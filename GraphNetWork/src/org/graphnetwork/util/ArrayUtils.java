/*
 *   ArrayUtils.java
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

public class ArrayUtils {
    
    /**
     * Prints the contents of the array.
     * @param a the array to print the contents of
     */
    public static void printArray(Object a[]) {
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i].toString() + " ");
    }
    
    /**
     * Prints the contents of the array.
     * @param a the array to print the contents of
     */
    public static void printArray(double a[]) {
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
    
    /**
     * Prints the contents of the array.
     * @param a the array to print the contents of
     */
    public static void printArray(int a[]) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    /**
     * Prints the contents of the array.
     * @param a the array to print the contents of
     */
    public static void printArray(int a[][]) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    
    
    /**
     * Find and returns the maximum number in the array.
     * @param a the array to search
     * @return the maximum number
     */
    public static int getMaximum(int a[]) {
        int max = a[0];
        
        for(int i = 1; i < a.length; i++)
            if(a[i] > max)
                max = a[i];
        return max;
    }

    /**
     * Find and returns the index of the maximum number in the array.
     * @param a the array to search
     * @return the index of the maximum number
     */
    public static int getIndexOfMaximum(int a[]) {
        int maxIndex = 0;
        int max = a[0];
        
        for(int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    

    /**
     * Find and returns the minimum number in the array.
     * @param a the array to search
     * @return the minimum number
     */
    public static int getMinimum(int a[]) {
        int min = a[0];
        
        for(int i = 1; i < a.length; i++)
            if(a[i] < min)
                min = a[i];
        return min;
    }
    
    /**
     * Find and returns the index of the minimum number in the array.
     * @param a the array to search
     * @return the index of the minimum number
     */
    public static int getIndexOfMinimum(int a[]) {
        int minIndex = 0;
        int min = a[0];
        
        for(int i = 1; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    

    /**
     * Find and returns the minimum number in the array.
     * @param a the array to search
     * @return the minimum number
     */
    public static int getMinimum(int a[][]) {
        int min = a[0][0];
        
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a[i].length; j++)
                if(a[i][j] < min)
                    min = a[i][j];
        
        return min;
    }
    
    
    /**
     * Find and returns the index of the minimum number in the array.
     * @param a the array to search
     * @return an array of size 2 with the indices of the minimum number
     */
    public static int[] getIndicesOfMinimum(int a[][]) {
        int minIndices[] = new int[2];
        int min = a[0][0];
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if(a[i][j] < min) {
                    min = a[i][j];
                    minIndices[0] = i;
                    minIndices[1] = j;
                }
            }
        }
        return minIndices;
    }
}
