/*
 *   RandomGraphGenerator.java
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

package org.graphnetwork.generate;

/* jgrapht classes */
import org.jgrapht.*;
import org.jgrapht.ext.IntegerNameProvider;
import org.jgrapht.graph.ListenableUndirectedWeightedGraph;

/* my classes */
import org.graphnetwork.jgrapht.graph.DefaultWeightedEdge;

/**
 *
 * @author faif
 */
public class RandomGraphGenerator implements
        org.graphnetwork.common.Constants {
    
    /** Creates a graph with a random number
     * of edges and vertices
     * @param numOfVertices the maximum number of vertices
     * @param numOfEdges the maximum number of edges
     * @param minWeight the minimum weight value
     * @param maxWeight the maximum weight value
     */
    public RandomGraphGenerator(ListenableUndirectedWeightedGraph g,
            int numOfVertices, int numOfEdges, float minWeight,
            float maxWeight) {
        
        /* call the method which adds one edge per vertex */
        Object vertices[] = addOneEdgePerVertex(g, numOfVertices, numOfEdges,
                minWeight, maxWeight);
        
        generateRestGraph(g, vertices, (numOfEdges - 1), minWeight, maxWeight);
    }
    
    /** Creates a graph with a random number of edges
     * per vertex
     * @param numOfVertices the maximum number of vertices
     * @param numOfEdges the maximum number of edges
     * @param minWeight the minimum weight value
     * @param maxWeight the maximum weight value
     */
    private void generateRestGraph(ListenableUndirectedWeightedGraph g,
            Object v[], int numOfEdges, float minWeight,
            float maxWeight) {
        
        for (int i = 0; i < v.length; i++) {
            /* get a random number of edges */
            int rEdges =
                    org.graphnetwork.util.
                    Random.getRandomPositiveInteger(numOfEdges);
            
            /* add a random number of edges between the current and a random
              vertex */
            for (int j=0; j<rEdges; j++) {
                /* get a random vertex */
                int rVertex =
                        org.graphnetwork.util.Random.getRandomPositiveIntegerLim(i,
                        v.length);
                try {
                    /* add to the edge a random weight between MINW and MAXW */
                    float randWeight =
                            org.graphnetwork.util.Random.getRandomPositiveFloatLim(
                            minWeight, maxWeight);
                    Object e = g.addEdge(v[i], v[rVertex]);
                    if (e instanceof DefaultWeightedEdge) {
                        ((DefaultWeightedEdge)e).setWeight(randWeight);
                    }
                } catch (Exception e) {
//                    e.printStackTrace();
                }
            }
        }
    }
    
    /** Creates a graph with one edge per vertex
     * of edges and vertices
     * @param numOfVertices the maximum number of vertices
     * @param numOfEdges the maximum number of edges
     * @param minWeight the minimum weight value
     * @param maxWeight the maximum weight value
     */
    private Object[] addOneEdgePerVertex(ListenableUndirectedWeightedGraph g,
            int numOfVertices, int numOfEdges, float minWeight,
            float maxWeight) {
        
        /* the name provider of the vertices */
        /* IntegerNameProvider provides names 1, 2, 3, etc. */
        IntegerNameProvider i=new IntegerNameProvider();
        
        Object v[] = new String[numOfVertices];
        
        /* previous and current vertex (to add the edge) */
        java.lang.String prev = EMPTY;
        java.lang.String curr = EMPTY;
        
        prev = i.getVertexName(prev);
        g.addVertex(prev);
        v[0] = prev;
        
        /* add the vertices to the graph */
        for (int j = 0; j < numOfVertices; j++) {
            curr = i.getVertexName(curr);
            g.addVertex(curr);
            v[j] = curr;
            
            float randWeight = 0f;
            
            try {
                /* add one edge per vertex */
                Object e =
                        g.addEdge(prev, curr);
                
                /* add to the edge a random weight between MINW and MAXW */
                randWeight =
                        org.graphnetwork.util.Random.getRandomPositiveFloatLim(
                        minWeight, maxWeight);
                
                if (e instanceof DefaultWeightedEdge) {
                    ((DefaultWeightedEdge)e).setWeight(randWeight);
                }
            } catch (Exception e) {
//                System.out.println("loop...");
            }
            prev = curr;
        }
        return v;
    }
    
}