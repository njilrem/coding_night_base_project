package ua.edu.ukma.e_oss.team4.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Table(name = "session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date_from")
    private Timestamp dateFrom;

    @Column(name = "date_to")
    private Timestamp dateTo;
}
