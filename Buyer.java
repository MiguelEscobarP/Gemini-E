import java.util.List;
import java.util.ArrayList;

class Buyer {
    private int ID;
    private String FullName;
    private List<PaymentMethod> PaymentMethods;

    public Buyer(int ID, String FullName, List<PaymentMethod> PaymentMethods) {
        this.ID = ID;
        this.FullName = FullName;
        this.PaymentMethods = PaymentMethods;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return PaymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        PaymentMethods = paymentMethods;
    }



    public static class PaymentMethod {
        private String type;
        private String details;

        public PaymentMethod(String type, String details) {
            this.type = type;
            this.details = details;
        }


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }
    }