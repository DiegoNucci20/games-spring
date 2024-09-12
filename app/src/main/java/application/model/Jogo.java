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
@Table (name = "jogos")
public class Jogo{
    @Id
    @GeneratedValue(strategy = GerantionType.IDENTIFY)
   private long id;
   @Column (unique = true, nullable = false)
   private String titulo;

   @ManyToOne
   @JoinColumn(name = "id_genero")
   private Categoria categoria;

   @ManyToMany
   @JoinTable(
      name = "jogos_possuem_plataformas",
      joinColumns = @JoinColumn(name = "id_jogos"),
      inverseJoinColumns = @JoinColumn(name = "id_plataformas"))
    private Set<Plataforma> plataformas = new HashSet<>();

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(Set<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }

}