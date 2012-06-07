/*
 *   DefaultWeightedEdge.java
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


package org.graphnetwork.jgrapht.graph;

public class DefaultWeightedEdge
        extends org.jgrapht.graph.DefaultWeightedEdge {
    private float weight; /* the weight value of the edge */
    
    /**
     * Sets the weight value of the DefaultWeightedEdge
     *
     * @param w the value of the weight to be set
     */
    public void setWeight(float w) {
        weight = w;
    }
    
    /**
     * Returns the weight value of the DefaultWeightedEdge
     *
     * @return the value of the weight of this edge
     */
    public float getWeight() {
        return weight;
    }
    
    /**
     * Overrides the toString method of DefaultWeightedEdge
     * to return just a String representation of the weight
     * of the edge + the superclass toString.
     *
     *
     * @return a string representation of the weight value
     */
    public java.lang.String toString() {
        return super.toString() + " = " + weight;
    }
}
