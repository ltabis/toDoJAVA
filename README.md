# toDoJAVA (WIP)
## Java and bash todo manager.

The goal of this program is to provide a todo list manager using the terminal.

You can create **lists** : those are here to separate your todo things from one another.

You can insert **cards** in them : cards are your todo things and needs to be inside a list.

All of your cards have **Ids** : use the card id and associated list to delete it from the list.

## How to use :

-> ```./todo.sh```
   Display all lists, their content and Id's.

-> ```./todo.sh [list name]```
   Display the content and Id's of a list.

-> ```./todo.sh add [list name]```
   Create a new list.

-> ```./todo.sh add [list name] [card description]```
   Create a todo card inside a list.

-> ```./todo.sh check [list name] [card id]```
   Check a todo card inside a list (done state)
   if this card is already checked, the program will uncheck it for you.

-> ```./todo.sh remove [list name]```
   Remove a list.

-> ```./todo.sh remove [list name] [card id]```
   Remove a card from a list.

-> ```./todo.sh help```
   Display help.

You can of course bind these commands with aliases.

## Exemple :
![alt text](https://github.com/ltabis/toDoJAVA/blob/master/misc/images/exemple.png)

## Features not yet implemented :

>> check and uncheck