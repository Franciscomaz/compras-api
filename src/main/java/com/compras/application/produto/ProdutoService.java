/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compras.application.produto;

import com.compras.domain.produto.IProdutoRepository;
import com.compras.domain.produto.Produto;
import java.util.List;

/**
 *
 * @author chico
 */
public class ProdutoService {
    private final IProdutoRepository produtoRepository;
    
    public ProdutoService(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    
    public void salvar(Produto produto){
        this.produtoRepository.salvar(produto);
    }
       
    public void atualizar(Produto produto){
        this.produtoRepository.atualizar(produto);
    }
    
    public Produto buscar(Long id) {
        return this.produtoRepository.buscar(id);
    }
    
    public List<Produto> listar(){
        return this.produtoRepository.listar();
    } 
}
