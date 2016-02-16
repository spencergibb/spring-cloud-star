vault policy-write appa appA.hcl

vault token-create -policy=appa -id="00000000-0000-0000-0000-000000000001" -orphan

vault write secret/testConsulVaultAppA appA.secret=appAsecret

vault policy-write appb appB.hcl

vault token-create -policy=appb -id="00000000-0000-0000-0000-000000000002" -orphan

vault write secret/testConsulVaultAppB appB.secret=appBsecret

