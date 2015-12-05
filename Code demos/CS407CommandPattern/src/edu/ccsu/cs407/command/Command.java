package edu.ccsu.cs407.command;

/**
 *
 * @author Chad Williams
 */
public interface Command {
  public void execute() throws CommandExecutionException;
}
