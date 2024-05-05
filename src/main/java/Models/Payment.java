package Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment {
    @Id
    private Long id;
    private boolean status;
    private double amount;
    private String date;

}
