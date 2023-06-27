package domain.blackjack.player.state;

import domain.blackjack.card.Cards;

public class Bust extends Finished{

  public Bust(Cards cards) {
    super(cards);
  }
}
