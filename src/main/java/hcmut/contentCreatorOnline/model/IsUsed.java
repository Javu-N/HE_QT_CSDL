package hcmut.contentCreatorOnline.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "IsUsed")
public class IsUsed {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id")
    private UUID id;

    @Column(name = "paymentId")
    private UUID paymentId;

    @Column(name = "userId")
    private UUID userId;

    @Column(name = "accountNumber")
    private String accountNumber;
}
