package ua.edu.ukma.e_oss.team4.entity;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SessionDocs {
    private int id;
    private int sessionToDocId;
    private String file;
    //TODO session to doc id
}
