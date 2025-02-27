package hcmut.contentCreatorOnline.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Has_Creation")
public class HasCreation {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id")
    private UUID id;

    @Column(name = "orderId")
    private UUID orderId;

    @Column(name = "creationId")
    private UUID creationId;

    @Column(name = "price")
    private Double price;
}
