package kz.market.yeetcross.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_details", schema = "public")
public class Details {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id", nullable = false)
    private Long id;

    @Column(name = "_name", nullable = false)
    private String name;

    @Column(name = "_description")
    private String description;

    @Column(name = "_size")
    private Double size;

    @Column(name = "_price")
    private Double price;

    @Column(name = "_is_best_seller")
    private boolean isBestSeller;

    @Column(name = "_color")
    private String color;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "_brand", referencedColumnName = "_id")
    private Brand brand;

    @OneToOne(mappedBy = "details")
    @JsonIgnore
    private Good good;
}
