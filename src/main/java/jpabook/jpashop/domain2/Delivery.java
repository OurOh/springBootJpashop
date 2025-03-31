package jpabook.jpashop.domain2;

import jakarta.persistence.*;
import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.DeliveryStatus;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Delivery {

    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;

}
