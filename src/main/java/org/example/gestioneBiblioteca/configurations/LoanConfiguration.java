package org.example.gestioneBiblioteca.configurations;

import org.example.gestioneBiblioteca.models.Loan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LoanConfiguration {

    @Bean("createloan")
    @Scope("prototype")
    public Loan createLoan() {
        return new Loan();
    }

}
