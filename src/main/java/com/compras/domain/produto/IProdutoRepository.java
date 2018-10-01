/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compras.domain.produto;

import java.util.List;

/**
 *
 * @author chico
 */
public interface IProdutoRepository {

    public Produto buscar(Long id);

    public List<Produto> listar();

    public void salvar(Produto produto);

    public void atualizar(Produto produto);
}
