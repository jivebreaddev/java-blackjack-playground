package domain.blackjack.player.state;

import domain.blackjack.card.Cards;

public class Blackjack extends Finished {

  public Blackjack(final Cards cards) {
    super(cards);
  }

  @Override
  public double earningsRate() {
    return 1.5;
  }
}
