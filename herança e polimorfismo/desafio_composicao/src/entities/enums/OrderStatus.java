package entities.enums;

public enum OrderStatus {
    PENDING_STATUS(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int value;  //declarar um constante do tipo dos indices

    OrderStatus(int value) {   //igual um construtor com parametro
        this.value = value;
    }

    public int getValue() {  //metodo get
        return value;
    }
}
