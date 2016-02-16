backend "consul" {
  address = "127.0.0.1:8500"
  path = "vault"
  token = "00000000-0000-0000-0000-000000000000"
}

listener "tcp" {
 address = "127.0.0.1:8200"
 tls_disable = 1
}
