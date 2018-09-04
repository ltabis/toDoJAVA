#!/bin/bash

if [ "$1" = "help" ]; then
  cat misc/help.txt
fi

java -jar misc/todo.jar "$@"
