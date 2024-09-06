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
@Table (name = "plataformas")
public class Plataforma{
    @Id
    @GeneratedValue(strategy = GerantionType.IDENTIFY)
   private long id;
   @Column (unique = true, nullable = false)
   private String nome;

public void setId(long id) {
    this.id = id;
}

public long getId() {
    return id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

}