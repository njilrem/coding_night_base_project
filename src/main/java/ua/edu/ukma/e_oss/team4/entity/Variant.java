package ua.edu.ukma.e_oss.team4.entity;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Variant {
    private int id;
    private int pollId;
    private String text;
    //TODO pollId
}
