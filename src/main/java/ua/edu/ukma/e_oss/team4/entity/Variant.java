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
@Table(name = "variant")
public class Variant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "poll_id")
    private int pollId;

    @Column(name = "text")
    private String text;
}
