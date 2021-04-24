public class Sales {
    private float salesTotal;
    private float tax;
    public void setPayment(float s) {
        salesTotal = s;
    }
    public float getTotal() {
        return salesTotal;
    }
    public float getReceipt(){
        return salesTotal+tax;
    }
}
