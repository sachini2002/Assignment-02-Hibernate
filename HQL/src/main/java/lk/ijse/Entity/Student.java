package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class Student {
    @Id
    private int id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "student",fetch = FetchType.EAGER)
    List<Address> addresses;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + id +
                ", name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';

    }
}
