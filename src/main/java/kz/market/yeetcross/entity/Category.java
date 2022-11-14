package kz.market.yeetcross.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@Data
@Entity
@Table(name = "_category", schema = "public")
public class Category {
    @Id
    @Column(name = "_id", nullable = false)
    private String id;

    @Column(name = "_name")
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Good> goods;
}
