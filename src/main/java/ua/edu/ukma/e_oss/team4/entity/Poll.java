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
@Table(name = "poll")
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "request_id")
    private int requestId;
    @Column(name = "session_to_poll_id")
    private  int sessionToPollId;
}
