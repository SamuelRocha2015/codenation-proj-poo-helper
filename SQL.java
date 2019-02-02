package br.com.codenation.lojavirutal.util;

public class SQL {
    public static final String  INSERT_CARRINHO = "INSERT INTO carrinho(usuario_id, vl_total, qtd_total, dt_hora, loja) VALUES(?, ?, ?, ?, ?)";
    public static final String SELECT_PRODUTOS_CATEGORIA = "SELECT * FROM produto WHERE qtd_estoque > 0 AND categoria = ? ";
    public static final String SELECT_PRODUTO_ID = "SELECT * FROM produto WHERE id = ?";
    public static final String UPDATE_ESTOQUE_PRODUTO = "UPDATE produto SET qtd_estoque = ? WHERE id = ?";
    public static final String SELECT_USUARIO_CPF = "SELECT * FROM usuario WHERE cpf = ?";
}
