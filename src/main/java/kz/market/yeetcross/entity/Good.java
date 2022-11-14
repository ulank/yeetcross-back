package kz.market.yeetcross.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

/**
 * @author Ulan
 * @date 11/9/2022
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "_good", schema = "public")
public class Good {

    @Id
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @Column(name = "_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "_article", unique = true, updatable = false)
    private String article;

    @Column(name = "_image")
    private String image;

    @CreatedDate
    @Column(name = "_created")
    private Timestamp createdDate;

    @LastModifiedDate
    @Column(name = "_modified")
    private Instant lastModifiedDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "_details_id", referencedColumnName = "_id")
    private Details details;

    @ManyToOne
    @JoinColumn(name = "_category_id", nullable = false)
    private Category category;
}

