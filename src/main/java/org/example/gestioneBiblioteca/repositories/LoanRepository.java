package org.example.gestioneBiblioteca.repositories;

import org.example.gestioneBiblioteca.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Long> {
    List<Loan> findByDataRestituzioneIsNull();
}
