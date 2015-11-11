package edu.ccsu.cs407.creational;

/**
 * Concrete Call of Duty maze creator
 */
public class CODMazeCreator extends MazeCreator{

  @Override
  protected Wall makeWall() {
    return new CODWall();
  }
  
}
