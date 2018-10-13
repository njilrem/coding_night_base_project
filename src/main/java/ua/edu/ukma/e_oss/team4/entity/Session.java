package ua.edu.ukma.e_oss.team4.entity;

import lombok.*;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Session {
    private int id;
    private Timestamp dateFrom;
    private Timestamp dateTo;
}
