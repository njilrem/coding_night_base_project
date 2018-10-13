package ua.edu.ukma.e_oss.team4.entity;

import lombok.*;

import javax.persistence.*;


@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Table(name = "vote")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_to_variant_id")
    private int userToVariantId;

    @Column(name = "variant_id")
    private int variantId;

    @Column(name = "comment")
    private String comment;
}
