package seeandyougo.refactor.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "menu", fetch = FetchType.LAZY)
    private List<Review> reviewList;

}
