package ua.edu.ukma.e_oss.team4.entity;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vote {
    private int id;
    private int userToVariantId;
    private int variantId;
    private String comment;
    //TODO user to variant id
    //TODO variant od

}
