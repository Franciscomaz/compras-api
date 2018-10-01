/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compras.resources;

import com.compras.application.produto.ProdutoService;
import com.compras.domain.produto.Produto;
import com.compras.infrastructure.persistence.ProdutoRepository;
import com.compras.infrastructure.serializer.ObjectSerializer;
import com.google.gson.Gson;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("produto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProdutoResource {
    @Context
    private UriInfo context;

    private final ProdutoService produtoService;
    private final ObjectSerializer serializador;
    
    public ProdutoResource() {
        this.serializador = ObjectSerializer.instance();
        this.produtoService = new ProdutoService(new ProdutoRepository());
    }

    @GET
    public String listarProdutos() {
        //return serializador.serializar(produtoService.listar());
        return "ok";
    }

    @GET
    @Path("{id}")
    public String buscarProduto(@PathParam("id") Long id) {
        return this.serializador.serializar(this.produtoService.buscar(id));
    }

    @PUT
    public void atualizarProduto(String json) {
        Produto produto = serializador.desserializar(json, Produto.class);
        produtoService.atualizar(produto);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void salvarProduto(String json) {
        Produto produto = serializador.desserializar(json, Produto.class);
        produtoService.salvar(produto);
    }
}
