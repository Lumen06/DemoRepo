package homework.Order.OrderMemoryRepo;

import homework.ArrayUtils.ArrayUtils;
import homework.Order.Order;
import homework.User.User;

import static homework.Storage.Storage.orders;
import static homework.Storage.Storage.users;

public class OrderMemoryRepo {

    private int orderIndex = -1;


    public void addOrder(Order Order) {
        if (orderIndex == orders.length-1) {
            Order[] newOrders = new Order[ (int) (orderIndex * 1.5)];
            System.arraycopy(orders, 0, newOrders, 0, orders.length);
            orders = newOrders;
        }
        orderIndex++;
        orders[orderIndex] = Order;

    }



    public Order findOrderByID(Long id) {
        Integer index = findOrderByIndex(id);
        if (index != null) {
            return orders[index];
        }

        return null;
    }

    public Order[] findOrdersByUser(User user) {
        Order[] userOrders = new Order[users.length];
        int j = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].getUser().equals(user)) {
                userOrders[j] = orders[i];
                j++;
            }
        }
        if (j != 0) {

            Order[] array = new Order[j+1];
            System.arraycopy(userOrders, 0, array, 0, array.length-1);

            return array;
        }
        else return null;
    }

    public void deleteOrder(Order order) {
        Integer index = findOrderByEntity(order);
        deleteOrderByIndex(index);
    }

    public void deleteOrder(Long id) {
        Integer index = findOrderByIndex(id);
        deleteOrderByIndex(index);
    }

    public void printOrders() {
        for (Order Order : orders) {
            System.out.println(Order);

        }
    }

    public Integer findOrderByIndex(Long index) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].getId().equals(index)) {
                return i;
            }
        }
        return null;

    }

    public Integer findOrderByEntity(Order order) {
        for (int i = 0; i<orders.length; i++) {
            if (orders[i].equals(order)) {
                return i;
            }
        }
        return null;
    }

    public void deleteOrderByIndex(int index) {
        ArrayUtils.removeElement(orders, index);
        orderIndex--;
    }
}
