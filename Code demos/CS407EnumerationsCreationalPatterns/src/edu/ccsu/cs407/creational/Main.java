package edu.ccsu.cs407.creational;

import edu.ccsu.cs407.enumeration.Direction;

/**
 * Demo of use of creational patterns
 */
public class Main {
  public static void main(String[] args){
    MazeCreator mazeCreator = new CODMazeCreator();
    Maze maze = mazeCreator.createMaze();
    System.out.println(maze.toString());
    
    mazeCreator = new HPMazeCreator();
    maze = mazeCreator.createMaze();
    System.out.println(maze.toString());
  }
}
