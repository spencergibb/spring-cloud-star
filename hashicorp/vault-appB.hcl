path "secret/application" {
  policy = "read"
}

path "secret/testConsulVaultAppB" {
  policy = "read"
}

path "secret/testConsulVaultAppB,appb" {
  policy = "read"
}

path "auth/token/lookup-self" {
  policy = "read"
}
