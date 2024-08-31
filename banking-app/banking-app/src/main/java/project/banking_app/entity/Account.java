package project.banking_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Type;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts") // create new table if application properties is update.
@Entity
public class Account {
    @Id  // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // automatically increment the primary key
    private Long id;

    @Column(name = "account_holder_name")
    private String accountHolderName;
    private double balance;
}
