package ch.heigvd.gen2019;

import java.util.ArrayList;

public class OrdersWriter {
    private final ArrayList<Order> orders;

    public OrdersWriter(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public String getContentsJSON() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (Order order : orders) {
            sb.append(order.getOrderJSON());
        }

        if (orders.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }



        return sb.append("]}").toString();
    }

}