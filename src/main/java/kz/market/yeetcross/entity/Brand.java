package kz.market.yeetcross.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * @author Ulan
 * @date 11/9/2022
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "_brand", schema = "public")
public class Brand {
    @Id
    @GeneratedValue(generator = "_brand_generator")
    @GenericGenerator(name = "_brand_generator",
            parameters = @org.hibernate.annotations.Parameter(name = "prefix", value = "brand"),
            strategy = "kz.market.yeetcross.util.BrandGenerator")
    @Column(name = "_id", nullable = false)
    private String id;

    @Column(name = "_name", nullable = false)
    private String name;

    @Column(name = "_image")
    private String image;

    @OneToOne(mappedBy = "brand")
    @JsonIgnore
    private Details details;
}
