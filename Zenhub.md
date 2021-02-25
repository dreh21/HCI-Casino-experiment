# Epics:

## Building the database
* Download/Set up MariaDB
* Create database Schema
* write scripts to import schema into MariaDB

## Populate database(complete after game logic is complete)
* write function that runs trial games
* Enable function to write to a file in format that can be inserted into database 
* write scripts Import data into Database 

## Implement player class/struct/object
* Create an object that can represent a player 
* Needs to have attributes: ID, total money, games played, time played ,...
* Needs methods for: changing total money value, increment games played, ....

## Implement card/deck class/struct/object
* Create Representaion of a deck of cards 
* Implement shuffle method 
* Implement deal methods for nessecary games (could be done in implementation of games also) 
* Implement a pop method (to get a card off top of deck)

## Implement Roulette logic
* Gain understanding of game and fill out Roulette document (optional) 
* Create RouletteGame.java and implement game logic 
* ....

## Implement Blackjack games logic
* Gain understanding of Black Jack and Spanish 21 and fill out Blackjack document (optional)
* Create BlackJack.java and implement game logic 
* Create Spanish21.java and implement game logic 

## Implement Poker games logic
* Gain understanding of Texas Hold'em and Omaha and fill out poker document (optional)
* Create Hold'em.java and implement game logic 
* Add methods to rank hands and determine game winner for Hold'em
* Create Omaha.java and implement game logic
* Add methods to rank hands and determine game winner for Omaha
* Set up "AI" for poker game cpu 
* 
## Implement Roulette GUI
* Look into java animations librarys to get a roulette wheel spinning and ball to drop 
* Set up buttons/methods to play again, exit to main menu, set bet amount, make bet,... 
* ...

## Implement Blackjack GUI
* Get a card/casino table as back ground
* Get player/dealer cards to render in front of them
* Set up buttons/methods to play again, exit to main menu, set bet amount, Double down, hit,...

## Implement Poker GUI
* Get a card/casino table as back ground
* Get player/ai cards to render in front of them
* Set up buttons/methods to play again, exit to main menu, set bet amount, fold, call, raise...

## Setup data collection
* Enable automatic data collection record user information after each individual game.
* Enable automatic data collection for entire session statistics 


