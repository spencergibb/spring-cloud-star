export VAULT_ADDR=http://127.0.0.1:8200
export VAULT_TOKEN=`grep "Initial Root Token" vault_keys.txt | awk '{print $4}'`
