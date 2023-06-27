package domain.blackjack.player.state;

public interface State {
  public State draw();
  public State stay();
  public State isFinished();
  public State cards();
  public State profit();
}
