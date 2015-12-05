package edu.ccsu.cs407.command;

/**
 *
 * @author Chad Williams
 */
public interface UndoableCommand extends Command{
  public void unexecute();
}
