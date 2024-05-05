package Payment;

import Models.Payment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class RazorpayService implements PaymentService{

    private RazorpayService razorpayService;
    public RazorpayService(RazorpayService razorpayService) {
        this.razorpayService = razorpayService;
    }

    @Override
    public String processPayment(Payment payment) {
        return null;
    }

    @Override
    public Payment getPaymentStatus(Long paymentId) {
        return null;
    }
}
