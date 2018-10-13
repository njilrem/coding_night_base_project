package ua.edu.ukma.e_oss.team4.entity;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Ks {
    private int id;
    private int year;
    private int userId;
    private int isHead;

}
