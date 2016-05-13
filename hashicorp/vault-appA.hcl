path "secret/application" {
  policy = "read"
}

path "secret/testConsulVaultAppA" {
  policy = "read"
}

path "secret/testConsulVaultAppA,appa" {
  policy = "read"
}

path "auth/token/lookup-self" {
  policy = "read"
}
