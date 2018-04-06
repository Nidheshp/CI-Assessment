#!/bin/bash

who
echo "-------"

touch users.txt
uptime >> users.txt

echo "  Would you like to delete the existing log file?"
echo "Yes (y), No (n)"
read reply

if [ $reply == n ]
then
echo " Keeping Existing file"

elif [ $reply == y ]
then
sudo rm users.txt
fi
