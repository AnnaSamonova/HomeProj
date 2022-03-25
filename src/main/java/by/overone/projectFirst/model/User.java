package by.overone.projectFirst.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "home_t_user")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="t_user_name")
    private String name;

    @Column(name="t_user_secondName")
    private String secondName;

    @Column(name="t_user_age")
    private String age;
}
