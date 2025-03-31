package jpabook.jpashop.domain2;

import jakarta.persistence.*;
import jpabook.jpashop.domain.Address;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany
    private List<Order> orders = new ArrayList<>();


}
