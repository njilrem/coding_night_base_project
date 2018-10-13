package ua.edu.ukma.e_oss.team4.entity;
import lombok.*;

import javax.persistence.Entity;
import java.sql.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String name;
    private String firstName;
    private String lastName;
    private int id;
    private Date dateOfBirth;
}
