package ch.heigvd.gen2019;

public class Product {
    private final String code;
    private final Color color;
    private final Size size;
    private final double price;
    private final String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getProductJSON() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(code);
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(color.toString());
        sb.append("\", ");

        if (size != Size.NONE) {
            sb.append("\"size\": \"");
            sb.append(size.toString());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(price);
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(currency);
        sb.append("\"}, ");
        return sb.toString();
    }
}