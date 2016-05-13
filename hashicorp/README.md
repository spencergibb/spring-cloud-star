# new terminal
./consul.sh

# new terminal
./vault.sh

# new terminal
. ./vault_env.sh

# first time only
vault init > vault_keys.txt

# first time only
. ./vault_env.sh

./vault_unseal.sh

./vault_write_policies.sh

