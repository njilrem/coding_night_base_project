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
@Table(name = "ks")
public class Ks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "year")
    private int year;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "is_head")
    private int isHead;

}
