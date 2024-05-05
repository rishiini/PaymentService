package Payment;

import Models.Payment;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    String processPayment(Payment payment);
    Payment getPaymentStatus(Long paymentId);

}
