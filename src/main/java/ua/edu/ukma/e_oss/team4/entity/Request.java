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
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;

    @Column(name = "status")
    private String status;

    @Column(name = "reply_text")
    private String replyText;

    @Column(name = "session_id")
    private int sessionId;

    @Column(name = "user_id")
    private int userId;
}
