package edu.ccsu.cs407.command;

/**
 *
 * @author Chad Williams
 */
public interface AbstractUndoableCommandFactory {

  public UndoableCommand makeUndoableCommand(String commandParameters);
}
