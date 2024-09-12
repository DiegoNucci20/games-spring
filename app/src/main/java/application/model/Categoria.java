package application.model;
import java.lang.annotation.Inherited;
import java.util.HashSet;
import java.util.Set;

import jakarta.persitence.Column;
import jakarta.persitence.Entity;
import jakarta.persitence.GeneratedValue;
import jakarta.persitence.GerationType;
import jakarta.persitence.Id;
import jakarta.persitence.OneToMany;
import jakarta.persitence.Table;

@Entinty
@Table (name = "categorias")
public class Categoria{
    @Id
    @GeneratedValue(strategy = GerantionType.IDENTIFY)
   private long id;
   @Column (unique = true, nullable = false)
   private String nome;

   @OnetoMany(mappedBy = "categoria")
   private Set<Jogo> jogos = new HashSet<>();

   public long getId() {
    return id;
   }

   public void setId(long id) {
    this.id = id;
   }

   public String getNome() {
    return nome;
   }

   public void setNome(String nome) {
    this.nome = nome;
   }

   public Set<Jogo> getJogos() {
    return jogos;
   }

   public void setJogos(Set<Jogo> jogos) {
    this.jogos = jogos;
   }