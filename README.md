# War(card GAME)🃏

The objective of the game is to win all of the cards.

## Installation

Clone this repo ↓

```bash
git clone https://github.com/YoubaImkf/WarGame
```

## Quand ca fonctionne 👀

```python
Thrall :[Carte: {type=Coeur, index=7}, Carte: {type=Carreau, index=7}, Carte: {type=Pique, index=4}, Carte: {type=Pique, index=6}, Carte: {type=Pique, index=7}]
Yoda :[Carte: {type=trèfle, index=10}, Carte: {type=Coeur, index=2}, Carte: {type=Pique, index=13}, Carte: {type=Coeur, index=8}, Carte: {type=Pique, index=3}]
 after:Thrall :[]
 after:Yoda   :[Carte: {type=trèfle, index=10}, Carte: {type=Pique, index=13}, Carte: {type=Coeur, index=8}, Carte: {type=Pique, index=6}, Carte: {type=Pique, index=4}, Carte: {type=Coeur, index=7}, Carte: {type=Coeur, index=2}, Carte: {type=Pique, index=3}, Carte: {type=Pique, index=7}, Carte: {type=Carreau, index=7}]
Yoda WIN
```

## How To Play 🏳️
The deck is divided evenly among the players, giving each a down stack. In unison, each player reveals the top card of their deck—this is a "battle"—and the player with the higher card takes both of the cards played and moves them to their stack. Aces are high, and suits are ignored.

If the two cards played are of equal value, then there is a "war". Both players place the next three cards face down and then another card face-up. The owner of the higher face-up card wins the war and adds all the cards on the table to the bottom of their deck. If the face-up cards are again equal then the battle repeats with another set of face-down/up cards. This repeats until one player's face-up card is higher than their opponent's.

__Source :__ [wiki](https://en.wikipedia.org/wiki/War_(card_game))
