package main.java.java8.functionalinterface;

public class PaytmUPI implements UPIPayments{
    @Override
    public String doPayment(String src, String dest) {
        return String.valueOf(src.hashCode() + dest.hashCode()) + "@Paytm";
    }
}
