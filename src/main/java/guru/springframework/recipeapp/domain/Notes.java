package guru.springframework.recipeapp.domain;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
