/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.social.entity.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author arthur.souza
 */
@Entity
@Table(name = "POST")
public class Post implements Serializable {

    public Post() {
    }

    public Post(String texto, Date data, Perfil perfilAutor) {
        this.texto = texto;
        this.data = data;
        this.perfilAutor = perfilAutor;
    }

    public Post(String texto, String imagem, Date data, Perfil perfilAutor) {
        this.texto = texto;
        this.imagem = imagem;
        this.data = data;
        this.perfilAutor = perfilAutor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_POST")
    @SequenceGenerator(name = "SEQ_POST", sequenceName = "SEQ_POST", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID_POST")
    private Long id;

    @NotNull
    @Size(min = 1, max = 255, message = "O mínimo de caracteres é 1 e o máximo é 255.")
    @Basic(optional = false)
    @Column(name = "TEXTO")
    private String texto;

    @Basic(optional = true)
    @Column(name = "IMAGEM")
    private String imagem;

    @NotNull
    @Basic(optional = false)
    @Column(name = "DATA_POST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @JoinColumn(name = "ID_PERFIL", nullable = false, foreignKey = @ForeignKey(name = "FK_POST_PERFIL"))
    @ManyToOne(targetEntity = Perfil.class)
    private Perfil perfilAutor;
    
    @OneToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_REACAO", nullable = true)
    private Reacao reacao;

    public Reacao getReacao() {
        return reacao;
    }

    public void setReacao(Reacao reacao) {
        this.reacao = reacao;
    }
    
    public Perfil getPerfilAutor() {
        return perfilAutor;
    }

    public void setPerfilAutor(Perfil perfilAutor) {
        this.perfilAutor = perfilAutor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

}
