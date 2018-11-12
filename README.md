# chutes-and-ladders-game
Priceline Coding Exercise solution

### Assignment
In Java, code a simulation of the classic children’s game “Chutes And Ladders.” There is no “right” answer to
this assignment, we will be evaluating the design choices and coding style.

**Instructions**
- Use this document as a business spec
- Design and develop the business objects only (do not create a GUI)
- To demonstrate that the software works, write a “main” method that simulates 2 to 4 four players and
generates output similar to the sample below
- Deliver the final code in .java files and any other resources required to run the program
- Please indicate in comments or in a separate document any assumptions you make about the
requirements, as well as any “ToDo” items that you would do if this was a “real” project but that are
not in the requirements given.

click [here](https://github.com/dvp3010/chutes-and-ladders-game/blob/master/ChutesandLaddersAssignment.pdf) for full specs

### Prerequisites for running executable jar
- Java 1.8

### Setup for running executable jar
```sh
$ mkdir -p /tmp/priceline
$ cd /tmp/priceline
$ git clone https://github.com/dvp3010/chutes-and-ladders-game.git
$ cd ./target
```

-------OR--------

You can download [chutes-and-ladders-game.jar]() and open command prompt at downloaded location to run the program.

### Usage
```sh
$ java -jar chutes-and-ladders-game.jar
```

- below is output of two player game

```sh
please enter player name and age delimited by comma i.e Dhruv,5:
Paul,5
Player [name=Paul, age=5] has been added. players : [Player [name=Paul, age=5]]

Do you want add another player[Y]? type 'N' and press enter to start the game.
Y
please enter player name and age delimited by comma i.e Dhruv,5:
Eric,6
Player [name=Eric, age=6] has been added. players : [Player [name=Paul, age=5], Player [name=Eric, age=6]]

Do you want add another player[Y]? type 'N' and press enter to start the game.
N
Players playing game : [Player [name=Paul, age=5], Player [name=Eric, age=6]]
Paul got highest spin number 4 so he/she will take first turn
Paul       spin_outcome:3 :   0 -->   3
Eric       spin_outcome:5 :   0 -->   5
Paul       spin_outcome:4 :   3 -->   7
Eric       spin_outcome:6 :   5 -->  11
Paul       spin_outcome:5 :   7 -->  12
Eric       spin_outcome:1 :  11 -->  12
Paul       spin_outcome:1 :  12 -->  13
Eric       spin_outcome:4 :  12 -->  16 --CHUTE-->   6
Paul       spin_outcome:1 :  13 -->  14
Eric       spin_outcome:5 :   6 -->  11
Paul       spin_outcome:1 :  14 -->  15
Eric       spin_outcome:2 :  11 -->  13
Paul       spin_outcome:3 :  15 -->  18
Eric       spin_outcome:3 :  13 -->  16 --CHUTE-->   6
Paul       spin_outcome:2 :  18 -->  20
Eric       spin_outcome:4 :   6 -->  10
Paul       spin_outcome:2 :  20 -->  22
Eric       spin_outcome:2 :  10 -->  12
Paul       spin_outcome:2 :  22 -->  24
Eric       spin_outcome:6 :  12 -->  18
Paul       spin_outcome:6 :  24 -->  30
Eric       spin_outcome:1 :  18 -->  19
Paul       spin_outcome:6 :  30 -->  36 --LADDER-->  44
Eric       spin_outcome:2 :  19 -->  21 --LADDER-->  42
Paul       spin_outcome:2 :  44 -->  46
Eric       spin_outcome:5 :  42 -->  47 --CHUTE-->  26
Paul       spin_outcome:6 :  46 -->  52
Eric       spin_outcome:2 :  26 -->  28 --LADDER-->  84
Paul       spin_outcome:5 :  52 -->  57
Eric       spin_outcome:3 :  84 -->  87 --CHUTE-->  24
Paul       spin_outcome:1 :  57 -->  58
Eric       spin_outcome:6 :  24 -->  30
Paul       spin_outcome:6 :  58 -->  64 --CHUTE-->  60
Eric       spin_outcome:6 :  30 -->  36 --LADDER-->  44
Paul       spin_outcome:2 :  60 -->  62 --CHUTE-->  19
Eric       spin_outcome:2 :  44 -->  46
Paul       spin_outcome:4 :  19 -->  23
Eric       spin_outcome:4 :  46 -->  50
Paul       spin_outcome:4 :  23 -->  27
Eric       spin_outcome:2 :  50 -->  52
Paul       spin_outcome:2 :  27 -->  29
Eric       spin_outcome:1 :  52 -->  53
Paul       spin_outcome:1 :  29 -->  30
Eric       spin_outcome:6 :  53 -->  59
Paul       spin_outcome:6 :  30 -->  36 --LADDER-->  44
Eric       spin_outcome:3 :  59 -->  62 --CHUTE-->  19
Paul       spin_outcome:1 :  44 -->  45
Eric       spin_outcome:6 :  19 -->  25
Paul       spin_outcome:6 :  45 -->  51 --LADDER-->  68
Eric       spin_outcome:6 :  25 -->  31
Paul       spin_outcome:6 :  68 -->  74
Eric       spin_outcome:2 :  31 -->  33
Paul       spin_outcome:4 :  74 -->  78
Eric       spin_outcome:4 :  33 -->  37
Paul       spin_outcome:6 :  78 -->  84
Eric       spin_outcome:3 :  37 -->  40
Paul       spin_outcome:4 :  84 -->  88
Eric       spin_outcome:2 :  40 -->  42
Paul       spin_outcome:6 :  88 -->  94
Eric       spin_outcome:3 :  42 -->  45
Paul       spin_outcome:3 :  94 -->  97
Eric       spin_outcome:5 :  45 -->  50
Paul       spin_outcome:1 :  97 -->  98 --CHUTE-->  78
Eric       spin_outcome:2 :  50 -->  52
Paul       spin_outcome:1 :  78 -->  79
Eric       spin_outcome:4 :  52 -->  56 --CHUTE-->  53
Paul       spin_outcome:4 :  79 -->  83
Eric       spin_outcome:6 :  53 -->  59
Paul       spin_outcome:4 :  83 -->  87 --CHUTE-->  24
Eric       spin_outcome:6 :  59 -->  65
Paul       spin_outcome:6 :  24 -->  30
Eric       spin_outcome:2 :  65 -->  67
Paul       spin_outcome:6 :  30 -->  36 --LADDER-->  44
Eric       spin_outcome:1 :  67 -->  68
Paul       spin_outcome:2 :  44 -->  46
Eric       spin_outcome:2 :  68 -->  70
Paul       spin_outcome:6 :  46 -->  52
Eric       spin_outcome:3 :  70 -->  73
Paul       spin_outcome:6 :  52 -->  58
Eric       spin_outcome:1 :  73 -->  74
Paul       spin_outcome:3 :  58 -->  61
Eric       spin_outcome:3 :  74 -->  77
Paul       spin_outcome:5 :  61 -->  66
Eric       spin_outcome:6 :  77 -->  83
Paul       spin_outcome:6 :  66 -->  72
Eric       spin_outcome:5 :  83 -->  88
Paul       spin_outcome:5 :  72 -->  77
Eric       spin_outcome:6 :  88 -->  94
Paul       spin_outcome:1 :  77 -->  78
Eric       spin_outcome:2 :  94 -->  96
Paul       spin_outcome:2 :  78 -->  80 --LADDER--> 100
The winner is Paul !
```

- below is output when you start game with less than 2 players.

```sh
please enter player name and age delimited by comma i.e Dhruv,5:
Dhruv,5
Player [name=Dhruv, age=5] has been added. players : [Player [name=Dhruv, age=5]]

Do you want add another player[Y]? type 'N' and press enter to start the game.
N
Players playing game : [Player [name=Dhruv, age=5]]
Exception in thread "main" com.candidate.priceline.chutes.and.ladders.game.exceptions.NotEnoughPlayersException: to play this game you need atleast 2 players.
	at com.candidate.priceline.chutes.and.ladders.game.core.ChutesAndLaddersGame.startPlay(ChutesAndLaddersGame.java:28)
	at com.candidate.priceline.chutes.and.ladders.game.Application.main(Application.java:35)
```

- below is output when you start game with more than 4 players.

```sh
please enter player name and age delimited by comma i.e Dhruv,5:
Paul,4
Player [name=Paul, age=4] has been added. players : [Player [name=Paul, age=4]]

Do you want add another player[Y]? type 'N' and press enter to start the game.
Y
please enter player name and age delimited by comma i.e Dhruv,5:
Eric,5
Player [name=Eric, age=5] has been added. players : [Player [name=Paul, age=4], Player [name=Eric, age=5]]

Do you want add another player[Y]? type 'N' and press enter to start the game.
Y
please enter player name and age delimited by comma i.e Dhruv,5:
Katrina,6
Player [name=Katrina, age=6] has been added. players : [Player [name=Paul, age=4], Player [name=Eric, age=5], Player [name=Katrina, age=6]]

Do you want add another player[Y]? type 'N' and press enter to start the game.
Y
please enter player name and age delimited by comma i.e Dhruv,5:
Mark,5
Player [name=Mark, age=5] has been added. players : [Player [name=Paul, age=4], Player [name=Eric, age=5], Player [name=Katrina, age=6], Player [name=Mark, age=5]]

Do you want add another player[Y]? type 'N' and press enter to start the game.
Y
please enter player name and age delimited by comma i.e Dhruv,5:
John,6
Player [name=John, age=6] has been added. players : [Player [name=Paul, age=4], Player [name=Eric, age=5], Player [name=Katrina, age=6], Player [name=Mark, age=5], Player [name=John, age=6]]

Do you want add another player[Y]? type 'N' and press enter to start the game.
N
Players playing game : [Player [name=Paul, age=4], Player [name=Eric, age=5], Player [name=Katrina, age=6], Player [name=Mark, age=5], Player [name=John, age=6]]
Exception in thread "main" com.candidate.priceline.chutes.and.ladders.game.exceptions.TooManyPlayersException: players cannot be morethan 4.
	at com.candidate.priceline.chutes.and.ladders.game.core.ChutesAndLaddersGame.startPlay(ChutesAndLaddersGame.java:31)
	at com.candidate.priceline.chutes.and.ladders.game.Application.main(Application.java:35)
```

- below is output if you provide player with age less than 4

```sh
please enter player name and age delimited by comma i.e Dhruv,5:
Eric,2
ERROR : player cannot be added. player Eric cannot play this game because this game contains small part which is CHOKING HAZARD for childer under age 3
please enter player name and age delimited by comma i.e Dhruv,5:
```

- below is output if you provide player with age greater than 7

```sh
please enter player name and age delimited by comma i.e Dhruv,5:
Paul,10
ERROR : player cannot be added. player Paul cannot play this game because this game is designed for 4-7 age group
please enter player name and age delimited by comma i.e Dhruv,5:
```
