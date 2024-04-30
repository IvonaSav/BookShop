package project.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.bookshop.model.Book;
import project.bookshop.model.Order;
import project.bookshop.model.User;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user); //TODO: Finding orders for a given user
    List<Order> findByBook(Book book); //TODO: Finding orders for a given book
}
