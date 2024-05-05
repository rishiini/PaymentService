package Controller;

import Models.Payment;
import Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private PaymentService paymentService;

    @Autowired
    public Controller(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //To check the Payment Status
    @GetMapping("/payment/status/{id}")
    public Payment getPaymentStatus(Long id){
        Payment payment = new Payment();
        boolean statusview = payment.isStatus();
        payment.setStatus(statusview);
        return payment;
    }
}
