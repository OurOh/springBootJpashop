package jpabook.jpashop.domain2;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Book extends Item {

    private String author;
    private String isbn;
}
