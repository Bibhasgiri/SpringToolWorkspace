package com.bibhas.datastru;

public class Shortest_Path {
	static int INF = Integer.MAX_VALUE,N = 6; 
    // A recursive function to find the shortest path from 
    // source 's' to destination 'd'. 
    static int minCostRec(int cost[][], int s, int d) 
    { 
        // If source is same as destination 
        // or destination is next to source 
        if (s == d || s+1 == d) 
          return cost[s][d]; 
       
        // Initialize min cost as direct ticket from 
        // source 's' to destination 'd'. 
        int min = cost[s][d]; 
       
        // Try every intermediate vertex to find minimum 
        for (int i = s+1; i<d; i++) 
        { 
            int c = minCostRec(cost, s, i) + 
                    minCostRec(cost, i, d); 
            if (c < min) 
               min = c; 
        } 
        return min; 
    } 
       
    // This function returns the smallest possible cost to 
    // reach station N-1 from station 0. This function mainly 
    // uses minCostRec(). 
    static int minCost(int cost[][]) 
    { 
        return minCostRec(cost, 0, N-1); 
    } 
  
    public static void main(String args[]) 
    { 
        int cost[][] = { {0, 15, 80, 90,105,200}, 
                      {INF, 0, 40, 50,70,85}, 
                      {INF, INF, INF, INF,85,110}, 
                      {INF, INF, INF, INF,INF,99} 
                    }; 
        System.out.println("The Minimum cost to reach station "+ N+ 
                                               " is "+minCost(cost)); 
    } 
}
