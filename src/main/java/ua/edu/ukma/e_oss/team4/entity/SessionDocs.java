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
@Table(name = "session_docs")
public class SessionDocs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "session_to_doc_id")
    private int sessionToDocId;

    @Column(name = "file")
    private String file;
}
