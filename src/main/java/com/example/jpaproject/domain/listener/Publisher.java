package com.example.jpaproject.domain.listener;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Publisher extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
    For orphan removal: If you invoke setOrders(null), the related Order entities will be removed in db automatically.
    For remove cascade: If you invoke setOrders(null), the related Order entities will NOT be removed in db automatically.
    */
    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "publisher_id")
    @ToString.Exclude
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }
}
