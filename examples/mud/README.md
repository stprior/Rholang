# Rho-Mud
This is to be an implementation of a simple adventure using rholang. 

## Phase 1 - POC
Initially this will simply consist of 

* a Location contract, instances of which are constructed with a channel and a description, and 
continue to write that description to the channel

* a Player contract, which is created with an action channel, and a current location. It 
can respond to two different actions; look and go. Look causes the current location to be displayed
to the console (through the actions channel), and go replaces the location which the contract is listening to.

* a Game contract
Other considerations initially include; 
* actions - different instances of actions (look and go) should be recognized by the contracts above, they are passed
with a channel - anything written to this channel should appear on the console.

* initialisation - a contract may be required to initialise several locations, and pass back a new player.
This may be a rosette script rather than a console

* interaction - steps required for instantiating and interacting with contracts to begin with

### Journey

* The game host deploys an instance of the Game contract. On chain this would be listening at a well known channel.

* The player sends a Start message to the game controller. Start message includes a reply channel, the Game Contract sends a new Player's listen channel to this 


## Phase 2 - adventure

In this phase the model would be built out to support more actions and objects, and interact 
directly with the console/browser rather than through Rosette.

Eric S. Raymond has recently updated and confirmed the open-source status of the original Crowther/Woods 
Adventure game from 1995. This may provide useful content to work with see https://gitlab.com/esr/open-adventure

## Phase 3 - multi user

This phase would use RChain to allow multiple users to interact within the adventure, and explore
novel methods of development through use of sharding and namespaces.


