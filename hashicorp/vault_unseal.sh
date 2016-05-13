#!/usr/bin/env bash

keys=($(head -n 3 vault_keys.txt | awk '{print $3}'))
length=${#keys[@]}
for ((i = 0; i != length; i++)); do
   echo "vault unseal ${keys[i]}"
   vault unseal ${keys[i]}
done