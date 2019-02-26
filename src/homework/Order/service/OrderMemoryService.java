package homework.Order.service;

import homework.Order.Order;
import homework.Order.OrderMemoryRepo.OrderMemoryRepo;
import homework.User.User;

public class OrderMemoryService {
    private OrderMemoryRepo orderRepo = new OrderMemoryRepo();

    public void addOrder(Order order) {
        orderRepo.addOrder(order);
    }

    public Order findOrderById(long id) {
        return orderRepo.findOrderByID(id);
    }

    public void deleteOrder(Order order) {
        orderRepo.deleteOrder(order);
    }

    public void deleteOrder(Long id) {
        orderRepo.deleteOrder(id);
    }

    public void printOrders() {
        orderRepo.printOrders();
    }

    public void findOrdersByUser(User user) {
        orderRepo.findOrdersByUser(user);
    }

}
